package COLAS;

public class EjemploCola {
    public static void main(String[] args) {
        Cola cola = new Cola();
        cola.enqueue(1);
        cola.enqueue(2);
        cola.enqueue(3);
        cola.imprimirCola();
        System.out.println(cola.dequeue());
        System.out.println(cola.peek()); 
        cola.imprimirCola(); 
    }
}
