package Thing;

public class Lista {
    public Nodo head;
    public Nodo tail;
    int mayor=Integer.MIN_VALUE;
    int sum=0, tot=0;

    public boolean listaVacia(){
        return head==null;
    }

    public void insertar(int n){
        Nodo nuevo= new Nodo(n);
        if(head==null){
            head=nuevo;
            tail=nuevo;
        }else{
            tail.siguiente=nuevo;
            tail=nuevo;
        }
    }

    public void imprPromedio() {
        Nodo actual = head;
        while (actual != null) {
            System.out.print(actual.valor + " - ");
            sum += actual.valor;
            actual = actual.siguiente;
            tot++;
        }
        System.out.println("null");
    }

    public void impr() {
        Nodo actual = head;
        while (actual != null) {
            System.out.print(actual.valor + " - ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }

    public boolean secuencial(int valor) {
        Nodo actual = head;
        while (actual != null) {
            if (actual.valor == valor) {
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }

    public Nodo anterior(Nodo actual){
        Nodo aux=head;
        while (aux!=null) {
            if (aux.siguiente==actual) 
                return aux;
            
            aux=aux.siguiente;
        }
        return actual;
    }

//------------------------------------------------------------------------------
//Ejercicio 1
    public void insertarDespues(int n, int posicion){
        Nodo nuevo =new Nodo(n);
        Nodo actual;
        if (listaVacia()) {
            System.out.println("La lista está vacía.");
            return;
        }else{
            if (secuencial(posicion)) {
                actual=buscar(posicion);
                nuevo.siguiente = actual.siguiente;
                actual.siguiente = nuevo;
            }else{
                System.out.println("El valor no se encuentra en la lista.");
                return;
            }
        }
    }

    public Nodo buscar(int valor){
        Nodo actual = head;
        while (actual != null) {
            if (actual.valor == valor) {
                return actual;
            }
            actual = actual.siguiente;
        }
        return null;
    }

//------------------------------------------------------------------------------
//Ejercicio 2
    public void promedio(){
        if (tot == 0) {
            System.out.println("No hay elementos en la lista.");
        } else {
            double promedio = (double) sum / tot;
            System.out.println("El promedio de los numeros es: " + promedio);
        }
    }

//------------------------------------------------------------------------------
//Ejercicio 3
    public void elimMayor(){
        Nodo aux=new Nodo(mayor);
        Nodo actual=head;
        if (listaVacia()) {
            System.out.println("No hay elementos en la lista.");
        } else {
            while (actual!=null) {
                if (actual.valor >= aux.valor) 
                    aux=actual;
                
                actual=actual.siguiente;
            }
            actual=head;
            while (actual.siguiente!=null) {
                if (aux.valor==actual.siguiente.valor) {
                    if (aux.siguiente==null) {
                        actual.siguiente=null;
                    }else{
                        actual.siguiente=aux.siguiente;
                    }
                }else{
                    actual=actual.siguiente;
                }
            }
            System.out.println("Numero Eliminado: "+aux.valor);
        }
    }

//------------------------------------------------------------------------------
//Ejercicio 4
    public void combinar(Lista lista1,Lista lista2,Lista combi){
        Nodo actual=lista1.head;
        mezclar(actual, combi);
        actual=lista2.head;
        mezclar(actual, combi);
    }

    public void mezclar(Nodo actual,Lista combi){
        while (actual!=null) {
            combi.insertar(actual.valor);
            actual=actual.siguiente;
        }
    }
    
    public void Ordenar(Nodo actual,Nodo next){
        int aux;
        if (next==null) {
            return;
        }else{
            if (actual.valor>next.valor) {
                aux=next.valor;
                next.valor=actual.valor;
                actual.valor=aux;
                Ordenar(anterior(actual), actual);
            } 
                Ordenar(next, next.siguiente);
            
        }
    }

    public void repetido(){
        Nodo actual=head;
        Nodo aux=head.siguiente;
        while (actual.siguiente!=null) {
            while (aux!=null) {
                if (actual.valor==aux.valor) {
                    if (aux.siguiente==null) {
                        actual.siguiente=null;
                        return;
                    }else{
                        actual.siguiente=aux.siguiente;
                        aux=aux.siguiente;
                    }
                } else {
                    aux=aux.siguiente;
                }
            }
            actual=actual.siguiente;
            aux=actual.siguiente;
        }
    }

//------------------------------------------------------------------------------
//Ejercicio 5
    //Utilizá metodos del ejercicio 4
    public void ingresoRepe(Lista X){
        Nodo actual=head;
        Nodo aux=head.siguiente;
        while (actual.siguiente!=null) {
            while (aux!=null) {
                if (actual.valor==aux.valor) {
                    X.insertar(actual.valor);
                    aux=aux.siguiente;
                } else {
                    aux=aux.siguiente;
                }
            }
            actual=actual.siguiente;
            aux=actual.siguiente;
        }
    }

//------------------------------------------------------------------------------
//Ejercicio 6
    public void imprInverso(Nodo actual){
        Nodo aux=head;
        while (aux!=null) {
            if (aux.siguiente==actual) {
                System.out.print(" - "+aux.valor);
                imprInverso(aux);
            }
            aux=aux.siguiente;
        }
    }

//------------------------------------------------------------------------------
//Ejercicio 7
    public int verificarOrden() {
        boolean ascendente = true,descendente = true;
        Nodo actual = head;
        if (listaVacia()) {
            return -1; // Lista vacía
        }
        while (actual.siguiente != null) {
            if (actual.valor > actual.siguiente.valor) 
                ascendente = false;

            if (actual.valor < actual.siguiente.valor) 
                descendente = false;

            actual = actual.siguiente;
        }
        if (ascendente) 
            return 1;

        if (descendente) 
            return 2;

        return 0;
    }

//------------------------------------------------------------------------------
//Ejercicio 8
    public void eraseOverLim(int lim){
        Nodo actual = head;
        while (actual != null) {
            if (actual.valor > lim) {
                if (actual == head) {
                    head = actual.siguiente;
                    actual = head;
                } else {
                    anterior(actual).siguiente = actual.siguiente;
                    actual = actual.siguiente;
                }
            } else {
                
                actual = actual.siguiente;
            }
        }
    }

//------------------------------------------------------------------------------
//Ejercicio 9:
    public Lista invertir(Lista lista) {
        Lista tempLista = new Lista();
        Nodo actual = lista.head;
        while (actual != null) {
            Nodo nuevo = new Nodo(actual.valor);
            if (tempLista.head == null) {
                tempLista.insertar(nuevo.valor);
            } else {
                nuevo.siguiente = tempLista.head;
                tempLista.head = nuevo;
            }
            actual = actual.siguiente;
        }
        return tempLista;
    }

//------------------------------------------------------------------------------
//Ejercicio 10
    public void burbuja(Nodo actual){
        int aux;
        if (actual.siguiente==null) {
            return;
        }else{
            if (actual.valor>actual.siguiente.valor) {
                aux=actual.siguiente.valor;
                actual.siguiente.valor=actual.valor;
                actual.valor=aux;
                Ordenar(anterior(actual), actual);
            } 
                Ordenar(actual.siguiente, actual.siguiente.siguiente);
            
        }
    }

//------------------------------------------------------------------------------
//Ejercicio 11
    public void eliminarDesdePosicion(int x,int n) {
        if (listaVacia() || n<=0) {
            System.out.println("Lista vacía o número inválido de nodos a eliminar.");
            return;
        }
        Nodo actual=head;
        Nodo anterior=null;
        for (int i=0; i<x && actual!=null; i++) {
            anterior=actual;
            actual=actual.siguiente;
        }
        if (actual==null) {
            System.out.println("La posición " + x + " está fuera del rango de la lista.");
            return;
        }
        for (int i=0; i<n && actual!=null;i++) {
            actual=actual.siguiente;
        }
        if (anterior==null) {
            head=actual;
        } else {
            anterior.siguiente=actual;
        }
        if (actual==null) {
            tail=anterior;
        }
        System.out.println("Se eliminaron "+n+ " nodos a partir de la posición "+x);
    }

//Ejercicio 12
    public void patirIntercalado(Lista list1,Lista list2) {
        Nodo actual=head;
        int index=0;
        while (actual!=null) {
            if (index%2==0) {
                list1.insertar(actual.valor); // A, C, ...
            } else {
                list2.insertar(actual.valor); // B, D, ...
            }
            actual=actual.siguiente;
            index++;
        }
        System.out.println("Lista particionada intercaladamente.");
    }

//Ejercio 13
public void elimRep() {
    Nodo actual = head;
    while (actual != null) {
        Nodo verificador = head;
        int conteo = 0;
        while (verificador != null) {
            if (verificador.valor == actual.valor) {
                conteo++;
            }
            verificador = verificador.siguiente;
        }
        if (conteo > 1) {
            // Eliminar todos los nodos con este valor
            Nodo extra = new Nodo(0);
            extra.siguiente = head;
            Nodo anterior = extra;
            Nodo temp = head;
            while (temp != null) {
                if (temp.valor == actual.valor) {
                    anterior.siguiente = temp.siguiente;
                } else {
                    anterior = temp;
                }
                temp = temp.siguiente;
            }
            head = extra.siguiente;
            actual = head; // Reiniciar búsqueda
        } else {
            actual = actual.siguiente;
        }
    }
};
}
