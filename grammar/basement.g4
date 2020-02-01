grammar basement;

init : (command | config)*;
config: (DEPLOY_TK ID image_type | BASEMNT_LIST ) obj;
command: ( SET_TK type_command | REMOVE_TK ) ID | PERFORM_TK ID obj;
obj: CURLY_L_TK (params (COMMA_TK params)*)* CURLY_R_TK;
params: deploy_params | bst_params | perform_params;
deploy_params: deploy_regular_params
             | ENVIRONMENT_TK KEY_VAL_TK env_obj (COMMA_TK deploy_regular_params)*;
deploy_regular_params: deploy_keys KEY_VAL_TK deploy_values (COMMA_TK deploy_regular_params)*;
deploy_keys: PORT_TK ;
env_obj: CURLY_L_TK (env_params (COMMA_TK env_params)*)* CURLY_R_TK;
env_params: env_keys KEY_VAL_TK env_values;
env_keys: postgres_env | mongo_env;
postgres_env: ('POSTGRES_USER' | 'POSTGRES_PASSWORD' | 'POSTGRES_DB');
mongo_env: ('MONGO_DB');
env_values: STRING;
deploy_values: NUMBER | STRING;
bst_params: bst_keys KEY_VAL_TK bst_values (COMMA_TK bst_params)*;
perform_params: perform_keys KEY_VAL_TK perform_values (COMMA_TK perform_params)*;
perform_keys: (DIR_TK | COMMAND_TK);
perform_values: STRING;
bst_keys: (FLAG_TOKEN | IMAGE_TYPE_TK | CREATE_TK);
bst_values: flag_val | image_type | NUMBER | STRING;
type_command: ( DOWN_TK |  UP_TK);
flag_val: ( RUNNING_TK| ALL_TK | EXITED_TK );
image_type: ('postgres' | 'mongo' | 'nginx');
PERFORM_TK: 'perform ';
DEPLOY_TK: 'deploy';
BASEMNT_LIST: 'basement-list';
DIR_TK: 'directory';
RUNNING_TK: 'running';
COMMAND_TK: 'command';
REMOVE_TK: 'remove';
SET_TK: 'set-';
DOWN_TK: 'down';
UP_TK: 'up';
ALL_TK: 'all';
EXITED_TK: 'exited';
FLAG_TOKEN: 'flag';
IMAGE_TYPE_TK: 'image-type';
CREATE_TK: 'creation-time';
PORT_TK: 'port';
ENVIRONMENT_TK: 'env';
CURLY_L_TK: '{' ;
CURLY_R_TK: '}' ;
KEY_VAL_TK: ':';
COMMA_TK: ',';
ID : [a-zA-z]+ ;
NUMBER: [0-9]+ ;
STRING: '"'(ESC | SAFECODEPOINT)*'"';
SPACE: ' ' -> skip;
WS: [\t\n\r] + -> skip;
fragment ESC: '\\' (["\\/bfnrt] | UNICODE);
fragment UNICODE: 'u' HEX HEX HEX HEX;
fragment HEX: [0-9a-fA-F];
fragment SAFECODEPOINT: ~ ["\\\u0000-\u001F];