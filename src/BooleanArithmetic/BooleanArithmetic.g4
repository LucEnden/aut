// ============================================================
// Write a grammar for binary numerical infix_expressions (*, +, - , NOT, XOR , <<)
// Generate an Antlr lexer and parser and check the parse tree with the TestRig (with option '-gui')

// Write a inherited listener to report the following:
//     the number of additions present in the input infix_expression
//     the largest number present in the input infix_expression
//     the calculated result of the input infix_expression. (expired)
// Tips for further investigations: 
//      exploit the Antlr classes (like: print the vocabulary and the token stream of the lexer, and print all information of a rule's context and a TerminalNode)
// ============================================================
grammar BooleanArithmetic;

// rules
start           : (infix_expr | varassignment | print)+ ;

// function_signature  : 'def' WS VARNAME OPENBRACKET (VARNAME)* CLOSEBRACKET function_body ;
// function_body       : statement+ ;

infix_expr      : OPENBRACKET infix_expr CLOSEBRACKET #bracketInfixExpr
                | ( NOT | UADD | USUB ) infix_expr #unaryInfixExpr
                | infix_expr ( MLT | DIV | MOD ) infix_expr #multDivInfixExpr
                | infix_expr ( ADD | SUB ) infix_expr #addSubInfixExpr
                | infix_expr ( LSHIFT | RSHIFT) infix_expr #shiftInfixExpr
                | infix_expr BAND infix_expr #bAndInfixExpr
                | infix_expr BXOR infix_expr #bXorInfixExpr
                | infix_expr BOR infix_expr #bOrInfixExpr
                | BINARY  #constInfixOperand
                | VARNAME  #varInfixOperand
                ;
varassignment   : VARNAME ASSIGNMENT BINARY #varAssignmentUsingConst
                | VARNAME ASSIGNMENT VARNAME #varAssignmentUsingVar
                | VARNAME ASSIGNMENT infix_expr #varAssignmentUsingExpr
                ;
print           : PRINTCMD BINARY #printUsingConst
                | PRINTCMD VARNAME #printUsingVar
                | PRINTCMD infix_expr #printUsingInfixExpr
                ;

// ============================================================
// I asked perplexity what the where in the order of operations left and right shifts fall.
// In turn it gave me an entire list containing all the possible opperators in binary arithmatic and in which order to excecute them in.
// I will be using this as leading during my implementation of the calulator.

// https://www.perplexity.ai/search/where-do-left-shifts-and-right-8_diRiSHRv2k2DOihV.FMg#0
// Order of Operations for Binary infix_expressions
// 1.   Parentheses ()
// 2.   Unary operators (e.g., !, ~, ++, --)
// 3.   Multiplication (*), Division (/), Modulus (%)
// 4.   Addition (+), Subtraction (-)
// 5.   Bitwise shifts (<<, >>)
// 6.   Relational operators (<, >, <=, >=)
// 7.   Equality operators (==, !=)
// 8.   Bitwise AND (&)
// 9.   Bitwise XOR (^)
// 10.  Bitwise OR (|)
// 11.  Logical AND (&&)
// 12.  Logical OR (||)
// 13.  Conditional operator (?:)
// 14.  Assignment operators (=, +=, -=, etc.)
// ============================================================
// After some thought, it does not really make sense to support logical operations in arithmatic context
// This could be cool as a seperate grammer, or even part of this grammer, but not for now.
//
// TODO: I just found out their are different types of bit shifts, that being: logical, arithmatical and rotational. I need a method of denoting these seperatly, as my current grammer implementations treats them all the same
// ============================================================
// Other usefull resources I found:
// https://www.boolean-algebra.com/
// ============================================================

// Tokens
OPENBRACKET             : '(' ;
CLOSEBRACKET            : ')' ;
NOT                     : '!' ;
MLT                     : '*' ;
DIV                     : '/' ;
MOD                     : '%' ;
ADD                     : '+' ;
SUB                     : '-' ;
UADD                    : ADD ADD ;
USUB                    : SUB SUB ;
LSHIFT                  : '<<' ;
RSHIFT                  : '>>' ;
BAND                    : '&' ;
BXOR                    : '^' ;
BOR                     : '|' ;
BINARY                  : [01]+ ;
WS                      : SPACING -> skip ;

ASSIGNMENT              : '=' ;
PRINTCMD                : 'print' ;

VARNAME                 : (ALPHA | '_')+ ;
ALPHA                   : [a-zA-Z] ;

fragment SPACING        : [ \t\r\n] ;