// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g 2011-05-20 22:21:37

package mybridge.handle.simple.sqlparser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class SqlLexer extends Lexer {
    public static final int WHERE=15;
    public static final int ORDER=19;
    public static final int LIMIT=23;
    public static final int UPDATE=14;
    public static final int AND=18;
    public static final int T__61=61;
    public static final int ID=7;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int IN=42;
    public static final int T__53=53;
    public static final int INSERT=10;
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
    public static final int SET=4;
    public static final int V=40;
    public static final int Q=50;
    public static final int DELETE=13;
    public static final int P=43;
    public static final int S=30;
    public static final int R=37;
    public static final int Y=39;
    public static final int NUM=24;
    public static final int X=51;
    public static final int NAMES=5;
    public static final int Z=52;
    public static final int WS=25;
    public static final int DESC=21;
    public static final int FROM=9;
    public static final int LE=17;
    public static final int STRING=6;

    // delegates
    // delegators

    public SqlLexer() {;} 
    public SqlLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public SqlLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g"; }

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:7:7: ( '(' )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:7:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:8:7: ( ')' )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:8:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:9:7: ( '*' )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:9:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:10:7: ( ',' )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:10:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:11:7: ( '=' )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:11:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:12:7: ( '<' )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:12:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:13:7: ( '>' )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:13:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:14:7: ( '`' )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:14:9: '`'
            {
            match('`'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:15:7: ( '.' )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:15:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:144:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:144:9: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "GE"
    public final void mGE() throws RecognitionException {
        try {
            int _type = GE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:151:4: ( '>' '=' )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:151:6: '>' '='
            {
            match('>'); 
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GE"

    // $ANTLR start "LE"
    public final void mLE() throws RecognitionException {
        try {
            int _type = LE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:152:4: ( '<' '=' )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:152:6: '<' '='
            {
            match('<'); 
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LE"

    // $ANTLR start "NAMES"
    public final void mNAMES() throws RecognitionException {
        try {
            int _type = NAMES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:153:8: ( N A M E S )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:153:10: N A M E S
            {
            mN(); 
            mA(); 
            mM(); 
            mE(); 
            mS(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NAMES"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:154:6: ( A N D )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:154:8: A N D
            {
            mA(); 
            mN(); 
            mD(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "LIMIT"
    public final void mLIMIT() throws RecognitionException {
        try {
            int _type = LIMIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:155:8: ( L I M I T )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:155:10: L I M I T
            {
            mL(); 
            mI(); 
            mM(); 
            mI(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LIMIT"

    // $ANTLR start "DESC"
    public final void mDESC() throws RecognitionException {
        try {
            int _type = DESC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:156:6: ( D E S C )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:156:8: D E S C
            {
            mD(); 
            mE(); 
            mS(); 
            mC(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DESC"

    // $ANTLR start "ASC"
    public final void mASC() throws RecognitionException {
        try {
            int _type = ASC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:157:5: ( A S C )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:157:7: A S C
            {
            mA(); 
            mS(); 
            mC(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASC"

    // $ANTLR start "ORDER"
    public final void mORDER() throws RecognitionException {
        try {
            int _type = ORDER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:158:7: ( O R D E R )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:158:9: O R D E R
            {
            mO(); 
            mR(); 
            mD(); 
            mE(); 
            mR(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ORDER"

    // $ANTLR start "BY"
    public final void mBY() throws RecognitionException {
        try {
            int _type = BY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:159:4: ( B Y )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:159:6: B Y
            {
            mB(); 
            mY(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BY"

    // $ANTLR start "SET"
    public final void mSET() throws RecognitionException {
        try {
            int _type = SET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:160:5: ( S E T )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:160:7: S E T
            {
            mS(); 
            mE(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SET"

    // $ANTLR start "VALUES"
    public final void mVALUES() throws RecognitionException {
        try {
            int _type = VALUES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:161:8: ( V A L U E S )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:161:10: V A L U E S
            {
            mV(); 
            mA(); 
            mL(); 
            mU(); 
            mE(); 
            mS(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VALUES"

    // $ANTLR start "IN"
    public final void mIN() throws RecognitionException {
        try {
            int _type = IN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:162:5: ( I N )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:162:7: I N
            {
            mI(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IN"

    // $ANTLR start "INTO"
    public final void mINTO() throws RecognitionException {
        try {
            int _type = INTO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:163:6: ( I N T O )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:163:8: I N T O
            {
            mI(); 
            mN(); 
            mT(); 
            mO(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTO"

    // $ANTLR start "INSERT"
    public final void mINSERT() throws RecognitionException {
        try {
            int _type = INSERT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:164:9: ( I N S E R T )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:164:11: I N S E R T
            {
            mI(); 
            mN(); 
            mS(); 
            mE(); 
            mR(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INSERT"

    // $ANTLR start "UPDATE"
    public final void mUPDATE() throws RecognitionException {
        try {
            int _type = UPDATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:165:9: ( U P D A T E )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:165:11: U P D A T E
            {
            mU(); 
            mP(); 
            mD(); 
            mA(); 
            mT(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UPDATE"

    // $ANTLR start "DELETE"
    public final void mDELETE() throws RecognitionException {
        try {
            int _type = DELETE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:166:9: ( D E L E T E )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:166:11: D E L E T E
            {
            mD(); 
            mE(); 
            mL(); 
            mE(); 
            mT(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DELETE"

    // $ANTLR start "SELECT"
    public final void mSELECT() throws RecognitionException {
        try {
            int _type = SELECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:167:8: ( S E L E C T )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:167:10: S E L E C T
            {
            mS(); 
            mE(); 
            mL(); 
            mE(); 
            mC(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SELECT"

    // $ANTLR start "WHERE"
    public final void mWHERE() throws RecognitionException {
        try {
            int _type = WHERE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:168:8: ( W H E R E )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:168:10: W H E R E
            {
            mW(); 
            mH(); 
            mE(); 
            mR(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHERE"

    // $ANTLR start "FROM"
    public final void mFROM() throws RecognitionException {
        try {
            int _type = FROM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:169:6: ( F R O M )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:169:8: F R O M
            {
            mF(); 
            mR(); 
            mO(); 
            mM(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FROM"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:170:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' | '_' )* )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:170:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:170:31: ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:171:9: ( ( '\"' (~ ( '\\\\' | '\"' ) )* '\"' ) | ( '\\'' (~ ( '\\\\' | '\\'' ) )* '\\'' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\"') ) {
                alt4=1;
            }
            else if ( (LA4_0=='\'') ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:171:12: ( '\"' (~ ( '\\\\' | '\"' ) )* '\"' )
                    {
                    // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:171:12: ( '\"' (~ ( '\\\\' | '\"' ) )* '\"' )
                    // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:171:13: '\"' (~ ( '\\\\' | '\"' ) )* '\"'
                    {
                    match('\"'); 
                    // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:171:17: (~ ( '\\\\' | '\"' ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>='\u0000' && LA2_0<='!')||(LA2_0>='#' && LA2_0<='[')||(LA2_0>=']' && LA2_0<='\uFFFF')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:171:18: ~ ( '\\\\' | '\"' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    match('\"'); 

                    }


                    }
                    break;
                case 2 :
                    // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:171:39: ( '\\'' (~ ( '\\\\' | '\\'' ) )* '\\'' )
                    {
                    // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:171:39: ( '\\'' (~ ( '\\\\' | '\\'' ) )* '\\'' )
                    // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:171:40: '\\'' (~ ( '\\\\' | '\\'' ) )* '\\''
                    {
                    match('\''); 
                    // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:171:45: (~ ( '\\\\' | '\\'' ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='\u0000' && LA3_0<='&')||(LA3_0>='(' && LA3_0<='[')||(LA3_0>=']' && LA3_0<='\uFFFF')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:171:46: ~ ( '\\\\' | '\\'' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    match('\''); 

                    }


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "NUM"
    public final void mNUM() throws RecognitionException {
        try {
            int _type = NUM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:172:5: ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )? )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:172:7: ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )?
            {
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:172:7: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:172:8: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:172:18: ( '.' ( '0' .. '9' )+ )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='.') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:172:19: '.' ( '0' .. '9' )+
                    {
                    match('.'); 
                    // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:172:23: ( '0' .. '9' )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:172:24: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt6 >= 1 ) break loop6;
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NUM"

    // $ANTLR start "A"
    public final void mA() throws RecognitionException {
        try {
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:174:12: ( 'A' | 'a' )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "A"

    // $ANTLR start "B"
    public final void mB() throws RecognitionException {
        try {
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:175:12: ( 'B' | 'b' )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:
            {
            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "B"

    // $ANTLR start "C"
    public final void mC() throws RecognitionException {
        try {
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:176:12: ( 'C' | 'c' )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "C"

    // $ANTLR start "D"
    public final void mD() throws RecognitionException {
        try {
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:177:12: ( 'D' | 'd' )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "D"

    // $ANTLR start "E"
    public final void mE() throws RecognitionException {
        try {
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:178:12: ( 'E' | 'e' )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "E"

    // $ANTLR start "F"
    public final void mF() throws RecognitionException {
        try {
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:179:12: ( 'F' | 'f' )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "F"

    // $ANTLR start "G"
    public final void mG() throws RecognitionException {
        try {
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:180:12: ( 'G' | 'g' )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:
            {
            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "G"

    // $ANTLR start "H"
    public final void mH() throws RecognitionException {
        try {
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:181:12: ( 'H' | 'h' )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:
            {
            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "H"

    // $ANTLR start "I"
    public final void mI() throws RecognitionException {
        try {
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:182:12: ( 'I' | 'i' )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "I"

    // $ANTLR start "J"
    public final void mJ() throws RecognitionException {
        try {
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:183:12: ( 'J' | 'j' )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:
            {
            if ( input.LA(1)=='J'||input.LA(1)=='j' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "J"

    // $ANTLR start "K"
    public final void mK() throws RecognitionException {
        try {
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:184:12: ( 'K' | 'k' )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:
            {
            if ( input.LA(1)=='K'||input.LA(1)=='k' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "K"

    // $ANTLR start "L"
    public final void mL() throws RecognitionException {
        try {
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:185:12: ( 'L' | 'l' )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "L"

    // $ANTLR start "M"
    public final void mM() throws RecognitionException {
        try {
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:186:12: ( 'M' | 'm' )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:
            {
            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "M"

    // $ANTLR start "N"
    public final void mN() throws RecognitionException {
        try {
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:187:12: ( 'N' | 'n' )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "N"

    // $ANTLR start "O"
    public final void mO() throws RecognitionException {
        try {
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:188:12: ( 'O' | 'o' )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:
            {
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "O"

    // $ANTLR start "P"
    public final void mP() throws RecognitionException {
        try {
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:189:12: ( 'P' | 'p' )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:
            {
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "P"

    // $ANTLR start "Q"
    public final void mQ() throws RecognitionException {
        try {
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:190:12: ( 'Q' | 'q' )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:
            {
            if ( input.LA(1)=='Q'||input.LA(1)=='q' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "Q"

    // $ANTLR start "R"
    public final void mR() throws RecognitionException {
        try {
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:191:12: ( 'R' | 'r' )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "R"

    // $ANTLR start "S"
    public final void mS() throws RecognitionException {
        try {
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:192:12: ( 'S' | 's' )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "S"

    // $ANTLR start "T"
    public final void mT() throws RecognitionException {
        try {
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:193:12: ( 'T' | 't' )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "T"

    // $ANTLR start "U"
    public final void mU() throws RecognitionException {
        try {
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:194:12: ( 'U' | 'u' )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:
            {
            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "U"

    // $ANTLR start "V"
    public final void mV() throws RecognitionException {
        try {
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:195:12: ( 'V' | 'v' )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:
            {
            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "V"

    // $ANTLR start "W"
    public final void mW() throws RecognitionException {
        try {
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:196:12: ( 'W' | 'w' )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:
            {
            if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "W"

    // $ANTLR start "X"
    public final void mX() throws RecognitionException {
        try {
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:197:12: ( 'X' | 'x' )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:
            {
            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "X"

    // $ANTLR start "Y"
    public final void mY() throws RecognitionException {
        try {
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:198:12: ( 'Y' | 'y' )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:
            {
            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "Y"

    // $ANTLR start "Z"
    public final void mZ() throws RecognitionException {
        try {
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:199:12: ( 'Z' | 'z' )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:
            {
            if ( input.LA(1)=='Z'||input.LA(1)=='z' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "Z"

    public void mTokens() throws RecognitionException {
        // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:1:8: ( T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | WS | GE | LE | NAMES | AND | LIMIT | DESC | ASC | ORDER | BY | SET | VALUES | IN | INTO | INSERT | UPDATE | DELETE | SELECT | WHERE | FROM | ID | STRING | NUM )
        int alt8=32;
        alt8 = dfa8.predict(input);
        switch (alt8) {
            case 1 :
                // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:1:10: T__53
                {
                mT__53(); 

                }
                break;
            case 2 :
                // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:1:16: T__54
                {
                mT__54(); 

                }
                break;
            case 3 :
                // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:1:22: T__55
                {
                mT__55(); 

                }
                break;
            case 4 :
                // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:1:28: T__56
                {
                mT__56(); 

                }
                break;
            case 5 :
                // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:1:34: T__57
                {
                mT__57(); 

                }
                break;
            case 6 :
                // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:1:40: T__58
                {
                mT__58(); 

                }
                break;
            case 7 :
                // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:1:46: T__59
                {
                mT__59(); 

                }
                break;
            case 8 :
                // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:1:52: T__60
                {
                mT__60(); 

                }
                break;
            case 9 :
                // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:1:58: T__61
                {
                mT__61(); 

                }
                break;
            case 10 :
                // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:1:64: WS
                {
                mWS(); 

                }
                break;
            case 11 :
                // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:1:67: GE
                {
                mGE(); 

                }
                break;
            case 12 :
                // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:1:70: LE
                {
                mLE(); 

                }
                break;
            case 13 :
                // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:1:73: NAMES
                {
                mNAMES(); 

                }
                break;
            case 14 :
                // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:1:79: AND
                {
                mAND(); 

                }
                break;
            case 15 :
                // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:1:83: LIMIT
                {
                mLIMIT(); 

                }
                break;
            case 16 :
                // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:1:89: DESC
                {
                mDESC(); 

                }
                break;
            case 17 :
                // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:1:94: ASC
                {
                mASC(); 

                }
                break;
            case 18 :
                // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:1:98: ORDER
                {
                mORDER(); 

                }
                break;
            case 19 :
                // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:1:104: BY
                {
                mBY(); 

                }
                break;
            case 20 :
                // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:1:107: SET
                {
                mSET(); 

                }
                break;
            case 21 :
                // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:1:111: VALUES
                {
                mVALUES(); 

                }
                break;
            case 22 :
                // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:1:118: IN
                {
                mIN(); 

                }
                break;
            case 23 :
                // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:1:121: INTO
                {
                mINTO(); 

                }
                break;
            case 24 :
                // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:1:126: INSERT
                {
                mINSERT(); 

                }
                break;
            case 25 :
                // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:1:133: UPDATE
                {
                mUPDATE(); 

                }
                break;
            case 26 :
                // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:1:140: DELETE
                {
                mDELETE(); 

                }
                break;
            case 27 :
                // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:1:147: SELECT
                {
                mSELECT(); 

                }
                break;
            case 28 :
                // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:1:154: WHERE
                {
                mWHERE(); 

                }
                break;
            case 29 :
                // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:1:160: FROM
                {
                mFROM(); 

                }
                break;
            case 30 :
                // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:1:165: ID
                {
                mID(); 

                }
                break;
            case 31 :
                // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:1:168: STRING
                {
                mSTRING(); 

                }
                break;
            case 32 :
                // /home/quanwei/workspace_java/mybridge/src/mybridge/core/sqlparser/Sql.g:1:175: NUM
                {
                mNUM(); 

                }
                break;

        }

    }


    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA8_eotS =
        "\6\uffff\1\33\1\35\3\uffff\14\27\7\uffff\6\27\1\62\2\27\1\66\4\27"+
        "\1\75\1\76\4\27\1\uffff\1\103\2\27\1\uffff\6\27\2\uffff\2\27\1\116"+
        "\1\27\1\uffff\3\27\1\123\2\27\1\126\1\127\1\130\1\27\1\uffff\1\132"+
        "\3\27\1\uffff\1\27\1\137\3\uffff\1\140\1\uffff\1\141\1\142\1\143"+
        "\1\144\6\uffff";
    static final String DFA8_eofS =
        "\145\uffff";
    static final String DFA8_minS =
        "\1\11\5\uffff\2\75\3\uffff\1\101\1\116\1\111\1\105\1\122\1\131\1"+
        "\105\1\101\1\116\1\120\1\110\1\122\7\uffff\1\115\1\104\1\103\1\115"+
        "\1\114\1\104\1\60\2\114\1\60\1\104\1\105\1\117\1\105\2\60\1\111"+
        "\1\105\1\103\1\105\1\uffff\1\60\1\105\1\125\1\uffff\1\105\1\117"+
        "\1\101\1\122\1\115\1\123\2\uffff\2\124\1\60\1\122\1\uffff\1\103"+
        "\1\105\1\122\1\60\1\124\1\105\3\60\1\105\1\uffff\1\60\1\124\1\123"+
        "\1\124\1\uffff\1\105\1\60\3\uffff\1\60\1\uffff\4\60\6\uffff";
    static final String DFA8_maxS =
        "\1\172\5\uffff\2\75\3\uffff\1\141\1\163\1\151\1\145\1\162\1\171"+
        "\1\145\1\141\1\156\1\160\1\150\1\162\7\uffff\1\155\1\144\1\143\1"+
        "\155\1\163\1\144\1\172\1\164\1\154\1\172\1\144\1\145\1\157\1\145"+
        "\2\172\1\151\1\145\1\143\1\145\1\uffff\1\172\1\145\1\165\1\uffff"+
        "\1\145\1\157\1\141\1\162\1\155\1\163\2\uffff\2\164\1\172\1\162\1"+
        "\uffff\1\143\1\145\1\162\1\172\1\164\1\145\3\172\1\145\1\uffff\1"+
        "\172\1\164\1\163\1\164\1\uffff\1\145\1\172\3\uffff\1\172\1\uffff"+
        "\4\172\6\uffff";
    static final String DFA8_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\2\uffff\1\10\1\11\1\12\14\uffff\1\36"+
        "\1\37\1\40\1\14\1\6\1\13\1\7\24\uffff\1\23\3\uffff\1\26\6\uffff"+
        "\1\16\1\21\4\uffff\1\24\12\uffff\1\20\4\uffff\1\27\2\uffff\1\35"+
        "\1\15\1\17\1\uffff\1\22\4\uffff\1\34\1\32\1\33\1\25\1\30\1\31";
    static final String DFA8_specialS =
        "\145\uffff}>";
    static final String[] DFA8_transitionS = {
            "\2\12\2\uffff\1\12\22\uffff\1\12\1\uffff\1\30\4\uffff\1\30\1"+
            "\1\1\2\1\3\1\uffff\1\4\1\uffff\1\11\1\uffff\12\31\2\uffff\1"+
            "\6\1\5\1\7\2\uffff\1\14\1\20\1\27\1\16\1\27\1\26\2\27\1\23\2"+
            "\27\1\15\1\27\1\13\1\17\3\27\1\21\1\27\1\24\1\22\1\25\3\27\4"+
            "\uffff\1\27\1\10\1\14\1\20\1\27\1\16\1\27\1\26\2\27\1\23\2\27"+
            "\1\15\1\27\1\13\1\17\3\27\1\21\1\27\1\24\1\22\1\25\3\27",
            "",
            "",
            "",
            "",
            "",
            "\1\32",
            "\1\34",
            "",
            "",
            "",
            "\1\36\37\uffff\1\36",
            "\1\37\4\uffff\1\40\32\uffff\1\37\4\uffff\1\40",
            "\1\41\37\uffff\1\41",
            "\1\42\37\uffff\1\42",
            "\1\43\37\uffff\1\43",
            "\1\44\37\uffff\1\44",
            "\1\45\37\uffff\1\45",
            "\1\46\37\uffff\1\46",
            "\1\47\37\uffff\1\47",
            "\1\50\37\uffff\1\50",
            "\1\51\37\uffff\1\51",
            "\1\52\37\uffff\1\52",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\53\37\uffff\1\53",
            "\1\54\37\uffff\1\54",
            "\1\55\37\uffff\1\55",
            "\1\56\37\uffff\1\56",
            "\1\57\6\uffff\1\60\30\uffff\1\57\6\uffff\1\60",
            "\1\61\37\uffff\1\61",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\64\7\uffff\1\63\27\uffff\1\64\7\uffff\1\63",
            "\1\65\37\uffff\1\65",
            "\12\27\7\uffff\22\27\1\67\1\70\6\27\4\uffff\1\27\1\uffff\22"+
            "\27\1\67\1\70\6\27",
            "\1\71\37\uffff\1\71",
            "\1\72\37\uffff\1\72",
            "\1\73\37\uffff\1\73",
            "\1\74\37\uffff\1\74",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\77\37\uffff\1\77",
            "\1\100\37\uffff\1\100",
            "\1\101\37\uffff\1\101",
            "\1\102\37\uffff\1\102",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\104\37\uffff\1\104",
            "\1\105\37\uffff\1\105",
            "",
            "\1\106\37\uffff\1\106",
            "\1\107\37\uffff\1\107",
            "\1\110\37\uffff\1\110",
            "\1\111\37\uffff\1\111",
            "\1\112\37\uffff\1\112",
            "\1\113\37\uffff\1\113",
            "",
            "",
            "\1\114\37\uffff\1\114",
            "\1\115\37\uffff\1\115",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\117\37\uffff\1\117",
            "",
            "\1\120\37\uffff\1\120",
            "\1\121\37\uffff\1\121",
            "\1\122\37\uffff\1\122",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\124\37\uffff\1\124",
            "\1\125\37\uffff\1\125",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\131\37\uffff\1\131",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\133\37\uffff\1\133",
            "\1\134\37\uffff\1\134",
            "\1\135\37\uffff\1\135",
            "",
            "\1\136\37\uffff\1\136",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | WS | GE | LE | NAMES | AND | LIMIT | DESC | ASC | ORDER | BY | SET | VALUES | IN | INTO | INSERT | UPDATE | DELETE | SELECT | WHERE | FROM | ID | STRING | NUM );";
        }
    }
 

}