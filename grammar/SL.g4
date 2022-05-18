grammar SL;

commands   : command commands
        | EOF
        |
        ;

command    : conditionals
        | repeat
        | while
        | printexpr
        | declaration
        | assignation
        ;


declaration: VAR ID 'as' expr SMCOLON;
assignation: ID 'as' expr SMCOLON;
conditional: 'if' condition 'then' commands 'endif';
conditionals: conditional ELSE commands 'endelse'
            | conditional;
repeat: 'repeat' expr 'times' commands 'endrepeat';
while: WHILE condition 'then' commands 'endwhile';
condition : expr ROP expr;
printexpr: 'print' expr SMCOLON ;
expr:  expr MULOP expr
   |  expr SUMOP expr
   |  DOUBLE
   |  PIZQ expr PDER
   |  ID
   ;


COMMENT        : '/*' .*? '*/' -> skip ;
LINE_COMMENT   : '//' ~[\r\n]* -> skip ;
WS     : [ \t\r\n]+ -> skip ;
VAR    : 'var';
ELSE   :'else';
WHILE  :'while';
PIZQ   : '(' ;
PDER   : ')' ;
ROP       : ( '<' | '<=' | '>=' | '>' | '==' | '!=' ) ;
SMCOLON : ';' ;
MULOP  : ( '*' | '/' );
SUMOP  : ('+' | '-') ;
DOUBLE : [0-9]+( | [.][0-9]+);
ID        : [a-zA-Z][a-zA-Z0-9_]* ;
