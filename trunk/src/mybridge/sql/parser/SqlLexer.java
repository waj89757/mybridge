// $ANTLR 3.3 Nov 30, 2010 12:45:30 G:\\code\\mybridge\\src\\mybridge\\sql\\parser\\Sql.g 2011-05-06 21:05:30

package mybridge.sql.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class SqlLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int SELECT=4;
    public static final int FROM=5;
    public static final int ID=6;
    public static final int INSERT=7;
    public static final int INTO=8;
    public static final int VALUES=9;
    public static final int VALUE=10;
    public static final int DELETE=11;
    public static final int UPDATE=12;
    public static final int SET=13;
    public static final int WHERE=14;
    public static final int OP=15;
    public static final int IN=16;
    public static final int WS=17;
    public static final int STRING=18;
    public static final int NUM=19;

    // delegates
    // delegators

    public SqlLexer() {;} 
    public SqlLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public SqlLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "G:\\code\\mybridge\\src\\mybridge\\sql\\parser\\Sql.g"; }

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // G:\\code\\mybridge\\src\\mybridge\\sql\\parser\\Sql.g:7:7: ( '(' )
            // G:\\code\\mybridge\\src\\mybridge\\sql\\parser\\Sql.g:7:9: '('
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
            // G:\\code\\mybridge\\src\\mybridge\\sql\\parser\\Sql.g:8:7: ( ')' )
            // G:\\code\\mybridge\\src\\mybridge\\sql\\parser\\Sql.g:8:9: ')'
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
            // G:\\code\\mybridge\\src\\mybridge\\sql\\parser\\Sql.g:9:7: ( ',' )
            // G:\\code\\mybridge\\src\\mybridge\\sql\\parser\\Sql.g:9:9: ','
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
            // G:\\code\\mybridge\\src\\mybridge\\sql\\parser\\Sql.g:10:7: ( '=' )
            // G:\\code\\mybridge\\src\\mybridge\\sql\\parser\\Sql.g:10:9: '='
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

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // G:\\code\\mybridge\\src\\mybridge\\sql\\parser\\Sql.g:94:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // G:\\code\\mybridge\\src\\mybridge\\sql\\parser\\Sql.g:94:9: ( ' ' | '\\t' | '\\r' | '\\n' )
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
            // G:\\code\\mybridge\\src\\mybridge\\sql\\parser\\Sql.g:101:7: ( STRING | NUM )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='\"'||LA1_0=='\'') ) {
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
                    // G:\\code\\mybridge\\src\\mybridge\\sql\\parser\\Sql.g:101:9: STRING
                    {
                    mSTRING(); 

                    }
                    break;
                case 2 :
                    // G:\\code\\mybridge\\src\\mybridge\\sql\\parser\\Sql.g:101:18: NUM
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
            // G:\\code\\mybridge\\src\\mybridge\\sql\\parser\\Sql.g:102:5: ( ( 'S' | 's' ) ( 'E' | 'e' ) ( 'T' | 't' ) )
            // G:\\code\\mybridge\\src\\mybridge\\sql\\parser\\Sql.g:102:7: ( 'S' | 's' ) ( 'E' | 'e' ) ( 'T' | 't' )
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
            // G:\\code\\mybridge\\src\\mybridge\\sql\\parser\\Sql.g:103:8: ( ( 'V' | 'v' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'U' | 'u' ) ( 'E' | 'e' ) ( 'S' | 's' ) )
            // G:\\code\\mybridge\\src\\mybridge\\sql\\parser\\Sql.g:103:10: ( 'V' | 'v' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'U' | 'u' ) ( 'E' | 'e' ) ( 'S' | 's' )
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
            // G:\\code\\mybridge\\src\\mybridge\\sql\\parser\\Sql.g:104:5: ( ( 'I' | 'i' ) ( 'N' | 'n' ) )
            // G:\\code\\mybridge\\src\\mybridge\\sql\\parser\\Sql.g:104:7: ( 'I' | 'i' ) ( 'N' | 'n' )
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
            // G:\\code\\mybridge\\src\\mybridge\\sql\\parser\\Sql.g:105:6: ( ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'O' | 'o' ) )
            // G:\\code\\mybridge\\src\\mybridge\\sql\\parser\\Sql.g:105:8: ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'O' | 'o' )
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
            // G:\\code\\mybridge\\src\\mybridge\\sql\\parser\\Sql.g:106:8: ( ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'T' | 't' ) )
            // G:\\code\\mybridge\\src\\mybridge\\sql\\parser\\Sql.g:106:10: ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'T' | 't' )
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
            // G:\\code\\mybridge\\src\\mybridge\\sql\\parser\\Sql.g:107:8: ( ( 'U' | 'u' ) ( 'P' | 'p' ) ( 'D' | 'd' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'E' | 'e' ) )
            // G:\\code\\mybridge\\src\\mybridge\\sql\\parser\\Sql.g:107:10: ( 'U' | 'u' ) ( 'P' | 'p' ) ( 'D' | 'd' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'E' | 'e' )
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
            // G:\\code\\mybridge\\src\\mybridge\\sql\\parser\\Sql.g:108:8: ( ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'E' | 'e' ) )
            // G:\\code\\mybridge\\src\\mybridge\\sql\\parser\\Sql.g:108:10: ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'E' | 'e' )
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
            // G:\\code\\mybridge\\src\\mybridge\\sql\\parser\\Sql.g:109:4: ( ( ( 'O' | 'o' ) ( 'R' | 'r' ) ) | ( ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'D' | 'd' ) ) )
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
                    // G:\\code\\mybridge\\src\\mybridge\\sql\\parser\\Sql.g:109:6: ( ( 'O' | 'o' ) ( 'R' | 'r' ) )
                    {
                    // G:\\code\\mybridge\\src\\mybridge\\sql\\parser\\Sql.g:109:6: ( ( 'O' | 'o' ) ( 'R' | 'r' ) )
                    // G:\\code\\mybridge\\src\\mybridge\\sql\\parser\\Sql.g:109:7: ( 'O' | 'o' ) ( 'R' | 'r' )
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
                    // G:\\code\\mybridge\\src\\mybridge\\sql\\parser\\Sql.g:109:30: ( ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'D' | 'd' ) )
                    {
                    // G:\\code\\mybridge\\src\\mybridge\\sql\\parser\\Sql.g:109:30: ( ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'D' | 'd' ) )
                    // G:\\code\\mybridge\\src\\mybridge\\sql\\parser\\Sql.g:109:31: ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'D' | 'd' )
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
            // G:\\code\\mybridge\\src\\mybridge\\sql\\parser\\Sql.g:110:8: ( ( 'S' | 's' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' ) )
            // G:\\code\\mybridge\\src\\mybridge\\sql\\parser\\Sql.g:110:10: ( 'S' | 's' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' )
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
            // G:\\code\\mybridge\\src\\mybridge\\sql\\parser\\Sql.g:111:8: ( ( 'W' | 'w' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'E' | 'e' ) )
            // G:\\code\\mybridge\\src\\mybridge\\sql\\parser\\Sql.g:111:11: ( 'W' | 'w' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'E' | 'e' )
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
            // G:\\code\\mybridge\\src\\mybridge\\sql\\parser\\Sql.g:112:6: ( ( 'F' | 'f' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'M' | 'm' ) )
            // G:\\code\\mybridge\\src\\mybridge\\sql\\parser\\Sql.g:112:8: ( 'F' | 'f' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'M' | 'm' )
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
            // G:\\code\\mybridge\\src\\mybridge\\sql\\parser\\Sql.g:113:4: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' | '_' )* )
            // G:\\code\\mybridge\\src\\mybridge\\sql\\parser\\Sql.g:113:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // G:\\code\\mybridge\\src\\mybridge\\sql\\parser\\Sql.g:113:30: ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' | '_' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // G:\\code\\mybridge\\src\\mybridge\\sql\\parser\\Sql.g:
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
            // G:\\code\\mybridge\\src\\mybridge\\sql\\parser\\Sql.g:115:18: ( '\"' (~ ( '\\\\' | '\"' ) )* '\"' | '\\'' (~ ( '\\\\' | '\"' ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // G:\\code\\mybridge\\src\\mybridge\\sql\\parser\\Sql.g:115:21: '\"' (~ ( '\\\\' | '\"' ) )* '\"'
                    {
                    match('\"'); 
                    // G:\\code\\mybridge\\src\\mybridge\\sql\\parser\\Sql.g:115:25: (~ ( '\\\\' | '\"' ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // G:\\code\\mybridge\\src\\mybridge\\sql\\parser\\Sql.g:115:26: ~ ( '\\\\' | '\"' )
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
                    break;
                case 2 :
                    // G:\\code\\mybridge\\src\\mybridge\\sql\\parser\\Sql.g:115:47: '\\'' (~ ( '\\\\' | '\"' ) )* '\\''
                    {
                    match('\''); 
                    // G:\\code\\mybridge\\src\\mybridge\\sql\\parser\\Sql.g:115:52: (~ ( '\\\\' | '\"' ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\'') ) {
                            int LA5_1 = input.LA(2);

                            if ( ((LA5_1>='\u0000' && LA5_1<='!')||(LA5_1>='#' && LA5_1<='[')||(LA5_1>=']' && LA5_1<='\uFFFF')) ) {
                                alt5=1;
                            }


                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // G:\\code\\mybridge\\src\\mybridge\\sql\\parser\\Sql.g:115:53: ~ ( '\\\\' | '\"' )
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
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "NUM"
    public final void mNUM() throws RecognitionException {
        try {
            // G:\\code\\mybridge\\src\\mybridge\\sql\\parser\\Sql.g:116:16: ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )? )
            // G:\\code\\mybridge\\src\\mybridge\\sql\\parser\\Sql.g:116:18: ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )?
            {
            // G:\\code\\mybridge\\src\\mybridge\\sql\\parser\\Sql.g:116:18: ( '0' .. '9' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // G:\\code\\mybridge\\src\\mybridge\\sql\\parser\\Sql.g:116:19: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            // G:\\code\\mybridge\\src\\mybridge\\sql\\parser\\Sql.g:116:29: ( '.' ( '0' .. '9' )+ )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='.') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // G:\\code\\mybridge\\src\\mybridge\\sql\\parser\\Sql.g:116:30: '.' ( '0' .. '9' )+
                    {
                    match('.'); 
                    // G:\\code\\mybridge\\src\\mybridge\\sql\\parser\\Sql.g:116:34: ( '0' .. '9' )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // G:\\code\\mybridge\\src\\mybridge\\sql\\parser\\Sql.g:116:35: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
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
        // G:\\code\\mybridge\\src\\mybridge\\sql\\parser\\Sql.g:1:8: ( T__20 | T__21 | T__22 | T__23 | WS | VALUE | SET | VALUES | IN | INTO | INSERT | UPDATE | DELETE | OP | SELECT | WHERE | FROM | ID )
        int alt10=18;
        alt10 = dfa10.predict(input);
        switch (alt10) {
            case 1 :
                // G:\\code\\mybridge\\src\\mybridge\\sql\\parser\\Sql.g:1:10: T__20
                {
                mT__20(); 

                }
                break;
            case 2 :
                // G:\\code\\mybridge\\src\\mybridge\\sql\\parser\\Sql.g:1:16: T__21
                {
                mT__21(); 

                }
                break;
            case 3 :
                // G:\\code\\mybridge\\src\\mybridge\\sql\\parser\\Sql.g:1:22: T__22
                {
                mT__22(); 

                }
                break;
            case 4 :
                // G:\\code\\mybridge\\src\\mybridge\\sql\\parser\\Sql.g:1:28: T__23
                {
                mT__23(); 

                }
                break;
            case 5 :
                // G:\\code\\mybridge\\src\\mybridge\\sql\\parser\\Sql.g:1:34: WS
                {
                mWS(); 

                }
                break;
            case 6 :
                // G:\\code\\mybridge\\src\\mybridge\\sql\\parser\\Sql.g:1:37: VALUE
                {
                mVALUE(); 

                }
                break;
            case 7 :
                // G:\\code\\mybridge\\src\\mybridge\\sql\\parser\\Sql.g:1:43: SET
                {
                mSET(); 

                }
                break;
            case 8 :
                // G:\\code\\mybridge\\src\\mybridge\\sql\\parser\\Sql.g:1:47: VALUES
                {
                mVALUES(); 

                }
                break;
            case 9 :
                // G:\\code\\mybridge\\src\\mybridge\\sql\\parser\\Sql.g:1:54: IN
                {
                mIN(); 

                }
                break;
            case 10 :
                // G:\\code\\mybridge\\src\\mybridge\\sql\\parser\\Sql.g:1:57: INTO
                {
                mINTO(); 

                }
                break;
            case 11 :
                // G:\\code\\mybridge\\src\\mybridge\\sql\\parser\\Sql.g:1:62: INSERT
                {
                mINSERT(); 

                }
                break;
            case 12 :
                // G:\\code\\mybridge\\src\\mybridge\\sql\\parser\\Sql.g:1:69: UPDATE
                {
                mUPDATE(); 

                }
                break;
            case 13 :
                // G:\\code\\mybridge\\src\\mybridge\\sql\\parser\\Sql.g:1:76: DELETE
                {
                mDELETE(); 

                }
                break;
            case 14 :
                // G:\\code\\mybridge\\src\\mybridge\\sql\\parser\\Sql.g:1:83: OP
                {
                mOP(); 

                }
                break;
            case 15 :
                // G:\\code\\mybridge\\src\\mybridge\\sql\\parser\\Sql.g:1:86: SELECT
                {
                mSELECT(); 

                }
                break;
            case 16 :
                // G:\\code\\mybridge\\src\\mybridge\\sql\\parser\\Sql.g:1:93: WHERE
                {
                mWHERE(); 

                }
                break;
            case 17 :
                // G:\\code\\mybridge\\src\\mybridge\\sql\\parser\\Sql.g:1:99: FROM
                {
                mFROM(); 

                }
                break;
            case 18 :
                // G:\\code\\mybridge\\src\\mybridge\\sql\\parser\\Sql.g:1:104: ID
                {
                mID(); 

                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS =
        "\7\uffff\11\20\1\uffff\2\20\1\37\2\20\1\42\3\20\1\46\4\20\1\uffff"+
        "\2\20\1\uffff\1\42\2\20\1\uffff\2\20\1\61\4\20\1\66\2\20\1\uffff"+
        "\3\20\1\74\1\uffff\1\75\1\76\1\77\1\100\1\101\6\uffff";
    static final String DFA10_eofS =
        "\102\uffff";
    static final String DFA10_minS =
        "\1\11\6\uffff\1\105\1\101\1\116\1\120\1\105\1\122\1\116\1\110\1"+
        "\122\1\uffff\2\114\1\60\1\104\1\114\1\60\1\104\1\105\1\117\1\60"+
        "\1\105\1\125\1\117\1\105\1\uffff\1\101\1\105\1\uffff\1\60\1\122"+
        "\1\115\1\uffff\1\103\1\105\1\60\1\122\2\124\1\105\1\60\1\124\1\123"+
        "\1\uffff\1\124\2\105\1\60\1\uffff\5\60\6\uffff";
    static final String DFA10_maxS =
        "\1\172\6\uffff\1\145\1\141\1\156\1\160\1\145\1\162\1\156\1\150"+
        "\1\162\1\uffff\1\164\1\154\1\172\1\144\1\154\1\172\1\144\1\145\1"+
        "\157\1\172\1\145\1\165\1\157\1\145\1\uffff\1\141\1\145\1\uffff\1"+
        "\172\1\162\1\155\1\uffff\1\143\1\145\1\172\1\162\2\164\1\145\1\172"+
        "\1\164\1\163\1\uffff\1\164\2\145\1\172\1\uffff\5\172\6\uffff";
    static final String DFA10_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\11\uffff\1\22\16\uffff\1\11\2"+
        "\uffff\1\16\3\uffff\1\7\12\uffff\1\12\4\uffff\1\21\5\uffff\1\20"+
        "\1\17\1\10\1\13\1\14\1\15";
    static final String DFA10_specialS =
        "\102\uffff}>";
    static final String[] DFA10_transitionS = {
            "\2\5\2\uffff\1\5\22\uffff\1\5\1\uffff\1\6\4\uffff\1\6\1\1\1"+
            "\2\2\uffff\1\3\3\uffff\12\6\3\uffff\1\4\3\uffff\1\15\2\20\1"+
            "\13\1\20\1\17\2\20\1\11\5\20\1\14\3\20\1\7\1\20\1\12\1\10\1"+
            "\16\3\20\4\uffff\1\20\1\uffff\1\15\2\20\1\13\1\20\1\17\2\20"+
            "\1\11\5\20\1\14\3\20\1\7\1\20\1\12\1\10\1\16\3\20",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\21\37\uffff\1\21",
            "\1\22\37\uffff\1\22",
            "\1\23\37\uffff\1\23",
            "\1\24\37\uffff\1\24",
            "\1\25\37\uffff\1\25",
            "\1\26\37\uffff\1\26",
            "\1\27\37\uffff\1\27",
            "\1\30\37\uffff\1\30",
            "\1\31\37\uffff\1\31",
            "",
            "\1\33\7\uffff\1\32\27\uffff\1\33\7\uffff\1\32",
            "\1\34\37\uffff\1\34",
            "\12\20\7\uffff\22\20\1\36\1\35\6\20\4\uffff\1\20\1\uffff\22"+
            "\20\1\36\1\35\6\20",
            "\1\40\37\uffff\1\40",
            "\1\41\37\uffff\1\41",
            "\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32\20",
            "\1\43\37\uffff\1\43",
            "\1\44\37\uffff\1\44",
            "\1\45\37\uffff\1\45",
            "\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32\20",
            "\1\47\37\uffff\1\47",
            "\1\50\37\uffff\1\50",
            "\1\51\37\uffff\1\51",
            "\1\52\37\uffff\1\52",
            "",
            "\1\53\37\uffff\1\53",
            "\1\54\37\uffff\1\54",
            "",
            "\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32\20",
            "\1\55\37\uffff\1\55",
            "\1\56\37\uffff\1\56",
            "",
            "\1\57\37\uffff\1\57",
            "\1\60\37\uffff\1\60",
            "\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32\20",
            "\1\62\37\uffff\1\62",
            "\1\63\37\uffff\1\63",
            "\1\64\37\uffff\1\64",
            "\1\65\37\uffff\1\65",
            "\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32\20",
            "\1\67\37\uffff\1\67",
            "\1\70\37\uffff\1\70",
            "",
            "\1\71\37\uffff\1\71",
            "\1\72\37\uffff\1\72",
            "\1\73\37\uffff\1\73",
            "\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32\20",
            "",
            "\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32\20",
            "\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32\20",
            "\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32\20",
            "\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32\20",
            "\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32\20",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__20 | T__21 | T__22 | T__23 | WS | VALUE | SET | VALUES | IN | INTO | INSERT | UPDATE | DELETE | OP | SELECT | WHERE | FROM | ID );";
        }
    }
 

}