import java.util.ArrayList;
import java.util.List;

public class Ex05PreOrdem {
    static class Node {
        String etapa;
        Node left;
        Node right;

        Node(String etapa) {
            this.etapa = etapa;
        }
    }

    public static List<String> preOrdem(Node raiz) {
        List<String> resultado = new ArrayList<>();
        preOrdemRec(raiz, resultado);
        return resultado;
    }

    private static void preOrdemRec(Node atual, List<String> resultado) {
        if (atual == null) {
            return;
        }

        // 1) Raiz
        resultado.add(atual.etapa);
        // 2) Esquerda
        preOrdemRec(atual.left, resultado);
        // 3) Direita
        preOrdemRec(atual.right, resultado);
    }

    public static Node exemploDeploy() {
        Node raiz = new Node("Deploy");
        raiz.left = new Node("Build");
        raiz.right = new Node("Monitoramento");
        raiz.left.left = new Node("Compilar");
        raiz.left.right = new Node("Testar");
        return raiz;
    }
}
