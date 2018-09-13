//研究用に自分で作ったやつ(日本語不可)
//OTHER_SYMBOLいじればおそらく拡張可能

grammar Regex;

// -----------------Parser------------------
regex
   : exprlist (OR exprlist)*
   ;

exprlist
   : expr*
   ;

expr
   : lookaheadbehind? block quantifier?
   ;

block
   : operand
   | LPAREN regex RPAREN
   ;

operand
   : escape_operand
   | alphabet
   | digit
   | character_class
   | defined_character
   | boundary
   | other_operand
   ;

quantifier
   : ( QUESTION | STAR | PLUS | ranger ) ( QUESTION | PLUS )?
   ;

ranger
   : LBRACE NUMBER+ COMMA NUMBER* RBRACE
   ;

lookaheadbehind
   : LPAREN QUESTION (EQUAL | EXCLA | LT (EQUAL | EXCLA) |GT) regex RPAREN
   ;

// -----------------escape------------------
escape_operand
   : escape_punctual
   | escape_special
   ;

escape_punctual
   : ESC
   ( ESC
   | STAR
   | PLUS
   | DOT
   | QUESTION
   | LBRACE
   | RBRACE
   | LPAREN
   | RPAREN
   | LBRACK
   | RBRACK
   | CARET
   | DOLLAR
   | OR
   | SLASH
   )
   ;

// -----------------Digits------------------
digit
   : dec
   | octal
   | hex
   ;

dec
   : NUMBER
   ;

octal
   : OCTAL
   ;

hex
   : HEX
   ;

// -----------------alphabet------------------
alphabet
   : ALPHABET
   ;

// -----------------other------------------
escape_special
   : TAB
   | LF
   | CR
   | WS
   | OTH_ESC
   | DEFINED_CH
   ;

other_operand
   : EXCLA
   | DOLLAR
   | AND
   | EQUAL
   | TLIDE
   | CARET
//   | OR
//   | LPAREN
//   | RPAREN
   | LBRACE
   | RBRACE
   | COLON
   | SEMI
//   | LBRACK
//   | RBRACK
   | SLASH
   | LT
   | GT
   | COMMA
   | MINUS
   | WS
   | OTHER_SYMBOL
   ;

// -----------------Character Class------------------
character_class
   : (LBRACK CARET? tokeninclass* (ANDAND? character_class )* RBRACK)
   ;

tokeninclass
   : esc_in_cc
   | other_in_cc
   | factor_in_cc
   | escape_special
   | hex
   | octal
   ;

esc_in_cc
   : ESC  (ESC | RBRACK | MINUS | CARET)
   ;

factor_in_cc
   : alphanumeric ( MINUS alphanumeric )?
   ;

alphanumeric
   : ALPHABET
   | NUMBER
   ;

other_in_cc
   : EXCLA
   | QUESTION
   | DOLLAR
   | AND
   | EQUAL
   | TLIDE
//   | CARET
   | OR
   | LPAREN
   | RPAREN
   | LBRACE
   | RBRACE
   | COLON
   | SEMI
   | LBRACK
//   | RBRACK
   | SLASH
   | LT
   | GT
   | COMMA
   | DOT
//   | MINUS
   | WS
   | OTHER_SYMBOL
   ;

// -----------------defined_character------------------
defined_character
   : DEFINED_CH
   | DOT
   ;

boundary
   : CARET
   | DOLLAR
   | BOUNDARY
   ;

// -----------------Lexer------------------

// -----------------Digits------------------
fragment HEX_DIGIT
   :[0-9a-fA-F]
   ;

OCTAL
   : '\\0' [0-3]? [0-7]? [0-7]
   ;

HEX
   : '\\x' HEX_DIGIT HEX_DIGIT
   | '\\u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
   ;

TAB
   : '\\t'
   ;

LF
   : '\\n'
   ;

CR
   : '\\r'
   ;

OTH_ESC
   : '\\' [fae]
   ;

// -----------------defined_character------------------

DEFINED_CH
   : '\\' [dDhHsSvVwW]
   ;

BOUNDARY
   : '\\' [bBaAGzZ]
   ;

// -----------------punctual------------------
ANDAND
   : '&&'
   ;

AND
   : '&'
   ;

COLON
   : ':'
   ;

COMMA
   : ','
   ;

SEMI
   : ';'
   ;

LPAREN
   : '('
   ;

RPAREN
   : ')'
   ;

LBRACE
   : '{'
   ;

RBRACE
   : '}'
   ;

LBRACK
   : '['
   ;

RBRACK
   : ']'
   ;

LT
   : '<'
   ;

GT
   : '>'
   ;

EQUAL
   : '='
   ;

QUESTION
   : '?'
   ;

STAR
   : '*'
   ;

SLASH
   : '/'
   ;

PLUS
   : '+'
   ;

MINUS
   : '-'
   ;

OR
   : '|'
   ;

DOLLAR
   : '$'
   ;

DOT
   : '.'
   ;

TLIDE
   : '~'
   ;

ESC
   : '\\'
   ;

CARET
   : '^'
   ;

EXCLA
   : '!'
   ;

WS
   : ' '
   ;

ALPHABET
   : [a-zA-Z]
   ;

NUMBER
   : [0-9]
   ;

OTHER_SYMBOL
   : ["#%&'`@_/<>]
   ;
