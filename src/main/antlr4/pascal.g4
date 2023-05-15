grammar pascal;

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

fragment LETRA: [a-zA-Z];
fragment DIGITO: [0-9];

//Operadores
ADICAO: '+';
SUBTRACAO: '-';
MULTIPLICACAO: '*';
DIVIDIR: '/';
IGUAL: '=';
MENOR: '<';
MAIOR: '>';
MENOR_IGUAL: '<=';
MAIOR_IGUAL: '>=';
DIFERENTE: '<>';
ATRIBUICAO: ':=';
PONTO: '.';
PONTO_VIRGULA: ';';
DOIS_PONTOS: ':';
VIRGULA: ',';
PARENTESES_ESQ: '(';
PARENTESES_DIR: ')';

//Palavras reservadas
AND: A N D;
ARRAY: A R R A Y;
BEGIN: B E G I N;
CASE: C A S E;
CONST: C O N S T;
DIV: D I V;
DO: D O;
DOWNTO: D O W N T O;
ELSE: E L S E;
END: E N D;
FILE: F I L E;
FOR: F O R;
FUNCTION: F U N C T I O N;
GOTO: G O T O;
IF: I F;
IN: I N;
INTEGER: I N T E G E R;
LABEL: L A B E L;
MOD: M O D;
NIL: N I L;
NOT: N O T;
OF: O F;
OR: O R;
PACKED: P A C K E D;
PROCEDURE: P R O C E D U R E;
PROGRAM: P R O G R A M;
READ: R E A D;
REAL: R E A L;
RECORD: R E C O R D;
REPEAT: R E P E A T;
SET: S E T;
THEN: T H E N;
TO: T O;
TYPE: T Y P E;
UNTIL: U N T I L;
VAR: V A R;
WHILE: W H I L E;
WITH: W I T H;
WRITE: W R I T E;
WRITELN: W R I T E L N;

program: PROGRAM ID corpo PONTO;
corpo: declara BEGIN sentencas END;
declara: VAR dvar mais_dc | ;
mais_dc: PONTO_VIRGULA cont_dc;
cont_dc: dvar mais_dc | ;
dvar: variaveis DOIS_PONTOS tipo_var;
tipo_var: INTEGER;
variaveis: ID mais_var;
mais_var: VIRGULA variaveis | ;
sentencas: comando mais_sentencas;
mais_sentencas: PONTO_VIRGULA cont_sentencas;
cont_sentencas: sentencas | ;
var_read: ID mais_var_read;
mais_var_read: VIRGULA var_read | ;
var_write: ID mais_var_write;
mais_var_write: VIRGULA var_write | ;
comando:
    READ PARENTESES_ESQ var_read PARENTESES_DIR |
    WRITE PARENTESES_ESQ var_write PARENTESES_DIR |
    FOR ID ATRIBUICAO expressao TO expressao |
    DO BEGIN sentencas END |
    REPEAT sentencas UNTIL PARENTESES_ESQ condicao PARENTESES_DIR |
    WHILE PARENTESES_ESQ condicao PARENTESES_DIR DO BEGIN sentencas END |
    IF PARENTESES_ESQ condicao PARENTESES_DIR THEN BEGIN sentencas END pfalsa |
    ID ATRIBUICAO expressao;
condicao: expressao relacao expressao;
pfalsa: ELSE BEGIN sentencas END | ;
relacao: IGUAL |
         MENOR |
         MAIOR |
         MAIOR_IGUAL |
         MENOR_IGUAL |
         DIFERENTE;
expressao: termo outros_termos;
outros_termos: op_ad termo outros_termos | ;
op_ad: ADICAO | SUBTRACAO;
termo: fator mais_fatores;
mais_fatores: op_mul fator mais_fatores | ;
op_mul: MULTIPLICACAO | DIVIDIR;
fator: ID | INTNUM | PARENTESES_ESQ expressao PARENTESES_DIR;
ID: LETRA(LETRA | DIGITO)*;
INTNUM: DIGITO+;
WS: [ \t\r\n]+ -> skip; // despreza brancos, tabulações, quebras de linha e retornos de carro