public class Ex02ProfundidadeDoNo {
    static class Node {
        int id;
        Node left;
        Node right;

        Node(int id) {
            this.id = id;
        }
    }

    // Metodo publico para facilitar o uso didatico.
    public static int profundidade(Node raiz, int alvo) {
        return profundidadeRec(raiz, alvo, 0);
    }

    // Busca o no alvo e acompanha o nivel atual.
    private static int profundidadeRec(Node atual, int alvo, int nivel) {
        if (atual == null) {
            return -1;
        }

        if (atual.id == alvo) {
            return nivel;
        }

        int esquerda = profundidadeRec(atual.left, alvo, nivel + 1);
        if (esquerda != -1) {
            return esquerda;
        }

        return profundidadeRec(atual.right, alvo, nivel + 1);
    }

    public static Node exemploHierarquia() {
        Node raiz = new Node(10);
        raiz.left = new Node(7);
        raiz.right = new Node(15);
        raiz.left.left = new Node(5);
        raiz.left.right = new Node(8);
        return raiz;
    }
}
