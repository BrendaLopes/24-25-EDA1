package LISTA_CIRCULAR;

public class EjemploListaCircular {
    public static void main(String[] args) {
        ListaCircular lista = new ListaCircular();

        // Insertamos elementos en la lista circular
        lista.insertarAlFinal(1);
        lista.insertarAlFinal(2);
        lista.insertarAlFinal(3);
        lista.insertarAlFinal(4);

        System.out.println("Lista circular después de inserciones:");
        lista.imprimirLista();

        // Eliminamos el primer elemento
        lista.eliminarAlPrincipio();
        System.out.println("Lista circular después de eliminar al principio:");
        lista.imprimirLista();

        // Insertamos otro elemento
        lista.insertarAlFinal(5);
        System.out.println("Lista circular después de insertar al final:");
        lista.imprimirLista();
    }
}

