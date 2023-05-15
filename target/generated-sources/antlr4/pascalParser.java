// Generated from pascal.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class pascalParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

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
	public static final int
		RULE_program = 0, RULE_corpo = 1, RULE_declara = 2, RULE_mais_dc = 3, 
		RULE_cont_dc = 4, RULE_dvar = 5, RULE_tipo_var = 6, RULE_variaveis = 7, 
		RULE_mais_var = 8, RULE_sentencas = 9, RULE_mais_sentencas = 10, RULE_cont_sentencas = 11, 
		RULE_var_read = 12, RULE_mais_var_read = 13, RULE_var_write = 14, RULE_mais_var_write = 15, 
		RULE_comando = 16, RULE_condicao = 17, RULE_pfalsa = 18, RULE_relacao = 19, 
		RULE_expressao = 20, RULE_outros_termos = 21, RULE_op_ad = 22, RULE_termo = 23, 
		RULE_mais_fatores = 24, RULE_op_mul = 25, RULE_fator = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "corpo", "declara", "mais_dc", "cont_dc", "dvar", "tipo_var", 
			"variaveis", "mais_var", "sentencas", "mais_sentencas", "cont_sentencas", 
			"var_read", "mais_var_read", "var_write", "mais_var_write", "comando", 
			"condicao", "pfalsa", "relacao", "expressao", "outros_termos", "op_ad", 
			"termo", "mais_fatores", "op_mul", "fator"
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

	@Override
	public String getGrammarFileName() { return "pascal.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public pascalParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(pascalParser.PROGRAM, 0); }
		public TerminalNode ID() { return getToken(pascalParser.ID, 0); }
		public CorpoContext corpo() {
			return getRuleContext(CorpoContext.class,0);
		}
		public TerminalNode PONTO() { return getToken(pascalParser.PONTO, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(PROGRAM);
			setState(55);
			match(ID);
			setState(56);
			corpo();
			setState(57);
			match(PONTO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CorpoContext extends ParserRuleContext {
		public DeclaraContext declara() {
			return getRuleContext(DeclaraContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(pascalParser.BEGIN, 0); }
		public SentencasContext sentencas() {
			return getRuleContext(SentencasContext.class,0);
		}
		public TerminalNode END() { return getToken(pascalParser.END, 0); }
		public CorpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corpo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterCorpo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitCorpo(this);
		}
	}

	public final CorpoContext corpo() throws RecognitionException {
		CorpoContext _localctx = new CorpoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_corpo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			declara();
			setState(60);
			match(BEGIN);
			setState(61);
			sentencas();
			setState(62);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaraContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(pascalParser.VAR, 0); }
		public DvarContext dvar() {
			return getRuleContext(DvarContext.class,0);
		}
		public Mais_dcContext mais_dc() {
			return getRuleContext(Mais_dcContext.class,0);
		}
		public DeclaraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declara; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterDeclara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitDeclara(this);
		}
	}

	public final DeclaraContext declara() throws RecognitionException {
		DeclaraContext _localctx = new DeclaraContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declara);
		try {
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				match(VAR);
				setState(65);
				dvar();
				setState(66);
				mais_dc();
				}
				break;
			case BEGIN:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Mais_dcContext extends ParserRuleContext {
		public TerminalNode PONTO_VIRGULA() { return getToken(pascalParser.PONTO_VIRGULA, 0); }
		public Cont_dcContext cont_dc() {
			return getRuleContext(Cont_dcContext.class,0);
		}
		public Mais_dcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_dc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterMais_dc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitMais_dc(this);
		}
	}

	public final Mais_dcContext mais_dc() throws RecognitionException {
		Mais_dcContext _localctx = new Mais_dcContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_mais_dc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(PONTO_VIRGULA);
			setState(72);
			cont_dc();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Cont_dcContext extends ParserRuleContext {
		public DvarContext dvar() {
			return getRuleContext(DvarContext.class,0);
		}
		public Mais_dcContext mais_dc() {
			return getRuleContext(Mais_dcContext.class,0);
		}
		public Cont_dcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cont_dc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterCont_dc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitCont_dc(this);
		}
	}

	public final Cont_dcContext cont_dc() throws RecognitionException {
		Cont_dcContext _localctx = new Cont_dcContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_cont_dc);
		try {
			setState(78);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				dvar();
				setState(75);
				mais_dc();
				}
				break;
			case BEGIN:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DvarContext extends ParserRuleContext {
		public VariaveisContext variaveis() {
			return getRuleContext(VariaveisContext.class,0);
		}
		public TerminalNode DOIS_PONTOS() { return getToken(pascalParser.DOIS_PONTOS, 0); }
		public Tipo_varContext tipo_var() {
			return getRuleContext(Tipo_varContext.class,0);
		}
		public DvarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dvar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterDvar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitDvar(this);
		}
	}

	public final DvarContext dvar() throws RecognitionException {
		DvarContext _localctx = new DvarContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_dvar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			variaveis();
			setState(81);
			match(DOIS_PONTOS);
			setState(82);
			tipo_var();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tipo_varContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(pascalParser.INTEGER, 0); }
		public Tipo_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterTipo_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitTipo_var(this);
		}
	}

	public final Tipo_varContext tipo_var() throws RecognitionException {
		Tipo_varContext _localctx = new Tipo_varContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tipo_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(INTEGER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariaveisContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(pascalParser.ID, 0); }
		public Mais_varContext mais_var() {
			return getRuleContext(Mais_varContext.class,0);
		}
		public VariaveisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variaveis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterVariaveis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitVariaveis(this);
		}
	}

	public final VariaveisContext variaveis() throws RecognitionException {
		VariaveisContext _localctx = new VariaveisContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variaveis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(ID);
			setState(87);
			mais_var();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Mais_varContext extends ParserRuleContext {
		public TerminalNode VIRGULA() { return getToken(pascalParser.VIRGULA, 0); }
		public VariaveisContext variaveis() {
			return getRuleContext(VariaveisContext.class,0);
		}
		public Mais_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterMais_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitMais_var(this);
		}
	}

	public final Mais_varContext mais_var() throws RecognitionException {
		Mais_varContext _localctx = new Mais_varContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_mais_var);
		try {
			setState(92);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VIRGULA:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				match(VIRGULA);
				setState(90);
				variaveis();
				}
				break;
			case DOIS_PONTOS:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SentencasContext extends ParserRuleContext {
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public Mais_sentencasContext mais_sentencas() {
			return getRuleContext(Mais_sentencasContext.class,0);
		}
		public SentencasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterSentencas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitSentencas(this);
		}
	}

	public final SentencasContext sentencas() throws RecognitionException {
		SentencasContext _localctx = new SentencasContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_sentencas);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			comando();
			setState(95);
			mais_sentencas();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Mais_sentencasContext extends ParserRuleContext {
		public TerminalNode PONTO_VIRGULA() { return getToken(pascalParser.PONTO_VIRGULA, 0); }
		public Cont_sentencasContext cont_sentencas() {
			return getRuleContext(Cont_sentencasContext.class,0);
		}
		public Mais_sentencasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_sentencas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterMais_sentencas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitMais_sentencas(this);
		}
	}

	public final Mais_sentencasContext mais_sentencas() throws RecognitionException {
		Mais_sentencasContext _localctx = new Mais_sentencasContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_mais_sentencas);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(PONTO_VIRGULA);
			setState(98);
			cont_sentencas();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Cont_sentencasContext extends ParserRuleContext {
		public SentencasContext sentencas() {
			return getRuleContext(SentencasContext.class,0);
		}
		public Cont_sentencasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cont_sentencas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterCont_sentencas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitCont_sentencas(this);
		}
	}

	public final Cont_sentencasContext cont_sentencas() throws RecognitionException {
		Cont_sentencasContext _localctx = new Cont_sentencasContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_cont_sentencas);
		try {
			setState(102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DO:
			case FOR:
			case IF:
			case READ:
			case REPEAT:
			case WHILE:
			case WRITE:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				sentencas();
				}
				break;
			case END:
			case UNTIL:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Var_readContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(pascalParser.ID, 0); }
		public Mais_var_readContext mais_var_read() {
			return getRuleContext(Mais_var_readContext.class,0);
		}
		public Var_readContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_read; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterVar_read(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitVar_read(this);
		}
	}

	public final Var_readContext var_read() throws RecognitionException {
		Var_readContext _localctx = new Var_readContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_var_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(ID);
			setState(105);
			mais_var_read();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Mais_var_readContext extends ParserRuleContext {
		public TerminalNode VIRGULA() { return getToken(pascalParser.VIRGULA, 0); }
		public Var_readContext var_read() {
			return getRuleContext(Var_readContext.class,0);
		}
		public Mais_var_readContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_var_read; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterMais_var_read(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitMais_var_read(this);
		}
	}

	public final Mais_var_readContext mais_var_read() throws RecognitionException {
		Mais_var_readContext _localctx = new Mais_var_readContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_mais_var_read);
		try {
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VIRGULA:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				match(VIRGULA);
				setState(108);
				var_read();
				}
				break;
			case PARENTESES_DIR:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Var_writeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(pascalParser.ID, 0); }
		public Mais_var_writeContext mais_var_write() {
			return getRuleContext(Mais_var_writeContext.class,0);
		}
		public Var_writeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_write; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterVar_write(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitVar_write(this);
		}
	}

	public final Var_writeContext var_write() throws RecognitionException {
		Var_writeContext _localctx = new Var_writeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_var_write);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(ID);
			setState(113);
			mais_var_write();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Mais_var_writeContext extends ParserRuleContext {
		public TerminalNode VIRGULA() { return getToken(pascalParser.VIRGULA, 0); }
		public Var_writeContext var_write() {
			return getRuleContext(Var_writeContext.class,0);
		}
		public Mais_var_writeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_var_write; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterMais_var_write(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitMais_var_write(this);
		}
	}

	public final Mais_var_writeContext mais_var_write() throws RecognitionException {
		Mais_var_writeContext _localctx = new Mais_var_writeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_mais_var_write);
		try {
			setState(118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VIRGULA:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				match(VIRGULA);
				setState(116);
				var_write();
				}
				break;
			case PARENTESES_DIR:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComandoContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(pascalParser.READ, 0); }
		public TerminalNode PARENTESES_ESQ() { return getToken(pascalParser.PARENTESES_ESQ, 0); }
		public Var_readContext var_read() {
			return getRuleContext(Var_readContext.class,0);
		}
		public TerminalNode PARENTESES_DIR() { return getToken(pascalParser.PARENTESES_DIR, 0); }
		public TerminalNode WRITE() { return getToken(pascalParser.WRITE, 0); }
		public Var_writeContext var_write() {
			return getRuleContext(Var_writeContext.class,0);
		}
		public TerminalNode FOR() { return getToken(pascalParser.FOR, 0); }
		public TerminalNode ID() { return getToken(pascalParser.ID, 0); }
		public TerminalNode ATRIBUICAO() { return getToken(pascalParser.ATRIBUICAO, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode TO() { return getToken(pascalParser.TO, 0); }
		public TerminalNode DO() { return getToken(pascalParser.DO, 0); }
		public TerminalNode BEGIN() { return getToken(pascalParser.BEGIN, 0); }
		public SentencasContext sentencas() {
			return getRuleContext(SentencasContext.class,0);
		}
		public TerminalNode END() { return getToken(pascalParser.END, 0); }
		public TerminalNode REPEAT() { return getToken(pascalParser.REPEAT, 0); }
		public TerminalNode UNTIL() { return getToken(pascalParser.UNTIL, 0); }
		public CondicaoContext condicao() {
			return getRuleContext(CondicaoContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(pascalParser.WHILE, 0); }
		public TerminalNode IF() { return getToken(pascalParser.IF, 0); }
		public TerminalNode THEN() { return getToken(pascalParser.THEN, 0); }
		public PfalsaContext pfalsa() {
			return getRuleContext(PfalsaContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitComando(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_comando);
		try {
			setState(171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case READ:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				match(READ);
				setState(121);
				match(PARENTESES_ESQ);
				setState(122);
				var_read();
				setState(123);
				match(PARENTESES_DIR);
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				match(WRITE);
				setState(126);
				match(PARENTESES_ESQ);
				setState(127);
				var_write();
				setState(128);
				match(PARENTESES_DIR);
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(130);
				match(FOR);
				setState(131);
				match(ID);
				setState(132);
				match(ATRIBUICAO);
				setState(133);
				expressao();
				setState(134);
				match(TO);
				setState(135);
				expressao();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 4);
				{
				setState(137);
				match(DO);
				setState(138);
				match(BEGIN);
				setState(139);
				sentencas();
				setState(140);
				match(END);
				}
				break;
			case REPEAT:
				enterOuterAlt(_localctx, 5);
				{
				setState(142);
				match(REPEAT);
				setState(143);
				sentencas();
				setState(144);
				match(UNTIL);
				setState(145);
				match(PARENTESES_ESQ);
				setState(146);
				condicao();
				setState(147);
				match(PARENTESES_DIR);
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 6);
				{
				setState(149);
				match(WHILE);
				setState(150);
				match(PARENTESES_ESQ);
				setState(151);
				condicao();
				setState(152);
				match(PARENTESES_DIR);
				setState(153);
				match(DO);
				setState(154);
				match(BEGIN);
				setState(155);
				sentencas();
				setState(156);
				match(END);
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 7);
				{
				setState(158);
				match(IF);
				setState(159);
				match(PARENTESES_ESQ);
				setState(160);
				condicao();
				setState(161);
				match(PARENTESES_DIR);
				setState(162);
				match(THEN);
				setState(163);
				match(BEGIN);
				setState(164);
				sentencas();
				setState(165);
				match(END);
				setState(166);
				pfalsa();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 8);
				{
				setState(168);
				match(ID);
				setState(169);
				match(ATRIBUICAO);
				setState(170);
				expressao();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CondicaoContext extends ParserRuleContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public RelacaoContext relacao() {
			return getRuleContext(RelacaoContext.class,0);
		}
		public CondicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterCondicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitCondicao(this);
		}
	}

	public final CondicaoContext condicao() throws RecognitionException {
		CondicaoContext _localctx = new CondicaoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_condicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			expressao();
			setState(174);
			relacao();
			setState(175);
			expressao();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PfalsaContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(pascalParser.ELSE, 0); }
		public TerminalNode BEGIN() { return getToken(pascalParser.BEGIN, 0); }
		public SentencasContext sentencas() {
			return getRuleContext(SentencasContext.class,0);
		}
		public TerminalNode END() { return getToken(pascalParser.END, 0); }
		public PfalsaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pfalsa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterPfalsa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitPfalsa(this);
		}
	}

	public final PfalsaContext pfalsa() throws RecognitionException {
		PfalsaContext _localctx = new PfalsaContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_pfalsa);
		try {
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ELSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				match(ELSE);
				setState(178);
				match(BEGIN);
				setState(179);
				sentencas();
				setState(180);
				match(END);
				}
				break;
			case PONTO_VIRGULA:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RelacaoContext extends ParserRuleContext {
		public TerminalNode IGUAL() { return getToken(pascalParser.IGUAL, 0); }
		public TerminalNode MENOR() { return getToken(pascalParser.MENOR, 0); }
		public TerminalNode MAIOR() { return getToken(pascalParser.MAIOR, 0); }
		public TerminalNode MAIOR_IGUAL() { return getToken(pascalParser.MAIOR_IGUAL, 0); }
		public TerminalNode MENOR_IGUAL() { return getToken(pascalParser.MENOR_IGUAL, 0); }
		public TerminalNode DIFERENTE() { return getToken(pascalParser.DIFERENTE, 0); }
		public RelacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterRelacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitRelacao(this);
		}
	}

	public final RelacaoContext relacao() throws RecognitionException {
		RelacaoContext _localctx = new RelacaoContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_relacao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2016L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoContext extends ParserRuleContext {
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public Outros_termosContext outros_termos() {
			return getRuleContext(Outros_termosContext.class,0);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitExpressao(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expressao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			termo();
			setState(188);
			outros_termos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Outros_termosContext extends ParserRuleContext {
		public Op_adContext op_ad() {
			return getRuleContext(Op_adContext.class,0);
		}
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public Outros_termosContext outros_termos() {
			return getRuleContext(Outros_termosContext.class,0);
		}
		public Outros_termosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outros_termos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterOutros_termos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitOutros_termos(this);
		}
	}

	public final Outros_termosContext outros_termos() throws RecognitionException {
		Outros_termosContext _localctx = new Outros_termosContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_outros_termos);
		try {
			setState(195);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADICAO:
			case SUBTRACAO:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				op_ad();
				setState(191);
				termo();
				setState(192);
				outros_termos();
				}
				break;
			case IGUAL:
			case MENOR:
			case MAIOR:
			case MENOR_IGUAL:
			case MAIOR_IGUAL:
			case DIFERENTE:
			case PONTO_VIRGULA:
			case PARENTESES_DIR:
			case TO:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Op_adContext extends ParserRuleContext {
		public TerminalNode ADICAO() { return getToken(pascalParser.ADICAO, 0); }
		public TerminalNode SUBTRACAO() { return getToken(pascalParser.SUBTRACAO, 0); }
		public Op_adContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_ad; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterOp_ad(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitOp_ad(this);
		}
	}

	public final Op_adContext op_ad() throws RecognitionException {
		Op_adContext _localctx = new Op_adContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_op_ad);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			_la = _input.LA(1);
			if ( !(_la==ADICAO || _la==SUBTRACAO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TermoContext extends ParserRuleContext {
		public FatorContext fator() {
			return getRuleContext(FatorContext.class,0);
		}
		public Mais_fatoresContext mais_fatores() {
			return getRuleContext(Mais_fatoresContext.class,0);
		}
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitTermo(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_termo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			fator();
			setState(200);
			mais_fatores();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Mais_fatoresContext extends ParserRuleContext {
		public Op_mulContext op_mul() {
			return getRuleContext(Op_mulContext.class,0);
		}
		public FatorContext fator() {
			return getRuleContext(FatorContext.class,0);
		}
		public Mais_fatoresContext mais_fatores() {
			return getRuleContext(Mais_fatoresContext.class,0);
		}
		public Mais_fatoresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_fatores; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterMais_fatores(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitMais_fatores(this);
		}
	}

	public final Mais_fatoresContext mais_fatores() throws RecognitionException {
		Mais_fatoresContext _localctx = new Mais_fatoresContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_mais_fatores);
		try {
			setState(207);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULTIPLICACAO:
			case DIVIDIR:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				op_mul();
				setState(203);
				fator();
				setState(204);
				mais_fatores();
				}
				break;
			case ADICAO:
			case SUBTRACAO:
			case IGUAL:
			case MENOR:
			case MAIOR:
			case MENOR_IGUAL:
			case MAIOR_IGUAL:
			case DIFERENTE:
			case PONTO_VIRGULA:
			case PARENTESES_DIR:
			case TO:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Op_mulContext extends ParserRuleContext {
		public TerminalNode MULTIPLICACAO() { return getToken(pascalParser.MULTIPLICACAO, 0); }
		public TerminalNode DIVIDIR() { return getToken(pascalParser.DIVIDIR, 0); }
		public Op_mulContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_mul; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterOp_mul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitOp_mul(this);
		}
	}

	public final Op_mulContext op_mul() throws RecognitionException {
		Op_mulContext _localctx = new Op_mulContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_op_mul);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			_la = _input.LA(1);
			if ( !(_la==MULTIPLICACAO || _la==DIVIDIR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FatorContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(pascalParser.ID, 0); }
		public TerminalNode INTNUM() { return getToken(pascalParser.INTNUM, 0); }
		public TerminalNode PARENTESES_ESQ() { return getToken(pascalParser.PARENTESES_ESQ, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode PARENTESES_DIR() { return getToken(pascalParser.PARENTESES_DIR, 0); }
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterFator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitFator(this);
		}
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_fator);
		try {
			setState(217);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				match(ID);
				}
				break;
			case INTNUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				match(INTNUM);
				}
				break;
			case PARENTESES_ESQ:
				enterOuterAlt(_localctx, 3);
				{
				setState(213);
				match(PARENTESES_ESQ);
				setState(214);
				expressao();
				setState(215);
				match(PARENTESES_DIR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001<\u00dc\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002F\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004O\b\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0003\b]"+
		"\b\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0003\u000bg\b\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\r\u0003\ro\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0003\u000fw\b\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0003\u0010\u00ac\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0003\u0012\u00b8\b\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0003\u0015\u00c4\b\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0003\u0018\u00d0\b\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u00da"+
		"\b\u001a\u0001\u001a\u0000\u0000\u001b\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.024\u0000\u0003"+
		"\u0001\u0000\u0005\n\u0001\u0000\u0001\u0002\u0001\u0000\u0003\u0004\u00d2"+
		"\u00006\u0001\u0000\u0000\u0000\u0002;\u0001\u0000\u0000\u0000\u0004E"+
		"\u0001\u0000\u0000\u0000\u0006G\u0001\u0000\u0000\u0000\bN\u0001\u0000"+
		"\u0000\u0000\nP\u0001\u0000\u0000\u0000\fT\u0001\u0000\u0000\u0000\u000e"+
		"V\u0001\u0000\u0000\u0000\u0010\\\u0001\u0000\u0000\u0000\u0012^\u0001"+
		"\u0000\u0000\u0000\u0014a\u0001\u0000\u0000\u0000\u0016f\u0001\u0000\u0000"+
		"\u0000\u0018h\u0001\u0000\u0000\u0000\u001an\u0001\u0000\u0000\u0000\u001c"+
		"p\u0001\u0000\u0000\u0000\u001ev\u0001\u0000\u0000\u0000 \u00ab\u0001"+
		"\u0000\u0000\u0000\"\u00ad\u0001\u0000\u0000\u0000$\u00b7\u0001\u0000"+
		"\u0000\u0000&\u00b9\u0001\u0000\u0000\u0000(\u00bb\u0001\u0000\u0000\u0000"+
		"*\u00c3\u0001\u0000\u0000\u0000,\u00c5\u0001\u0000\u0000\u0000.\u00c7"+
		"\u0001\u0000\u0000\u00000\u00cf\u0001\u0000\u0000\u00002\u00d1\u0001\u0000"+
		"\u0000\u00004\u00d9\u0001\u0000\u0000\u000067\u0005+\u0000\u000078\u0005"+
		":\u0000\u000089\u0003\u0002\u0001\u00009:\u0005\f\u0000\u0000:\u0001\u0001"+
		"\u0000\u0000\u0000;<\u0003\u0004\u0002\u0000<=\u0005\u0014\u0000\u0000"+
		"=>\u0003\u0012\t\u0000>?\u0005\u001b\u0000\u0000?\u0003\u0001\u0000\u0000"+
		"\u0000@A\u00055\u0000\u0000AB\u0003\n\u0005\u0000BC\u0003\u0006\u0003"+
		"\u0000CF\u0001\u0000\u0000\u0000DF\u0001\u0000\u0000\u0000E@\u0001\u0000"+
		"\u0000\u0000ED\u0001\u0000\u0000\u0000F\u0005\u0001\u0000\u0000\u0000"+
		"GH\u0005\r\u0000\u0000HI\u0003\b\u0004\u0000I\u0007\u0001\u0000\u0000"+
		"\u0000JK\u0003\n\u0005\u0000KL\u0003\u0006\u0003\u0000LO\u0001\u0000\u0000"+
		"\u0000MO\u0001\u0000\u0000\u0000NJ\u0001\u0000\u0000\u0000NM\u0001\u0000"+
		"\u0000\u0000O\t\u0001\u0000\u0000\u0000PQ\u0003\u000e\u0007\u0000QR\u0005"+
		"\u000e\u0000\u0000RS\u0003\f\u0006\u0000S\u000b\u0001\u0000\u0000\u0000"+
		"TU\u0005\"\u0000\u0000U\r\u0001\u0000\u0000\u0000VW\u0005:\u0000\u0000"+
		"WX\u0003\u0010\b\u0000X\u000f\u0001\u0000\u0000\u0000YZ\u0005\u000f\u0000"+
		"\u0000Z]\u0003\u000e\u0007\u0000[]\u0001\u0000\u0000\u0000\\Y\u0001\u0000"+
		"\u0000\u0000\\[\u0001\u0000\u0000\u0000]\u0011\u0001\u0000\u0000\u0000"+
		"^_\u0003 \u0010\u0000_`\u0003\u0014\n\u0000`\u0013\u0001\u0000\u0000\u0000"+
		"ab\u0005\r\u0000\u0000bc\u0003\u0016\u000b\u0000c\u0015\u0001\u0000\u0000"+
		"\u0000dg\u0003\u0012\t\u0000eg\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000"+
		"\u0000fe\u0001\u0000\u0000\u0000g\u0017\u0001\u0000\u0000\u0000hi\u0005"+
		":\u0000\u0000ij\u0003\u001a\r\u0000j\u0019\u0001\u0000\u0000\u0000kl\u0005"+
		"\u000f\u0000\u0000lo\u0003\u0018\f\u0000mo\u0001\u0000\u0000\u0000nk\u0001"+
		"\u0000\u0000\u0000nm\u0001\u0000\u0000\u0000o\u001b\u0001\u0000\u0000"+
		"\u0000pq\u0005:\u0000\u0000qr\u0003\u001e\u000f\u0000r\u001d\u0001\u0000"+
		"\u0000\u0000st\u0005\u000f\u0000\u0000tw\u0003\u001c\u000e\u0000uw\u0001"+
		"\u0000\u0000\u0000vs\u0001\u0000\u0000\u0000vu\u0001\u0000\u0000\u0000"+
		"w\u001f\u0001\u0000\u0000\u0000xy\u0005,\u0000\u0000yz\u0005\u0010\u0000"+
		"\u0000z{\u0003\u0018\f\u0000{|\u0005\u0011\u0000\u0000|\u00ac\u0001\u0000"+
		"\u0000\u0000}~\u00058\u0000\u0000~\u007f\u0005\u0010\u0000\u0000\u007f"+
		"\u0080\u0003\u001c\u000e\u0000\u0080\u0081\u0005\u0011\u0000\u0000\u0081"+
		"\u00ac\u0001\u0000\u0000\u0000\u0082\u0083\u0005\u001d\u0000\u0000\u0083"+
		"\u0084\u0005:\u0000\u0000\u0084\u0085\u0005\u000b\u0000\u0000\u0085\u0086"+
		"\u0003(\u0014\u0000\u0086\u0087\u00052\u0000\u0000\u0087\u0088\u0003("+
		"\u0014\u0000\u0088\u00ac\u0001\u0000\u0000\u0000\u0089\u008a\u0005\u0018"+
		"\u0000\u0000\u008a\u008b\u0005\u0014\u0000\u0000\u008b\u008c\u0003\u0012"+
		"\t\u0000\u008c\u008d\u0005\u001b\u0000\u0000\u008d\u00ac\u0001\u0000\u0000"+
		"\u0000\u008e\u008f\u0005/\u0000\u0000\u008f\u0090\u0003\u0012\t\u0000"+
		"\u0090\u0091\u00054\u0000\u0000\u0091\u0092\u0005\u0010\u0000\u0000\u0092"+
		"\u0093\u0003\"\u0011\u0000\u0093\u0094\u0005\u0011\u0000\u0000\u0094\u00ac"+
		"\u0001\u0000\u0000\u0000\u0095\u0096\u00056\u0000\u0000\u0096\u0097\u0005"+
		"\u0010\u0000\u0000\u0097\u0098\u0003\"\u0011\u0000\u0098\u0099\u0005\u0011"+
		"\u0000\u0000\u0099\u009a\u0005\u0018\u0000\u0000\u009a\u009b\u0005\u0014"+
		"\u0000\u0000\u009b\u009c\u0003\u0012\t\u0000\u009c\u009d\u0005\u001b\u0000"+
		"\u0000\u009d\u00ac\u0001\u0000\u0000\u0000\u009e\u009f\u0005 \u0000\u0000"+
		"\u009f\u00a0\u0005\u0010\u0000\u0000\u00a0\u00a1\u0003\"\u0011\u0000\u00a1"+
		"\u00a2\u0005\u0011\u0000\u0000\u00a2\u00a3\u00051\u0000\u0000\u00a3\u00a4"+
		"\u0005\u0014\u0000\u0000\u00a4\u00a5\u0003\u0012\t\u0000\u00a5\u00a6\u0005"+
		"\u001b\u0000\u0000\u00a6\u00a7\u0003$\u0012\u0000\u00a7\u00ac\u0001\u0000"+
		"\u0000\u0000\u00a8\u00a9\u0005:\u0000\u0000\u00a9\u00aa\u0005\u000b\u0000"+
		"\u0000\u00aa\u00ac\u0003(\u0014\u0000\u00abx\u0001\u0000\u0000\u0000\u00ab"+
		"}\u0001\u0000\u0000\u0000\u00ab\u0082\u0001\u0000\u0000\u0000\u00ab\u0089"+
		"\u0001\u0000\u0000\u0000\u00ab\u008e\u0001\u0000\u0000\u0000\u00ab\u0095"+
		"\u0001\u0000\u0000\u0000\u00ab\u009e\u0001\u0000\u0000\u0000\u00ab\u00a8"+
		"\u0001\u0000\u0000\u0000\u00ac!\u0001\u0000\u0000\u0000\u00ad\u00ae\u0003"+
		"(\u0014\u0000\u00ae\u00af\u0003&\u0013\u0000\u00af\u00b0\u0003(\u0014"+
		"\u0000\u00b0#\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005\u001a\u0000\u0000"+
		"\u00b2\u00b3\u0005\u0014\u0000\u0000\u00b3\u00b4\u0003\u0012\t\u0000\u00b4"+
		"\u00b5\u0005\u001b\u0000\u0000\u00b5\u00b8\u0001\u0000\u0000\u0000\u00b6"+
		"\u00b8\u0001\u0000\u0000\u0000\u00b7\u00b1\u0001\u0000\u0000\u0000\u00b7"+
		"\u00b6\u0001\u0000\u0000\u0000\u00b8%\u0001\u0000\u0000\u0000\u00b9\u00ba"+
		"\u0007\u0000\u0000\u0000\u00ba\'\u0001\u0000\u0000\u0000\u00bb\u00bc\u0003"+
		".\u0017\u0000\u00bc\u00bd\u0003*\u0015\u0000\u00bd)\u0001\u0000\u0000"+
		"\u0000\u00be\u00bf\u0003,\u0016\u0000\u00bf\u00c0\u0003.\u0017\u0000\u00c0"+
		"\u00c1\u0003*\u0015\u0000\u00c1\u00c4\u0001\u0000\u0000\u0000\u00c2\u00c4"+
		"\u0001\u0000\u0000\u0000\u00c3\u00be\u0001\u0000\u0000\u0000\u00c3\u00c2"+
		"\u0001\u0000\u0000\u0000\u00c4+\u0001\u0000\u0000\u0000\u00c5\u00c6\u0007"+
		"\u0001\u0000\u0000\u00c6-\u0001\u0000\u0000\u0000\u00c7\u00c8\u00034\u001a"+
		"\u0000\u00c8\u00c9\u00030\u0018\u0000\u00c9/\u0001\u0000\u0000\u0000\u00ca"+
		"\u00cb\u00032\u0019\u0000\u00cb\u00cc\u00034\u001a\u0000\u00cc\u00cd\u0003"+
		"0\u0018\u0000\u00cd\u00d0\u0001\u0000\u0000\u0000\u00ce\u00d0\u0001\u0000"+
		"\u0000\u0000\u00cf\u00ca\u0001\u0000\u0000\u0000\u00cf\u00ce\u0001\u0000"+
		"\u0000\u0000\u00d01\u0001\u0000\u0000\u0000\u00d1\u00d2\u0007\u0002\u0000"+
		"\u0000\u00d23\u0001\u0000\u0000\u0000\u00d3\u00da\u0005:\u0000\u0000\u00d4"+
		"\u00da\u0005;\u0000\u0000\u00d5\u00d6\u0005\u0010\u0000\u0000\u00d6\u00d7"+
		"\u0003(\u0014\u0000\u00d7\u00d8\u0005\u0011\u0000\u0000\u00d8\u00da\u0001"+
		"\u0000\u0000\u0000\u00d9\u00d3\u0001\u0000\u0000\u0000\u00d9\u00d4\u0001"+
		"\u0000\u0000\u0000\u00d9\u00d5\u0001\u0000\u0000\u0000\u00da5\u0001\u0000"+
		"\u0000\u0000\u000bEN\\fnv\u00ab\u00b7\u00c3\u00cf\u00d9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}