// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g 2011-05-06 14:13:34

package mybridge.sql.parser;

import mybridge.sql.statement.*;
import java.util.Iterator;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class SqlParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "SELECT", "FROM", "ID", "INSERT", "INTO", "VALUES", "VALUE", "DELETE", "UPDATE", "SET", "WHERE", "WS", "OP", "IN", "STRING", "NUM", "'('", "')'", "','", "'='", "'*'"
    };
    public static final int WHERE=14;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int VALUES=9;
    public static final int UPDATE=12;
    public static final int SET=13;
    public static final int DELETE=11;
    public static final int VALUE=10;
    public static final int ID=6;
    public static final int EOF=-1;
    public static final int NUM=19;
    public static final int WS=15;
    public static final int IN=17;
    public static final int INSERT=7;
    public static final int OP=16;
    public static final int FROM=5;
    public static final int SELECT=4;
    public static final int INTO=8;
    public static final int STRING=18;

    // delegates
    // delegators


        public SqlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public SqlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return SqlParser.tokenNames; }
    public String getGrammarFileName() { return "/home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g"; }


        public SqlStatement sql;
        public boolean parseOk = false;



    // $ANTLR start "statement"
    // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:17:1: statement : ( select | insert | delete | update ) ;
    public final void statement() throws RecognitionException {
        try {
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:17:11: ( ( select | insert | delete | update ) )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:17:13: ( select | insert | delete | update )
            {
            sql = new SqlStatement();parseOk = false;
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:18:2: ( select | insert | delete | update )
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
                    // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:18:3: select
                    {
                    pushFollow(FOLLOW_select_in_statement32);
                    select();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:18:12: insert
                    {
                    pushFollow(FOLLOW_insert_in_statement36);
                    insert();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:18:21: delete
                    {
                    pushFollow(FOLLOW_delete_in_statement40);
                    delete();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:18:30: update
                    {
                    pushFollow(FOLLOW_update_in_statement44);
                    update();

                    state._fsp--;


                    }
                    break;

            }

            parseOk = true;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "statement"


    // $ANTLR start "select"
    // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:20:1: select : SELECT columns FROM e= ID where ;
    public final void select() throws RecognitionException {
        Token e=null;

        try {
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:20:8: ( SELECT columns FROM e= ID where )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:20:10: SELECT columns FROM e= ID where
            {
            match(input,SELECT,FOLLOW_SELECT_in_select56); 
            sql.type=SqlStatement.SELECT;
            pushFollow(FOLLOW_columns_in_select64);
            columns();

            state._fsp--;

            match(input,FROM,FOLLOW_FROM_in_select66); 
            e=(Token)match(input,ID,FOLLOW_ID_in_select74); 
            sql.table = (e!=null?e.getText():null);
            pushFollow(FOLLOW_where_in_select82);
            where();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "select"


    // $ANTLR start "insert"
    // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:24:1: insert : INSERT INTO e= ID '(' columns ')' VALUES '(' e= VALUE ( ',' e= VALUE )* ')' ;
    public final void insert() throws RecognitionException {
        Token e=null;

        try {
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:24:9: ( INSERT INTO e= ID '(' columns ')' VALUES '(' e= VALUE ( ',' e= VALUE )* ')' )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:24:11: INSERT INTO e= ID '(' columns ')' VALUES '(' e= VALUE ( ',' e= VALUE )* ')'
            {
            match(input,INSERT,FOLLOW_INSERT_in_insert90); 
            sql.type=SqlStatement.INSERT;
            match(input,INTO,FOLLOW_INTO_in_insert98); 
            e=(Token)match(input,ID,FOLLOW_ID_in_insert102); 
            sql.table = (e!=null?e.getText():null);
            match(input,20,FOLLOW_20_in_insert110); 
            pushFollow(FOLLOW_columns_in_insert112);
            columns();

            state._fsp--;

            Iterator<String> it = sql.fields.iterator();
            match(input,21,FOLLOW_21_in_insert116); 
            match(input,VALUES,FOLLOW_VALUES_in_insert119); 
            match(input,20,FOLLOW_20_in_insert121); 
            e=(Token)match(input,VALUE,FOLLOW_VALUE_in_insert126); 

            	  	if (it.hasNext())
            	  	{
            	  	    throw new RecognitionException();
            	  	}
            	  	sql.values.put(it.next(),(e!=null?e.getText():null));
            	  
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:34:5: ( ',' e= VALUE )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==22) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:34:6: ',' e= VALUE
            	    {
            	    match(input,22,FOLLOW_22_in_insert139); 
            	    e=(Token)match(input,VALUE,FOLLOW_VALUE_in_insert145); 

            	    	  	if (it.hasNext())
            	    	  	{
            	    	  	    throw new RecognitionException();
            	    	  	}
            	    	  	sql.values.put(it.next(),(e!=null?e.getText():null));
            	    	  

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match(input,21,FOLLOW_21_in_insert159); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "insert"


    // $ANTLR start "delete"
    // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:43:1: delete : DELETE FROM e= ID where ;
    public final void delete() throws RecognitionException {
        Token e=null;

        try {
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:43:9: ( DELETE FROM e= ID where )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:43:11: DELETE FROM e= ID where
            {
            match(input,DELETE,FOLLOW_DELETE_in_delete167); 
            sql.type=SqlStatement.DELETE;
            match(input,FROM,FOLLOW_FROM_in_delete175); 
            e=(Token)match(input,ID,FOLLOW_ID_in_delete179); 
            sql.table = (e!=null?e.getText():null);
            pushFollow(FOLLOW_where_in_delete187);
            where();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "delete"


    // $ANTLR start "update"
    // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:46:1: update : UPDATE e= ID SET e= ID '=' f= VALUE ( ',' ID '=' VALUE )* where ;
    public final void update() throws RecognitionException {
        Token e=null;
        Token f=null;

        try {
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:46:9: ( UPDATE e= ID SET e= ID '=' f= VALUE ( ',' ID '=' VALUE )* where )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:46:11: UPDATE e= ID SET e= ID '=' f= VALUE ( ',' ID '=' VALUE )* where
            {
            match(input,UPDATE,FOLLOW_UPDATE_in_update196); 
            sql.type=SqlStatement.UPDATE;
            e=(Token)match(input,ID,FOLLOW_ID_in_update206); 
            sql.table = (e!=null?e.getText():null);
            match(input,SET,FOLLOW_SET_in_update214); 
            e=(Token)match(input,ID,FOLLOW_ID_in_update218); 
            match(input,23,FOLLOW_23_in_update220); 
            f=(Token)match(input,VALUE,FOLLOW_VALUE_in_update224); 
            sql.values.put((e!=null?e.getText():null),(e!=null?e.getText():null));
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:49:5: ( ',' ID '=' VALUE )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==22) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:50:5: ',' ID '=' VALUE
            	    {
            	    match(input,22,FOLLOW_22_in_update238); 
            	    match(input,ID,FOLLOW_ID_in_update240); 
            	    match(input,23,FOLLOW_23_in_update242); 
            	    match(input,VALUE,FOLLOW_VALUE_in_update244); 
            	    sql.values.put((e!=null?e.getText():null),(e!=null?e.getText():null));

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            pushFollow(FOLLOW_where_in_update255);
            where();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "update"


    // $ANTLR start "columns"
    // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:52:1: columns : (e= ID | '*' ) ( ',' e= ID )* ;
    public final void columns() throws RecognitionException {
        Token e=null;

        try {
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:52:8: ( (e= ID | '*' ) ( ',' e= ID )* )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:52:10: (e= ID | '*' ) ( ',' e= ID )*
            {
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:52:10: (e= ID | '*' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==24) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:52:11: e= ID
                    {
                    e=(Token)match(input,ID,FOLLOW_ID_in_columns265); 

                    }
                    break;
                case 2 :
                    // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:52:16: '*'
                    {
                    match(input,24,FOLLOW_24_in_columns267); 

                    }
                    break;

            }

            sql.fields.add((e!=null?e.getText():null));
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:52:48: ( ',' e= ID )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==22) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:52:49: ',' e= ID
            	    {
            	    match(input,22,FOLLOW_22_in_columns273); 
            	    e=(Token)match(input,ID,FOLLOW_ID_in_columns277); 
            	    sql.fields.add((e!=null?e.getText():null));

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "columns"


    // $ANTLR start "where"
    // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:53:1: where : WHERE ( in | eq ) ( WS OP ID ( in | eq ) )* ;
    public final void where() throws RecognitionException {
        try {
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:53:8: ( WHERE ( in | eq ) ( WS OP ID ( in | eq ) )* )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:53:10: WHERE ( in | eq ) ( WS OP ID ( in | eq ) )*
            {
            match(input,WHERE,FOLLOW_WHERE_in_where289); 
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:53:16: ( in | eq )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==ID) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==IN) ) {
                    alt6=1;
                }
                else if ( (LA6_1==23) ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:53:18: in
                    {
                    pushFollow(FOLLOW_in_in_where293);
                    in();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:53:23: eq
                    {
                    pushFollow(FOLLOW_eq_in_where297);
                    eq();

                    state._fsp--;


                    }
                    break;

            }

            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:53:28: ( WS OP ID ( in | eq ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==WS) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:53:30: WS OP ID ( in | eq )
            	    {
            	    match(input,WS,FOLLOW_WS_in_where303); 
            	    match(input,OP,FOLLOW_OP_in_where305); 
            	    match(input,ID,FOLLOW_ID_in_where307); 
            	    // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:53:39: ( in | eq )
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0==ID) ) {
            	        int LA7_1 = input.LA(2);

            	        if ( (LA7_1==IN) ) {
            	            alt7=1;
            	        }
            	        else if ( (LA7_1==23) ) {
            	            alt7=2;
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 7, 1, input);

            	            throw nvae;
            	        }
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 7, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:53:40: in
            	            {
            	            pushFollow(FOLLOW_in_in_where310);
            	            in();

            	            state._fsp--;


            	            }
            	            break;
            	        case 2 :
            	            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:53:45: eq
            	            {
            	            pushFollow(FOLLOW_eq_in_where314);
            	            eq();

            	            state._fsp--;


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "where"


    // $ANTLR start "in"
    // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:54:1: in : ID IN '(' e= VALUE ( ',' e= VALUE )* ')' ;
    public final void in() throws RecognitionException {
        Token e=null;
        Token ID1=null;

        try {
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:54:4: ( ID IN '(' e= VALUE ( ',' e= VALUE )* ')' )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:54:6: ID IN '(' e= VALUE ( ',' e= VALUE )* ')'
            {
            ID1=(Token)match(input,ID,FOLLOW_ID_in_in326); 

            		if (sql.where.get((ID1!=null?ID1.getText():null)) == null) {
            		  sql.where.put((ID1!=null?ID1.getText():null),new ArrayList<String>());
            		}
            	
            match(input,IN,FOLLOW_IN_in_in333); 
            match(input,20,FOLLOW_20_in_in335); 
            e=(Token)match(input,VALUE,FOLLOW_VALUE_in_in341); 
            sql.where.get((ID1!=null?ID1.getText():null)).add((e!=null?e.getText():null));
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:62:2: ( ',' e= VALUE )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==22) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:62:3: ',' e= VALUE
            	    {
            	    match(input,22,FOLLOW_22_in_in348); 
            	    e=(Token)match(input,VALUE,FOLLOW_VALUE_in_in352); 
            	    sql.where.get((ID1!=null?ID1.getText():null)).add((e!=null?e.getText():null));

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match(input,21,FOLLOW_21_in_in359); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "in"


    // $ANTLR start "eq"
    // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:64:1: eq : ID '=' e= VALUE ;
    public final void eq() throws RecognitionException {
        Token e=null;
        Token ID2=null;

        try {
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:64:4: ( ID '=' e= VALUE )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:64:9: ID '=' e= VALUE
            {
            ID2=(Token)match(input,ID,FOLLOW_ID_in_eq369); 

            		if (sql.where.get((ID2!=null?ID2.getText():null)) == null) {
            		  sql.where.put((ID2!=null?ID2.getText():null),new ArrayList<String>());
            		}
            	
            match(input,23,FOLLOW_23_in_eq377); 
            e=(Token)match(input,VALUE,FOLLOW_VALUE_in_eq384); 
            sql.where.get((ID2!=null?ID2.getText():null)).add((e!=null?e.getText():null));

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "eq"

    // Delegated rules


 

    public static final BitSet FOLLOW_select_in_statement32 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insert_in_statement36 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_delete_in_statement40 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_update_in_statement44 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_select56 = new BitSet(new long[]{0x0000000001000040L});
    public static final BitSet FOLLOW_columns_in_select64 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_FROM_in_select66 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_select74 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_where_in_select82 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSERT_in_insert90 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_INTO_in_insert98 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_insert102 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_insert110 = new BitSet(new long[]{0x0000000001000040L});
    public static final BitSet FOLLOW_columns_in_insert112 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_insert116 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_VALUES_in_insert119 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_insert121 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_VALUE_in_insert126 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_22_in_insert139 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_VALUE_in_insert145 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_21_in_insert159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELETE_in_delete167 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_FROM_in_delete175 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_delete179 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_where_in_delete187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UPDATE_in_update196 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_update206 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_SET_in_update214 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_update218 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_update220 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_VALUE_in_update224 = new BitSet(new long[]{0x0000000000404000L});
    public static final BitSet FOLLOW_22_in_update238 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_update240 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_update242 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_VALUE_in_update244 = new BitSet(new long[]{0x0000000000404000L});
    public static final BitSet FOLLOW_where_in_update255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_columns265 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_24_in_columns267 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_columns273 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_columns277 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_WHERE_in_where289 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_in_in_where293 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_eq_in_where297 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_WS_in_where303 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_OP_in_where305 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_where307 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_in_in_where310 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_eq_in_where314 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ID_in_in326 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_IN_in_in333 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_in335 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_VALUE_in_in341 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_22_in_in348 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_VALUE_in_in352 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_21_in_in359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_eq369 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_eq377 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_VALUE_in_eq384 = new BitSet(new long[]{0x0000000000000002L});

}