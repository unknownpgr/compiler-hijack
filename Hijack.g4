grammar Hijack;

@header {package generated;}

// Start point
start: code* EOF;

// Variable type
type:
	'void'			# type_void
	| 'int'			# type_int
	| 'float'		# type_float
	| 'bool'		# type_bool
	| type '[' ']'	# type_array
	| id			# type_custom;

// Definition
def_var: type id;
def_func: def_var '(' ( | def_var (',' def_var)*) ')' codeblock;
def_struct: id '{' (definition (';' definition)+) '}';
definition: def_var | def_func | def_struct;

// Program flow control
if_condition: 'if' '(' exp ')';
if_stat: if_condition codeblock ( 'else' codeblock)?;
return_phrase: 'return' exp;
control: if_stat | return_phrase;

// Expression
exp:
	id											# exp_id
	| ( l_int | l_float)						# exp_num
	| l_string									# exp_string
	| exp '.' exp								# op_refer
	| exp '(' ( | exp ( ',' exp)*) ')'			# op_call
	| '!' exp									# op_negate
	| ( '+' | '-') exp							# op_sign
	| exp ( '*' | '/') exp						# op_muldiv
	| exp ( '+' | '-') exp						# op_addsub
	| exp ( '>=' | '<=' | '>' | '<' | '==') exp	# op_comp
	| exp '=' exp								# op_assign
	| '(' exp ')'								# op_bracket;

// Special rules
def_var_assign: def_var '=' exp;
special_rules: def_var_assign;

// Code and codeblock
code: control | definition | exp | special_rules;
codeblock: '{' code ( ';' code?)+ '}' | code ';';

// Defaut
id: ID;
l_int: INT;
l_float: FLOAT;
l_string: STRING;

// LEX
STRING: '"' [^"]+ '"';
ID: ( '_' | [a-zA-Z]) ( '_' | [a-zA-Z0-9])*;
INT: '0' | [1-9] [0-9]*;
FLOAT: INT [.] [0-9]* | [.] [0-9]+;

// White spaces and comments
WS: [ \t\r\n]+ -> skip; // skip spaces, tabs, newlines
COMMENT_LINE: '//' ~[\r\n]* -> skip;
COMMENT_BLOCK: '/*' .*? '*/' -> skip;