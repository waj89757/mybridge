// $ANTLR 3.3 Nov 30, 2010 12:45:30 G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g 2011-05-10 18:10:13

package mybridge.core.sqlparser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class SqlParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "SELECT", "FROM", "INSERT", "INTO", "VALUES", "DELETE", "UPDATE", "SET", "ID", "WHERE", "GE", "LE", "AND", "ORDER", "BY", "DESC", "ASC", "LIMIT", "NUM", "STRING", "WS", "A", "N", "D", "L", "I", "M", "T", "E", "S", "C", "O", "R", "B", "Y", "V", "U", "IN", "P", "W", "H", "F", "G", "J", "K", "Q", "X", "Z", "'('", "')'", "'*'", "','", "'='", "'<'", "'>'", "'.'"
    };
    public static final int EOF=-1;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int SELECT=4;
    public static final int FROM=5;
    public static final int INSERT=6;
    public static final int INTO=7;
    public static final int VALUES=8;
    public static final int DELETE=9;
    public static final int UPDATE=10;
    public static final int SET=11;
    public static final int ID=12;
    public static final int WHERE=13;
    public static final int GE=14;
    public static final int LE=15;
    public static final int AND=16;
    public static final int ORDER=17;
    public static final int BY=18;
    public static final int DESC=19;
    public static final int ASC=20;
    public static final int LIMIT=21;
    public static final int NUM=22;
    public static final int STRING=23;
    public static final int WS=24;
    public static final int A=25;
    public static final int N=26;
    public static final int D=27;
    public static final int L=28;
    public static final int I=29;
    public static final int M=30;
    public static final int T=31;
    public static final int E=32;
    public static final int S=33;
    public static final int C=34;
    public static final int O=35;
    public static final int R=36;
    public static final int B=37;
    public static final int Y=38;
    public static final int V=39;
    public static final int U=40;
    public static final int IN=41;
    public static final int P=42;
    public static final int W=43;
    public static final int H=44;
    public static final int F=45;
    public static final int G=46;
    public static final int J=47;
    public static final int K=48;
    public static final int Q=49;
    public static final int X=50;
    public static final int Z=51;

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
        	return null;
    }



    // $ANTLR start "parse"
    // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:36:1: parse : ( select | insert | delete | update );
    public final void parse() throws RecognitionException {
        try {
            // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:36:7: ( select | insert | delete | update )
            int alt1=4;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:37:2: select
                    {
                    pushFollow(FOLLOW_select_in_parse34);
                    select();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:37:11: insert
                    {
                    pushFollow(FOLLOW_insert_in_parse38);
                    insert();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:37:20: delete
                    {
                    pushFollow(FOLLOW_delete_in_parse42);
                    delete();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:37:29: update
                    {
                    pushFollow(FOLLOW_update_in_parse46);
                    update();

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


    // $ANTLR start "select"
    // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:40:1: select : SELECT colList FROM table ( where )? ( order )? ( limit )? ;
    public final void select() throws RecognitionException {
        ColList colList1 = null;

        SqlParser.table_return table2 = null;

        Where where3 = null;

        Order order4 = null;

        Limit limit5 = null;


        try {
            // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:40:8: ( SELECT colList FROM table ( where )? ( order )? ( limit )? )
            // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:41:3: SELECT colList FROM table ( where )? ( order )? ( limit )?
            {
            match(input,SELECT,FOLLOW_SELECT_in_select58); 
            select = new SelectStatement();
            pushFollow(FOLLOW_colList_in_select65);
            colList1=colList();

            state._fsp--;

            select.setColList(colList1);
            match(input,FROM,FOLLOW_FROM_in_select70); 
            pushFollow(FOLLOW_table_in_select76);
            table2=table();

            state._fsp--;

            select.db = (table2!=null?table2.db:null);select.table = (table2!=null?table2.table:null);
            // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:45:2: ( where )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==WHERE) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:45:2: where
                    {
                    pushFollow(FOLLOW_where_in_select82);
                    where3=where();

                    state._fsp--;


                    }
                    break;

            }

            select.setWhere(where3);
            // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:46:2: ( order )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==ORDER) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:46:2: order
                    {
                    pushFollow(FOLLOW_order_in_select89);
                    order4=order();

                    state._fsp--;


                    }
                    break;

            }

            select.setOrder(order4);
            // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:47:2: ( limit )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==LIMIT) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:47:2: limit
                    {
                    pushFollow(FOLLOW_limit_in_select96);
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
    // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:50:1: insert : INSERT INTO table '(' colList ')' VALUES '(' valueList ')' ;
    public final void insert() throws RecognitionException {
        SqlParser.table_return table6 = null;

        ColList colList7 = null;

        ValueList valueList8 = null;


        try {
            // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:50:9: ( INSERT INTO table '(' colList ')' VALUES '(' valueList ')' )
            // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:51:3: INSERT INTO table '(' colList ')' VALUES '(' valueList ')'
            {
            match(input,INSERT,FOLLOW_INSERT_in_insert114); 
            match(input,INTO,FOLLOW_INTO_in_insert116); 
            insert = new InsertStatement();
            pushFollow(FOLLOW_table_in_insert124);
            table6=table();

            state._fsp--;

            insert.db = (table6!=null?table6.db:null);insert.table = (table6!=null?table6.table:null);
            match(input,52,FOLLOW_52_in_insert132); 
            pushFollow(FOLLOW_colList_in_insert134);
            colList7=colList();

            state._fsp--;

            match(input,53,FOLLOW_53_in_insert136); 
            insert.setColList(colList7);
            match(input,VALUES,FOLLOW_VALUES_in_insert142); 
            match(input,52,FOLLOW_52_in_insert145); 
            pushFollow(FOLLOW_valueList_in_insert147);
            valueList8=valueList();

            state._fsp--;

            match(input,53,FOLLOW_53_in_insert149); 
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
    // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:58:1: delete : DELETE FROM table ( where )? ;
    public final void delete() throws RecognitionException {
        SqlParser.table_return table9 = null;

        Where where10 = null;


        try {
            // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:58:9: ( DELETE FROM table ( where )? )
            // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:59:2: DELETE FROM table ( where )?
            {
            match(input,DELETE,FOLLOW_DELETE_in_delete165); 
            delete = new DeleteStatement();
            match(input,FROM,FOLLOW_FROM_in_delete172); 
            pushFollow(FOLLOW_table_in_delete178);
            table9=table();

            state._fsp--;

            delete.db = (table9!=null?table9.db:null);delete.table = (table9!=null?table9.table:null);
            // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:62:2: ( where )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==WHERE) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:62:2: where
                    {
                    pushFollow(FOLLOW_where_in_delete184);
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
    // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:65:1: update : UPDATE table SET values ( where )? ;
    public final void update() throws RecognitionException {
        SqlParser.table_return table11 = null;

        Values values12 = null;

        Where where13 = null;


        try {
            // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:65:9: ( UPDATE table SET values ( where )? )
            // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:66:2: UPDATE table SET values ( where )?
            {
            match(input,UPDATE,FOLLOW_UPDATE_in_update202); 
            update = new UpdateStatement();
            pushFollow(FOLLOW_table_in_update209);
            table11=table();

            state._fsp--;

            update.db = (table11!=null?table11.db:null);update.table = (table11!=null?table11.table:null);
            match(input,SET,FOLLOW_SET_in_update214); 
            pushFollow(FOLLOW_values_in_update218);
            values12=values();

            state._fsp--;

            update.setValues(values12);
            // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:70:2: ( where )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==WHERE) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:70:2: where
                    {
                    pushFollow(FOLLOW_where_in_update224);
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
    // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:73:1: colList returns [ColList value] : ( '*' | e= ID ( ',' e= ID )* );
    public final ColList colList() throws RecognitionException {
        ColList value = null;

        Token e=null;

        value = new ColList();
        try {
            // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:75:30: ( '*' | e= ID ( ',' e= ID )* )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==54) ) {
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
                    // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:76:2: '*'
                    {
                    match(input,54,FOLLOW_54_in_colList252); 
                    value.add("*");

                    }
                    break;
                case 2 :
                    // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:78:2: e= ID ( ',' e= ID )*
                    {
                    e=(Token)match(input,ID,FOLLOW_ID_in_colList264); 
                    value.add((e!=null?e.getText():null));
                    // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:79:2: ( ',' e= ID )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==55) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:79:3: ',' e= ID
                    	    {
                    	    match(input,55,FOLLOW_55_in_colList272); 
                    	    e=(Token)match(input,ID,FOLLOW_ID_in_colList276); 
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
    // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:82:1: where returns [Where value] : WHERE id= ID op= ( '=' | GE | LE | '<' | '>' ) v= value ( AND id= ID op= ( '=' | GE | LE | '<' | '>' ) v= value )* ;
    public final Where where() throws RecognitionException {
        Where value = null;

        Token id=null;
        Token op=null;
        SqlParser.value_return v = null;


        try {
            // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:83:23: ( WHERE id= ID op= ( '=' | GE | LE | '<' | '>' ) v= value ( AND id= ID op= ( '=' | GE | LE | '<' | '>' ) v= value )* )
            // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:84:2: WHERE id= ID op= ( '=' | GE | LE | '<' | '>' ) v= value ( AND id= ID op= ( '=' | GE | LE | '<' | '>' ) v= value )*
            {
            match(input,WHERE,FOLLOW_WHERE_in_where301); 
            value = new Where();
            id=(Token)match(input,ID,FOLLOW_ID_in_where308); 
            op=(Token)input.LT(1);
            if ( (input.LA(1)>=GE && input.LA(1)<=LE)||(input.LA(1)>=56 && input.LA(1)<=58) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            pushFollow(FOLLOW_value_in_where338);
            v=value();

            state._fsp--;

            value.add((id!=null?id.getText():null),(op!=null?op.getText():null),(v!=null?v.value:null));
            // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:87:2: ( AND id= ID op= ( '=' | GE | LE | '<' | '>' ) v= value )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==AND) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:88:4: AND id= ID op= ( '=' | GE | LE | '<' | '>' ) v= value
            	    {
            	    match(input,AND,FOLLOW_AND_in_where348); 
            	    id=(Token)match(input,ID,FOLLOW_ID_in_where352); 
            	    op=(Token)input.LT(1);
            	    if ( (input.LA(1)>=GE && input.LA(1)<=LE)||(input.LA(1)>=56 && input.LA(1)<=58) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_value_in_where381);
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
    // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:92:1: order returns [Order value] : ORDER BY ID (e= DESC | e= ASC )? ;
    public final Order order() throws RecognitionException {
        Order value = null;

        Token e=null;

        try {
            // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:93:22: ( ORDER BY ID (e= DESC | e= ASC )? )
            // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:94:2: ORDER BY ID (e= DESC | e= ASC )?
            {
            match(input,ORDER,FOLLOW_ORDER_in_order402); 
            match(input,BY,FOLLOW_BY_in_order404); 
            value = new Order();
            match(input,ID,FOLLOW_ID_in_order412); 
            // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:95:6: (e= DESC | e= ASC )?
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
                    // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:95:7: e= DESC
                    {
                    e=(Token)match(input,DESC,FOLLOW_DESC_in_order418); 

                    }
                    break;
                case 2 :
                    // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:95:16: e= ASC
                    {
                    e=(Token)match(input,ASC,FOLLOW_ASC_in_order424); 
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
    // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:98:1: limit returns [Limit value] : LIMIT e1= NUM ',' e2= NUM ;
    public final Limit limit() throws RecognitionException {
        Limit value = null;

        Token e1=null;
        Token e2=null;

        try {
            // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:99:22: ( LIMIT e1= NUM ',' e2= NUM )
            // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:100:2: LIMIT e1= NUM ',' e2= NUM
            {
            match(input,LIMIT,FOLLOW_LIMIT_in_limit444); 
            e1=(Token)match(input,NUM,FOLLOW_NUM_in_limit448); 
            match(input,55,FOLLOW_55_in_limit450); 
            e2=(Token)match(input,NUM,FOLLOW_NUM_in_limit454); 
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
    // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:103:1: table returns [String db,String table] : e= ID ( '.' e= ID )? ;
    public final SqlParser.table_return table() throws RecognitionException {
        SqlParser.table_return retval = new SqlParser.table_return();
        retval.start = input.LT(1);

        Token e=null;

        try {
            // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:104:34: (e= ID ( '.' e= ID )? )
            // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:105:3: e= ID ( '.' e= ID )?
            {
            e=(Token)match(input,ID,FOLLOW_ID_in_table478); 
            retval.table = (e!=null?e.getText():null);
            // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:106:3: ( '.' e= ID )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==59) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:106:5: '.' e= ID
                    {
                    match(input,59,FOLLOW_59_in_table489); 
                    e=(Token)match(input,ID,FOLLOW_ID_in_table496); 
                    retval.db = retval.table;retval.table =(e!=null?e.getText():null);

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
    // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:111:1: valueList returns [ValueList value] : e= value ( ',' e= value )* ;
    public final ValueList valueList() throws RecognitionException {
        ValueList value = null;

        SqlParser.value_return e = null;


        try {
            // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:112:27: (e= value ( ',' e= value )* )
            // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:113:2: e= value ( ',' e= value )*
            {
            value = new ValueList();
            pushFollow(FOLLOW_value_in_valueList526);
            e=value();

            state._fsp--;

            value.add((e!=null?input.toString(e.start,e.stop):null));
            // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:115:2: ( ',' e= value )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==55) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:115:3: ',' e= value
            	    {
            	    match(input,55,FOLLOW_55_in_valueList535); 
            	    pushFollow(FOLLOW_value_in_valueList539);
            	    e=value();

            	    state._fsp--;

            	    value.add((e!=null?input.toString(e.start,e.stop):null));

            	    }
            	    break;

            	default :
            	    break loop12;
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
    // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:118:1: values returns [Values value] : id= ID '=' v= value ( ',' id= ID '=' v= value )* ;
    public final Values values() throws RecognitionException {
        Values value = null;

        Token id=null;
        SqlParser.value_return v = null;


        try {
            // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:119:24: (id= ID '=' v= value ( ',' id= ID '=' v= value )* )
            // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:120:4: id= ID '=' v= value ( ',' id= ID '=' v= value )*
            {
            value = new Values();
            id=(Token)match(input,ID,FOLLOW_ID_in_values567); 
            match(input,56,FOLLOW_56_in_values569); 
            pushFollow(FOLLOW_value_in_values573);
            v=value();

            state._fsp--;

            value.add((id!=null?id.getText():null),(v!=null?v.value:null));
            // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:122:2: ( ',' id= ID '=' v= value )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==55) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:122:4: ',' id= ID '=' v= value
            	    {
            	    match(input,55,FOLLOW_55_in_values580); 
            	    id=(Token)match(input,ID,FOLLOW_ID_in_values584); 
            	    match(input,56,FOLLOW_56_in_values586); 
            	    pushFollow(FOLLOW_value_in_values590);
            	    v=value();

            	    state._fsp--;

            	    value.add((id!=null?id.getText():null),(v!=null?v.value:null));

            	    }
            	    break;

            	default :
            	    break loop13;
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
    // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:125:1: value returns [String value] : e= ( STRING | NUM ) ;
    public final SqlParser.value_return value() throws RecognitionException {
        SqlParser.value_return retval = new SqlParser.value_return();
        retval.start = input.LT(1);

        Token e=null;

        try {
            // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:126:24: (e= ( STRING | NUM ) )
            // G:\\code\\mybridge\\src\\mybridge\\core\\sqlparser\\Sql.g:127:2: e= ( STRING | NUM )
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


 

    public static final BitSet FOLLOW_select_in_parse34 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insert_in_parse38 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_delete_in_parse42 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_update_in_parse46 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_select58 = new BitSet(new long[]{0x0040000000001000L});
    public static final BitSet FOLLOW_colList_in_select65 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_FROM_in_select70 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_table_in_select76 = new BitSet(new long[]{0x0000000000222002L});
    public static final BitSet FOLLOW_where_in_select82 = new BitSet(new long[]{0x0000000000220002L});
    public static final BitSet FOLLOW_order_in_select89 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_limit_in_select96 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSERT_in_insert114 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_INTO_in_insert116 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_table_in_insert124 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_insert132 = new BitSet(new long[]{0x0040000000001000L});
    public static final BitSet FOLLOW_colList_in_insert134 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_insert136 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_VALUES_in_insert142 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_insert145 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_valueList_in_insert147 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_insert149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELETE_in_delete165 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_FROM_in_delete172 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_table_in_delete178 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_where_in_delete184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UPDATE_in_update202 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_table_in_update209 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_SET_in_update214 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_values_in_update218 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_where_in_update224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_colList252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_colList264 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_55_in_colList272 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ID_in_colList276 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_WHERE_in_where301 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ID_in_where308 = new BitSet(new long[]{0x070000000000C000L});
    public static final BitSet FOLLOW_set_in_where314 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_value_in_where338 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_AND_in_where348 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ID_in_where352 = new BitSet(new long[]{0x070000000000C000L});
    public static final BitSet FOLLOW_set_in_where357 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_value_in_where381 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ORDER_in_order402 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_BY_in_order404 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ID_in_order412 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_DESC_in_order418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASC_in_order424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LIMIT_in_limit444 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_NUM_in_limit448 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_limit450 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_NUM_in_limit454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_table478 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_59_in_table489 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ID_in_table496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_valueList526 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_55_in_valueList535 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_value_in_valueList539 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_ID_in_values567 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_values569 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_value_in_values573 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_55_in_values580 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ID_in_values584 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_values586 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_value_in_values590 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_set_in_value613 = new BitSet(new long[]{0x0000000000000002L});

}