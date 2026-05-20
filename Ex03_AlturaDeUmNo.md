# Exercicio 3 - Altura de um No (Rede de Franquias)

## Cenario realista
Uma rede de franquias quer saber quantos niveis de filiais existem abaixo de uma unidade especifica.

## Conceito praticado
- Altura de um no especifico.
- Diferenca entre altura da arvore inteira e altura de um no interno.

## Guia passo a passo (bem guiado)
1. Crie a funcao alturaDoNo com parametros raiz e alvo.
2. Crie a variavel noAlvo e armazene nela o retorno de uma funcao buscarNo.
3. Se noAlvo for null, retorne -1.
4. Se encontrou, chame alturaSubarvore(noAlvo).
5. Na funcao alturaSubarvore:
	- Se raiz for null, retorne 0.
	- Crie alturaEsquerda e alturaDireita com chamadas recursivas.
	- Retorne 1 + max(alturaEsquerda, alturaDireita).

## Orientacoes claras para resolucao
1. Separe o problema em duas etapas: buscar e medir.
2. Nao misture logica de busca com logica de altura na mesma funcao.
3. Teste com alvo na raiz, alvo interno e alvo inexistente.

## Por que essa solucao e adequada
A pergunta do cenario nao e sobre toda a estrutura, mas sobre um ponto especifico dela. Separar localizar e medir deixa o raciocinio claro.

## Solucao esperada
Consulte o arquivo de solucao correspondente do exercicio 3 no repositorio.
