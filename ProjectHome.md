# Mybridge是什么 #

MyBridge是一个纯java实现的基于Mysql协议的高性能的异步网络框架，基于MyBridge开发的Server端只需关注业务逻辑实现部分，就可以让Client通过现有的MysqlClient库来调用，直接复用了已经很成熟的MysqlClient端技术，如协议实现、负载均衡、读写分离等逻辑，同时避免开发client端的工作量，也使得新服务的推广变得简单和容易。

# 框架结构 #

![http://mblogpic.store.qq.com/mblogpic/bb7c3aa2e655066282ac/2000?a.png](http://mblogpic.store.qq.com/mblogpic/bb7c3aa2e655066282ac/2000?a.png)

MyBridge框架分为4层，从下至上依次为：
  1. **网络IO层**：采用开源的[xnet](http://code.google.com/p/xnet/)异步网络框架，完成异步的网络事件处理。
  1. **Mysql协议处理层**：封装了Mysql的协议，并对上层返回的数据进行pack，要求mysql协议版本>=4.4.1。
  1. **Sql解析层**：将原始sql解析成结构化的命令调用，提供给下一层调用。
  1. **命令执行层**：执行具体的体命令，这一层即是使用者需要关心和实现。

# 执行流程 #

![http://mblogpic.store.qq.com/mblogpic/d048bbeaab74ed5b73b4/2000?a.png](http://mblogpic.store.qq.com/mblogpic/d048bbeaab74ed5b73b4/2000?a.png)

  1. 建立连接，初始化一个Handle对象实例，因此handle对象使用中是线程安全的。
  1. 首先完成同client的握手过程，账户权限验证由Mybridge完成。
  1. Client发送command给Mybridge，command除了可以是普通sql外，还可以是以下命令：切换数据库（use database），设置连接编码（set names），退出（quit）。
  1. 收到command后，对命令进行解析执行，执行方式为根据命令类型调用以下用户函数。

| **命令类型** | **callback函数** | **说明** |
|:---------|:---------------|:-------|
|Select    |doSelect        |查询语句    |
|Insert    |doInsert        |插入语句    |
|Update    |doUpdate        |更新语句    |
|Delete    |doDelete        |删除语句    |
|Use Db    |setDb           |切换数据库   |
|Set Names |setCharset      |设置连接编码  |
|Quit      |close           |退出会话    |

# 实例 #

MyBridge的源码包自带了3个实例，分别为：
  1. **MysqlProxy** ：实现了一个支持读写分离的Mysql连接池中间层。
  1. **lucene** ：全文检索服务，主要是对lucene3.0的网络封装。
  1. **Example** ：一个纯内存数据库demo，用hashmap、list容器实现，主要供开发者参考。

# 用户API接口 #

```
/**
* 查询命令
* @param fieldList 需要返回的字段，如select field1,field2
* @param where    过滤条件，如where a=1 and b=2
* @param order    排序规则，如order by a desc
* @param limit 分页，如limit 0,10
* @return 返回结果集
* @throws Exception
*/
public abstract ResultSet doSelect(List<Field> fieldList, List<Cond> where,Order order, Limit limit) throws Exception;
 
/**
* 插入命令
* @param fieldList 待插入记录的字段名值，分别对应<Field.getName,Field.getValue>
* @return
* @throws Exception
*/
public abstract int doInsert(List<Field> fieldList) throws Exception;
 
/**
* 更新命令
* @param fieldList 更新记录的字段名值，分别对应<Field.getName,Field.getValue>
* @param where 过滤条件，如where a=1 and b=2
* @return
* @throws Exception
*/
public abstract int doUpdate(List<Field> fieldList, List<Cond> where) throws Exception;
 
/**
* 删除命令
* @param where 过滤条件，如where a=1 and b=2
* @return
* @throws Exception
*/
public abstract int doDelete(List<Cond> where) throws Exception;
/**
* 初始化，当连接建立时调用
*/
public void open();
/**
* 关闭，quit命令或连接断开时调用
*/
public void close();
/**
* 设置连接编码命令，如set names "utf8"
* @param charset
* @throws Exception
*/
public void setCharset(String charset) throws Exception;
/**
* use db命令
* @param db
*/
public void setDb(String db);
```