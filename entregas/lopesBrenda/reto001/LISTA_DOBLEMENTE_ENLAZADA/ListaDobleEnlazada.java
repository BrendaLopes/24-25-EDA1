package LISTA_DOBLEMENTE_ENLAZADA;

class ListaDobleEnlazada {
    private NodoDoble cabeza;

    public ListaDobleEnlazada() {
        this.cabeza = null;
    }

    public void insertarAlPrincipio(int dato) {
        NodoDoble nuevoNodo = new NodoDoble(dato);
        if (cabeza != null) {
            cabeza.anterior = nuevoNodo;
        }
        nuevoNodo.siguiente = cabeza;
        cabeza = nuevoNodo;
    }

    public void insertarAlFinal(int dato) {
        NodoDoble nuevoNodo = new NodoDoble(dato);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            return;
        }
        NodoDoble actual = cabeza;
        while (actual.siguiente != null) {
            actual = actual.siguiente;
        }
        actual.siguiente = nuevoNodo;
        nuevoNodo.anterior = actual;
    }

    public void eliminarAlPrincipio() {
        if (cabeza != null) {
            cabeza = cabeza.siguiente;
            if (cabeza != null) {
                cabeza.anterior = null;
            }
        }
    }

    public void eliminarAlFinal() {
        if (cabeza == null) {
            return;
        }
        if (cabeza.siguiente == null) {
            cabeza = null;
            return;
        }
        NodoDoble actual = cabeza;
        while (actual.siguiente != null) {
            actual = actual.siguiente;
        }
        actual.anterior.siguiente = null;
    }

    public void imprimirDesdeElPrincipio() {
        NodoDoble actual = cabeza;
        System.out.print("Inicio -> ");
        while (actual != null) {
            System.out.print(actual.dato + " -> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }

    public void imprimirDesdeElFinal() {
        if (cabeza == null) return;

        NodoDoble actual = cabeza;
        while (actual.siguiente != null) {
            actual = actual.siguiente;
        }

        System.out.print("Fin -> ");
        while (actual != null) {
            System.out.print(actual.dato + " -> ");
            actual = actual.anterior;
        }
        System.out.println("Inicio");
    }
}

