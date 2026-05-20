public class Ex03AlturaDeUmNo {
    static class Node {
        int codigo;
        Node left;
        Node right;

        Node(int codigo) {
            this.codigo = codigo;
        }
    }

    public static int alturaDoNo(Node raiz, int alvo) {
        Node noAlvo = buscarNo(raiz, alvo);
        if (noAlvo == null) {
            return -1;
        }
        return alturaSubarvore(noAlvo);
    }

    // Busca simples em arvore binaria comum.
    private static Node buscarNo(Node atual, int alvo) {
        if (atual == null) {
            return null;
        }
        if (atual.codigo == alvo) {
            return atual;
        }
        Node esquerda = buscarNo(atual.left, alvo);
        if (esquerda != null) {
            return esquerda;
        }
        return buscarNo(atual.right, alvo);
    }

    // Altura da subarvore enraizada no no informado.
    private static int alturaSubarvore(Node raiz) {
        if (raiz == null) {
            return 0;
        }
        return 1 + Math.max(alturaSubarvore(raiz.left), alturaSubarvore(raiz.right));
    }

    public static Node exemploFranquias() {
        Node raiz = new Node(100);
        raiz.left = new Node(80);
        raiz.right = new Node(120);
        raiz.left.left = new Node(70);
        raiz.left.right = new Node(90);
        raiz.left.left.left = new Node(60);
        return raiz;
    }
}
