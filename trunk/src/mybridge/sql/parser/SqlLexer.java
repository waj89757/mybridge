// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g 2011-05-06 14:13:34

package mybridge.sql.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class SqlLexer extends Lexer {
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

    public SqlLexer() {;} 
    public SqlLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public SqlLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g"; }

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:7:7: ( '(' )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:7:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:8:7: ( ')' )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:8:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:9:7: ( ',' )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:9:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:10:7: ( '=' )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:10:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:11:7: ( '*' )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:11:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:73:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:73:9: ( ' ' | '\\t' | '\\r' | '\\n' )
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

    // $ANTLR start "VALUE"
    public final void mVALUE() throws RecognitionException {
        try {
            int _type = VALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:80:7: ( STRING | NUM )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='\"') ) {
                alt1=1;
            }
            else if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:80:9: STRING
                    {
                    mSTRING(); 

                    }
                    break;
                case 2 :
                    // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:80:18: NUM
                    {
                    mNUM(); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VALUE"

    // $ANTLR start "SET"
    public final void mSET() throws RecognitionException {
        try {
            int _type = SET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:81:5: ( ( 'S' | 's' ) ( 'E' | 'e' ) ( 'T' | 't' ) )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:81:7: ( 'S' | 's' ) ( 'E' | 'e' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


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
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:82:8: ( ( 'V' | 'v' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'U' | 'u' ) ( 'E' | 'e' ) ( 'S' | 's' ) )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:82:10: ( 'V' | 'v' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'U' | 'u' ) ( 'E' | 'e' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


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
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:83:5: ( ( 'I' | 'i' ) ( 'N' | 'n' ) )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:83:7: ( 'I' | 'i' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


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
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:84:6: ( ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'O' | 'o' ) )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:84:8: ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'O' | 'o' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


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
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:85:8: ( ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'T' | 't' ) )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:85:10: ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


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
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:86:8: ( ( 'U' | 'u' ) ( 'P' | 'p' ) ( 'D' | 'd' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'E' | 'e' ) )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:86:10: ( 'U' | 'u' ) ( 'P' | 'p' ) ( 'D' | 'd' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


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
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:87:8: ( ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'E' | 'e' ) )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:87:10: ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DELETE"

    // $ANTLR start "OP"
    public final void mOP() throws RecognitionException {
        try {
            int _type = OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:88:4: ( ( ( 'O' | 'o' ) ( 'R' | 'r' ) ) | ( ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'D' | 'd' ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='O'||LA2_0=='o') ) {
                alt2=1;
            }
            else if ( (LA2_0=='A'||LA2_0=='a') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:88:6: ( ( 'O' | 'o' ) ( 'R' | 'r' ) )
                    {
                    // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:88:6: ( ( 'O' | 'o' ) ( 'R' | 'r' ) )
                    // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:88:7: ( 'O' | 'o' ) ( 'R' | 'r' )
                    {
                    if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }


                    }
                    break;
                case 2 :
                    // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:88:30: ( ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'D' | 'd' ) )
                    {
                    // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:88:30: ( ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'D' | 'd' ) )
                    // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:88:31: ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'D' | 'd' )
                    {
                    if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


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
    // $ANTLR end "OP"

    // $ANTLR start "SELECT"
    public final void mSELECT() throws RecognitionException {
        try {
            int _type = SELECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:89:8: ( ( 'S' | 's' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' ) )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:89:10: ( 'S' | 's' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


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
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:90:8: ( ( 'W' | 'w' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'E' | 'e' ) )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:90:11: ( 'W' | 'w' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


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
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:91:6: ( ( 'F' | 'f' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'M' | 'm' ) )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:91:8: ( 'F' | 'f' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'M' | 'm' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


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
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:92:4: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' | '_' )* )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:92:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:92:30: ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' | '_' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:
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
            	    break loop3;
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
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:94:18: ( '\"' (~ ( '\\\\' | '\"' ) )* '\"' )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:94:21: '\"' (~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:94:25: (~ ( '\\\\' | '\"' ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:94:26: ~ ( '\\\\' | '\"' )
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
            	    break loop4;
                }
            } while (true);

            match('\"'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "NUM"
    public final void mNUM() throws RecognitionException {
        try {
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:95:16: ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )? )
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:95:18: ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )?
            {
            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:95:18: ( '0' .. '9' )+
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
            	    // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:95:19: '0' .. '9'
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

            // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:95:29: ( '.' ( '0' .. '9' )+ )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='.') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:95:30: '.' ( '0' .. '9' )+
                    {
                    match('.'); 
                    // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:95:34: ( '0' .. '9' )+
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
                    	    // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:95:35: '0' .. '9'
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

        }
        finally {
        }
    }
    // $ANTLR end "NUM"

    public void mTokens() throws RecognitionException {
        // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:1:8: ( T__20 | T__21 | T__22 | T__23 | T__24 | WS | VALUE | SET | VALUES | IN | INTO | INSERT | UPDATE | DELETE | OP | SELECT | WHERE | FROM | ID )
        int alt8=19;
        alt8 = dfa8.predict(input);
        switch (alt8) {
            case 1 :
                // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:1:10: T__20
                {
                mT__20(); 

                }
                break;
            case 2 :
                // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:1:16: T__21
                {
                mT__21(); 

                }
                break;
            case 3 :
                // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:1:22: T__22
                {
                mT__22(); 

                }
                break;
            case 4 :
                // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:1:28: T__23
                {
                mT__23(); 

                }
                break;
            case 5 :
                // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:1:34: T__24
                {
                mT__24(); 

                }
                break;
            case 6 :
                // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:1:40: WS
                {
                mWS(); 

                }
                break;
            case 7 :
                // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:1:43: VALUE
                {
                mVALUE(); 

                }
                break;
            case 8 :
                // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:1:49: SET
                {
                mSET(); 

                }
                break;
            case 9 :
                // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:1:53: VALUES
                {
                mVALUES(); 

                }
                break;
            case 10 :
                // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:1:60: IN
                {
                mIN(); 

                }
                break;
            case 11 :
                // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:1:63: INTO
                {
                mINTO(); 

                }
                break;
            case 12 :
                // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:1:68: INSERT
                {
                mINSERT(); 

                }
                break;
            case 13 :
                // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:1:75: UPDATE
                {
                mUPDATE(); 

                }
                break;
            case 14 :
                // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:1:82: DELETE
                {
                mDELETE(); 

                }
                break;
            case 15 :
                // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:1:89: OP
                {
                mOP(); 

                }
                break;
            case 16 :
                // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:1:92: SELECT
                {
                mSELECT(); 

                }
                break;
            case 17 :
                // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:1:99: WHERE
                {
                mWHERE(); 

                }
                break;
            case 18 :
                // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:1:105: FROM
                {
                mFROM(); 

                }
                break;
            case 19 :
                // /home/quanwei/workspace_java/mybridge/src/mybridge/sql/parser/Sql.g:1:110: ID
                {
                mID(); 

                }
                break;

        }

    }


    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA8_eotS =
        "\10\uffff\11\21\1\uffff\2\21\1\40\2\21\1\43\3\21\1\47\4\21\1\uffff"+
        "\2\21\1\uffff\1\43\2\21\1\uffff\2\21\1\62\4\21\1\67\2\21\1\uffff"+
        "\3\21\1\75\1\uffff\1\76\1\77\1\100\1\101\1\102\6\uffff";
    static final String DFA8_eofS =
        "\103\uffff";
    static final String DFA8_minS =
        "\1\11\7\uffff\1\105\1\101\1\116\1\120\1\105\1\122\1\116\1\110\1"+
        "\122\1\uffff\2\114\1\60\1\104\1\114\1\60\1\104\1\105\1\117\1\60"+
        "\1\105\1\125\1\117\1\105\1\uffff\1\101\1\105\1\uffff\1\60\1\122"+
        "\1\115\1\uffff\1\103\1\105\1\60\1\122\2\124\1\105\1\60\1\124\1\123"+
        "\1\uffff\1\124\2\105\1\60\1\uffff\5\60\6\uffff";
    static final String DFA8_maxS =
        "\1\172\7\uffff\1\145\1\141\1\156\1\160\1\145\1\162\1\156\1\150\1"+
        "\162\1\uffff\1\164\1\154\1\172\1\144\1\154\1\172\1\144\1\145\1\157"+
        "\1\172\1\145\1\165\1\157\1\145\1\uffff\1\141\1\145\1\uffff\1\172"+
        "\1\162\1\155\1\uffff\1\143\1\145\1\172\1\162\2\164\1\145\1\172\1"+
        "\164\1\163\1\uffff\1\164\2\145\1\172\1\uffff\5\172\6\uffff";
    static final String DFA8_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\11\uffff\1\23\16\uffff\1\12"+
        "\2\uffff\1\17\3\uffff\1\10\12\uffff\1\13\4\uffff\1\22\5\uffff\1"+
        "\21\1\20\1\11\1\14\1\15\1\16";
    static final String DFA8_specialS =
        "\103\uffff}>";
    static final String[] DFA8_transitionS = {
            "\2\6\2\uffff\1\6\22\uffff\1\6\1\uffff\1\7\5\uffff\1\1\1\2\1"+
            "\5\1\uffff\1\3\3\uffff\12\7\3\uffff\1\4\3\uffff\1\16\2\21\1"+
            "\14\1\21\1\20\2\21\1\12\5\21\1\15\3\21\1\10\1\21\1\13\1\11\1"+
            "\17\3\21\4\uffff\1\21\1\uffff\1\16\2\21\1\14\1\21\1\20\2\21"+
            "\1\12\5\21\1\15\3\21\1\10\1\21\1\13\1\11\1\17\3\21",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\22\37\uffff\1\22",
            "\1\23\37\uffff\1\23",
            "\1\24\37\uffff\1\24",
            "\1\25\37\uffff\1\25",
            "\1\26\37\uffff\1\26",
            "\1\27\37\uffff\1\27",
            "\1\30\37\uffff\1\30",
            "\1\31\37\uffff\1\31",
            "\1\32\37\uffff\1\32",
            "",
            "\1\34\7\uffff\1\33\27\uffff\1\34\7\uffff\1\33",
            "\1\35\37\uffff\1\35",
            "\12\21\7\uffff\22\21\1\37\1\36\6\21\4\uffff\1\21\1\uffff\22"+
            "\21\1\37\1\36\6\21",
            "\1\41\37\uffff\1\41",
            "\1\42\37\uffff\1\42",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "\1\44\37\uffff\1\44",
            "\1\45\37\uffff\1\45",
            "\1\46\37\uffff\1\46",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "\1\50\37\uffff\1\50",
            "\1\51\37\uffff\1\51",
            "\1\52\37\uffff\1\52",
            "\1\53\37\uffff\1\53",
            "",
            "\1\54\37\uffff\1\54",
            "\1\55\37\uffff\1\55",
            "",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "\1\56\37\uffff\1\56",
            "\1\57\37\uffff\1\57",
            "",
            "\1\60\37\uffff\1\60",
            "\1\61\37\uffff\1\61",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "\1\63\37\uffff\1\63",
            "\1\64\37\uffff\1\64",
            "\1\65\37\uffff\1\65",
            "\1\66\37\uffff\1\66",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "\1\70\37\uffff\1\70",
            "\1\71\37\uffff\1\71",
            "",
            "\1\72\37\uffff\1\72",
            "\1\73\37\uffff\1\73",
            "\1\74\37\uffff\1\74",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
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
            return "1:1: Tokens : ( T__20 | T__21 | T__22 | T__23 | T__24 | WS | VALUE | SET | VALUES | IN | INTO | INSERT | UPDATE | DELETE | OP | SELECT | WHERE | FROM | ID );";
        }
    }
 

}