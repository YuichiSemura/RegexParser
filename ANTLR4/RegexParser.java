// Generated from Regex.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RegexParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OCTAL=1, HEX=2, TAB=3, LF=4, CR=5, OTH_ESC=6, DEFINED_CH=7, BOUNDARY=8, 
		ANDAND=9, AND=10, COLON=11, COMMA=12, SEMI=13, LPAREN=14, RPAREN=15, LBRACE=16, 
		RBRACE=17, LBRACK=18, RBRACK=19, LT=20, GT=21, EQUAL=22, QUESTION=23, 
		STAR=24, SLASH=25, PLUS=26, MINUS=27, OR=28, DOLLAR=29, DOT=30, TLIDE=31, 
		ESC=32, CARET=33, EXCLA=34, WS=35, ALPHABET=36, NUMBER=37, OTHER_SYMBOL=38;
	public static final int
		RULE_regex = 0, RULE_exprlist = 1, RULE_expr = 2, RULE_block = 3, RULE_operand = 4, 
		RULE_quantifier = 5, RULE_ranger = 6, RULE_lookaheadbehind = 7, RULE_escape_operand = 8, 
		RULE_escape_punctual = 9, RULE_digit = 10, RULE_dec = 11, RULE_octal = 12, 
		RULE_hex = 13, RULE_alphabet = 14, RULE_escape_special = 15, RULE_other_operand = 16, 
		RULE_character_class = 17, RULE_tokeninclass = 18, RULE_esc_in_cc = 19, 
		RULE_factor_in_cc = 20, RULE_alphanumeric = 21, RULE_other_in_cc = 22, 
		RULE_defined_character = 23, RULE_boundary = 24;
	public static final String[] ruleNames = {
		"regex", "exprlist", "expr", "block", "operand", "quantifier", "ranger", 
		"lookaheadbehind", "escape_operand", "escape_punctual", "digit", "dec", 
		"octal", "hex", "alphabet", "escape_special", "other_operand", "character_class", 
		"tokeninclass", "esc_in_cc", "factor_in_cc", "alphanumeric", "other_in_cc", 
		"defined_character", "boundary"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'\\t'", "'\\n'", "'\\r'", null, null, null, "'&&'", 
		"'&'", "':'", "','", "';'", "'('", "')'", "'{'", "'}'", "'['", "']'", 
		"'<'", "'>'", "'='", "'?'", "'*'", "'/'", "'+'", "'-'", "'|'", "'$'", 
		"'.'", "'~'", "'\\'", "'^'", "'!'", "' '"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "OCTAL", "HEX", "TAB", "LF", "CR", "OTH_ESC", "DEFINED_CH", "BOUNDARY", 
		"ANDAND", "AND", "COLON", "COMMA", "SEMI", "LPAREN", "RPAREN", "LBRACE", 
		"RBRACE", "LBRACK", "RBRACK", "LT", "GT", "EQUAL", "QUESTION", "STAR", 
		"SLASH", "PLUS", "MINUS", "OR", "DOLLAR", "DOT", "TLIDE", "ESC", "CARET", 
		"EXCLA", "WS", "ALPHABET", "NUMBER", "OTHER_SYMBOL"
	};
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
	public String getGrammarFileName() { return "Regex.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RegexParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class RegexContext extends ParserRuleContext {
		public List<ExprlistContext> exprlist() {
			return getRuleContexts(ExprlistContext.class);
		}
		public ExprlistContext exprlist(int i) {
			return getRuleContext(ExprlistContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(RegexParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(RegexParser.OR, i);
		}
		public RegexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegexListener ) ((RegexListener)listener).enterRegex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegexListener ) ((RegexListener)listener).exitRegex(this);
		}
	}

	public final RegexContext regex() throws RecognitionException {
		RegexContext _localctx = new RegexContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_regex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			exprlist();
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(51);
				match(OR);
				setState(52);
				exprlist();
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ExprlistContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegexListener ) ((RegexListener)listener).enterExprlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegexListener ) ((RegexListener)listener).exitExprlist(this);
		}
	}

	public final ExprlistContext exprlist() throws RecognitionException {
		ExprlistContext _localctx = new ExprlistContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_exprlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OCTAL) | (1L << HEX) | (1L << TAB) | (1L << LF) | (1L << CR) | (1L << OTH_ESC) | (1L << DEFINED_CH) | (1L << BOUNDARY) | (1L << AND) | (1L << COLON) | (1L << COMMA) | (1L << SEMI) | (1L << LPAREN) | (1L << LBRACE) | (1L << RBRACE) | (1L << LBRACK) | (1L << LT) | (1L << GT) | (1L << EQUAL) | (1L << SLASH) | (1L << MINUS) | (1L << DOLLAR) | (1L << DOT) | (1L << TLIDE) | (1L << ESC) | (1L << CARET) | (1L << EXCLA) | (1L << WS) | (1L << ALPHABET) | (1L << NUMBER) | (1L << OTHER_SYMBOL))) != 0)) {
				{
				{
				setState(58);
				expr();
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ExprContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LookaheadbehindContext lookaheadbehind() {
			return getRuleContext(LookaheadbehindContext.class,0);
		}
		public QuantifierContext quantifier() {
			return getRuleContext(QuantifierContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegexListener ) ((RegexListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegexListener ) ((RegexListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(64);
				lookaheadbehind();
				}
				break;
			}
			setState(67);
			block();
			setState(69);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(68);
				quantifier();
				}
				break;
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

	public static class BlockContext extends ParserRuleContext {
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(RegexParser.LPAREN, 0); }
		public RegexContext regex() {
			return getRuleContext(RegexContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(RegexParser.RPAREN, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegexListener ) ((RegexListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegexListener ) ((RegexListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_block);
		try {
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OCTAL:
			case HEX:
			case TAB:
			case LF:
			case CR:
			case OTH_ESC:
			case DEFINED_CH:
			case BOUNDARY:
			case AND:
			case COLON:
			case COMMA:
			case SEMI:
			case LBRACE:
			case RBRACE:
			case LBRACK:
			case LT:
			case GT:
			case EQUAL:
			case SLASH:
			case MINUS:
			case DOLLAR:
			case DOT:
			case TLIDE:
			case ESC:
			case CARET:
			case EXCLA:
			case WS:
			case ALPHABET:
			case NUMBER:
			case OTHER_SYMBOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				operand();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				match(LPAREN);
				setState(73);
				regex();
				setState(74);
				match(RPAREN);
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

	public static class OperandContext extends ParserRuleContext {
		public Escape_operandContext escape_operand() {
			return getRuleContext(Escape_operandContext.class,0);
		}
		public AlphabetContext alphabet() {
			return getRuleContext(AlphabetContext.class,0);
		}
		public DigitContext digit() {
			return getRuleContext(DigitContext.class,0);
		}
		public Character_classContext character_class() {
			return getRuleContext(Character_classContext.class,0);
		}
		public Defined_characterContext defined_character() {
			return getRuleContext(Defined_characterContext.class,0);
		}
		public BoundaryContext boundary() {
			return getRuleContext(BoundaryContext.class,0);
		}
		public Other_operandContext other_operand() {
			return getRuleContext(Other_operandContext.class,0);
		}
		public OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegexListener ) ((RegexListener)listener).enterOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegexListener ) ((RegexListener)listener).exitOperand(this);
		}
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_operand);
		try {
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				escape_operand();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				alphabet();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(80);
				digit();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(81);
				character_class();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(82);
				defined_character();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(83);
				boundary();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(84);
				other_operand();
				}
				break;
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

	public static class QuantifierContext extends ParserRuleContext {
		public List<TerminalNode> QUESTION() { return getTokens(RegexParser.QUESTION); }
		public TerminalNode QUESTION(int i) {
			return getToken(RegexParser.QUESTION, i);
		}
		public TerminalNode STAR() { return getToken(RegexParser.STAR, 0); }
		public List<TerminalNode> PLUS() { return getTokens(RegexParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(RegexParser.PLUS, i);
		}
		public RangerContext ranger() {
			return getRuleContext(RangerContext.class,0);
		}
		public QuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegexListener ) ((RegexListener)listener).enterQuantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegexListener ) ((RegexListener)listener).exitQuantifier(this);
		}
	}

	public final QuantifierContext quantifier() throws RecognitionException {
		QuantifierContext _localctx = new QuantifierContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_quantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QUESTION:
				{
				setState(87);
				match(QUESTION);
				}
				break;
			case STAR:
				{
				setState(88);
				match(STAR);
				}
				break;
			case PLUS:
				{
				setState(89);
				match(PLUS);
				}
				break;
			case LBRACE:
				{
				setState(90);
				ranger();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QUESTION || _la==PLUS) {
				{
				setState(93);
				_la = _input.LA(1);
				if ( !(_la==QUESTION || _la==PLUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
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

	public static class RangerContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(RegexParser.LBRACE, 0); }
		public TerminalNode COMMA() { return getToken(RegexParser.COMMA, 0); }
		public TerminalNode RBRACE() { return getToken(RegexParser.RBRACE, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(RegexParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(RegexParser.NUMBER, i);
		}
		public RangerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ranger; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegexListener ) ((RegexListener)listener).enterRanger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegexListener ) ((RegexListener)listener).exitRanger(this);
		}
	}

	public final RangerContext ranger() throws RecognitionException {
		RangerContext _localctx = new RangerContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ranger);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(LBRACE);
			setState(98); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(97);
				match(NUMBER);
				}
				}
				setState(100); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBER );
			setState(102);
			match(COMMA);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NUMBER) {
				{
				{
				setState(103);
				match(NUMBER);
				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(109);
			match(RBRACE);
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

	public static class LookaheadbehindContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(RegexParser.LPAREN, 0); }
		public TerminalNode QUESTION() { return getToken(RegexParser.QUESTION, 0); }
		public RegexContext regex() {
			return getRuleContext(RegexContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(RegexParser.RPAREN, 0); }
		public TerminalNode EQUAL() { return getToken(RegexParser.EQUAL, 0); }
		public TerminalNode EXCLA() { return getToken(RegexParser.EXCLA, 0); }
		public TerminalNode LT() { return getToken(RegexParser.LT, 0); }
		public TerminalNode GT() { return getToken(RegexParser.GT, 0); }
		public LookaheadbehindContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lookaheadbehind; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegexListener ) ((RegexListener)listener).enterLookaheadbehind(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegexListener ) ((RegexListener)listener).exitLookaheadbehind(this);
		}
	}

	public final LookaheadbehindContext lookaheadbehind() throws RecognitionException {
		LookaheadbehindContext _localctx = new LookaheadbehindContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_lookaheadbehind);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(LPAREN);
			setState(112);
			match(QUESTION);
			setState(118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQUAL:
				{
				setState(113);
				match(EQUAL);
				}
				break;
			case EXCLA:
				{
				setState(114);
				match(EXCLA);
				}
				break;
			case LT:
				{
				setState(115);
				match(LT);
				setState(116);
				_la = _input.LA(1);
				if ( !(_la==EQUAL || _la==EXCLA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case GT:
				{
				setState(117);
				match(GT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(120);
			regex();
			setState(121);
			match(RPAREN);
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

	public static class Escape_operandContext extends ParserRuleContext {
		public Escape_punctualContext escape_punctual() {
			return getRuleContext(Escape_punctualContext.class,0);
		}
		public Escape_specialContext escape_special() {
			return getRuleContext(Escape_specialContext.class,0);
		}
		public Escape_operandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escape_operand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegexListener ) ((RegexListener)listener).enterEscape_operand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegexListener ) ((RegexListener)listener).exitEscape_operand(this);
		}
	}

	public final Escape_operandContext escape_operand() throws RecognitionException {
		Escape_operandContext _localctx = new Escape_operandContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_escape_operand);
		try {
			setState(125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ESC:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				escape_punctual();
				}
				break;
			case TAB:
			case LF:
			case CR:
			case OTH_ESC:
			case DEFINED_CH:
			case WS:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				escape_special();
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

	public static class Escape_punctualContext extends ParserRuleContext {
		public List<TerminalNode> ESC() { return getTokens(RegexParser.ESC); }
		public TerminalNode ESC(int i) {
			return getToken(RegexParser.ESC, i);
		}
		public TerminalNode STAR() { return getToken(RegexParser.STAR, 0); }
		public TerminalNode PLUS() { return getToken(RegexParser.PLUS, 0); }
		public TerminalNode DOT() { return getToken(RegexParser.DOT, 0); }
		public TerminalNode QUESTION() { return getToken(RegexParser.QUESTION, 0); }
		public TerminalNode LBRACE() { return getToken(RegexParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(RegexParser.RBRACE, 0); }
		public TerminalNode LPAREN() { return getToken(RegexParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(RegexParser.RPAREN, 0); }
		public TerminalNode LBRACK() { return getToken(RegexParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(RegexParser.RBRACK, 0); }
		public TerminalNode CARET() { return getToken(RegexParser.CARET, 0); }
		public TerminalNode DOLLAR() { return getToken(RegexParser.DOLLAR, 0); }
		public TerminalNode OR() { return getToken(RegexParser.OR, 0); }
		public TerminalNode SLASH() { return getToken(RegexParser.SLASH, 0); }
		public Escape_punctualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escape_punctual; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegexListener ) ((RegexListener)listener).enterEscape_punctual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegexListener ) ((RegexListener)listener).exitEscape_punctual(this);
		}
	}

	public final Escape_punctualContext escape_punctual() throws RecognitionException {
		Escape_punctualContext _localctx = new Escape_punctualContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_escape_punctual);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(ESC);
			setState(128);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << RPAREN) | (1L << LBRACE) | (1L << RBRACE) | (1L << LBRACK) | (1L << RBRACK) | (1L << QUESTION) | (1L << STAR) | (1L << SLASH) | (1L << PLUS) | (1L << OR) | (1L << DOLLAR) | (1L << DOT) | (1L << ESC) | (1L << CARET))) != 0)) ) {
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

	public static class DigitContext extends ParserRuleContext {
		public DecContext dec() {
			return getRuleContext(DecContext.class,0);
		}
		public OctalContext octal() {
			return getRuleContext(OctalContext.class,0);
		}
		public HexContext hex() {
			return getRuleContext(HexContext.class,0);
		}
		public DigitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_digit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegexListener ) ((RegexListener)listener).enterDigit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegexListener ) ((RegexListener)listener).exitDigit(this);
		}
	}

	public final DigitContext digit() throws RecognitionException {
		DigitContext _localctx = new DigitContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_digit);
		try {
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				dec();
				}
				break;
			case OCTAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				octal();
				}
				break;
			case HEX:
				enterOuterAlt(_localctx, 3);
				{
				setState(132);
				hex();
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

	public static class DecContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(RegexParser.NUMBER, 0); }
		public DecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegexListener ) ((RegexListener)listener).enterDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegexListener ) ((RegexListener)listener).exitDec(this);
		}
	}

	public final DecContext dec() throws RecognitionException {
		DecContext _localctx = new DecContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_dec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(NUMBER);
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

	public static class OctalContext extends ParserRuleContext {
		public TerminalNode OCTAL() { return getToken(RegexParser.OCTAL, 0); }
		public OctalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_octal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegexListener ) ((RegexListener)listener).enterOctal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegexListener ) ((RegexListener)listener).exitOctal(this);
		}
	}

	public final OctalContext octal() throws RecognitionException {
		OctalContext _localctx = new OctalContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_octal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(OCTAL);
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

	public static class HexContext extends ParserRuleContext {
		public TerminalNode HEX() { return getToken(RegexParser.HEX, 0); }
		public HexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegexListener ) ((RegexListener)listener).enterHex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegexListener ) ((RegexListener)listener).exitHex(this);
		}
	}

	public final HexContext hex() throws RecognitionException {
		HexContext _localctx = new HexContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_hex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(HEX);
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

	public static class AlphabetContext extends ParserRuleContext {
		public TerminalNode ALPHABET() { return getToken(RegexParser.ALPHABET, 0); }
		public AlphabetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alphabet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegexListener ) ((RegexListener)listener).enterAlphabet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegexListener ) ((RegexListener)listener).exitAlphabet(this);
		}
	}

	public final AlphabetContext alphabet() throws RecognitionException {
		AlphabetContext _localctx = new AlphabetContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_alphabet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(ALPHABET);
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

	public static class Escape_specialContext extends ParserRuleContext {
		public TerminalNode TAB() { return getToken(RegexParser.TAB, 0); }
		public TerminalNode LF() { return getToken(RegexParser.LF, 0); }
		public TerminalNode CR() { return getToken(RegexParser.CR, 0); }
		public TerminalNode WS() { return getToken(RegexParser.WS, 0); }
		public TerminalNode OTH_ESC() { return getToken(RegexParser.OTH_ESC, 0); }
		public TerminalNode DEFINED_CH() { return getToken(RegexParser.DEFINED_CH, 0); }
		public Escape_specialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escape_special; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegexListener ) ((RegexListener)listener).enterEscape_special(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegexListener ) ((RegexListener)listener).exitEscape_special(this);
		}
	}

	public final Escape_specialContext escape_special() throws RecognitionException {
		Escape_specialContext _localctx = new Escape_specialContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_escape_special);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TAB) | (1L << LF) | (1L << CR) | (1L << OTH_ESC) | (1L << DEFINED_CH) | (1L << WS))) != 0)) ) {
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

	public static class Other_operandContext extends ParserRuleContext {
		public TerminalNode EXCLA() { return getToken(RegexParser.EXCLA, 0); }
		public TerminalNode DOLLAR() { return getToken(RegexParser.DOLLAR, 0); }
		public TerminalNode AND() { return getToken(RegexParser.AND, 0); }
		public TerminalNode EQUAL() { return getToken(RegexParser.EQUAL, 0); }
		public TerminalNode TLIDE() { return getToken(RegexParser.TLIDE, 0); }
		public TerminalNode CARET() { return getToken(RegexParser.CARET, 0); }
		public TerminalNode LBRACE() { return getToken(RegexParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(RegexParser.RBRACE, 0); }
		public TerminalNode COLON() { return getToken(RegexParser.COLON, 0); }
		public TerminalNode SEMI() { return getToken(RegexParser.SEMI, 0); }
		public TerminalNode SLASH() { return getToken(RegexParser.SLASH, 0); }
		public TerminalNode LT() { return getToken(RegexParser.LT, 0); }
		public TerminalNode GT() { return getToken(RegexParser.GT, 0); }
		public TerminalNode COMMA() { return getToken(RegexParser.COMMA, 0); }
		public TerminalNode MINUS() { return getToken(RegexParser.MINUS, 0); }
		public TerminalNode WS() { return getToken(RegexParser.WS, 0); }
		public TerminalNode OTHER_SYMBOL() { return getToken(RegexParser.OTHER_SYMBOL, 0); }
		public Other_operandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_other_operand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegexListener ) ((RegexListener)listener).enterOther_operand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegexListener ) ((RegexListener)listener).exitOther_operand(this);
		}
	}

	public final Other_operandContext other_operand() throws RecognitionException {
		Other_operandContext _localctx = new Other_operandContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_other_operand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << COLON) | (1L << COMMA) | (1L << SEMI) | (1L << LBRACE) | (1L << RBRACE) | (1L << LT) | (1L << GT) | (1L << EQUAL) | (1L << SLASH) | (1L << MINUS) | (1L << DOLLAR) | (1L << TLIDE) | (1L << CARET) | (1L << EXCLA) | (1L << WS) | (1L << OTHER_SYMBOL))) != 0)) ) {
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

	public static class Character_classContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(RegexParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(RegexParser.RBRACK, 0); }
		public TerminalNode CARET() { return getToken(RegexParser.CARET, 0); }
		public List<TokeninclassContext> tokeninclass() {
			return getRuleContexts(TokeninclassContext.class);
		}
		public TokeninclassContext tokeninclass(int i) {
			return getRuleContext(TokeninclassContext.class,i);
		}
		public List<Character_classContext> character_class() {
			return getRuleContexts(Character_classContext.class);
		}
		public Character_classContext character_class(int i) {
			return getRuleContext(Character_classContext.class,i);
		}
		public List<TerminalNode> ANDAND() { return getTokens(RegexParser.ANDAND); }
		public TerminalNode ANDAND(int i) {
			return getToken(RegexParser.ANDAND, i);
		}
		public Character_classContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_character_class; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegexListener ) ((RegexListener)listener).enterCharacter_class(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegexListener ) ((RegexListener)listener).exitCharacter_class(this);
		}
	}

	public final Character_classContext character_class() throws RecognitionException {
		Character_classContext _localctx = new Character_classContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_character_class);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(147);
			match(LBRACK);
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CARET) {
				{
				setState(148);
				match(CARET);
				}
			}

			setState(154);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(151);
					tokeninclass();
					}
					} 
				}
				setState(156);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ANDAND || _la==LBRACK) {
				{
				{
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ANDAND) {
					{
					setState(157);
					match(ANDAND);
					}
				}

				setState(160);
				character_class();
				}
				}
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(166);
			match(RBRACK);
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

	public static class TokeninclassContext extends ParserRuleContext {
		public Esc_in_ccContext esc_in_cc() {
			return getRuleContext(Esc_in_ccContext.class,0);
		}
		public Other_in_ccContext other_in_cc() {
			return getRuleContext(Other_in_ccContext.class,0);
		}
		public Factor_in_ccContext factor_in_cc() {
			return getRuleContext(Factor_in_ccContext.class,0);
		}
		public Escape_specialContext escape_special() {
			return getRuleContext(Escape_specialContext.class,0);
		}
		public HexContext hex() {
			return getRuleContext(HexContext.class,0);
		}
		public OctalContext octal() {
			return getRuleContext(OctalContext.class,0);
		}
		public TokeninclassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tokeninclass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegexListener ) ((RegexListener)listener).enterTokeninclass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegexListener ) ((RegexListener)listener).exitTokeninclass(this);
		}
	}

	public final TokeninclassContext tokeninclass() throws RecognitionException {
		TokeninclassContext _localctx = new TokeninclassContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_tokeninclass);
		try {
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				esc_in_cc();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				other_in_cc();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(170);
				factor_in_cc();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(171);
				escape_special();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(172);
				hex();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(173);
				octal();
				}
				break;
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

	public static class Esc_in_ccContext extends ParserRuleContext {
		public List<TerminalNode> ESC() { return getTokens(RegexParser.ESC); }
		public TerminalNode ESC(int i) {
			return getToken(RegexParser.ESC, i);
		}
		public TerminalNode RBRACK() { return getToken(RegexParser.RBRACK, 0); }
		public TerminalNode MINUS() { return getToken(RegexParser.MINUS, 0); }
		public TerminalNode CARET() { return getToken(RegexParser.CARET, 0); }
		public Esc_in_ccContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_esc_in_cc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegexListener ) ((RegexListener)listener).enterEsc_in_cc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegexListener ) ((RegexListener)listener).exitEsc_in_cc(this);
		}
	}

	public final Esc_in_ccContext esc_in_cc() throws RecognitionException {
		Esc_in_ccContext _localctx = new Esc_in_ccContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_esc_in_cc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(ESC);
			setState(177);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RBRACK) | (1L << MINUS) | (1L << ESC) | (1L << CARET))) != 0)) ) {
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

	public static class Factor_in_ccContext extends ParserRuleContext {
		public List<AlphanumericContext> alphanumeric() {
			return getRuleContexts(AlphanumericContext.class);
		}
		public AlphanumericContext alphanumeric(int i) {
			return getRuleContext(AlphanumericContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(RegexParser.MINUS, 0); }
		public Factor_in_ccContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor_in_cc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegexListener ) ((RegexListener)listener).enterFactor_in_cc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegexListener ) ((RegexListener)listener).exitFactor_in_cc(this);
		}
	}

	public final Factor_in_ccContext factor_in_cc() throws RecognitionException {
		Factor_in_ccContext _localctx = new Factor_in_ccContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_factor_in_cc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			alphanumeric();
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(180);
				match(MINUS);
				setState(181);
				alphanumeric();
				}
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

	public static class AlphanumericContext extends ParserRuleContext {
		public TerminalNode ALPHABET() { return getToken(RegexParser.ALPHABET, 0); }
		public TerminalNode NUMBER() { return getToken(RegexParser.NUMBER, 0); }
		public AlphanumericContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alphanumeric; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegexListener ) ((RegexListener)listener).enterAlphanumeric(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegexListener ) ((RegexListener)listener).exitAlphanumeric(this);
		}
	}

	public final AlphanumericContext alphanumeric() throws RecognitionException {
		AlphanumericContext _localctx = new AlphanumericContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_alphanumeric);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			_la = _input.LA(1);
			if ( !(_la==ALPHABET || _la==NUMBER) ) {
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

	public static class Other_in_ccContext extends ParserRuleContext {
		public TerminalNode EXCLA() { return getToken(RegexParser.EXCLA, 0); }
		public TerminalNode QUESTION() { return getToken(RegexParser.QUESTION, 0); }
		public TerminalNode DOLLAR() { return getToken(RegexParser.DOLLAR, 0); }
		public TerminalNode AND() { return getToken(RegexParser.AND, 0); }
		public TerminalNode EQUAL() { return getToken(RegexParser.EQUAL, 0); }
		public TerminalNode TLIDE() { return getToken(RegexParser.TLIDE, 0); }
		public TerminalNode OR() { return getToken(RegexParser.OR, 0); }
		public TerminalNode LPAREN() { return getToken(RegexParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(RegexParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(RegexParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(RegexParser.RBRACE, 0); }
		public TerminalNode COLON() { return getToken(RegexParser.COLON, 0); }
		public TerminalNode SEMI() { return getToken(RegexParser.SEMI, 0); }
		public TerminalNode LBRACK() { return getToken(RegexParser.LBRACK, 0); }
		public TerminalNode SLASH() { return getToken(RegexParser.SLASH, 0); }
		public TerminalNode LT() { return getToken(RegexParser.LT, 0); }
		public TerminalNode GT() { return getToken(RegexParser.GT, 0); }
		public TerminalNode COMMA() { return getToken(RegexParser.COMMA, 0); }
		public TerminalNode DOT() { return getToken(RegexParser.DOT, 0); }
		public TerminalNode WS() { return getToken(RegexParser.WS, 0); }
		public TerminalNode OTHER_SYMBOL() { return getToken(RegexParser.OTHER_SYMBOL, 0); }
		public Other_in_ccContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_other_in_cc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegexListener ) ((RegexListener)listener).enterOther_in_cc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegexListener ) ((RegexListener)listener).exitOther_in_cc(this);
		}
	}

	public final Other_in_ccContext other_in_cc() throws RecognitionException {
		Other_in_ccContext _localctx = new Other_in_ccContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_other_in_cc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << COLON) | (1L << COMMA) | (1L << SEMI) | (1L << LPAREN) | (1L << RPAREN) | (1L << LBRACE) | (1L << RBRACE) | (1L << LBRACK) | (1L << LT) | (1L << GT) | (1L << EQUAL) | (1L << QUESTION) | (1L << SLASH) | (1L << OR) | (1L << DOLLAR) | (1L << DOT) | (1L << TLIDE) | (1L << EXCLA) | (1L << WS) | (1L << OTHER_SYMBOL))) != 0)) ) {
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

	public static class Defined_characterContext extends ParserRuleContext {
		public TerminalNode DEFINED_CH() { return getToken(RegexParser.DEFINED_CH, 0); }
		public TerminalNode DOT() { return getToken(RegexParser.DOT, 0); }
		public Defined_characterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defined_character; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegexListener ) ((RegexListener)listener).enterDefined_character(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegexListener ) ((RegexListener)listener).exitDefined_character(this);
		}
	}

	public final Defined_characterContext defined_character() throws RecognitionException {
		Defined_characterContext _localctx = new Defined_characterContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_defined_character);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			_la = _input.LA(1);
			if ( !(_la==DEFINED_CH || _la==DOT) ) {
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

	public static class BoundaryContext extends ParserRuleContext {
		public TerminalNode CARET() { return getToken(RegexParser.CARET, 0); }
		public TerminalNode DOLLAR() { return getToken(RegexParser.DOLLAR, 0); }
		public TerminalNode BOUNDARY() { return getToken(RegexParser.BOUNDARY, 0); }
		public BoundaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boundary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegexListener ) ((RegexListener)listener).enterBoundary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegexListener ) ((RegexListener)listener).exitBoundary(this);
		}
	}

	public final BoundaryContext boundary() throws RecognitionException {
		BoundaryContext _localctx = new BoundaryContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_boundary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOUNDARY) | (1L << DOLLAR) | (1L << CARET))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u00c3\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\2\7\28\n\2\f\2\16\2;\13\2\3\3\7\3>\n\3\f\3\16\3A"+
		"\13\3\3\4\5\4D\n\4\3\4\3\4\5\4H\n\4\3\5\3\5\3\5\3\5\3\5\5\5O\n\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\5\6X\n\6\3\7\3\7\3\7\3\7\5\7^\n\7\3\7\5\7a\n\7"+
		"\3\b\3\b\6\be\n\b\r\b\16\bf\3\b\3\b\7\bk\n\b\f\b\16\bn\13\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\5\ty\n\t\3\t\3\t\3\t\3\n\3\n\5\n\u0080\n\n"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\5\f\u0088\n\f\3\r\3\r\3\16\3\16\3\17\3\17"+
		"\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\5\23\u0098\n\23\3\23\7\23\u009b"+
		"\n\23\f\23\16\23\u009e\13\23\3\23\5\23\u00a1\n\23\3\23\7\23\u00a4\n\23"+
		"\f\23\16\23\u00a7\13\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00b1"+
		"\n\24\3\25\3\25\3\25\3\26\3\26\3\26\5\26\u00b9\n\26\3\27\3\27\3\30\3\30"+
		"\3\31\3\31\3\32\3\32\3\32\2\2\33\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\2\f\4\2\31\31\34\34\4\2\30\30$$\6\2\20\25\31\34\36 \""+
		"#\4\2\5\t%%\13\2\f\17\22\23\26\30\33\33\35\35\37\37!!#%((\5\2\25\25\35"+
		"\35\"#\3\2&\'\b\2\f\24\26\31\33\33\36!$%((\4\2\t\t  \5\2\n\n\37\37##\2"+
		"\u00ca\2\64\3\2\2\2\4?\3\2\2\2\6C\3\2\2\2\bN\3\2\2\2\nW\3\2\2\2\f]\3\2"+
		"\2\2\16b\3\2\2\2\20q\3\2\2\2\22\177\3\2\2\2\24\u0081\3\2\2\2\26\u0087"+
		"\3\2\2\2\30\u0089\3\2\2\2\32\u008b\3\2\2\2\34\u008d\3\2\2\2\36\u008f\3"+
		"\2\2\2 \u0091\3\2\2\2\"\u0093\3\2\2\2$\u0095\3\2\2\2&\u00b0\3\2\2\2(\u00b2"+
		"\3\2\2\2*\u00b5\3\2\2\2,\u00ba\3\2\2\2.\u00bc\3\2\2\2\60\u00be\3\2\2\2"+
		"\62\u00c0\3\2\2\2\649\5\4\3\2\65\66\7\36\2\2\668\5\4\3\2\67\65\3\2\2\2"+
		"8;\3\2\2\29\67\3\2\2\29:\3\2\2\2:\3\3\2\2\2;9\3\2\2\2<>\5\6\4\2=<\3\2"+
		"\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@\5\3\2\2\2A?\3\2\2\2BD\5\20\t\2CB\3"+
		"\2\2\2CD\3\2\2\2DE\3\2\2\2EG\5\b\5\2FH\5\f\7\2GF\3\2\2\2GH\3\2\2\2H\7"+
		"\3\2\2\2IO\5\n\6\2JK\7\20\2\2KL\5\2\2\2LM\7\21\2\2MO\3\2\2\2NI\3\2\2\2"+
		"NJ\3\2\2\2O\t\3\2\2\2PX\5\22\n\2QX\5\36\20\2RX\5\26\f\2SX\5$\23\2TX\5"+
		"\60\31\2UX\5\62\32\2VX\5\"\22\2WP\3\2\2\2WQ\3\2\2\2WR\3\2\2\2WS\3\2\2"+
		"\2WT\3\2\2\2WU\3\2\2\2WV\3\2\2\2X\13\3\2\2\2Y^\7\31\2\2Z^\7\32\2\2[^\7"+
		"\34\2\2\\^\5\16\b\2]Y\3\2\2\2]Z\3\2\2\2][\3\2\2\2]\\\3\2\2\2^`\3\2\2\2"+
		"_a\t\2\2\2`_\3\2\2\2`a\3\2\2\2a\r\3\2\2\2bd\7\22\2\2ce\7\'\2\2dc\3\2\2"+
		"\2ef\3\2\2\2fd\3\2\2\2fg\3\2\2\2gh\3\2\2\2hl\7\16\2\2ik\7\'\2\2ji\3\2"+
		"\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2mo\3\2\2\2nl\3\2\2\2op\7\23\2\2p\17"+
		"\3\2\2\2qr\7\20\2\2rx\7\31\2\2sy\7\30\2\2ty\7$\2\2uv\7\26\2\2vy\t\3\2"+
		"\2wy\7\27\2\2xs\3\2\2\2xt\3\2\2\2xu\3\2\2\2xw\3\2\2\2yz\3\2\2\2z{\5\2"+
		"\2\2{|\7\21\2\2|\21\3\2\2\2}\u0080\5\24\13\2~\u0080\5 \21\2\177}\3\2\2"+
		"\2\177~\3\2\2\2\u0080\23\3\2\2\2\u0081\u0082\7\"\2\2\u0082\u0083\t\4\2"+
		"\2\u0083\25\3\2\2\2\u0084\u0088\5\30\r\2\u0085\u0088\5\32\16\2\u0086\u0088"+
		"\5\34\17\2\u0087\u0084\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0086\3\2\2\2"+
		"\u0088\27\3\2\2\2\u0089\u008a\7\'\2\2\u008a\31\3\2\2\2\u008b\u008c\7\3"+
		"\2\2\u008c\33\3\2\2\2\u008d\u008e\7\4\2\2\u008e\35\3\2\2\2\u008f\u0090"+
		"\7&\2\2\u0090\37\3\2\2\2\u0091\u0092\t\5\2\2\u0092!\3\2\2\2\u0093\u0094"+
		"\t\6\2\2\u0094#\3\2\2\2\u0095\u0097\7\24\2\2\u0096\u0098\7#\2\2\u0097"+
		"\u0096\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009c\3\2\2\2\u0099\u009b\5&"+
		"\24\2\u009a\u0099\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d\u00a5\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a1\7\13"+
		"\2\2\u00a0\u009f\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2"+
		"\u00a4\5$\23\2\u00a3\u00a0\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2"+
		"\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a8\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8"+
		"\u00a9\7\25\2\2\u00a9%\3\2\2\2\u00aa\u00b1\5(\25\2\u00ab\u00b1\5.\30\2"+
		"\u00ac\u00b1\5*\26\2\u00ad\u00b1\5 \21\2\u00ae\u00b1\5\34\17\2\u00af\u00b1"+
		"\5\32\16\2\u00b0\u00aa\3\2\2\2\u00b0\u00ab\3\2\2\2\u00b0\u00ac\3\2\2\2"+
		"\u00b0\u00ad\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00af\3\2\2\2\u00b1\'\3"+
		"\2\2\2\u00b2\u00b3\7\"\2\2\u00b3\u00b4\t\7\2\2\u00b4)\3\2\2\2\u00b5\u00b8"+
		"\5,\27\2\u00b6\u00b7\7\35\2\2\u00b7\u00b9\5,\27\2\u00b8\u00b6\3\2\2\2"+
		"\u00b8\u00b9\3\2\2\2\u00b9+\3\2\2\2\u00ba\u00bb\t\b\2\2\u00bb-\3\2\2\2"+
		"\u00bc\u00bd\t\t\2\2\u00bd/\3\2\2\2\u00be\u00bf\t\n\2\2\u00bf\61\3\2\2"+
		"\2\u00c0\u00c1\t\13\2\2\u00c1\63\3\2\2\2\259?CGNW]`flx\177\u0087\u0097"+
		"\u009c\u00a0\u00a5\u00b0\u00b8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}