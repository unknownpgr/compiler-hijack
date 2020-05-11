grammar Hijack;

@header {package generated;}

s
:
	code* EOF
;

code
:
	'(' code ')' # parentheses
	| '{' code* '}' # codeblock
	| type_ id # variable_definition
	| ret_type = type_ '('
	(
		|
		(
			id
			(
				',' id
			)*
		)?
	) ')' body = code # function_definition
	|
	(
		type_int
		| type_float
	) # number
	| id # code_id
	| func = code '('
	(
		|
		(
			code
			(
				',' code
			)*
		)?
	) ')' # function_call
	| operator = OP_UNI_1 operand = code # unary_operation
	| ordL = code operator = OP_BIN_1 ordR = code # binary_operation
	| ordL = code operator = OP_BIN_2 ordR = code # binary_operation
	| operator = OP_UNI_3 operand = code # unary_operation
	| lhs = code '=' rhs = code # assign
	| code ';' # skip
;

type_
:
	'int'
	| 'float'
;

id
:
	ID
;

type_int
:
	INT
;

type_float
:
	FLOAT
;

OP_UNI_1
:
	'!'
	| '~'
;

OP_BIN_1
:
	'^'
	| '*'
	| '/'
	| '%'
	| '&'
;

OP_BIN_2
:
	'+'
	| '-'
	| '|'
;

OP_BIN_3
:
	'='
;

OP_UNI_3
:
	'+'
	| '-'
;

ID
:
	(
		'_'
		| [a-z]
		| [A-Z]
	)
	(
		'_'
		| [a-z]
		| [A-Z]
		| [0-9]
	)*
;

INT
:
	[1-9] [0-9]*
;

FLOAT
:
	INT [.]
	| INT [.] INT
	| [.] INT
;

WS
:
	[ \t\r\n]+ -> skip
; // skip spaces, tabs, newlines

COMMENT_LINE
:
	'//' ~[\r\n]* -> skip
;

COMMENT_BLOCK
:
	'/*' .*? '*/' -> skip
;
