lexer grammar BooleanExprLexer;
@header {
package antlrsource;
}
AND: A N D;
OR: O R;
NOT: N O T;
TRUE: 'True';
FALSE: 'False';
GT: G T {setText(" > ");};
GE: G E {setText(" >= ");};
LT: L T {setText(" < ");};
LE: L E {setText(" <= ");};
EQ: E Q {setText(" == ");};
LPARENTHESIS: '(';
RPARENTHESIS: ')';
DECIMAL_NUMBER: '-'? [0-9]+ ( '.' [0-9]+)?;
IDENTIFIER: [a-zA-Z_] [a-zA-Z_0-9]*;
WS: [ \r\t\u000C\n]+ -> skip;

fragment A : [aA]; // match either an 'a' or 'A'
fragment B : [bB];
fragment C : [cC];
fragment D : [dD];
fragment E : [eE];
fragment F : [fF];
fragment G : [gG];
fragment H : [hH];
fragment I : [iI];
fragment J : [jJ];
fragment K : [kK];
fragment L : [lL];
fragment M : [mM];
fragment N : [nN];
fragment O : [oO];
fragment P : [pP];
fragment Q : [qQ];
fragment R : [rR];
fragment S : [sS];
fragment T : [tT];
fragment U : [uU];
fragment V : [vV];
fragment W : [wW];
fragment X : [xX];
fragment Y : [yY];
fragment Z : [zZ];