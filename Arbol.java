
class Nodo{
    int valor;
    Nodo izquierdo, derecho;

    public Nodo(int valor){
        this.valor = valor;
        izquierdo = derecho = null;
    }
}

class Cola {
    private Nodo[] nElem;
    private int head, tail, ev;

    public Cola(int capacidad){
        nElem = new Nodo[capacidad];
        head = 0;
        tail = -1;
        ev = 0;
    }

    public void encolar(Nodo nodo){
        if (ev == nElem.length){
            System.out.println("La cola está llena.");
            return;
        }
        tail = (tail + 1) % nElem.length;
        nElem[tail] = nodo;
        ev++;
    }

    public Nodo desencolar(){
        if (isEmpty()) 
            return null;

        Nodo X = nElem[head];
        head = (head + 1) % nElem.length;
        ev--;
        return X;
    }

    public boolean isEmpty(){
        return ev == 0;
    }
}

public class Arbol{
    Nodo raiz;

    public void recorridoInorden(Nodo nodo){
        if (nodo != null){
            recorridoInorden(nodo.izquierdo);
            System.out.print(nodo.valor + " ");
            recorridoInorden(nodo.derecho);
        }
    }

    public void recorridoPreorden(Nodo nodo){
        if (nodo != null){
            System.out.print(nodo.valor + " ");
            recorridoPreorden(nodo.izquierdo);
            recorridoPreorden(nodo.derecho);
        }
    }

    public void recorridoPostorden(Nodo nodo){
        if (nodo != null){
            recorridoPostorden(nodo.izquierdo);
            recorridoPostorden(nodo.derecho);
            System.out.print(nodo.valor + " ");
        }
    }

    public void recorridoPorNiveles(){
        if (raiz == null) return;

        Cola cola = new Cola(100);
        cola.encolar(raiz);

        while (!cola.isEmpty()){
            Nodo actual = cola.desencolar();
            System.out.print(actual.valor + " ");

            if (actual.izquierdo != null)
                cola.encolar(actual.izquierdo);
            if (actual.derecho != null)
                cola.encolar(actual.derecho);   
        }
    }

    public static void main(String[] args){
        Arbol arbol = new Arbol();

        arbol.raiz = new Nodo(1);
        arbol.raiz.izquierdo = new Nodo(2);
        arbol.raiz.derecho = new Nodo(3);
        arbol.raiz.izquierdo.izquierdo = new Nodo(4);
        arbol.raiz.izquierdo.derecho = new Nodo(5);
        arbol.raiz.derecho.izquierdo = new Nodo(6);
        arbol.raiz.derecho.derecho = new Nodo(7);
        arbol.raiz.izquierdo.izquierdo.izquierdo = new Nodo(8);
        arbol.raiz.izquierdo.derecho.izquierdo = new Nodo(9);

        System.out.println("In-Orden:");
        arbol.recorridoInorden(arbol.raiz);
        System.out.println("\nPre-Orden:");
        arbol.recorridoPreorden(arbol.raiz);
        System.out.println("\nPost-Orden:");
        arbol.recorridoPostorden(arbol.raiz);
        System.out.println("\nPor niveles:");
        arbol.recorridoPorNiveles();

        System.out.println();
    }
}
