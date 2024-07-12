import os
import re
import time
os.system("cls")

# Caminho para o arquivo de código fonte
file_path = "case3-analisador-lexico/codigo/source_code.txt"

# Ler o conteúdo do arquivo
with open(file_path, 'r', encoding='utf-8') as file:
    source_code = file.read()

# Definição dos padrões de tokens
token_patterns = [
    ('WHITESPACE', r'\s+'),
    ('COMMENT', r'//.*?$'),
    ('CONDITION', r'\b(if|else|else if|switch)\b'),
    ('LOOP', r'\b(do|for|while)\b'),
    ('PROTECTION', r'\b(private|public|protected)\b'),
    ('CLASS', r'\b(String|Integer|Double|Math|ArrayList)\b'),
    ('KEYWORD', r'\b(return|int|float|double|static|void|main|class|System|out|println|import|from)\b'),
    ('ID', r'\b[a-zA-Z_][a-zA-Z_0-9]*\b'),
    ('STRING', r'".*"'),
    ('NUMBER', r'\b\d+(\.\d+)?\b'),
    ('OPERATOR', r'[+\-*/=<>!%]'),
    ('DELIMITER', r'[\[\](){}:;,."\']'),
    ('UNKNOWN', r'.'),
]


# Compilação dos padrões em expressões regulares
token_regex = '|'.join(f'(?P<{name}>{pattern})' for name, pattern in token_patterns)
compiled_regex = re.compile(token_regex, re.MULTILINE)

# Função para fazer a análise léxica
def lex_analyzer(code):
    # Criar variáveis iniciais
    line_num = 1
    line_start = 0
    comments = 0
    tokens = []
    symbol_table = {}
    # Iterar pelos matches das expressões regulares
    for match in compiled_regex.finditer(code):
        # Separar tipo, valor e coluna
        kind = match.lastgroup
        value = match.group(kind)
        column = match.start() - line_start
        # Exibir erros léxicos
        if kind == "UNKNOWN":
            print(f"\033[31mErro léxico: caractere inesperado '{value}' na linha {line_num}, coluna {column}\033[m")
        # Ignorar espaços em branco e comentários
        if kind == 'WHITESPACE' or kind == 'COMMENT':
            if kind == 'COMMENT':
                comments += 1
            pass
        # Adicionar valores às tabelas de tokens e de símbolos 
        else:
            tokens.append((kind, value, line_num, column))
            if kind == 'ID' and value not in symbol_table:
                symbol_table[value] = len(symbol_table) + 1    
        # Adicionar 1 a "line_num" caso pule de linha
        if '\n' in value:
            line_start = match.end()
            line_num += 1
    # Retornar tabelas de tokens e de símbolos
    print(f"\033[31m{comments} comentários ignorados\033[m")
    return tokens, symbol_table

# Execução do analisador léxico
tokens, symbol_table = lex_analyzer(source_code)





# Cores
VERMELHO = "\033[1;31m"
VERDE = "\033[1;32m"
AMARELO = "\033[1;33m"
BRANCO = "\033[m"

# Exibição do código de entrada
print(f"{VERMELHO}Código de entrada:")
time.sleep(2)
print(f"{VERDE}{source_code}")
time.sleep(2)

# Exibição dos tokens
print(f"\n{VERMELHO}Tokens:{BRANCO}")
time.sleep(2)
for token in tokens:
    string = f"{AMARELO}Tipo:{BRANCO} {token[0]:15} {AMARELO}Valor:{BRANCO} {token[1]:25} {AMARELO}Linha:{BRANCO} {token[2]:<10} {AMARELO}Coluna:{BRANCO} {token[3]}"
    print(string)
    time.sleep(.1)
time.sleep(2)

# Exibição da tabela de símbolos
print(f"\n{VERMELHO}Tabela de Símbolos(ID's){BRANCO}")
time.sleep(2)
for symbol, id in symbol_table.items():
    print(f'{AMARELO}{id}:{BRANCO} {symbol}')
    time.sleep(.1)
