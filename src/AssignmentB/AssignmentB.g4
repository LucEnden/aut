// Write a grammar for binary numerical expressions (*, +, - , NOT, XOR , <<)
// Generate an Antlr lexer and parser and check the parse tree with the TestRig (with option '-gui')

// Write a inherited listener to report the following:
//     the number of additions present in the input expression
//     the largest number present in the input expression
//     the calculated result of the input expression. (expired)
// Tips for further investigations: 
//      exploit the Antlr classes (like: print the vocabulary and the token stream of the lexer, and print all information of a rule's context and a TerminalNode)
grammar AssignmentB;

// rules
infix_expr : ((const)+ operator)+ const;
operator : MLT
    | DIV
    | ADD
    | SUB
    | MOD
    | AND
    | NOT
    | OR
    | XOR
    | LSHIFT
    | RSHIFT
    ;
const : BIT+ ;

// tokens
MLT     : '*' ;
DIV     : '/' ;
ADD     : '+' ;
SUB     : '-' ;
MOD     : '%' ;
AND     : '&' ;
NOT     : '!' ;
OR      : '|' ;
XOR     : '^' ;
LSHIFT  : '<<' ;
RSHIFT  : '>>' ;
BIT     : [01]+ ;
WS      : [ \t\n] -> skip;