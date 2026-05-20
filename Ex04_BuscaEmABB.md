# Exercicio 4 - Busca em ABB (Catalogo de Produtos)

## Cenario 
Um e-commerce precisa localizar rapidamente um produto pelo codigo sem percorrer todo o catalogo.

## Conceito praticado
- Propriedade da ABB.
- Busca eficiente comparando alvo com valor atual.

## Guia passo a passo 
1. Crie a funcao buscar recebendo raiz e codigo.
2. Crie a variavel atual e inicie com a raiz.
3. Enquanto atual for diferente de null:
	- Se codigo for igual a atual.codigo, retorne true.
	- Se codigo for menor, atual recebe atual.left.
	- Senao, atual recebe atual.right.
4. Se saiu do laco, retorne false.
5. Para montar exemplos, use a funcao inserir respeitando as regras da ABB.

## Orientacoes para resolucao
1. Nunca percorra os dois lados ao mesmo tempo em ABB.
2. Use apenas comparacao de menor/maior para decidir o proximo passo.
3. Teste um valor existente e outro inexistente.

## Por que essa solucao e adequada
A ABB reduz o numero de comparacoes em estruturas balanceadas, tornando a busca mais rapida que uma lista comum.
