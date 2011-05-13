grammar Sql;

@header{
package mybridge.core.sqlparser;
}
@lexer::header{
package mybridge.core.sqlparser;
}
@members {
	public SelectStatement select;
	public InsertStatement insert;
	public UpdateStatement update;
	public DeleteStatement delete; 
	public SetNamesStatement setname;
	public String errorMsg = "";
	public Statement getStatement() {
	    	if (select != null) {
	    		return select;
	    	}
	    	if (insert != null) {
	    		return insert;
	    	}
	    	if (delete != null) {
	    		return delete;
	    	}
	    	if (update != null) {
	    		return update;
	    	}
	    	if (setname != null) {
	    		return setname;
	    	}
	    	return null;
	}
        public void reportError(RecognitionException e) {
		String hdr = getErrorHeader(e);
		String msg = getErrorMessage(e, getTokenNames());
		errorMsg =hdr + ":" + msg;
	}
}
@rulecatch {
catch (RecognitionException exception) {
throw exception;
}
}
	
parse	:
	select | insert | delete | update | setname
	;

setname :	
	SET NAMES e=(STRING | ID) {setname = new SetNamesStatement();setname.setCharset($e.text);}
	;
	
select	:
 	SELECT 	{select = new SelectStatement();} 
	colList {select.setColList($colList.value);}
	FROM 	 
	table	{select.db = $table.db;select.table = $table.table;} 
	where?  {select.setWhere($where.value);}
	order?  {select.setOrder($order.value);}
	limit?  {select.setLimit($limit.value);}
	;
	
insert 	:
 	INSERT INTO 		{insert = new InsertStatement();} 
	table 			{insert.db = $table.db;insert.table = $table.table;}
	'('	colList ')' 	{insert.setColList($colList.value);}
	VALUES
	'(' valueList ')'	{insert.setValueList($valueList.value);}
	;
	
delete 	: 
	DELETE 	{delete = new DeleteStatement();} 
	FROM   
	table 	{delete.db = $table.db;delete.table = $table.table;}
	where? 	{delete.setWhere($where.value);}
	;
	
update 	: 
	UPDATE 	{update = new UpdateStatement();} 
	table	{update.db = $table.db;update.table = $table.table;}
	SET 
	values  {update.setValues($values.value);}
	where?	{update.setWhere($where.value);}
	;

colList 
returns [ColList value] 
@init{value = new ColList();}: 			 
	'*' 		{value.add("*");}
	|
	e=ID 		{value.add($e.text);}
	(',' e=ID 	{value.add($e.text);} )* 
	;
	
where 	
returns [Where value]	:
	WHERE {value = new Where();}
	id=ID 
	op=('=' |  GE | LE | '<' | '>' ) v=value {value.add($id.text,$op.text,$v.value);}
	(
	  AND id=ID  op=('=' |  GE | LE | '<' | '>' ) v=value {value.add($id.text,$op.text,$v.value);}
	)*
	;

order	
returns [Order value]:
	ORDER BY		 	{value = new Order();}
	ID 	(e=DESC | e=ASC {value.setFlag($e.text);})?
	;
	
limit	
returns [Limit value]:
	LIMIT e1=NUM ',' e2=NUM  	{value = new Limit(Integer.parseInt($e1.text),Integer.parseInt($e2.text));}
	;

table	
returns [String db,String table] : 
	 '`'? e=ID {$table = $e.text;} 	'`'?
	 ( '.'
	  '`'? e=ID {$db = $table;$table=$e.text;}  '`'?
	 )?
	 ;

valueList	
returns [ValueList value] :
	{value = new ValueList();}
	e=value		  {value.add($e.text);}
	(',' e=value  {value.add($e.text);})*
	;

values	
returns [Values value] :
			{value = new Values();}
	id=ID '=' v=value {value.add($id.text,$v.value);}
	( ',' id=ID '=' v=value {value.add($id.text,$v.value);})*
	;
	
value
returns [String value] : 
	e=(STRING | NUM) {$value = $e.text;}
	;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ; 

GE	: '>' '=';
LE	: '<' '=';
NAMES 	: N A M E S;
AND 	: A N D;
LIMIT 	: L I M I T;
DESC	: D E S C;
ASC	: A S C;
ORDER	: O R D E R;
BY	: B Y;
SET	: S E T;
VALUES	: V A L U E S;
IN 	: I N;
INTO	: I N T O;
INSERT  : I N S E R T;
UPDATE 	: U P D A T E;
DELETE  : D E L E T E;
SELECT	: S E L E C T;
WHERE 	: W H E R E ;
FROM	: F R O M;
ID 	: ('a'..'z'|'A'..'Z'|'_') ('0'..'9'|'a'..'z'|'A'..'Z'|'_')* ;
STRING  :  '"' (~('\\'|'"'))* '"' |  '\'' (~('\\'|'"'))* '\''  ;
NUM	: ('0'..'9')+('.' ('0'..'9')+)?;

fragment A : 'A'|'a';
fragment B : 'B'|'b';
fragment C : 'C'|'c';
fragment D : 'D'|'d';
fragment E : 'E'|'e';
fragment F : 'F'|'f';
fragment G : 'G'|'g';
fragment H : 'H'|'h';
fragment I : 'I'|'i';
fragment J : 'J'|'j';
fragment K : 'K'|'k';
fragment L : 'L'|'l';
fragment M : 'M'|'m';
fragment N : 'N'|'n';
fragment O : 'O'|'o';
fragment P : 'P'|'p';
fragment Q : 'Q'|'q';
fragment R : 'R'|'r';
fragment S : 'S'|'s';
fragment T : 'T'|'t';
fragment U : 'U'|'u';
fragment V : 'V'|'v';
fragment W : 'W'|'w';
fragment X : 'X'|'x';
fragment Y : 'Y'|'y';
fragment Z : 'Z'|'z';  