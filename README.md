Cada modificação feita no arquivo TypeExpression.g4 (onde está a gramática) precisa salvar o arquivo e compilar ele novamente usando o comando:

java -cp antlr-4.13.0-complete.jar;. org.antlr.v4.Tool TypeExpression.g4 -o ./src/parser -package parser

Importante configurar o arquivo do antlr na versão 4.13 no eclipse (o arquivo do projeto no eclipse já está no repositório)

Na MainClass tem duas opções para geração de código, na linha 20 é passar como parâmetro "Java" ou "C" para ter o retorno do arquivo esperado.
