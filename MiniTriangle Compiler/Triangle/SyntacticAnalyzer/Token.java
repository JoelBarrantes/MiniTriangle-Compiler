/*
 * @(#)Token.java                        2.1 2003/10/07
 *
 * Copyright (C) 1999, 2003 D.A. Watt and D.F. Brown
 * Dept. of Computing Science, University of Glasgow, Glasgow G12 8QQ Scotland
 * and School of Computer and Math Sciences, The Robert Gordon University,
 * St. Andrew Street, Aberdeen AB25 1HG, Scotland.
 * All rights reserved.
 *
 * This software is provided free for educational use only. It may
 * not be used for commercial purposes without the prior written permission
 * of the authors.
 */

package Triangle.SyntacticAnalyzer;


final class Token extends Object {

  protected int kind;
  protected String spelling;
  protected SourcePosition position;

  public Token(int kind, String spelling, SourcePosition position) {

    if (kind == Token.IDENTIFIER) {
      int currentKind = firstReservedWord;
      boolean searching = true;

      while (searching) {
        int comparison = tokenTable[currentKind].compareTo(spelling);
        if (comparison == 0) {
          this.kind = currentKind;
          searching = false;
        } else if (comparison > 0 || currentKind == lastReservedWord) {
          this.kind = Token.IDENTIFIER;
          searching = false;
        } else {
          currentKind ++;
        }
      }
    } else
      this.kind = kind;

    this.spelling = spelling;
    this.position = position;

  }

  public static String spell (int kind) {
    return tokenTable[kind];
  }

  public String toString() {
    return "Kind=" + kind + ", spelling=" + spelling +
      ", position=" + position;
  }

  // Token classes...

  public static final int

    // literals, identifiers, operators...
    INTLITERAL	= 0,
    CHARLITERAL	= 1,
    IDENTIFIER	= 2,
    OPERATOR	= 3,

    // reserved words - must be in alphabetical order...
    AND			= 4,	//Added Token
    ARRAY		= 5,
    //BEGIN		= 5, 
    CONST		= 6,
    DO			= 7,
    ELSE		= 8,
    END			= 9,
    FOR			= 10,	//Added Token
    FUNC		= 11,
    IF			= 12,
    IN			= 13,
    LET			= 14,
    LOCAL		= 15	//Added Token
    OF			= 16,
    PAR 		= 17	//Added Token
    PROC		= 18,
    RECORD		= 19,
    RECURSIVE	= 20,	//Added Token
    REPEAT		= 21,	//Added Token
    SKIP		= 22,	//Added Token
    THEN		= 23,	
    TO			= 24,	//Added Token
    TYPE		= 25,
    UNTIL		= 26,	//Added Token
    VAR			= 27,
    WHILE		= 28,

    // punctuation...
    DOT			= 29,
    COLON		= 30,
    SEMICOLON	= 31,
    COMMA		= 32,
    BECOMES		= 33,
    IS			= 34,

    // brackets...
    LPAREN		= 35,
    RPAREN		= 36,
    LBRACKET	= 37,
    RBRACKET	= 38,
    LCURLY		= 39,
    RCURLY		= 40,

    // special tokens...
    EOT			= 41,
    ERROR		= 42;

  private static String[] tokenTable = new String[] {
    "<int>",
    "<char>",
    "<identifier>",
    "<operator>",
    "and",		//Added Token
    "array",
    //"begin",
    "const",
    "do",
    "else",
    "end",
    "for",		//Added Token
    "func",
    "if",
    "in",
    "let",
    "local",	//Added Token
    "of",
    "par",		//Added Token
    "proc",
    "record",
    "recursive",//Added Token
    "repeat",	//Added Token
    "skip",		//Added Token
    "then",
    "to",		//Added Token
    "type",
    "until",	//Added Token
    "var",
    "while",
    ".",
    ":",
    ";",
    ",",
    ":=",
    "~",
    "(",
    ")",
    "[",
    "]",
    "{",
    "}",
    "",
    "<error>"
  };

  private final static int	firstReservedWord = Token.ARRAY,
  				lastReservedWord  = Token.WHILE;

}
