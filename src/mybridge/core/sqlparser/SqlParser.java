// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g 2011-05-20 22:21:37

package mybridge.core.sqlparser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class SqlParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "SET", "NAMES", "STRING", "ID", "SELECT", "FROM", "INSERT", "INTO", "VALUES", "DELETE", "UPDATE", "WHERE", "GE", "LE", "AND", "ORDER", "BY", "DESC", "ASC", "LIMIT", "NUM", "WS", "N", "A", "M", "E", "S", "D", "L", "I", "T", "C", "O", "R", "B", "Y", "V", "U", "IN", "P", "W", "H", "F", "G", "J", "K", "Q", "X", "Z", "'('", "')'", "'*'", "','", "'='", "'<'", "'>'", "'`'", "'.'"
    };
    public static final int WHERE=15;
    public static final int ORDER=19;
    public static final int LIMIT=23;
    public static final int UPDATE=14;
    public static final int ID=7;
    public static final int T__61=61;
    public static final int AND=18;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int IN=42;
    public static final int INSERT=10;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__59=59;
    public static final int SELECT=8;
    public static final int INTO=11;
    public static final int D=31;
    public static final int E=29;
    public static final int F=46;
    public static final int GE=16;
    public static final int BY=20;
    public static final int G=47;
    public static final int A=27;
    public static final int B=38;
    public static final int C=35;
    public static final int ASC=22;
    public static final int L=32;
    public static final int M=28;
    public static final int N=26;
    public static final int O=36;
    public static final int H=45;
    public static final int I=33;
    public static final int J=48;
    public static final int K=49;
    public static final int VALUES=12;
    public static final int U=41;
    public static final int T=34;
    public static final int W=44;
    public static final int V=40;
    public static final int SET=4;
    public static final int Q=50;
    public static final int P=43;
    public static final int DELETE=13;
    public static final int S=30;
    public static final int R=37;
    public static final int Y=39;
    public static final int X=51;
    public static final int NUM=24;
    public static final int Z=52;
    public static final int NAMES=5;
    public static final int WS=25;
    public static final int DESC=21;
    public static final int FROM=9;
    public static final int LE=17;
    public static final int STRING=6;

    // delegates
    // delegators


        public SqlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public SqlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return SqlParser.tokenNames; }
    public String getGrammarFileName() { return "/home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g"; }


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



    // $ANTLR start "parse"
    // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:46:1: parse : ( select | insert | delete | update | setname );
    public final void parse() throws RecognitionException {
        try {
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:46:7: ( select | insert | delete | update | setname )
            int alt1=5;
            switch ( input.LA(1) ) {
            case SELECT:
                {
                alt1=1;
                }
                break;
            case INSERT:
                {
                alt1=2;
                }
                break;
            case DELETE:
                {
                alt1=3;
                }
                break;
            case UPDATE:
                {
                alt1=4;
                }
                break;
            case SET:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:47:2: select
                    {
                    pushFollow(FOLLOW_select_in_parse34);
                    select();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:47:11: insert
                    {
                    pushFollow(FOLLOW_insert_in_parse38);
                    insert();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:47:20: delete
                    {
                    pushFollow(FOLLOW_delete_in_parse42);
                    delete();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:47:29: update
                    {
                    pushFollow(FOLLOW_update_in_parse46);
                    update();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:47:38: setname
                    {
                    pushFollow(FOLLOW_setname_in_parse50);
                    setname();

                    state._fsp--;


                    }
                    break;

            }
        }

        catch (RecognitionException exception) {
        throw exception;
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "parse"


    // $ANTLR start "setname"
    // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:50:1: setname : SET NAMES e= ( STRING | ID ) ;
    public final void setname() throws RecognitionException {
        Token e=null;

        try {
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:50:9: ( SET NAMES e= ( STRING | ID ) )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:51:2: SET NAMES e= ( STRING | ID )
            {
            match(input,SET,FOLLOW_SET_in_setname62); 
            match(input,NAMES,FOLLOW_NAMES_in_setname64); 
            e=(Token)input.LT(1);
            if ( (input.LA(1)>=STRING && input.LA(1)<=ID) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            setname = new SetNamesStatement();setname.setCharset((e!=null?e.getText():null));

            }

        }

        catch (RecognitionException exception) {
        throw exception;
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "setname"


    // $ANTLR start "select"
    // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:54:1: select : SELECT colList FROM table ( where )? ( order )? ( limit )? ;
    public final void select() throws RecognitionException {
        ColList colList1 = null;

        SqlParser.table_return table2 = null;

        Where where3 = null;

        Order order4 = null;

        Limit limit5 = null;


        try {
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:54:8: ( SELECT colList FROM table ( where )? ( order )? ( limit )? )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:55:3: SELECT colList FROM table ( where )? ( order )? ( limit )?
            {
            match(input,SELECT,FOLLOW_SELECT_in_select89); 
            select = new SelectStatement();
            pushFollow(FOLLOW_colList_in_select96);
            colList1=colList();

            state._fsp--;

            select.setColList(colList1);
            match(input,FROM,FOLLOW_FROM_in_select101); 
            pushFollow(FOLLOW_table_in_select107);
            table2=table();

            state._fsp--;

            select.db = (table2!=null?table2.db:null);select.table = (table2!=null?table2.table:null);
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:59:2: ( where )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==WHERE) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:59:2: where
                    {
                    pushFollow(FOLLOW_where_in_select113);
                    where3=where();

                    state._fsp--;


                    }
                    break;

            }

            select.setWhere(where3);
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:60:2: ( order )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==ORDER) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:60:2: order
                    {
                    pushFollow(FOLLOW_order_in_select120);
                    order4=order();

                    state._fsp--;


                    }
                    break;

            }

            select.setOrder(order4);
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:61:2: ( limit )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==LIMIT) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:61:2: limit
                    {
                    pushFollow(FOLLOW_limit_in_select127);
                    limit5=limit();

                    state._fsp--;


                    }
                    break;

            }

            select.setLimit(limit5);

            }

        }

        catch (RecognitionException exception) {
        throw exception;
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "select"


    // $ANTLR start "insert"
    // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:64:1: insert : INSERT INTO table '(' colList ')' VALUES '(' valueList ')' ;
    public final void insert() throws RecognitionException {
        SqlParser.table_return table6 = null;

        ColList colList7 = null;

        ValueList valueList8 = null;


        try {
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:64:9: ( INSERT INTO table '(' colList ')' VALUES '(' valueList ')' )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:65:3: INSERT INTO table '(' colList ')' VALUES '(' valueList ')'
            {
            match(input,INSERT,FOLLOW_INSERT_in_insert145); 
            match(input,INTO,FOLLOW_INTO_in_insert147); 
            insert = new InsertStatement();
            pushFollow(FOLLOW_table_in_insert155);
            table6=table();

            state._fsp--;

            insert.db = (table6!=null?table6.db:null);insert.table = (table6!=null?table6.table:null);
            match(input,53,FOLLOW_53_in_insert163); 
            pushFollow(FOLLOW_colList_in_insert165);
            colList7=colList();

            state._fsp--;

            match(input,54,FOLLOW_54_in_insert167); 
            insert.setColList(colList7);
            match(input,VALUES,FOLLOW_VALUES_in_insert173); 
            match(input,53,FOLLOW_53_in_insert176); 
            pushFollow(FOLLOW_valueList_in_insert178);
            valueList8=valueList();

            state._fsp--;

            match(input,54,FOLLOW_54_in_insert180); 
            insert.setValueList(valueList8);

            }

        }

        catch (RecognitionException exception) {
        throw exception;
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "insert"


    // $ANTLR start "delete"
    // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:72:1: delete : DELETE FROM table ( where )? ;
    public final void delete() throws RecognitionException {
        SqlParser.table_return table9 = null;

        Where where10 = null;


        try {
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:72:9: ( DELETE FROM table ( where )? )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:73:2: DELETE FROM table ( where )?
            {
            match(input,DELETE,FOLLOW_DELETE_in_delete196); 
            delete = new DeleteStatement();
            match(input,FROM,FOLLOW_FROM_in_delete203); 
            pushFollow(FOLLOW_table_in_delete209);
            table9=table();

            state._fsp--;

            delete.db = (table9!=null?table9.db:null);delete.table = (table9!=null?table9.table:null);
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:76:2: ( where )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==WHERE) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:76:2: where
                    {
                    pushFollow(FOLLOW_where_in_delete215);
                    where10=where();

                    state._fsp--;


                    }
                    break;

            }

            delete.setWhere(where10);

            }

        }

        catch (RecognitionException exception) {
        throw exception;
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "delete"


    // $ANTLR start "update"
    // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:79:1: update : UPDATE table SET values ( where )? ;
    public final void update() throws RecognitionException {
        SqlParser.table_return table11 = null;

        Values values12 = null;

        Where where13 = null;


        try {
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:79:9: ( UPDATE table SET values ( where )? )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:80:2: UPDATE table SET values ( where )?
            {
            match(input,UPDATE,FOLLOW_UPDATE_in_update233); 
            update = new UpdateStatement();
            pushFollow(FOLLOW_table_in_update240);
            table11=table();

            state._fsp--;

            update.db = (table11!=null?table11.db:null);update.table = (table11!=null?table11.table:null);
            match(input,SET,FOLLOW_SET_in_update245); 
            pushFollow(FOLLOW_values_in_update249);
            values12=values();

            state._fsp--;

            update.setValues(values12);
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:84:2: ( where )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==WHERE) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:84:2: where
                    {
                    pushFollow(FOLLOW_where_in_update255);
                    where13=where();

                    state._fsp--;


                    }
                    break;

            }

            update.setWhere(where13);

            }

        }

        catch (RecognitionException exception) {
        throw exception;
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "update"


    // $ANTLR start "colList"
    // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:87:1: colList returns [ColList value] : ( '*' | e= ID ( ',' e= ID )* );
    public final ColList colList() throws RecognitionException {
        ColList value = null;

        Token e=null;

        value = new ColList();
        try {
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:89:30: ( '*' | e= ID ( ',' e= ID )* )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==55) ) {
                alt8=1;
            }
            else if ( (LA8_0==ID) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:90:2: '*'
                    {
                    match(input,55,FOLLOW_55_in_colList283); 
                    value.add("*");

                    }
                    break;
                case 2 :
                    // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:92:2: e= ID ( ',' e= ID )*
                    {
                    e=(Token)match(input,ID,FOLLOW_ID_in_colList295); 
                    value.add((e!=null?e.getText():null));
                    // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:93:2: ( ',' e= ID )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==56) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:93:3: ',' e= ID
                    	    {
                    	    match(input,56,FOLLOW_56_in_colList303); 
                    	    e=(Token)match(input,ID,FOLLOW_ID_in_colList307); 
                    	    value.add((e!=null?e.getText():null));

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }
        }

        catch (RecognitionException exception) {
        throw exception;
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "colList"


    // $ANTLR start "where"
    // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:96:1: where returns [Where value] : WHERE id= ID op= ( '=' | GE | LE | '<' | '>' ) v= value ( AND id= ID op= ( '=' | GE | LE | '<' | '>' ) v= value )* ;
    public final Where where() throws RecognitionException {
        Where value = null;

        Token id=null;
        Token op=null;
        SqlParser.value_return v = null;


        try {
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:97:23: ( WHERE id= ID op= ( '=' | GE | LE | '<' | '>' ) v= value ( AND id= ID op= ( '=' | GE | LE | '<' | '>' ) v= value )* )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:98:2: WHERE id= ID op= ( '=' | GE | LE | '<' | '>' ) v= value ( AND id= ID op= ( '=' | GE | LE | '<' | '>' ) v= value )*
            {
            match(input,WHERE,FOLLOW_WHERE_in_where332); 
            value = new Where();
            id=(Token)match(input,ID,FOLLOW_ID_in_where339); 
            op=(Token)input.LT(1);
            if ( (input.LA(1)>=GE && input.LA(1)<=LE)||(input.LA(1)>=57 && input.LA(1)<=59) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            pushFollow(FOLLOW_value_in_where369);
            v=value();

            state._fsp--;

            value.add((id!=null?id.getText():null),(op!=null?op.getText():null),(v!=null?v.value:null));
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:101:2: ( AND id= ID op= ( '=' | GE | LE | '<' | '>' ) v= value )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==AND) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:102:4: AND id= ID op= ( '=' | GE | LE | '<' | '>' ) v= value
            	    {
            	    match(input,AND,FOLLOW_AND_in_where379); 
            	    id=(Token)match(input,ID,FOLLOW_ID_in_where383); 
            	    op=(Token)input.LT(1);
            	    if ( (input.LA(1)>=GE && input.LA(1)<=LE)||(input.LA(1)>=57 && input.LA(1)<=59) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_value_in_where412);
            	    v=value();

            	    state._fsp--;

            	    value.add((id!=null?id.getText():null),(op!=null?op.getText():null),(v!=null?v.value:null));

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

        }

        catch (RecognitionException exception) {
        throw exception;
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "where"


    // $ANTLR start "order"
    // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:106:1: order returns [Order value] : ORDER BY ID (e= DESC | e= ASC )? ;
    public final Order order() throws RecognitionException {
        Order value = null;

        Token e=null;

        try {
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:107:22: ( ORDER BY ID (e= DESC | e= ASC )? )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:108:2: ORDER BY ID (e= DESC | e= ASC )?
            {
            match(input,ORDER,FOLLOW_ORDER_in_order433); 
            match(input,BY,FOLLOW_BY_in_order435); 
            value = new Order();
            match(input,ID,FOLLOW_ID_in_order443); 
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:109:6: (e= DESC | e= ASC )?
            int alt10=3;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==DESC) ) {
                alt10=1;
            }
            else if ( (LA10_0==ASC) ) {
                alt10=2;
            }
            switch (alt10) {
                case 1 :
                    // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:109:7: e= DESC
                    {
                    e=(Token)match(input,DESC,FOLLOW_DESC_in_order449); 

                    }
                    break;
                case 2 :
                    // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:109:16: e= ASC
                    {
                    e=(Token)match(input,ASC,FOLLOW_ASC_in_order455); 
                    value.setFlag((e!=null?e.getText():null));

                    }
                    break;

            }


            }

        }

        catch (RecognitionException exception) {
        throw exception;
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "order"


    // $ANTLR start "limit"
    // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:112:1: limit returns [Limit value] : LIMIT e1= NUM ',' e2= NUM ;
    public final Limit limit() throws RecognitionException {
        Limit value = null;

        Token e1=null;
        Token e2=null;

        try {
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:113:22: ( LIMIT e1= NUM ',' e2= NUM )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:114:2: LIMIT e1= NUM ',' e2= NUM
            {
            match(input,LIMIT,FOLLOW_LIMIT_in_limit475); 
            e1=(Token)match(input,NUM,FOLLOW_NUM_in_limit479); 
            match(input,56,FOLLOW_56_in_limit481); 
            e2=(Token)match(input,NUM,FOLLOW_NUM_in_limit485); 
            value = new Limit(Integer.parseInt((e1!=null?e1.getText():null)),Integer.parseInt((e2!=null?e2.getText():null)));

            }

        }

        catch (RecognitionException exception) {
        throw exception;
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "limit"

    public static class table_return extends ParserRuleReturnScope {
        public String db;
        public String table;
    };

    // $ANTLR start "table"
    // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:117:1: table returns [String db,String table] : ( '`' )? e= ID ( '`' )? ( '.' ( '`' )? e= ID ( '`' )? )? ;
    public final SqlParser.table_return table() throws RecognitionException {
        SqlParser.table_return retval = new SqlParser.table_return();
        retval.start = input.LT(1);

        Token e=null;

        try {
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:118:34: ( ( '`' )? e= ID ( '`' )? ( '.' ( '`' )? e= ID ( '`' )? )? )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:119:3: ( '`' )? e= ID ( '`' )? ( '.' ( '`' )? e= ID ( '`' )? )?
            {
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:119:3: ( '`' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==60) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:119:3: '`'
                    {
                    match(input,60,FOLLOW_60_in_table507); 

                    }
                    break;

            }

            e=(Token)match(input,ID,FOLLOW_ID_in_table512); 
            retval.table = (e!=null?e.getText():null);
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:119:34: ( '`' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==60) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:119:34: '`'
                    {
                    match(input,60,FOLLOW_60_in_table517); 

                    }
                    break;

            }

            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:120:3: ( '.' ( '`' )? e= ID ( '`' )? )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==61) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:120:5: '.' ( '`' )? e= ID ( '`' )?
                    {
                    match(input,61,FOLLOW_61_in_table524); 
                    // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:121:4: ( '`' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==60) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:121:4: '`'
                            {
                            match(input,60,FOLLOW_60_in_table529); 

                            }
                            break;

                    }

                    e=(Token)match(input,ID,FOLLOW_ID_in_table534); 
                    retval.db = retval.table;retval.table =(e!=null?e.getText():null);
                    // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:121:46: ( '`' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==60) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:121:46: '`'
                            {
                            match(input,60,FOLLOW_60_in_table539); 

                            }
                            break;

                    }


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

        }

        catch (RecognitionException exception) {
        throw exception;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "table"


    // $ANTLR start "valueList"
    // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:125:1: valueList returns [ValueList value] : e= value ( ',' e= value )* ;
    public final ValueList valueList() throws RecognitionException {
        ValueList value = null;

        SqlParser.value_return e = null;


        try {
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:126:27: (e= value ( ',' e= value )* )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:127:2: e= value ( ',' e= value )*
            {
            value = new ValueList();
            pushFollow(FOLLOW_value_in_valueList567);
            e=value();

            state._fsp--;

            value.add((e!=null?input.toString(e.start,e.stop):null));
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:129:2: ( ',' e= value )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==56) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:129:3: ',' e= value
            	    {
            	    match(input,56,FOLLOW_56_in_valueList576); 
            	    pushFollow(FOLLOW_value_in_valueList580);
            	    e=value();

            	    state._fsp--;

            	    value.add((e!=null?input.toString(e.start,e.stop):null));

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }

        }

        catch (RecognitionException exception) {
        throw exception;
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "valueList"


    // $ANTLR start "values"
    // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:132:1: values returns [Values value] : id= ID '=' v= value ( ',' id= ID '=' v= value )* ;
    public final Values values() throws RecognitionException {
        Values value = null;

        Token id=null;
        SqlParser.value_return v = null;


        try {
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:133:24: (id= ID '=' v= value ( ',' id= ID '=' v= value )* )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:134:4: id= ID '=' v= value ( ',' id= ID '=' v= value )*
            {
            value = new Values();
            id=(Token)match(input,ID,FOLLOW_ID_in_values608); 
            match(input,57,FOLLOW_57_in_values610); 
            pushFollow(FOLLOW_value_in_values614);
            v=value();

            state._fsp--;

            value.add((id!=null?id.getText():null),(v!=null?v.value:null));
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:136:2: ( ',' id= ID '=' v= value )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==56) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:136:4: ',' id= ID '=' v= value
            	    {
            	    match(input,56,FOLLOW_56_in_values621); 
            	    id=(Token)match(input,ID,FOLLOW_ID_in_values625); 
            	    match(input,57,FOLLOW_57_in_values627); 
            	    pushFollow(FOLLOW_value_in_values631);
            	    v=value();

            	    state._fsp--;

            	    value.add((id!=null?id.getText():null),(v!=null?v.value:null));

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }

        }

        catch (RecognitionException exception) {
        throw exception;
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "values"

    public static class value_return extends ParserRuleReturnScope {
        public String value;
    };

    // $ANTLR start "value"
    // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:139:1: value returns [String value] : e= ( STRING | NUM ) ;
    public final SqlParser.value_return value() throws RecognitionException {
        SqlParser.value_return retval = new SqlParser.value_return();
        retval.start = input.LT(1);

        Token e=null;

        try {
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:140:24: (e= ( STRING | NUM ) )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:141:2: e= ( STRING | NUM )
            {
            e=(Token)input.LT(1);
            if ( input.LA(1)==STRING||input.LA(1)==NUM ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            retval.value = (e!=null?e.getText():null);

            }

            retval.stop = input.LT(-1);

        }

        catch (RecognitionException exception) {
        throw exception;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "value"

    // Delegated rules


 

    public static final BitSet FOLLOW_select_in_parse34 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insert_in_parse38 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_delete_in_parse42 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_update_in_parse46 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_setname_in_parse50 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SET_in_setname62 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NAMES_in_setname64 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_set_in_setname68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_select89 = new BitSet(new long[]{0x0080000000000080L});
    public static final BitSet FOLLOW_colList_in_select96 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_FROM_in_select101 = new BitSet(new long[]{0x1000000000000080L});
    public static final BitSet FOLLOW_table_in_select107 = new BitSet(new long[]{0x0000000000888002L});
    public static final BitSet FOLLOW_where_in_select113 = new BitSet(new long[]{0x0000000000880002L});
    public static final BitSet FOLLOW_order_in_select120 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_limit_in_select127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSERT_in_insert145 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_INTO_in_insert147 = new BitSet(new long[]{0x1000000000000080L});
    public static final BitSet FOLLOW_table_in_insert155 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_insert163 = new BitSet(new long[]{0x0080000000000080L});
    public static final BitSet FOLLOW_colList_in_insert165 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_insert167 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_VALUES_in_insert173 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_insert176 = new BitSet(new long[]{0x0000000001000040L});
    public static final BitSet FOLLOW_valueList_in_insert178 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_insert180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELETE_in_delete196 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_FROM_in_delete203 = new BitSet(new long[]{0x1000000000000080L});
    public static final BitSet FOLLOW_table_in_delete209 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_where_in_delete215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UPDATE_in_update233 = new BitSet(new long[]{0x1000000000000080L});
    public static final BitSet FOLLOW_table_in_update240 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_SET_in_update245 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_values_in_update249 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_where_in_update255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_colList283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_colList295 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_56_in_colList303 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_colList307 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_WHERE_in_where332 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_where339 = new BitSet(new long[]{0x0E00000000030000L});
    public static final BitSet FOLLOW_set_in_where345 = new BitSet(new long[]{0x0000000001000040L});
    public static final BitSet FOLLOW_value_in_where369 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_AND_in_where379 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_where383 = new BitSet(new long[]{0x0E00000000030000L});
    public static final BitSet FOLLOW_set_in_where388 = new BitSet(new long[]{0x0000000001000040L});
    public static final BitSet FOLLOW_value_in_where412 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ORDER_in_order433 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_BY_in_order435 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_order443 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_DESC_in_order449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASC_in_order455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LIMIT_in_limit475 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_NUM_in_limit479 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_limit481 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_NUM_in_limit485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_table507 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_table512 = new BitSet(new long[]{0x3000000000000002L});
    public static final BitSet FOLLOW_60_in_table517 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_61_in_table524 = new BitSet(new long[]{0x1000000000000080L});
    public static final BitSet FOLLOW_60_in_table529 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_table534 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_60_in_table539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_valueList567 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_56_in_valueList576 = new BitSet(new long[]{0x0000000001000040L});
    public static final BitSet FOLLOW_value_in_valueList580 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_ID_in_values608 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_values610 = new BitSet(new long[]{0x0000000001000040L});
    public static final BitSet FOLLOW_value_in_values614 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_56_in_values621 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_values625 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_values627 = new BitSet(new long[]{0x0000000001000040L});
    public static final BitSet FOLLOW_value_in_values631 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_set_in_value654 = new BitSet(new long[]{0x0000000000000002L});

}