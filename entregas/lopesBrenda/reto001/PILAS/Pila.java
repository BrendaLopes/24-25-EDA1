package PILAS;

public class Pila {
    private Nodo tope;

    public Pila() {
        this.tope = null;
    }

    public void push(int valor) {
        Nodo nuevoNodo = new Nodo(valor);
        nuevoNodo.siguiente = tope;
        tope = nuevoNodo;
    }

    public int pop() {
        if (estaVacia()) {
            System.out.println("La pila está vacía");
            return -1; 
        }
        int valor = tope.dato;
        tope = tope.siguiente;
        return valor;
    }

    public int peek() {
        if (estaVacia()) {
            System.out.println("La pila está vacía");
            return -1; 
        }
        return tope.dato;
    }

    public boolean estaVacia() {
        return tope == null;
    }

    public void imprimirPila() {
        Nodo actual = tope;
        System.out.print("Tope -> ");
        while (actual != null) {
            System.out.print(actual.dato + " -> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }
}
