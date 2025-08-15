
class nodo extends Nodo {
    int valor;
    nodo izquierda, derecha;

    public nodo(int valor) {
        super(valor);
        izquierda = derecha = null;
    }
    
}

public class ArbolBinario {

    // Método para calcular la altura
    public static int altura(nodo raiz) {
        if (raiz == null) {
            return -1; // altura de árbol vacío
        }
        int altIzquierda = altura(raiz.izquierda);
        int altDerecha = altura(raiz.derecha);
        return 1 + Math.max(altIzquierda, altDerecha);
    }

    public static void main(String[] args) {
        // Construcción del árbol
        nodo raiz = new nodo(1);
        raiz.izquierda = new nodo(2);
        raiz.derecha = new nodo(3);
        raiz.izquierda.izquierda = new nodo(4);
        raiz.izquierda.derecha = new nodo(5);

        // Cálculo de altura
        System.out.println("Altura del árbol: " + altura(raiz));
    }
}


