grammar MyGrammar;

// 1. name and age
// 2. first name and lastname
// 3. name and telephone number
// 4. first name, lastname and telephone number
// 5. ...

// rules
myStart  	: (hello | goodbye)+ EOF;
hello		: HELLO name AGE;
goodbye		: GOODBYE;
name        : ID ID?; // first name & last name

// tokens
GOODBYE		: 'Bye';
HELLO		: 'Hello';
NUMBER		: [0-9] ;
AGE         : [0-9]{1,3} ;
TELNUM      : '+'[0-9]{1,3}[0-9]+ ;
ID 			: [_A-Za-z][A-Za-z_!0-9.]* ; 
WS 			: [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
