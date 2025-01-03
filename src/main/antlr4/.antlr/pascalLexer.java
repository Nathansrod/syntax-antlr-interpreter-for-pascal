// Generated from /home/nathan/Projects/Compiladores/antlr-syntax/src/main/antlr4/pascal.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class pascalLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ADICAO=1, SUBTRACAO=2, MULTIPLICACAO=3, DIVIDIR=4, IGUAL=5, MENOR=6, MAIOR=7, 
		MENOR_IGUAL=8, MAIOR_IGUAL=9, DIFERENTE=10, ATRIBUICAO=11, PONTO=12, PONTO_VIRGULA=13, 
		DOIS_PONTOS=14, VIRGULA=15, PARENTESES_ESQ=16, PARENTESES_DIR=17, AND=18, 
		ARRAY=19, BEGIN=20, CASE=21, CONST=22, DIV=23, DO=24, DOWNTO=25, ELSE=26, 
		END=27, FILE=28, FOR=29, FUNCTION=30, GOTO=31, IF=32, IN=33, INTEGER=34, 
		LABEL=35, MOD=36, NIL=37, NOT=38, OF=39, OR=40, PACKED=41, PROCEDURE=42, 
		PROGRAM=43, READ=44, REAL=45, RECORD=46, REPEAT=47, SET=48, THEN=49, TO=50, 
		TYPE=51, UNTIL=52, VAR=53, WHILE=54, WITH=55, WRITE=56, WRITELN=57, ID=58, 
		INTNUM=59, WS=60;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", 
			"O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "LETRA", 
			"DIGITO", "ADICAO", "SUBTRACAO", "MULTIPLICACAO", "DIVIDIR", "IGUAL", 
			"MENOR", "MAIOR", "MENOR_IGUAL", "MAIOR_IGUAL", "DIFERENTE", "ATRIBUICAO", 
			"PONTO", "PONTO_VIRGULA", "DOIS_PONTOS", "VIRGULA", "PARENTESES_ESQ", 
			"PARENTESES_DIR", "AND", "ARRAY", "BEGIN", "CASE", "CONST", "DIV", "DO", 
			"DOWNTO", "ELSE", "END", "FILE", "FOR", "FUNCTION", "GOTO", "IF", "IN", 
			"INTEGER", "LABEL", "MOD", "NIL", "NOT", "OF", "OR", "PACKED", "PROCEDURE", 
			"PROGRAM", "READ", "REAL", "RECORD", "REPEAT", "SET", "THEN", "TO", "TYPE", 
			"UNTIL", "VAR", "WHILE", "WITH", "WRITE", "WRITELN", "ID", "INTNUM", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'*'", "'/'", "'='", "'<'", "'>'", "'<='", "'>='", 
			"'<>'", "':='", "'.'", "';'", "':'", "','", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ADICAO", "SUBTRACAO", "MULTIPLICACAO", "DIVIDIR", "IGUAL", "MENOR", 
			"MAIOR", "MENOR_IGUAL", "MAIOR_IGUAL", "DIFERENTE", "ATRIBUICAO", "PONTO", 
			"PONTO_VIRGULA", "DOIS_PONTOS", "VIRGULA", "PARENTESES_ESQ", "PARENTESES_DIR", 
			"AND", "ARRAY", "BEGIN", "CASE", "CONST", "DIV", "DO", "DOWNTO", "ELSE", 
			"END", "FILE", "FOR", "FUNCTION", "GOTO", "IF", "IN", "INTEGER", "LABEL", 
			"MOD", "NIL", "NOT", "OF", "OR", "PACKED", "PROCEDURE", "PROGRAM", "READ", 
			"REAL", "RECORD", "REPEAT", "SET", "THEN", "TO", "TYPE", "UNTIL", "VAR", 
			"WHILE", "WITH", "WRITE", "WRITELN", "ID", "INTNUM", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public pascalLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "pascal.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2>\u01f9\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3"+
		"\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3"+
		"\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3"+
		"\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3%"+
		"\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/"+
		"\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64"+
		"\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67"+
		"\3\67\3\67\38\38\38\38\39\39\39\39\39\3:\3:\3:\3:\3;\3;\3;\3;\3;\3;\3"+
		";\3;\3;\3<\3<\3<\3<\3<\3=\3=\3=\3>\3>\3>\3?\3?\3?\3?\3?\3?\3?\3?\3@\3"+
		"@\3@\3@\3@\3@\3A\3A\3A\3A\3B\3B\3B\3B\3C\3C\3C\3C\3D\3D\3D\3E\3E\3E\3"+
		"F\3F\3F\3F\3F\3F\3F\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3H\3H\3H\3H\3H\3H\3"+
		"H\3H\3I\3I\3I\3I\3I\3J\3J\3J\3J\3J\3K\3K\3K\3K\3K\3K\3K\3L\3L\3L\3L\3"+
		"L\3L\3L\3M\3M\3M\3M\3N\3N\3N\3N\3N\3O\3O\3O\3P\3P\3P\3P\3P\3Q\3Q\3Q\3"+
		"Q\3Q\3Q\3R\3R\3R\3R\3S\3S\3S\3S\3S\3S\3T\3T\3T\3T\3T\3U\3U\3U\3U\3U\3"+
		"U\3V\3V\3V\3V\3V\3V\3V\3V\3W\3W\3W\7W\u01e9\nW\fW\16W\u01ec\13W\3X\6X"+
		"\u01ef\nX\rX\16X\u01f0\3Y\6Y\u01f4\nY\rY\16Y\u01f5\3Y\3Y\2\2Z\3\2\5\2"+
		"\7\2\t\2\13\2\r\2\17\2\21\2\23\2\25\2\27\2\31\2\33\2\35\2\37\2!\2#\2%"+
		"\2\'\2)\2+\2-\2/\2\61\2\63\2\65\2\67\29\2;\3=\4?\5A\6C\7E\bG\tI\nK\13"+
		"M\fO\rQ\16S\17U\20W\21Y\22[\23]\24_\25a\26c\27e\30g\31i\32k\33m\34o\35"+
		"q\36s\37u w!y\"{#}$\177%\u0081&\u0083\'\u0085(\u0087)\u0089*\u008b+\u008d"+
		",\u008f-\u0091.\u0093/\u0095\60\u0097\61\u0099\62\u009b\63\u009d\64\u009f"+
		"\65\u00a1\66\u00a3\67\u00a58\u00a79\u00a9:\u00ab;\u00ad<\u00af=\u00b1"+
		">\3\2\37\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2J"+
		"Jjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4"+
		"\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{"+
		"{\4\2\\\\||\4\2C\\c|\3\2\62;\5\2\13\f\17\17\"\"\2\u01e0\2;\3\2\2\2\2="+
		"\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2"+
		"\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2"+
		"\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c"+
		"\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2"+
		"\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2"+
		"\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2"+
		"\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2"+
		"\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097"+
		"\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2"+
		"\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9"+
		"\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2"+
		"\2\3\u00b3\3\2\2\2\5\u00b5\3\2\2\2\7\u00b7\3\2\2\2\t\u00b9\3\2\2\2\13"+
		"\u00bb\3\2\2\2\r\u00bd\3\2\2\2\17\u00bf\3\2\2\2\21\u00c1\3\2\2\2\23\u00c3"+
		"\3\2\2\2\25\u00c5\3\2\2\2\27\u00c7\3\2\2\2\31\u00c9\3\2\2\2\33\u00cb\3"+
		"\2\2\2\35\u00cd\3\2\2\2\37\u00cf\3\2\2\2!\u00d1\3\2\2\2#\u00d3\3\2\2\2"+
		"%\u00d5\3\2\2\2\'\u00d7\3\2\2\2)\u00d9\3\2\2\2+\u00db\3\2\2\2-\u00dd\3"+
		"\2\2\2/\u00df\3\2\2\2\61\u00e1\3\2\2\2\63\u00e3\3\2\2\2\65\u00e5\3\2\2"+
		"\2\67\u00e7\3\2\2\29\u00e9\3\2\2\2;\u00eb\3\2\2\2=\u00ed\3\2\2\2?\u00ef"+
		"\3\2\2\2A\u00f1\3\2\2\2C\u00f3\3\2\2\2E\u00f5\3\2\2\2G\u00f7\3\2\2\2I"+
		"\u00f9\3\2\2\2K\u00fc\3\2\2\2M\u00ff\3\2\2\2O\u0102\3\2\2\2Q\u0105\3\2"+
		"\2\2S\u0107\3\2\2\2U\u0109\3\2\2\2W\u010b\3\2\2\2Y\u010d\3\2\2\2[\u010f"+
		"\3\2\2\2]\u0111\3\2\2\2_\u0115\3\2\2\2a\u011b\3\2\2\2c\u0121\3\2\2\2e"+
		"\u0126\3\2\2\2g\u012c\3\2\2\2i\u0130\3\2\2\2k\u0133\3\2\2\2m\u013a\3\2"+
		"\2\2o\u013f\3\2\2\2q\u0143\3\2\2\2s\u0148\3\2\2\2u\u014c\3\2\2\2w\u0155"+
		"\3\2\2\2y\u015a\3\2\2\2{\u015d\3\2\2\2}\u0160\3\2\2\2\177\u0168\3\2\2"+
		"\2\u0081\u016e\3\2\2\2\u0083\u0172\3\2\2\2\u0085\u0176\3\2\2\2\u0087\u017a"+
		"\3\2\2\2\u0089\u017d\3\2\2\2\u008b\u0180\3\2\2\2\u008d\u0187\3\2\2\2\u008f"+
		"\u0191\3\2\2\2\u0091\u0199\3\2\2\2\u0093\u019e\3\2\2\2\u0095\u01a3\3\2"+
		"\2\2\u0097\u01aa\3\2\2\2\u0099\u01b1\3\2\2\2\u009b\u01b5\3\2\2\2\u009d"+
		"\u01ba\3\2\2\2\u009f\u01bd\3\2\2\2\u00a1\u01c2\3\2\2\2\u00a3\u01c8\3\2"+
		"\2\2\u00a5\u01cc\3\2\2\2\u00a7\u01d2\3\2\2\2\u00a9\u01d7\3\2\2\2\u00ab"+
		"\u01dd\3\2\2\2\u00ad\u01e5\3\2\2\2\u00af\u01ee\3\2\2\2\u00b1\u01f3\3\2"+
		"\2\2\u00b3\u00b4\t\2\2\2\u00b4\4\3\2\2\2\u00b5\u00b6\t\3\2\2\u00b6\6\3"+
		"\2\2\2\u00b7\u00b8\t\4\2\2\u00b8\b\3\2\2\2\u00b9\u00ba\t\5\2\2\u00ba\n"+
		"\3\2\2\2\u00bb\u00bc\t\6\2\2\u00bc\f\3\2\2\2\u00bd\u00be\t\7\2\2\u00be"+
		"\16\3\2\2\2\u00bf\u00c0\t\b\2\2\u00c0\20\3\2\2\2\u00c1\u00c2\t\t\2\2\u00c2"+
		"\22\3\2\2\2\u00c3\u00c4\t\n\2\2\u00c4\24\3\2\2\2\u00c5\u00c6\t\13\2\2"+
		"\u00c6\26\3\2\2\2\u00c7\u00c8\t\f\2\2\u00c8\30\3\2\2\2\u00c9\u00ca\t\r"+
		"\2\2\u00ca\32\3\2\2\2\u00cb\u00cc\t\16\2\2\u00cc\34\3\2\2\2\u00cd\u00ce"+
		"\t\17\2\2\u00ce\36\3\2\2\2\u00cf\u00d0\t\20\2\2\u00d0 \3\2\2\2\u00d1\u00d2"+
		"\t\21\2\2\u00d2\"\3\2\2\2\u00d3\u00d4\t\22\2\2\u00d4$\3\2\2\2\u00d5\u00d6"+
		"\t\23\2\2\u00d6&\3\2\2\2\u00d7\u00d8\t\24\2\2\u00d8(\3\2\2\2\u00d9\u00da"+
		"\t\25\2\2\u00da*\3\2\2\2\u00db\u00dc\t\26\2\2\u00dc,\3\2\2\2\u00dd\u00de"+
		"\t\27\2\2\u00de.\3\2\2\2\u00df\u00e0\t\30\2\2\u00e0\60\3\2\2\2\u00e1\u00e2"+
		"\t\31\2\2\u00e2\62\3\2\2\2\u00e3\u00e4\t\32\2\2\u00e4\64\3\2\2\2\u00e5"+
		"\u00e6\t\33\2\2\u00e6\66\3\2\2\2\u00e7\u00e8\t\34\2\2\u00e88\3\2\2\2\u00e9"+
		"\u00ea\t\35\2\2\u00ea:\3\2\2\2\u00eb\u00ec\7-\2\2\u00ec<\3\2\2\2\u00ed"+
		"\u00ee\7/\2\2\u00ee>\3\2\2\2\u00ef\u00f0\7,\2\2\u00f0@\3\2\2\2\u00f1\u00f2"+
		"\7\61\2\2\u00f2B\3\2\2\2\u00f3\u00f4\7?\2\2\u00f4D\3\2\2\2\u00f5\u00f6"+
		"\7>\2\2\u00f6F\3\2\2\2\u00f7\u00f8\7@\2\2\u00f8H\3\2\2\2\u00f9\u00fa\7"+
		">\2\2\u00fa\u00fb\7?\2\2\u00fbJ\3\2\2\2\u00fc\u00fd\7@\2\2\u00fd\u00fe"+
		"\7?\2\2\u00feL\3\2\2\2\u00ff\u0100\7>\2\2\u0100\u0101\7@\2\2\u0101N\3"+
		"\2\2\2\u0102\u0103\7<\2\2\u0103\u0104\7?\2\2\u0104P\3\2\2\2\u0105\u0106"+
		"\7\60\2\2\u0106R\3\2\2\2\u0107\u0108\7=\2\2\u0108T\3\2\2\2\u0109\u010a"+
		"\7<\2\2\u010aV\3\2\2\2\u010b\u010c\7.\2\2\u010cX\3\2\2\2\u010d\u010e\7"+
		"*\2\2\u010eZ\3\2\2\2\u010f\u0110\7+\2\2\u0110\\\3\2\2\2\u0111\u0112\5"+
		"\3\2\2\u0112\u0113\5\35\17\2\u0113\u0114\5\t\5\2\u0114^\3\2\2\2\u0115"+
		"\u0116\5\3\2\2\u0116\u0117\5%\23\2\u0117\u0118\5%\23\2\u0118\u0119\5\3"+
		"\2\2\u0119\u011a\5\63\32\2\u011a`\3\2\2\2\u011b\u011c\5\5\3\2\u011c\u011d"+
		"\5\13\6\2\u011d\u011e\5\17\b\2\u011e\u011f\5\23\n\2\u011f\u0120\5\35\17"+
		"\2\u0120b\3\2\2\2\u0121\u0122\5\7\4\2\u0122\u0123\5\3\2\2\u0123\u0124"+
		"\5\'\24\2\u0124\u0125\5\13\6\2\u0125d\3\2\2\2\u0126\u0127\5\7\4\2\u0127"+
		"\u0128\5\37\20\2\u0128\u0129\5\35\17\2\u0129\u012a\5\'\24\2\u012a\u012b"+
		"\5)\25\2\u012bf\3\2\2\2\u012c\u012d\5\t\5\2\u012d\u012e\5\23\n\2\u012e"+
		"\u012f\5-\27\2\u012fh\3\2\2\2\u0130\u0131\5\t\5\2\u0131\u0132\5\37\20"+
		"\2\u0132j\3\2\2\2\u0133\u0134\5\t\5\2\u0134\u0135\5\37\20\2\u0135\u0136"+
		"\5/\30\2\u0136\u0137\5\35\17\2\u0137\u0138\5)\25\2\u0138\u0139\5\37\20"+
		"\2\u0139l\3\2\2\2\u013a\u013b\5\13\6\2\u013b\u013c\5\31\r\2\u013c\u013d"+
		"\5\'\24\2\u013d\u013e\5\13\6\2\u013en\3\2\2\2\u013f\u0140\5\13\6\2\u0140"+
		"\u0141\5\35\17\2\u0141\u0142\5\t\5\2\u0142p\3\2\2\2\u0143\u0144\5\r\7"+
		"\2\u0144\u0145\5\23\n\2\u0145\u0146\5\31\r\2\u0146\u0147\5\13\6\2\u0147"+
		"r\3\2\2\2\u0148\u0149\5\r\7\2\u0149\u014a\5\37\20\2\u014a\u014b\5%\23"+
		"\2\u014bt\3\2\2\2\u014c\u014d\5\r\7\2\u014d\u014e\5+\26\2\u014e\u014f"+
		"\5\35\17\2\u014f\u0150\5\7\4\2\u0150\u0151\5)\25\2\u0151\u0152\5\23\n"+
		"\2\u0152\u0153\5\37\20\2\u0153\u0154\5\35\17\2\u0154v\3\2\2\2\u0155\u0156"+
		"\5\17\b\2\u0156\u0157\5\37\20\2\u0157\u0158\5)\25\2\u0158\u0159\5\37\20"+
		"\2\u0159x\3\2\2\2\u015a\u015b\5\23\n\2\u015b\u015c\5\r\7\2\u015cz\3\2"+
		"\2\2\u015d\u015e\5\23\n\2\u015e\u015f\5\35\17\2\u015f|\3\2\2\2\u0160\u0161"+
		"\5\23\n\2\u0161\u0162\5\35\17\2\u0162\u0163\5)\25\2\u0163\u0164\5\13\6"+
		"\2\u0164\u0165\5\17\b\2\u0165\u0166\5\13\6\2\u0166\u0167\5%\23\2\u0167"+
		"~\3\2\2\2\u0168\u0169\5\31\r\2\u0169\u016a\5\3\2\2\u016a\u016b\5\5\3\2"+
		"\u016b\u016c\5\13\6\2\u016c\u016d\5\31\r\2\u016d\u0080\3\2\2\2\u016e\u016f"+
		"\5\33\16\2\u016f\u0170\5\37\20\2\u0170\u0171\5\t\5\2\u0171\u0082\3\2\2"+
		"\2\u0172\u0173\5\35\17\2\u0173\u0174\5\23\n\2\u0174\u0175\5\31\r\2\u0175"+
		"\u0084\3\2\2\2\u0176\u0177\5\35\17\2\u0177\u0178\5\37\20\2\u0178\u0179"+
		"\5)\25\2\u0179\u0086\3\2\2\2\u017a\u017b\5\37\20\2\u017b\u017c\5\r\7\2"+
		"\u017c\u0088\3\2\2\2\u017d\u017e\5\37\20\2\u017e\u017f\5%\23\2\u017f\u008a"+
		"\3\2\2\2\u0180\u0181\5!\21\2\u0181\u0182\5\3\2\2\u0182\u0183\5\7\4\2\u0183"+
		"\u0184\5\27\f\2\u0184\u0185\5\13\6\2\u0185\u0186\5\t\5\2\u0186\u008c\3"+
		"\2\2\2\u0187\u0188\5!\21\2\u0188\u0189\5%\23\2\u0189\u018a\5\37\20\2\u018a"+
		"\u018b\5\7\4\2\u018b\u018c\5\13\6\2\u018c\u018d\5\t\5\2\u018d\u018e\5"+
		"+\26\2\u018e\u018f\5%\23\2\u018f\u0190\5\13\6\2\u0190\u008e\3\2\2\2\u0191"+
		"\u0192\5!\21\2\u0192\u0193\5%\23\2\u0193\u0194\5\37\20\2\u0194\u0195\5"+
		"\17\b\2\u0195\u0196\5%\23\2\u0196\u0197\5\3\2\2\u0197\u0198\5\33\16\2"+
		"\u0198\u0090\3\2\2\2\u0199\u019a\5%\23\2\u019a\u019b\5\13\6\2\u019b\u019c"+
		"\5\3\2\2\u019c\u019d\5\t\5\2\u019d\u0092\3\2\2\2\u019e\u019f\5%\23\2\u019f"+
		"\u01a0\5\13\6\2\u01a0\u01a1\5\3\2\2\u01a1\u01a2\5\31\r\2\u01a2\u0094\3"+
		"\2\2\2\u01a3\u01a4\5%\23\2\u01a4\u01a5\5\13\6\2\u01a5\u01a6\5\7\4\2\u01a6"+
		"\u01a7\5\37\20\2\u01a7\u01a8\5%\23\2\u01a8\u01a9\5\t\5\2\u01a9\u0096\3"+
		"\2\2\2\u01aa\u01ab\5%\23\2\u01ab\u01ac\5\13\6\2\u01ac\u01ad\5!\21\2\u01ad"+
		"\u01ae\5\13\6\2\u01ae\u01af\5\3\2\2\u01af\u01b0\5)\25\2\u01b0\u0098\3"+
		"\2\2\2\u01b1\u01b2\5\'\24\2\u01b2\u01b3\5\13\6\2\u01b3\u01b4\5)\25\2\u01b4"+
		"\u009a\3\2\2\2\u01b5\u01b6\5)\25\2\u01b6\u01b7\5\21\t\2\u01b7\u01b8\5"+
		"\13\6\2\u01b8\u01b9\5\35\17\2\u01b9\u009c\3\2\2\2\u01ba\u01bb\5)\25\2"+
		"\u01bb\u01bc\5\37\20\2\u01bc\u009e\3\2\2\2\u01bd\u01be\5)\25\2\u01be\u01bf"+
		"\5\63\32\2\u01bf\u01c0\5!\21\2\u01c0\u01c1\5\13\6\2\u01c1\u00a0\3\2\2"+
		"\2\u01c2\u01c3\5+\26\2\u01c3\u01c4\5\35\17\2\u01c4\u01c5\5)\25\2\u01c5"+
		"\u01c6\5\23\n\2\u01c6\u01c7\5\31\r\2\u01c7\u00a2\3\2\2\2\u01c8\u01c9\5"+
		"-\27\2\u01c9\u01ca\5\3\2\2\u01ca\u01cb\5%\23\2\u01cb\u00a4\3\2\2\2\u01cc"+
		"\u01cd\5/\30\2\u01cd\u01ce\5\21\t\2\u01ce\u01cf\5\23\n\2\u01cf\u01d0\5"+
		"\31\r\2\u01d0\u01d1\5\13\6\2\u01d1\u00a6\3\2\2\2\u01d2\u01d3\5/\30\2\u01d3"+
		"\u01d4\5\23\n\2\u01d4\u01d5\5)\25\2\u01d5\u01d6\5\21\t\2\u01d6\u00a8\3"+
		"\2\2\2\u01d7\u01d8\5/\30\2\u01d8\u01d9\5%\23\2\u01d9\u01da\5\23\n\2\u01da"+
		"\u01db\5)\25\2\u01db\u01dc\5\13\6\2\u01dc\u00aa\3\2\2\2\u01dd\u01de\5"+
		"/\30\2\u01de\u01df\5%\23\2\u01df\u01e0\5\23\n\2\u01e0\u01e1\5)\25\2\u01e1"+
		"\u01e2\5\13\6\2\u01e2\u01e3\5\31\r\2\u01e3\u01e4\5\35\17\2\u01e4\u00ac"+
		"\3\2\2\2\u01e5\u01ea\5\67\34\2\u01e6\u01e9\5\67\34\2\u01e7\u01e9\59\35"+
		"\2\u01e8\u01e6\3\2\2\2\u01e8\u01e7\3\2\2\2\u01e9\u01ec\3\2\2\2\u01ea\u01e8"+
		"\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u00ae\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ed"+
		"\u01ef\59\35\2\u01ee\u01ed\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0\u01ee\3\2"+
		"\2\2\u01f0\u01f1\3\2\2\2\u01f1\u00b0\3\2\2\2\u01f2\u01f4\t\36\2\2\u01f3"+
		"\u01f2\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f5\u01f6\3\2"+
		"\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01f8\bY\2\2\u01f8\u00b2\3\2\2\2\7\2\u01e8"+
		"\u01ea\u01f0\u01f5\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}