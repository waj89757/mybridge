// $ANTLR 3.3 Nov 30, 2010 12:45:30 G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g 2011-05-11 13:32:11

package mybridge.core.sqlparser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class SqlParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "SET", "NAMES", "SELECT", "FROM", "INSERT", "INTO", "VALUES", "DELETE", "UPDATE", "ID", "WHERE", "GE", "LE", "AND", "ORDER", "BY", "DESC", "ASC", "LIMIT", "NUM", "STRING", "WS", "N", "A", "M", "E", "S", "D", "L", "I", "T", "C", "O", "R", "B", "Y", "V", "U", "IN", "P", "W", "H", "F", "G", "J", "K", "Q", "X", "Z", "'('", "')'", "'*'", "','", "'='", "'<'", "'>'", "'`'", "'.'"
    };
    public static final int EOF=-1;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int SET=4;
    public static final int NAMES=5;
    public static final int SELECT=6;
    public static final int FROM=7;
    public static final int INSERT=8;
    public static final int INTO=9;
    public static final int VALUES=10;
    public static final int DELETE=11;
    public static final int UPDATE=12;
    public static final int ID=13;
    public static final int WHERE=14;
    public static final int GE=15;
    public static final int LE=16;
    public static final int AND=17;
    public static final int ORDER=18;
    public static final int BY=19;
    public static final int DESC=20;
    public static final int ASC=21;
    public static final int LIMIT=22;
    public static final int NUM=23;
    public static final int STRING=24;
    public static final int WS=25;
    public static final int N=26;
    public static final int A=27;
    public static final int M=28;
    public static final int E=29;
    public static final int S=30;
    public static final int D=31;
    public static final int L=32;
    public static final int I=33;
    public static final int T=34;
    public static final int C=35;
    public static final int O=36;
    public static final int R=37;
    public static final int B=38;
    public static final int Y=39;
    public static final int V=40;
    public static final int U=41;
    public static final int IN=42;
    public static final int P=43;
    public static final int W=44;
    public static final int H=45;
    public static final int F=46;
    public static final int G=47;
    public static final int J=48;
    public static final int K=49;
    public static final int Q=50;
    public static final int X=51;
    public static final int Z=52;

    // delegates
    // delegators


        public SqlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public SqlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return SqlParser.tokenNames; }
    public String getGrammarFileName() { return "G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g"; }


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
    // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:47:1: parse : ( select | insert | delete | update | setname );
    public final void parse() throws RecognitionException {
        try {
            // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:47:7: ( select | insert | delete | update | setname )
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
                    // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:48:2: select
                    {
                    pushFollow(FOLLOW_select_in_parse35);
                    select();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:48:11: insert
                    {
                    pushFollow(FOLLOW_insert_in_parse39);
                    insert();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:48:20: delete
                    {
                    pushFollow(FOLLOW_delete_in_parse43);
                    delete();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:48:29: update
                    {
                    pushFollow(FOLLOW_update_in_parse47);
                    update();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:48:38: setname
                    {
                    pushFollow(FOLLOW_setname_in_parse51);
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
    // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:51:1: setname : SET NAMES value ;
    public final void setname() throws RecognitionException {
        SqlParser.value_return value1 = null;


        try {
            // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:51:9: ( SET NAMES value )
            // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:52:2: SET NAMES value
            {
            match(input,SET,FOLLOW_SET_in_setname63); 
            match(input,NAMES,FOLLOW_NAMES_in_setname65); 
            pushFollow(FOLLOW_value_in_setname67);
            value1=value();

            state._fsp--;

            setname = new SetNamesStatement();setname.setCharset((value1!=null?value1.value:null));

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
    // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:55:1: select : SELECT colList FROM table ( where )? ( order )? ( limit )? ;
    public final void select() throws RecognitionException {
        ColList colList2 = null;

        SqlParser.table_return table3 = null;

        Where where4 = null;

        Order order5 = null;

        Limit limit6 = null;


        try {
            // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:55:8: ( SELECT colList FROM table ( where )? ( order )? ( limit )? )
            // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:56:3: SELECT colList FROM table ( where )? ( order )? ( limit )?
            {
            match(input,SELECT,FOLLOW_SELECT_in_select82); 
            select = new SelectStatement();
            pushFollow(FOLLOW_colList_in_select89);
            colList2=colList();

            state._fsp--;

            select.setColList(colList2);
            match(input,FROM,FOLLOW_FROM_in_select94); 
            pushFollow(FOLLOW_table_in_select100);
            table3=table();

            state._fsp--;

            select.db = (table3!=null?table3.db:null);select.table = (table3!=null?table3.table:null);
            // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:60:2: ( where )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==WHERE) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:60:2: where
                    {
                    pushFollow(FOLLOW_where_in_select106);
                    where4=where();

                    state._fsp--;


                    }
                    break;

            }

            select.setWhere(where4);
            // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:61:2: ( order )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==ORDER) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:61:2: order
                    {
                    pushFollow(FOLLOW_order_in_select113);
                    order5=order();

                    state._fsp--;


                    }
                    break;

            }

            select.setOrder(order5);
            // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:62:2: ( limit )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==LIMIT) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:62:2: limit
                    {
                    pushFollow(FOLLOW_limit_in_select120);
                    limit6=limit();

                    state._fsp--;


                    }
                    break;

            }

            select.setLimit(limit6);

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
    // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:65:1: insert : INSERT INTO table '(' colList ')' VALUES '(' valueList ')' ;
    public final void insert() throws RecognitionException {
        SqlParser.table_return table7 = null;

        ColList colList8 = null;

        ValueList valueList9 = null;


        try {
            // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:65:9: ( INSERT INTO table '(' colList ')' VALUES '(' valueList ')' )
            // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:66:3: INSERT INTO table '(' colList ')' VALUES '(' valueList ')'
            {
            match(input,INSERT,FOLLOW_INSERT_in_insert138); 
            match(input,INTO,FOLLOW_INTO_in_insert140); 
            insert = new InsertStatement();
            pushFollow(FOLLOW_table_in_insert148);
            table7=table();

            state._fsp--;

            insert.db = (table7!=null?table7.db:null);insert.table = (table7!=null?table7.table:null);
            match(input,53,FOLLOW_53_in_insert156); 
            pushFollow(FOLLOW_colList_in_insert158);
            colList8=colList();

            state._fsp--;

            match(input,54,FOLLOW_54_in_insert160); 
            insert.setColList(colList8);
            match(input,VALUES,FOLLOW_VALUES_in_insert166); 
            match(input,53,FOLLOW_53_in_insert169); 
            pushFollow(FOLLOW_valueList_in_insert171);
            valueList9=valueList();

            state._fsp--;

            match(input,54,FOLLOW_54_in_insert173); 
            insert.setValueList(valueList9);

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
    // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:73:1: delete : DELETE FROM table ( where )? ;
    public final void delete() throws RecognitionException {
        SqlParser.table_return table10 = null;

        Where where11 = null;


        try {
            // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:73:9: ( DELETE FROM table ( where )? )
            // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:74:2: DELETE FROM table ( where )?
            {
            match(input,DELETE,FOLLOW_DELETE_in_delete189); 
            delete = new DeleteStatement();
            match(input,FROM,FOLLOW_FROM_in_delete196); 
            pushFollow(FOLLOW_table_in_delete202);
            table10=table();

            state._fsp--;

            delete.db = (table10!=null?table10.db:null);delete.table = (table10!=null?table10.table:null);
            // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:77:2: ( where )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==WHERE) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:77:2: where
                    {
                    pushFollow(FOLLOW_where_in_delete208);
                    where11=where();

                    state._fsp--;


                    }
                    break;

            }

            delete.setWhere(where11);

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
    // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:80:1: update : UPDATE table SET values ( where )? ;
    public final void update() throws RecognitionException {
        SqlParser.table_return table12 = null;

        Values values13 = null;

        Where where14 = null;


        try {
            // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:80:9: ( UPDATE table SET values ( where )? )
            // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:81:2: UPDATE table SET values ( where )?
            {
            match(input,UPDATE,FOLLOW_UPDATE_in_update226); 
            update = new UpdateStatement();
            pushFollow(FOLLOW_table_in_update233);
            table12=table();

            state._fsp--;

            update.db = (table12!=null?table12.db:null);update.table = (table12!=null?table12.table:null);
            match(input,SET,FOLLOW_SET_in_update238); 
            pushFollow(FOLLOW_values_in_update242);
            values13=values();

            state._fsp--;

            update.setValues(values13);
            // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:85:2: ( where )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==WHERE) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:85:2: where
                    {
                    pushFollow(FOLLOW_where_in_update248);
                    where14=where();

                    state._fsp--;


                    }
                    break;

            }

            update.setWhere(where14);

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
    // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:88:1: colList returns [ColList value] : ( '*' | e= ID ( ',' e= ID )* );
    public final ColList colList() throws RecognitionException {
        ColList value = null;

        Token e=null;

        value = new ColList();
        try {
            // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:90:30: ( '*' | e= ID ( ',' e= ID )* )
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
                    // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:91:2: '*'
                    {
                    match(input,55,FOLLOW_55_in_colList276); 
                    value.add("*");

                    }
                    break;
                case 2 :
                    // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:93:2: e= ID ( ',' e= ID )*
                    {
                    e=(Token)match(input,ID,FOLLOW_ID_in_colList288); 
                    value.add((e!=null?e.getText():null));
                    // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:94:2: ( ',' e= ID )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==56) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:94:3: ',' e= ID
                    	    {
                    	    match(input,56,FOLLOW_56_in_colList296); 
                    	    e=(Token)match(input,ID,FOLLOW_ID_in_colList300); 
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
    // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:97:1: where returns [Where value] : WHERE id= ID op= ( '=' | GE | LE | '<' | '>' ) v= value ( AND id= ID op= ( '=' | GE | LE | '<' | '>' ) v= value )* ;
    public final Where where() throws RecognitionException {
        Where value = null;

        Token id=null;
        Token op=null;
        SqlParser.value_return v = null;


        try {
            // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:98:23: ( WHERE id= ID op= ( '=' | GE | LE | '<' | '>' ) v= value ( AND id= ID op= ( '=' | GE | LE | '<' | '>' ) v= value )* )
            // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:99:2: WHERE id= ID op= ( '=' | GE | LE | '<' | '>' ) v= value ( AND id= ID op= ( '=' | GE | LE | '<' | '>' ) v= value )*
            {
            match(input,WHERE,FOLLOW_WHERE_in_where325); 
            value = new Where();
            id=(Token)match(input,ID,FOLLOW_ID_in_where332); 
            op=(Token)input.LT(1);
            if ( (input.LA(1)>=GE && input.LA(1)<=LE)||(input.LA(1)>=57 && input.LA(1)<=59) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            pushFollow(FOLLOW_value_in_where362);
            v=value();

            state._fsp--;

            value.add((id!=null?id.getText():null),(op!=null?op.getText():null),(v!=null?v.value:null));
            // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:102:2: ( AND id= ID op= ( '=' | GE | LE | '<' | '>' ) v= value )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==AND) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:103:4: AND id= ID op= ( '=' | GE | LE | '<' | '>' ) v= value
            	    {
            	    match(input,AND,FOLLOW_AND_in_where372); 
            	    id=(Token)match(input,ID,FOLLOW_ID_in_where376); 
            	    op=(Token)input.LT(1);
            	    if ( (input.LA(1)>=GE && input.LA(1)<=LE)||(input.LA(1)>=57 && input.LA(1)<=59) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_value_in_where405);
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
    // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:107:1: order returns [Order value] : ORDER BY ID (e= DESC | e= ASC )? ;
    public final Order order() throws RecognitionException {
        Order value = null;

        Token e=null;

        try {
            // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:108:22: ( ORDER BY ID (e= DESC | e= ASC )? )
            // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:109:2: ORDER BY ID (e= DESC | e= ASC )?
            {
            match(input,ORDER,FOLLOW_ORDER_in_order426); 
            match(input,BY,FOLLOW_BY_in_order428); 
            value = new Order();
            match(input,ID,FOLLOW_ID_in_order436); 
            // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:110:6: (e= DESC | e= ASC )?
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
                    // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:110:7: e= DESC
                    {
                    e=(Token)match(input,DESC,FOLLOW_DESC_in_order442); 

                    }
                    break;
                case 2 :
                    // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:110:16: e= ASC
                    {
                    e=(Token)match(input,ASC,FOLLOW_ASC_in_order448); 
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
    // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:113:1: limit returns [Limit value] : LIMIT e1= NUM ',' e2= NUM ;
    public final Limit limit() throws RecognitionException {
        Limit value = null;

        Token e1=null;
        Token e2=null;

        try {
            // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:114:22: ( LIMIT e1= NUM ',' e2= NUM )
            // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:115:2: LIMIT e1= NUM ',' e2= NUM
            {
            match(input,LIMIT,FOLLOW_LIMIT_in_limit468); 
            e1=(Token)match(input,NUM,FOLLOW_NUM_in_limit472); 
            match(input,56,FOLLOW_56_in_limit474); 
            e2=(Token)match(input,NUM,FOLLOW_NUM_in_limit478); 
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
    // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:118:1: table returns [String db,String table] : ( '`' )? e= ID ( '`' )? ( '.' ( '`' )? e= ID ( '`' )? )? ;
    public final SqlParser.table_return table() throws RecognitionException {
        SqlParser.table_return retval = new SqlParser.table_return();
        retval.start = input.LT(1);

        Token e=null;

        try {
            // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:119:34: ( ( '`' )? e= ID ( '`' )? ( '.' ( '`' )? e= ID ( '`' )? )? )
            // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:120:3: ( '`' )? e= ID ( '`' )? ( '.' ( '`' )? e= ID ( '`' )? )?
            {
            // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:120:3: ( '`' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==60) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:120:3: '`'
                    {
                    match(input,60,FOLLOW_60_in_table500); 

                    }
                    break;

            }

            e=(Token)match(input,ID,FOLLOW_ID_in_table505); 
            retval.table = (e!=null?e.getText():null);
            // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:120:34: ( '`' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==60) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:120:34: '`'
                    {
                    match(input,60,FOLLOW_60_in_table510); 

                    }
                    break;

            }

            // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:121:3: ( '.' ( '`' )? e= ID ( '`' )? )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==61) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:121:5: '.' ( '`' )? e= ID ( '`' )?
                    {
                    match(input,61,FOLLOW_61_in_table517); 
                    // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:122:4: ( '`' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==60) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:122:4: '`'
                            {
                            match(input,60,FOLLOW_60_in_table522); 

                            }
                            break;

                    }

                    e=(Token)match(input,ID,FOLLOW_ID_in_table527); 
                    retval.db = retval.table;retval.table =(e!=null?e.getText():null);
                    // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:122:46: ( '`' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==60) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:122:46: '`'
                            {
                            match(input,60,FOLLOW_60_in_table532); 

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
    // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:126:1: valueList returns [ValueList value] : e= value ( ',' e= value )* ;
    public final ValueList valueList() throws RecognitionException {
        ValueList value = null;

        SqlParser.value_return e = null;


        try {
            // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:127:27: (e= value ( ',' e= value )* )
            // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:128:2: e= value ( ',' e= value )*
            {
            value = new ValueList();
            pushFollow(FOLLOW_value_in_valueList560);
            e=value();

            state._fsp--;

            value.add((e!=null?input.toString(e.start,e.stop):null));
            // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:130:2: ( ',' e= value )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==56) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:130:3: ',' e= value
            	    {
            	    match(input,56,FOLLOW_56_in_valueList569); 
            	    pushFollow(FOLLOW_value_in_valueList573);
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
    // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:133:1: values returns [Values value] : id= ID '=' v= value ( ',' id= ID '=' v= value )* ;
    public final Values values() throws RecognitionException {
        Values value = null;

        Token id=null;
        SqlParser.value_return v = null;


        try {
            // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:134:24: (id= ID '=' v= value ( ',' id= ID '=' v= value )* )
            // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:135:4: id= ID '=' v= value ( ',' id= ID '=' v= value )*
            {
            value = new Values();
            id=(Token)match(input,ID,FOLLOW_ID_in_values601); 
            match(input,57,FOLLOW_57_in_values603); 
            pushFollow(FOLLOW_value_in_values607);
            v=value();

            state._fsp--;

            value.add((id!=null?id.getText():null),(v!=null?v.value:null));
            // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:137:2: ( ',' id= ID '=' v= value )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==56) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:137:4: ',' id= ID '=' v= value
            	    {
            	    match(input,56,FOLLOW_56_in_values614); 
            	    id=(Token)match(input,ID,FOLLOW_ID_in_values618); 
            	    match(input,57,FOLLOW_57_in_values620); 
            	    pushFollow(FOLLOW_value_in_values624);
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
    // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:140:1: value returns [String value] : e= ( STRING | NUM ) ;
    public final SqlParser.value_return value() throws RecognitionException {
        SqlParser.value_return retval = new SqlParser.value_return();
        retval.start = input.LT(1);

        Token e=null;

        try {
            // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:141:24: (e= ( STRING | NUM ) )
            // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:142:2: e= ( STRING | NUM )
            {
            e=(Token)input.LT(1);
            if ( (input.LA(1)>=NUM && input.LA(1)<=STRING) ) {
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


 

    public static final BitSet FOLLOW_select_in_parse35 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insert_in_parse39 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_delete_in_parse43 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_update_in_parse47 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_setname_in_parse51 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SET_in_setname63 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NAMES_in_setname65 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_value_in_setname67 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_select82 = new BitSet(new long[]{0x0080000000002000L});
    public static final BitSet FOLLOW_colList_in_select89 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_FROM_in_select94 = new BitSet(new long[]{0x1000000000002000L});
    public static final BitSet FOLLOW_table_in_select100 = new BitSet(new long[]{0x0000000000444002L});
    public static final BitSet FOLLOW_where_in_select106 = new BitSet(new long[]{0x0000000000440002L});
    public static final BitSet FOLLOW_order_in_select113 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_limit_in_select120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSERT_in_insert138 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_INTO_in_insert140 = new BitSet(new long[]{0x1000000000002000L});
    public static final BitSet FOLLOW_table_in_insert148 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_insert156 = new BitSet(new long[]{0x0080000000002000L});
    public static final BitSet FOLLOW_colList_in_insert158 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_insert160 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_VALUES_in_insert166 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_insert169 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_valueList_in_insert171 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_insert173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELETE_in_delete189 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_FROM_in_delete196 = new BitSet(new long[]{0x1000000000002000L});
    public static final BitSet FOLLOW_table_in_delete202 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_where_in_delete208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UPDATE_in_update226 = new BitSet(new long[]{0x1000000000002000L});
    public static final BitSet FOLLOW_table_in_update233 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_SET_in_update238 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_values_in_update242 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_where_in_update248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_colList276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_colList288 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_56_in_colList296 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_colList300 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_WHERE_in_where325 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_where332 = new BitSet(new long[]{0x0E00000000018000L});
    public static final BitSet FOLLOW_set_in_where338 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_value_in_where362 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_AND_in_where372 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_where376 = new BitSet(new long[]{0x0E00000000018000L});
    public static final BitSet FOLLOW_set_in_where381 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_value_in_where405 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ORDER_in_order426 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_BY_in_order428 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_order436 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_DESC_in_order442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASC_in_order448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LIMIT_in_limit468 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_NUM_in_limit472 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_limit474 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_NUM_in_limit478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_table500 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_table505 = new BitSet(new long[]{0x3000000000000002L});
    public static final BitSet FOLLOW_60_in_table510 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_61_in_table517 = new BitSet(new long[]{0x1000000000002000L});
    public static final BitSet FOLLOW_60_in_table522 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_table527 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_60_in_table532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_valueList560 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_56_in_valueList569 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_value_in_valueList573 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_ID_in_values601 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_values603 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_value_in_values607 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_56_in_values614 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_values618 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_values620 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_value_in_values624 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_set_in_value647 = new BitSet(new long[]{0x0000000000000002L});

}