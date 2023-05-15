// Generated from pascal.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link pascalParser}.
 */
public interface pascalListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link pascalParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(pascalParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(pascalParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascalParser#corpo}.
	 * @param ctx the parse tree
	 */
	void enterCorpo(pascalParser.CorpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#corpo}.
	 * @param ctx the parse tree
	 */
	void exitCorpo(pascalParser.CorpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascalParser#declara}.
	 * @param ctx the parse tree
	 */
	void enterDeclara(pascalParser.DeclaraContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#declara}.
	 * @param ctx the parse tree
	 */
	void exitDeclara(pascalParser.DeclaraContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascalParser#mais_dc}.
	 * @param ctx the parse tree
	 */
	void enterMais_dc(pascalParser.Mais_dcContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#mais_dc}.
	 * @param ctx the parse tree
	 */
	void exitMais_dc(pascalParser.Mais_dcContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascalParser#cont_dc}.
	 * @param ctx the parse tree
	 */
	void enterCont_dc(pascalParser.Cont_dcContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#cont_dc}.
	 * @param ctx the parse tree
	 */
	void exitCont_dc(pascalParser.Cont_dcContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascalParser#dvar}.
	 * @param ctx the parse tree
	 */
	void enterDvar(pascalParser.DvarContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#dvar}.
	 * @param ctx the parse tree
	 */
	void exitDvar(pascalParser.DvarContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascalParser#tipo_var}.
	 * @param ctx the parse tree
	 */
	void enterTipo_var(pascalParser.Tipo_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#tipo_var}.
	 * @param ctx the parse tree
	 */
	void exitTipo_var(pascalParser.Tipo_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascalParser#variaveis}.
	 * @param ctx the parse tree
	 */
	void enterVariaveis(pascalParser.VariaveisContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#variaveis}.
	 * @param ctx the parse tree
	 */
	void exitVariaveis(pascalParser.VariaveisContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascalParser#mais_var}.
	 * @param ctx the parse tree
	 */
	void enterMais_var(pascalParser.Mais_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#mais_var}.
	 * @param ctx the parse tree
	 */
	void exitMais_var(pascalParser.Mais_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascalParser#sentencas}.
	 * @param ctx the parse tree
	 */
	void enterSentencas(pascalParser.SentencasContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#sentencas}.
	 * @param ctx the parse tree
	 */
	void exitSentencas(pascalParser.SentencasContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascalParser#mais_sentencas}.
	 * @param ctx the parse tree
	 */
	void enterMais_sentencas(pascalParser.Mais_sentencasContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#mais_sentencas}.
	 * @param ctx the parse tree
	 */
	void exitMais_sentencas(pascalParser.Mais_sentencasContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascalParser#cont_sentencas}.
	 * @param ctx the parse tree
	 */
	void enterCont_sentencas(pascalParser.Cont_sentencasContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#cont_sentencas}.
	 * @param ctx the parse tree
	 */
	void exitCont_sentencas(pascalParser.Cont_sentencasContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascalParser#var_read}.
	 * @param ctx the parse tree
	 */
	void enterVar_read(pascalParser.Var_readContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#var_read}.
	 * @param ctx the parse tree
	 */
	void exitVar_read(pascalParser.Var_readContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascalParser#mais_var_read}.
	 * @param ctx the parse tree
	 */
	void enterMais_var_read(pascalParser.Mais_var_readContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#mais_var_read}.
	 * @param ctx the parse tree
	 */
	void exitMais_var_read(pascalParser.Mais_var_readContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascalParser#var_write}.
	 * @param ctx the parse tree
	 */
	void enterVar_write(pascalParser.Var_writeContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#var_write}.
	 * @param ctx the parse tree
	 */
	void exitVar_write(pascalParser.Var_writeContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascalParser#mais_var_write}.
	 * @param ctx the parse tree
	 */
	void enterMais_var_write(pascalParser.Mais_var_writeContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#mais_var_write}.
	 * @param ctx the parse tree
	 */
	void exitMais_var_write(pascalParser.Mais_var_writeContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascalParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(pascalParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(pascalParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascalParser#condicao}.
	 * @param ctx the parse tree
	 */
	void enterCondicao(pascalParser.CondicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#condicao}.
	 * @param ctx the parse tree
	 */
	void exitCondicao(pascalParser.CondicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascalParser#pfalsa}.
	 * @param ctx the parse tree
	 */
	void enterPfalsa(pascalParser.PfalsaContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#pfalsa}.
	 * @param ctx the parse tree
	 */
	void exitPfalsa(pascalParser.PfalsaContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascalParser#relacao}.
	 * @param ctx the parse tree
	 */
	void enterRelacao(pascalParser.RelacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#relacao}.
	 * @param ctx the parse tree
	 */
	void exitRelacao(pascalParser.RelacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascalParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(pascalParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(pascalParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascalParser#outros_termos}.
	 * @param ctx the parse tree
	 */
	void enterOutros_termos(pascalParser.Outros_termosContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#outros_termos}.
	 * @param ctx the parse tree
	 */
	void exitOutros_termos(pascalParser.Outros_termosContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascalParser#op_ad}.
	 * @param ctx the parse tree
	 */
	void enterOp_ad(pascalParser.Op_adContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#op_ad}.
	 * @param ctx the parse tree
	 */
	void exitOp_ad(pascalParser.Op_adContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascalParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(pascalParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(pascalParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascalParser#mais_fatores}.
	 * @param ctx the parse tree
	 */
	void enterMais_fatores(pascalParser.Mais_fatoresContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#mais_fatores}.
	 * @param ctx the parse tree
	 */
	void exitMais_fatores(pascalParser.Mais_fatoresContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascalParser#op_mul}.
	 * @param ctx the parse tree
	 */
	void enterOp_mul(pascalParser.Op_mulContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#op_mul}.
	 * @param ctx the parse tree
	 */
	void exitOp_mul(pascalParser.Op_mulContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascalParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(pascalParser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(pascalParser.FatorContext ctx);
}