package LISTA_CIRCULAR;

class ListaCircular {
    private NodoCircular cabeza;

    public ListaCircular() {
        this.cabeza = null;
    }

    // Inserta un nuevo nodo al final de la lista
    public void insertarAlFinal(int dato) {
        NodoCircular nuevoNodo = new NodoCircular(dato);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            cabeza.siguiente = cabeza; // Apunta al mismo nodo para cerrar el ciclo
        } else {
            NodoCircular actual = cabeza;
            while (actual.siguiente != cabeza) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoNodo;
            nuevoNodo.siguiente = cabeza;
        }
    }

    // Elimina el primer nodo de la lista
    public void eliminarAlPrincipio() {
        if (cabeza == null) {
            System.out.println("La lista está vacía");
            return;
        }

        if (cabeza.siguiente == cabeza) { // Si hay un solo nodo
            cabeza = null;
        } else {
            NodoCircular actual = cabeza;
            while (actual.siguiente != cabeza) {
                actual = actual.siguiente;
            }
            actual.siguiente = cabeza.siguiente;
            cabeza = cabeza.siguiente;
        }
    }

    // Imprime la lista desde el primer nodo hasta volver al inicio
    public void imprimirLista() {
        if (cabeza == null) {
            System.out.println("La lista está vacía");
            return;
        }
        NodoCircular actual = cabeza;
        do {
            System.out.print(actual.dato + " -> ");
            actual = actual.siguiente;
        } while (actual != cabeza);
        System.out.println("(cabeza)");
    }
}

