package LISTA_DOBLEMENTE_ENLAZADA;

public class EjemploListaDobleEnlazada {
    public static void main(String[] args) {
        ListaDobleEnlazada lista = new ListaDobleEnlazada();

        lista.insertarAlPrincipio(3);
        lista.insertarAlPrincipio(2);
        lista.insertarAlPrincipio(1);

        System.out.println("Lista desde el principio:");
        lista.imprimirDesdeElPrincipio();

        lista.insertarAlFinal(4);
        lista.insertarAlFinal(5);

        System.out.println("Lista después de insertar al final:");
        lista.imprimirDesdeElPrincipio();

        lista.eliminarAlPrincipio();
        System.out.println("Lista después de eliminar al principio:");
        lista.imprimirDesdeElPrincipio();

        lista.eliminarAlFinal();
        System.out.println("Lista después de eliminar al final:");
        lista.imprimirDesdeElPrincipio();

        System.out.println("Lista desde el final:");
        lista.imprimirDesdeElFinal();
    }
}

