public class Ex04BuscaEmABB {
    static class Node {
        int codigo;
        Node left;
        Node right;

        Node(int codigo) {
            this.codigo = codigo;
        }
    }

    public static Node inserir(Node raiz, int codigo) {
        if (raiz == null) {
            return new Node(codigo);
        }

        if (codigo < raiz.codigo) {
            raiz.left = inserir(raiz.left, codigo);
        } else if (codigo > raiz.codigo) {
            raiz.right = inserir(raiz.right, codigo);
        }
        return raiz;
    }

    public static boolean buscar(Node raiz, int codigo) {
        Node atual = raiz;
        while (atual != null) {
            if (codigo == atual.codigo) {
                return true;
            }
            if (codigo < atual.codigo) {
                atual = atual.left;
            } else {
                atual = atual.right;
            }
        }
        return false;
    }

    public static Node exemploCatalogo() {
        int[] codigos = {50, 30, 70, 20, 40, 60, 80};
        Node raiz = null;
        for (int c : codigos) {
            raiz = inserir(raiz, c);
        }
        return raiz;
    }
}
