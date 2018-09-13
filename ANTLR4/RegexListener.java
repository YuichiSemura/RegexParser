// Generated from Regex.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RegexParser}.
 */
public interface RegexListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RegexParser#regex}.
	 * @param ctx the parse tree
	 */
	void enterRegex(RegexParser.RegexContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegexParser#regex}.
	 * @param ctx the parse tree
	 */
	void exitRegex(RegexParser.RegexContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegexParser#exprlist}.
	 * @param ctx the parse tree
	 */
	void enterExprlist(RegexParser.ExprlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegexParser#exprlist}.
	 * @param ctx the parse tree
	 */
	void exitExprlist(RegexParser.ExprlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegexParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(RegexParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegexParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(RegexParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegexParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(RegexParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegexParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(RegexParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegexParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterOperand(RegexParser.OperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegexParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitOperand(RegexParser.OperandContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegexParser#quantifier}.
	 * @param ctx the parse tree
	 */
	void enterQuantifier(RegexParser.QuantifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegexParser#quantifier}.
	 * @param ctx the parse tree
	 */
	void exitQuantifier(RegexParser.QuantifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegexParser#ranger}.
	 * @param ctx the parse tree
	 */
	void enterRanger(RegexParser.RangerContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegexParser#ranger}.
	 * @param ctx the parse tree
	 */
	void exitRanger(RegexParser.RangerContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegexParser#lookaheadbehind}.
	 * @param ctx the parse tree
	 */
	void enterLookaheadbehind(RegexParser.LookaheadbehindContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegexParser#lookaheadbehind}.
	 * @param ctx the parse tree
	 */
	void exitLookaheadbehind(RegexParser.LookaheadbehindContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegexParser#escape_operand}.
	 * @param ctx the parse tree
	 */
	void enterEscape_operand(RegexParser.Escape_operandContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegexParser#escape_operand}.
	 * @param ctx the parse tree
	 */
	void exitEscape_operand(RegexParser.Escape_operandContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegexParser#escape_punctual}.
	 * @param ctx the parse tree
	 */
	void enterEscape_punctual(RegexParser.Escape_punctualContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegexParser#escape_punctual}.
	 * @param ctx the parse tree
	 */
	void exitEscape_punctual(RegexParser.Escape_punctualContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegexParser#digit}.
	 * @param ctx the parse tree
	 */
	void enterDigit(RegexParser.DigitContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegexParser#digit}.
	 * @param ctx the parse tree
	 */
	void exitDigit(RegexParser.DigitContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegexParser#dec}.
	 * @param ctx the parse tree
	 */
	void enterDec(RegexParser.DecContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegexParser#dec}.
	 * @param ctx the parse tree
	 */
	void exitDec(RegexParser.DecContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegexParser#octal}.
	 * @param ctx the parse tree
	 */
	void enterOctal(RegexParser.OctalContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegexParser#octal}.
	 * @param ctx the parse tree
	 */
	void exitOctal(RegexParser.OctalContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegexParser#hex}.
	 * @param ctx the parse tree
	 */
	void enterHex(RegexParser.HexContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegexParser#hex}.
	 * @param ctx the parse tree
	 */
	void exitHex(RegexParser.HexContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegexParser#alphabet}.
	 * @param ctx the parse tree
	 */
	void enterAlphabet(RegexParser.AlphabetContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegexParser#alphabet}.
	 * @param ctx the parse tree
	 */
	void exitAlphabet(RegexParser.AlphabetContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegexParser#escape_special}.
	 * @param ctx the parse tree
	 */
	void enterEscape_special(RegexParser.Escape_specialContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegexParser#escape_special}.
	 * @param ctx the parse tree
	 */
	void exitEscape_special(RegexParser.Escape_specialContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegexParser#other_operand}.
	 * @param ctx the parse tree
	 */
	void enterOther_operand(RegexParser.Other_operandContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegexParser#other_operand}.
	 * @param ctx the parse tree
	 */
	void exitOther_operand(RegexParser.Other_operandContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegexParser#character_class}.
	 * @param ctx the parse tree
	 */
	void enterCharacter_class(RegexParser.Character_classContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegexParser#character_class}.
	 * @param ctx the parse tree
	 */
	void exitCharacter_class(RegexParser.Character_classContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegexParser#tokeninclass}.
	 * @param ctx the parse tree
	 */
	void enterTokeninclass(RegexParser.TokeninclassContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegexParser#tokeninclass}.
	 * @param ctx the parse tree
	 */
	void exitTokeninclass(RegexParser.TokeninclassContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegexParser#esc_in_cc}.
	 * @param ctx the parse tree
	 */
	void enterEsc_in_cc(RegexParser.Esc_in_ccContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegexParser#esc_in_cc}.
	 * @param ctx the parse tree
	 */
	void exitEsc_in_cc(RegexParser.Esc_in_ccContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegexParser#factor_in_cc}.
	 * @param ctx the parse tree
	 */
	void enterFactor_in_cc(RegexParser.Factor_in_ccContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegexParser#factor_in_cc}.
	 * @param ctx the parse tree
	 */
	void exitFactor_in_cc(RegexParser.Factor_in_ccContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegexParser#alphanumeric}.
	 * @param ctx the parse tree
	 */
	void enterAlphanumeric(RegexParser.AlphanumericContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegexParser#alphanumeric}.
	 * @param ctx the parse tree
	 */
	void exitAlphanumeric(RegexParser.AlphanumericContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegexParser#other_in_cc}.
	 * @param ctx the parse tree
	 */
	void enterOther_in_cc(RegexParser.Other_in_ccContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegexParser#other_in_cc}.
	 * @param ctx the parse tree
	 */
	void exitOther_in_cc(RegexParser.Other_in_ccContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegexParser#defined_character}.
	 * @param ctx the parse tree
	 */
	void enterDefined_character(RegexParser.Defined_characterContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegexParser#defined_character}.
	 * @param ctx the parse tree
	 */
	void exitDefined_character(RegexParser.Defined_characterContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegexParser#boundary}.
	 * @param ctx the parse tree
	 */
	void enterBoundary(RegexParser.BoundaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegexParser#boundary}.
	 * @param ctx the parse tree
	 */
	void exitBoundary(RegexParser.BoundaryContext ctx);
}