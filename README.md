Projeto de Compiladores UFABC Q2 2023

A gramática definida foi baseada na TypeExpression implementada nas aulas da disciplina, fazendo as 
modificações necessárias para atender os requisitos do projeto.

Toda a gramática está no arquivo TypeExpression.g4, a compilação foi realizada na versão 4.13 do antlr.

Os arquivos de entrada são do tipo .expr, alguns exemplos de entradas utilizadas no vídeo (algumas para simular erros e warnings também) estão disponíves no repositório.

Foi realizada a tentativa de implementar um interpretador, que funciona de forma parcial reconhecendo alguns comandos (mas com dificuldade em outros). Para rodar o interpretador basta remover os comentários da linha 26 na classe MainClass.

No momento da compilação é possível gerar código em duas linguagens alvos distintas, C e Java. Basta passar como parâmetro o nome da linguagem na função da classe parser generateObjectCode (será gerado um arquivo input.c ou MainClass.java).

No momento da compilação é printado o resultado, warnings ou possíveis erros, além de informações sobre os identificadores com os valores do mesmo após a compilação. Quando o comando leia é inserido no código, para permitir análise de valor em tempo real de compilação (avaliação das operações aritméticas), é atribuído um valor aleatório nos tipos REAL e INTENGER, e um texto genérico no tipo TEXTO.

Os integrantes do grupo do projeto foram:

Ariel Magalhães Bellio 11061215
Juliana Cavalaro de Oliveira 11100013
João Pedro Martini Gomes 11201722884
Nathan Palmares da Silva Firmo 11201811807