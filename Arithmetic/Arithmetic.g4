grammar Arithmetic;
// Define a rule
start : '(' expr ')' ;
expr : expr MULTIPLY expr
     | expr DIVIDE expr
     | expr ADD expr
     | expr SUBTRACT expr
     | INT
     ;

// r  : 'hello' ID ;         // match keyword hello followed by an identifier
// ID : [a-z]+ ;             // match lower-case identifiers
OPENBRACKET : '(' ;
CLOSEBRACKET : ')' ;
MULTIPLY : '*' ;
DIVIDE : '/' ;
ADD : '+' ;
SUBTRACT : '-' ;
INT : [0-9]+ ;
WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines