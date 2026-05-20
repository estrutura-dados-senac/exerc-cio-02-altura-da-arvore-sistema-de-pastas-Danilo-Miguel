# Exercicio 5 - Percurso Pre-Ordem (Checklist de Deploy)

## Cenario 
Voce tem um fluxo de deploy em etapas e precisa registrar a ordem de execucao do processo pai antes dos subprocessos.

## Conceito praticado
- Percurso pre-ordem: raiz, esquerda, direita.

## Guia passo a passo 
1. Crie a funcao preOrdem que retorna uma lista de strings.
2. Dentro dela, crie a variavel resultado como lista vazia.
3. Chame uma funcao auxiliar preOrdemRec(raiz, resultado).
4. Na funcao auxiliar:
	- Se atual for null, retorne.
	- Adicione atual.etapa na lista resultado.
	- Chame recursivamente para esquerda.
	- Chame recursivamente para direita.
5. Retorne a lista resultado no metodo principal.

## Orientacoes  para resolucao
1. Grave mentalmente a ordem: primeiro o no atual.
2. Use lista para guardar a sequencia visitada.
3. Teste com arvore pequena para conferir visualmente a ordem.

## Por que essa solucao e adequada
No cenario, o processo principal deve ser tratado antes dos detalhes. Isso combina exatamente com a logica da pre-ordem.

## Solucao esperada
Consulte o arquivo de solucao correspondente do exercicio 5 no repositorio.
