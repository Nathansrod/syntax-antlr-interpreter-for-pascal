// Generated from /home/nathan/Projects/Compiladores/antlr-syntax/src/main/antlr4/pascal.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class pascalParser extends Parser {
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

	public static class Mais_dcContext extends ParserRuleContext {
		public TerminalNode PONTO_VIRGULA() { return getToken(pascalParser.PONTO_VIRGULA, 0); }
		public Cont_dcContext cont_dc() {
			return getRuleContext(Cont_dcContext.class,0);
		}
		public Mais_dcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_dc; }
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

	public static class Tipo_varContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(pascalParser.INTEGER, 0); }
		public Tipo_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_var; }
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

	public static class VariaveisContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(pascalParser.ID, 0); }
		public Mais_varContext mais_var() {
			return getRuleContext(Mais_varContext.class,0);
		}
		public VariaveisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variaveis; }
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

	public static class Mais_varContext extends ParserRuleContext {
		public TerminalNode VIRGULA() { return getToken(pascalParser.VIRGULA, 0); }
		public VariaveisContext variaveis() {
			return getRuleContext(VariaveisContext.class,0);
		}
		public Mais_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_var; }
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

	public static class Mais_sentencasContext extends ParserRuleContext {
		public TerminalNode PONTO_VIRGULA() { return getToken(pascalParser.PONTO_VIRGULA, 0); }
		public Cont_sentencasContext cont_sentencas() {
			return getRuleContext(Cont_sentencasContext.class,0);
		}
		public Mais_sentencasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_sentencas; }
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

	public static class Cont_sentencasContext extends ParserRuleContext {
		public SentencasContext sentencas() {
			return getRuleContext(SentencasContext.class,0);
		}
		public Cont_sentencasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cont_sentencas; }
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

	public static class Var_readContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(pascalParser.ID, 0); }
		public Mais_var_readContext mais_var_read() {
			return getRuleContext(Mais_var_readContext.class,0);
		}
		public Var_readContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_read; }
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

	public static class Mais_var_readContext extends ParserRuleContext {
		public TerminalNode VIRGULA() { return getToken(pascalParser.VIRGULA, 0); }
		public Var_readContext var_read() {
			return getRuleContext(Var_readContext.class,0);
		}
		public Mais_var_readContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_var_read; }
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

	public static class Var_writeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(pascalParser.ID, 0); }
		public Mais_var_writeContext mais_var_write() {
			return getRuleContext(Mais_var_writeContext.class,0);
		}
		public Var_writeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_write; }
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

	public static class Mais_var_writeContext extends ParserRuleContext {
		public TerminalNode VIRGULA() { return getToken(pascalParser.VIRGULA, 0); }
		public Var_writeContext var_write() {
			return getRuleContext(Var_writeContext.class,0);
		}
		public Mais_var_writeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_var_write; }
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
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IGUAL) | (1L << MENOR) | (1L << MAIOR) | (1L << MENOR_IGUAL) | (1L << MAIOR_IGUAL) | (1L << DIFERENTE))) != 0)) ) {
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

	public static class Op_adContext extends ParserRuleContext {
		public TerminalNode ADICAO() { return getToken(pascalParser.ADICAO, 0); }
		public TerminalNode SUBTRACAO() { return getToken(pascalParser.SUBTRACAO, 0); }
		public Op_adContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_ad; }
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

	public static class Op_mulContext extends ParserRuleContext {
		public TerminalNode MULTIPLICACAO() { return getToken(pascalParser.MULTIPLICACAO, 0); }
		public TerminalNode DIVIDIR() { return getToken(pascalParser.DIVIDIR, 0); }
		public Op_mulContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_mul; }
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3>\u00de\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\5\4H\n\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6Q\n\6\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\5\n_\n\n\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\r\3\r\5\ri\n\r\3\16\3\16\3\16\3\17\3\17\3\17\5\17q\n\17\3"+
		"\20\3\20\3\20\3\21\3\21\3\21\5\21y\n\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\5\22\u00ae\n\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\5\24\u00ba\n\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\3\27\5\27\u00c6\n\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32"+
		"\5\32\u00d2\n\32\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u00dc\n"+
		"\34\3\34\2\2\35\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\66\2\5\3\2\7\f\3\2\3\4\3\2\5\6\2\u00d4\28\3\2\2\2\4=\3\2\2\2\6G\3"+
		"\2\2\2\bI\3\2\2\2\nP\3\2\2\2\fR\3\2\2\2\16V\3\2\2\2\20X\3\2\2\2\22^\3"+
		"\2\2\2\24`\3\2\2\2\26c\3\2\2\2\30h\3\2\2\2\32j\3\2\2\2\34p\3\2\2\2\36"+
		"r\3\2\2\2 x\3\2\2\2\"\u00ad\3\2\2\2$\u00af\3\2\2\2&\u00b9\3\2\2\2(\u00bb"+
		"\3\2\2\2*\u00bd\3\2\2\2,\u00c5\3\2\2\2.\u00c7\3\2\2\2\60\u00c9\3\2\2\2"+
		"\62\u00d1\3\2\2\2\64\u00d3\3\2\2\2\66\u00db\3\2\2\289\7-\2\29:\7<\2\2"+
		":;\5\4\3\2;<\7\16\2\2<\3\3\2\2\2=>\5\6\4\2>?\7\26\2\2?@\5\24\13\2@A\7"+
		"\35\2\2A\5\3\2\2\2BC\7\67\2\2CD\5\f\7\2DE\5\b\5\2EH\3\2\2\2FH\3\2\2\2"+
		"GB\3\2\2\2GF\3\2\2\2H\7\3\2\2\2IJ\7\17\2\2JK\5\n\6\2K\t\3\2\2\2LM\5\f"+
		"\7\2MN\5\b\5\2NQ\3\2\2\2OQ\3\2\2\2PL\3\2\2\2PO\3\2\2\2Q\13\3\2\2\2RS\5"+
		"\20\t\2ST\7\20\2\2TU\5\16\b\2U\r\3\2\2\2VW\7$\2\2W\17\3\2\2\2XY\7<\2\2"+
		"YZ\5\22\n\2Z\21\3\2\2\2[\\\7\21\2\2\\_\5\20\t\2]_\3\2\2\2^[\3\2\2\2^]"+
		"\3\2\2\2_\23\3\2\2\2`a\5\"\22\2ab\5\26\f\2b\25\3\2\2\2cd\7\17\2\2de\5"+
		"\30\r\2e\27\3\2\2\2fi\5\24\13\2gi\3\2\2\2hf\3\2\2\2hg\3\2\2\2i\31\3\2"+
		"\2\2jk\7<\2\2kl\5\34\17\2l\33\3\2\2\2mn\7\21\2\2nq\5\32\16\2oq\3\2\2\2"+
		"pm\3\2\2\2po\3\2\2\2q\35\3\2\2\2rs\7<\2\2st\5 \21\2t\37\3\2\2\2uv\7\21"+
		"\2\2vy\5\36\20\2wy\3\2\2\2xu\3\2\2\2xw\3\2\2\2y!\3\2\2\2z{\7.\2\2{|\7"+
		"\22\2\2|}\5\32\16\2}~\7\23\2\2~\u00ae\3\2\2\2\177\u0080\7:\2\2\u0080\u0081"+
		"\7\22\2\2\u0081\u0082\5\36\20\2\u0082\u0083\7\23\2\2\u0083\u00ae\3\2\2"+
		"\2\u0084\u0085\7\37\2\2\u0085\u0086\7<\2\2\u0086\u0087\7\r\2\2\u0087\u0088"+
		"\5*\26\2\u0088\u0089\7\64\2\2\u0089\u008a\5*\26\2\u008a\u00ae\3\2\2\2"+
		"\u008b\u008c\7\32\2\2\u008c\u008d\7\26\2\2\u008d\u008e\5\24\13\2\u008e"+
		"\u008f\7\35\2\2\u008f\u00ae\3\2\2\2\u0090\u0091\7\61\2\2\u0091\u0092\5"+
		"\24\13\2\u0092\u0093\7\66\2\2\u0093\u0094\7\22\2\2\u0094\u0095\5$\23\2"+
		"\u0095\u0096\7\23\2\2\u0096\u00ae\3\2\2\2\u0097\u0098\78\2\2\u0098\u0099"+
		"\7\22\2\2\u0099\u009a\5$\23\2\u009a\u009b\7\23\2\2\u009b\u009c\7\32\2"+
		"\2\u009c\u009d\7\26\2\2\u009d\u009e\5\24\13\2\u009e\u009f\7\35\2\2\u009f"+
		"\u00ae\3\2\2\2\u00a0\u00a1\7\"\2\2\u00a1\u00a2\7\22\2\2\u00a2\u00a3\5"+
		"$\23\2\u00a3\u00a4\7\23\2\2\u00a4\u00a5\7\63\2\2\u00a5\u00a6\7\26\2\2"+
		"\u00a6\u00a7\5\24\13\2\u00a7\u00a8\7\35\2\2\u00a8\u00a9\5&\24\2\u00a9"+
		"\u00ae\3\2\2\2\u00aa\u00ab\7<\2\2\u00ab\u00ac\7\r\2\2\u00ac\u00ae\5*\26"+
		"\2\u00adz\3\2\2\2\u00ad\177\3\2\2\2\u00ad\u0084\3\2\2\2\u00ad\u008b\3"+
		"\2\2\2\u00ad\u0090\3\2\2\2\u00ad\u0097\3\2\2\2\u00ad\u00a0\3\2\2\2\u00ad"+
		"\u00aa\3\2\2\2\u00ae#\3\2\2\2\u00af\u00b0\5*\26\2\u00b0\u00b1\5(\25\2"+
		"\u00b1\u00b2\5*\26\2\u00b2%\3\2\2\2\u00b3\u00b4\7\34\2\2\u00b4\u00b5\7"+
		"\26\2\2\u00b5\u00b6\5\24\13\2\u00b6\u00b7\7\35\2\2\u00b7\u00ba\3\2\2\2"+
		"\u00b8\u00ba\3\2\2\2\u00b9\u00b3\3\2\2\2\u00b9\u00b8\3\2\2\2\u00ba\'\3"+
		"\2\2\2\u00bb\u00bc\t\2\2\2\u00bc)\3\2\2\2\u00bd\u00be\5\60\31\2\u00be"+
		"\u00bf\5,\27\2\u00bf+\3\2\2\2\u00c0\u00c1\5.\30\2\u00c1\u00c2\5\60\31"+
		"\2\u00c2\u00c3\5,\27\2\u00c3\u00c6\3\2\2\2\u00c4\u00c6\3\2\2\2\u00c5\u00c0"+
		"\3\2\2\2\u00c5\u00c4\3\2\2\2\u00c6-\3\2\2\2\u00c7\u00c8\t\3\2\2\u00c8"+
		"/\3\2\2\2\u00c9\u00ca\5\66\34\2\u00ca\u00cb\5\62\32\2\u00cb\61\3\2\2\2"+
		"\u00cc\u00cd\5\64\33\2\u00cd\u00ce\5\66\34\2\u00ce\u00cf\5\62\32\2\u00cf"+
		"\u00d2\3\2\2\2\u00d0\u00d2\3\2\2\2\u00d1\u00cc\3\2\2\2\u00d1\u00d0\3\2"+
		"\2\2\u00d2\63\3\2\2\2\u00d3\u00d4\t\4\2\2\u00d4\65\3\2\2\2\u00d5\u00dc"+
		"\7<\2\2\u00d6\u00dc\7=\2\2\u00d7\u00d8\7\22\2\2\u00d8\u00d9\5*\26\2\u00d9"+
		"\u00da\7\23\2\2\u00da\u00dc\3\2\2\2\u00db\u00d5\3\2\2\2\u00db\u00d6\3"+
		"\2\2\2\u00db\u00d7\3\2\2\2\u00dc\67\3\2\2\2\rGP^hpx\u00ad\u00b9\u00c5"+
		"\u00d1\u00db";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}