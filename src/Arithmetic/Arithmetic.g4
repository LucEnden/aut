grammar Arithmetic;

// 4 * (1 + (2 - 1)) / 2 = 4

infix_expr  : const (infix)+ EQU const;
infix : (OPENBRACKET | CLOSEBRACKET)
    |   (MLT | DIV)
    |   (SUB | ADD)
    |   const
    ;
// In infix arithmatic, a constant is considered a real or natural number
const : (INT | REAL) ;

// Tokens
OPENBRACKET : '(' ;
CLOSEBRACKET : ')' ;
MLT : '*' ;
DIV : '/' ;
ADD : '+' ;
SUB : '-' ;
EQU : '=' ;
REAL : INT.INT ;
INT : SUB[0-9]+ | [0-9]+ ;
WS : ([ \t\n]+) -> skip ; // TODO: fix the fact that 4 4 * 2 should not be an accaptable infix notated som






// ====================================================================================

// expr : infix+ const outcome;
// infix : (first_order | second_order | third_order);
// first_order : OPENBRACKET (first_order | second_order | third_order)+ const CLOSEBRACKET ;
// second_order : const (MLT | DIV)+ ;
// third_order : const (ADD | SUB)+ ;
// const : INT | REAL ;
// outcome : EQU const ;

// expr : (infix)+ EQU const ;
// infix : OPENBRACKET (infix)+
//     |   (MLT | DIV) const
//     |   (SUB | ADD) const
//     |   const
//     |   CLOSEBRACKET
//     ;
// const : INT | REAL ;