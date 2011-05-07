// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g 2011-05-07 11:47:15

package mybridge.sql.parser;

import mybridge.sql.statement.*;
import java.util.Iterator;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class SqlParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "SELECT", "FROM", "INSERT", "INTO", "VALUES", "VALUE", "DELETE", "UPDATE", "SET", "ID", "WHERE", "OP", "IN", "WS", "STRING", "NUM", "'('", "')'", "','", "'='", "'`'", "'.'"
    };
    public static final int WHERE=14;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int VALUES=8;
    public static final int UPDATE=11;
    public static final int SET=12;
    public static final int DELETE=10;
    public static final int VALUE=9;
    public static final int ID=13;
    public static final int EOF=-1;
    public static final int NUM=19;
    public static final int WS=17;
    public static final int IN=16;
    public static final int INSERT=6;
    public static final int OP=15;
    public static final int FROM=5;
    public static final int SELECT=4;
    public static final int INTO=7;
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



    // $ANTLR start "sql"
    // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:17:1: sql : statement ;
    public final void sql() throws RecognitionException {
        try {
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:17:5: ( statement )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:18:2: statement
            {
            sql = new SqlStatement();parseOk = false;
            pushFollow(FOLLOW_statement_in_sql31);
            statement();

            state._fsp--;

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
    // $ANTLR end "sql"


    // $ANTLR start "statement"
    // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:22:1: statement : ( select | insert | delete | update );
    public final void statement() throws RecognitionException {
        try {
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:22:10: ( select | insert | delete | update )
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
                    // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:22:11: select
                    {
                    pushFollow(FOLLOW_select_in_statement42);
                    select();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:22:20: insert
                    {
                    pushFollow(FOLLOW_insert_in_statement46);
                    insert();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:22:29: delete
                    {
                    pushFollow(FOLLOW_delete_in_statement50);
                    delete();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:22:38: update
                    {
                    pushFollow(FOLLOW_update_in_statement54);
                    update();

                    state._fsp--;


                    }
                    break;

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
    // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:24:1: select : SELECT columns FROM table ( where )? ;
    public final void select() throws RecognitionException {
        try {
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:24:8: ( SELECT columns FROM table ( where )? )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:24:10: SELECT columns FROM table ( where )?
            {
            match(input,SELECT,FOLLOW_SELECT_in_select62); 
            sql.type=SqlStatement.SELECT;
            pushFollow(FOLLOW_columns_in_select70);
            columns();

            state._fsp--;

            match(input,FROM,FOLLOW_FROM_in_select75); 
            pushFollow(FOLLOW_table_in_select81);
            table();

            state._fsp--;

            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:28:4: ( where )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==WHERE) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:28:4: where
                    {
                    pushFollow(FOLLOW_where_in_select86);
                    where();

                    state._fsp--;


                    }
                    break;

            }


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
    // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:29:1: insert : INSERT INTO table '(' columns ')' VALUES '(' e= VALUE ( ',' e= VALUE )* ')' ;
    public final void insert() throws RecognitionException {
        Token e=null;

        try {
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:29:9: ( INSERT INTO table '(' columns ')' VALUES '(' e= VALUE ( ',' e= VALUE )* ')' )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:29:11: INSERT INTO table '(' columns ')' VALUES '(' e= VALUE ( ',' e= VALUE )* ')'
            {
            match(input,INSERT,FOLLOW_INSERT_in_insert95); 
            sql.type=SqlStatement.INSERT;
            match(input,INTO,FOLLOW_INTO_in_insert107); 
            pushFollow(FOLLOW_table_in_insert113);
            table();

            state._fsp--;

            match(input,20,FOLLOW_20_in_insert118); 
            pushFollow(FOLLOW_columns_in_insert123);
            columns();

            state._fsp--;

            Iterator<String> it = sql.fields.iterator();
            match(input,21,FOLLOW_21_in_insert130); 
            match(input,VALUES,FOLLOW_VALUES_in_insert136); 
            match(input,20,FOLLOW_20_in_insert141); 
            e=(Token)match(input,VALUE,FOLLOW_VALUE_in_insert150); 

            	  	if (!it.hasNext())
            	  	{
            	  	    throw new RecognitionException();
            	  	}
            	  	sql.values.put(it.next(),(e!=null?e.getText():null));
            	  
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:46:4: ( ',' e= VALUE )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==22) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:46:5: ',' e= VALUE
            	    {
            	    match(input,22,FOLLOW_22_in_insert162); 
            	    e=(Token)match(input,VALUE,FOLLOW_VALUE_in_insert171); 

            	    	  	if (!it.hasNext())
            	    	  	{
            	    	  	    throw new RecognitionException();
            	    	  	}
            	    	  	sql.values.put(it.next(),(e!=null?e.getText():null));
            	    	  

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            	  	if (it.hasNext()) {
            	  	    throw new RecognitionException();
            	  	}
            	  
            match(input,21,FOLLOW_21_in_insert193); 

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
    // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:62:1: delete : DELETE FROM table ( where )? ;
    public final void delete() throws RecognitionException {
        try {
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:62:9: ( DELETE FROM table ( where )? )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:62:11: DELETE FROM table ( where )?
            {
            match(input,DELETE,FOLLOW_DELETE_in_delete201); 
            sql.type=SqlStatement.DELETE;
            match(input,FROM,FOLLOW_FROM_in_delete209); 
            pushFollow(FOLLOW_table_in_delete214);
            table();

            state._fsp--;

            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:65:4: ( where )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==WHERE) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:65:4: where
                    {
                    pushFollow(FOLLOW_where_in_delete219);
                    where();

                    state._fsp--;


                    }
                    break;

            }


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
    // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:66:1: update : UPDATE table SET e= ID '=' f= VALUE ( ',' e= ID '=' f= VALUE )* ( where )? ;
    public final void update() throws RecognitionException {
        Token e=null;
        Token f=null;

        try {
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:66:9: ( UPDATE table SET e= ID '=' f= VALUE ( ',' e= ID '=' f= VALUE )* ( where )? )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:66:11: UPDATE table SET e= ID '=' f= VALUE ( ',' e= ID '=' f= VALUE )* ( where )?
            {
            match(input,UPDATE,FOLLOW_UPDATE_in_update229); 
            sql.type=SqlStatement.UPDATE;
            pushFollow(FOLLOW_table_in_update237);
            table();

            state._fsp--;

            match(input,SET,FOLLOW_SET_in_update242); 
            e=(Token)match(input,ID,FOLLOW_ID_in_update246); 
            match(input,23,FOLLOW_23_in_update248); 
            f=(Token)match(input,VALUE,FOLLOW_VALUE_in_update252); 
            sql.values.put((e!=null?e.getText():null),(f!=null?f.getText():null));
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:69:5: ( ',' e= ID '=' f= VALUE )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==22) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:70:5: ',' e= ID '=' f= VALUE
            	    {
            	    match(input,22,FOLLOW_22_in_update266); 
            	    e=(Token)match(input,ID,FOLLOW_ID_in_update270); 
            	    match(input,23,FOLLOW_23_in_update272); 
            	    f=(Token)match(input,VALUE,FOLLOW_VALUE_in_update276); 
            	    sql.values.put((e!=null?e.getText():null),(f!=null?f.getText():null));

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:71:8: ( where )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==WHERE) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:71:8: where
                    {
                    pushFollow(FOLLOW_where_in_update287);
                    where();

                    state._fsp--;


                    }
                    break;

            }


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
    // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:72:1: columns : (e= ID ) ( ',' e= ID )* ;
    public final void columns() throws RecognitionException {
        Token e=null;

        try {
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:72:8: ( (e= ID ) ( ',' e= ID )* )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:72:10: (e= ID ) ( ',' e= ID )*
            {
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:72:10: (e= ID )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:72:11: e= ID
            {
            e=(Token)match(input,ID,FOLLOW_ID_in_columns298); 

            }

            sql.fields.add((e!=null?e.getText():null));
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:74:3: ( ',' e= ID )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==22) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:74:4: ',' e= ID
            	    {
            	    match(input,22,FOLLOW_22_in_columns309); 
            	    e=(Token)match(input,ID,FOLLOW_ID_in_columns313); 
            	    sql.fields.add((e!=null?e.getText():null));

            	    }
            	    break;

            	default :
            	    break loop7;
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
    // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:75:1: where : WHERE ( in | eq ) ( OP ( in | eq ) )* ;
    public final void where() throws RecognitionException {
        try {
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:75:8: ( WHERE ( in | eq ) ( OP ( in | eq ) )* )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:75:10: WHERE ( in | eq ) ( OP ( in | eq ) )*
            {
            match(input,WHERE,FOLLOW_WHERE_in_where325); 
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:75:16: ( in | eq )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==ID) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==23) ) {
                    alt8=2;
                }
                else if ( (LA8_1==IN) ) {
                    alt8=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:75:18: in
                    {
                    pushFollow(FOLLOW_in_in_where329);
                    in();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:75:23: eq
                    {
                    pushFollow(FOLLOW_eq_in_where333);
                    eq();

                    state._fsp--;


                    }
                    break;

            }

            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:75:28: ( OP ( in | eq ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==OP) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:75:29: OP ( in | eq )
            	    {
            	    match(input,OP,FOLLOW_OP_in_where338); 
            	    // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:75:32: ( in | eq )
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0==ID) ) {
            	        int LA9_1 = input.LA(2);

            	        if ( (LA9_1==IN) ) {
            	            alt9=1;
            	        }
            	        else if ( (LA9_1==23) ) {
            	            alt9=2;
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 9, 1, input);

            	            throw nvae;
            	        }
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 9, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:75:33: in
            	            {
            	            pushFollow(FOLLOW_in_in_where341);
            	            in();

            	            state._fsp--;


            	            }
            	            break;
            	        case 2 :
            	            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:75:38: eq
            	            {
            	            pushFollow(FOLLOW_eq_in_where345);
            	            eq();

            	            state._fsp--;


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
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


    // $ANTLR start "table"
    // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:76:1: table : ( '`' )? e= ID ( '`' )? ( '.' ( '`' )? f= ID ( '`' )? )? ;
    public final void table() throws RecognitionException {
        Token e=null;
        Token f=null;

        try {
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:76:7: ( ( '`' )? e= ID ( '`' )? ( '.' ( '`' )? f= ID ( '`' )? )? )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:76:9: ( '`' )? e= ID ( '`' )? ( '.' ( '`' )? f= ID ( '`' )? )?
            {
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:76:9: ( '`' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:76:10: '`'
                    {
                    match(input,24,FOLLOW_24_in_table358); 

                    }
                    break;

            }

            e=(Token)match(input,ID,FOLLOW_ID_in_table364); 
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:76:21: ( '`' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:76:22: '`'
                    {
                    match(input,24,FOLLOW_24_in_table367); 

                    }
                    break;

            }

            sql.table = (e!=null?e.getText():null);
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:76:53: ( '.' ( '`' )? f= ID ( '`' )? )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==25) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:76:54: '.' ( '`' )? f= ID ( '`' )?
                    {
                    match(input,25,FOLLOW_25_in_table376); 
                    // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:76:58: ( '`' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==24) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:76:59: '`'
                            {
                            match(input,24,FOLLOW_24_in_table379); 

                            }
                            break;

                    }

                    f=(Token)match(input,ID,FOLLOW_ID_in_table385); 
                    sql.db = (e!=null?e.getText():null);sql.table = (f!=null?f.getText():null);
                    // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:76:111: ( '`' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==24) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:76:112: '`'
                            {
                            match(input,24,FOLLOW_24_in_table391); 

                            }
                            break;

                    }


                    }
                    break;

            }


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
    // $ANTLR end "table"


    // $ANTLR start "in"
    // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:77:1: in : ID IN '(' e= VALUE ( ',' e= VALUE )* ')' ;
    public final void in() throws RecognitionException {
        Token e=null;
        Token ID1=null;

        try {
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:77:4: ( ID IN '(' e= VALUE ( ',' e= VALUE )* ')' )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:77:6: ID IN '(' e= VALUE ( ',' e= VALUE )* ')'
            {
            ID1=(Token)match(input,ID,FOLLOW_ID_in_in402); 

            		if (sql.where.get((ID1!=null?ID1.getText():null)) == null) {
            		  sql.where.put((ID1!=null?ID1.getText():null),new ArrayList<String>());
            		}
            	
            match(input,IN,FOLLOW_IN_in_in409); 
            match(input,20,FOLLOW_20_in_in411); 
            e=(Token)match(input,VALUE,FOLLOW_VALUE_in_in417); 
            sql.where.get((ID1!=null?ID1.getText():null)).add((e!=null?e.getText():null));
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:85:2: ( ',' e= VALUE )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==22) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:85:3: ',' e= VALUE
            	    {
            	    match(input,22,FOLLOW_22_in_in424); 
            	    e=(Token)match(input,VALUE,FOLLOW_VALUE_in_in427); 
            	    sql.where.get((ID1!=null?ID1.getText():null)).add((e!=null?e.getText():null));

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            match(input,21,FOLLOW_21_in_in432); 

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
    // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:86:1: eq : ID '=' e= VALUE ;
    public final void eq() throws RecognitionException {
        Token e=null;
        Token ID2=null;

        try {
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:86:4: ( ID '=' e= VALUE )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:86:9: ID '=' e= VALUE
            {
            ID2=(Token)match(input,ID,FOLLOW_ID_in_eq442); 

            		if (sql.where.get((ID2!=null?ID2.getText():null)) == null) {
            		  sql.where.put((ID2!=null?ID2.getText():null),new ArrayList<String>());
            		}
            	
            match(input,23,FOLLOW_23_in_eq450); 
            e=(Token)match(input,VALUE,FOLLOW_VALUE_in_eq457); 
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


 

    public static final BitSet FOLLOW_statement_in_sql31 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_in_statement42 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insert_in_statement46 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_delete_in_statement50 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_update_in_statement54 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_select62 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_columns_in_select70 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_FROM_in_select75 = new BitSet(new long[]{0x0000000001002000L});
    public static final BitSet FOLLOW_table_in_select81 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_where_in_select86 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSERT_in_insert95 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_INTO_in_insert107 = new BitSet(new long[]{0x0000000001002000L});
    public static final BitSet FOLLOW_table_in_insert113 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_insert118 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_columns_in_insert123 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_insert130 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_VALUES_in_insert136 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_insert141 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_VALUE_in_insert150 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_22_in_insert162 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_VALUE_in_insert171 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_21_in_insert193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELETE_in_delete201 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_FROM_in_delete209 = new BitSet(new long[]{0x0000000001002000L});
    public static final BitSet FOLLOW_table_in_delete214 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_where_in_delete219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UPDATE_in_update229 = new BitSet(new long[]{0x0000000001002000L});
    public static final BitSet FOLLOW_table_in_update237 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_SET_in_update242 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_update246 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_update248 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_VALUE_in_update252 = new BitSet(new long[]{0x0000000000404002L});
    public static final BitSet FOLLOW_22_in_update266 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_update270 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_update272 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_VALUE_in_update276 = new BitSet(new long[]{0x0000000000404002L});
    public static final BitSet FOLLOW_where_in_update287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_columns298 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_columns309 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_columns313 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_WHERE_in_where325 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_in_in_where329 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_eq_in_where333 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_OP_in_where338 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_in_in_where341 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_eq_in_where345 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_24_in_table358 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_table364 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_24_in_table367 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_table376 = new BitSet(new long[]{0x0000000001002000L});
    public static final BitSet FOLLOW_24_in_table379 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_table385 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_table391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_in402 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_IN_in_in409 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_in411 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_VALUE_in_in417 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_22_in_in424 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_VALUE_in_in427 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_21_in_in432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_eq442 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_eq450 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_VALUE_in_eq457 = new BitSet(new long[]{0x0000000000000002L});

}