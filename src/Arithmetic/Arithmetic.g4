grammar Arithmetic;

// 4 * (1 + (2 - 1)) / 2 = 4

expr  : (infix)+ EQU const ;
infix : OPENBRACKET (infix)+ CLOSEBRACKET
    |   (MLT | DIV)
    |   (SUB | ADD)
    |   const
    ;
const : INT | REAL ;

// Tokens
OPENBRACKET : '(' ;
CLOSEBRACKET : ')' ;
MLT : '*' ;
DIV : '/' ;
ADD : '+' ;
SUB : '-' ;
EQU : '=' ;
INT : (SUB | )[0-9]+ ;
REAL : (SUB | )INT.INT ;
WS : ([ \t]+) -> skip ; // skip spaces, tabs

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