# Exercicio 1 - Altura da Arvore (Sistema de Pastas)

## Cenario 
Voce esta construindo um painel de TI que mostra o quao profunda esta a estrutura de pastas de uma empresa. Quanto maior a altura, mais dificil pode ser navegar e manter os arquivos.

## Conceito praticado
- Altura da arvore.
- Recursao para percorrer subarvores.

## Guia passo a passo 
1. Crie uma funcao chamada altura que recebe a raiz da arvore.
2. Comece com o caso base:
	- Se raiz for null, retorne 0.
3. Crie a variavel alturaEsquerda e guarde nela o resultado de altura(raiz.left).
4. Crie a variavel alturaDireita e guarde nela o resultado de altura(raiz.right).
5. Crie a variavel maiorAltura e guarde o maior valor entre alturaEsquerda e alturaDireita.
6. Retorne 1 + maiorAltura.
7. Teste com uma arvore pequena e depois com arvore vazia.

## Orientacoes 
1. Escreva o caso base antes de qualquer outra linha.
2. Escreva as duas chamadas recursivas em variaveis separadas para enxergar melhor o fluxo.
3. Evite tentar “adivinhar” a altura; sempre deixe a recursao calcular.
4. Valide com dois cenarios: arvore normal e arvore null.

## Por que essa solucao e adequada
A recursao segue exatamente a definicao matematica de altura da arvore e deixa o codigo simples para iniciantes.

## Solucao esperada
Consulte o arquivo de solucao correspondente do exercicio 1 no repositorio.
