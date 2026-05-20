# Exercicio 2 - Profundidade de um No (Sistema de Permissoes)

## Cenario  - > Ex02ProfundidadeDoNo
Voce precisa descobrir em qual nivel da hierarquia organizacional um colaborador esta para aplicar regras de permissao.

## Conceito praticado
- Profundidade de no.
- Busca em arvore com acumulacao de nivel.

## Guia passo a passo 
1. Crie uma funcao publica profundidade que recebe raiz e alvo.
2. Nessa funcao, chame uma funcao auxiliar com nivel inicial 0.
3. Na funcao auxiliar, comece com:
	- Se atual for null, retorne -1.
4. Se atual.id for igual ao alvo, retorne nivel.
5. Crie a variavel resultadoEsquerda recebendo a busca na esquerda com nivel + 1.
6. Se resultadoEsquerda for diferente de -1, retorne esse valor.
7. Caso contrario, retorne o resultado da busca na direita com nivel + 1.

## Orientacoes 
1. Use -1 para representar “nao encontrado”.
2. Nao some nivel fora da recursao; some no momento da descida.
3. Faça primeiro a busca na esquerda e depois na direita para manter padrao.
4. Teste tres casos: raiz, no interno e no inexistente.

## Por que essa solucao e adequada
A profundidade depende do caminho desde a raiz. A busca recursiva com nivel acumulado representa exatamente esse caminho.

## Solucao esperada
Consulte o arquivo de solucao correspondente do exercicio 2 no repositorio.
