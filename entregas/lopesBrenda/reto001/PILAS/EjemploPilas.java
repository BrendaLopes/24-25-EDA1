package PILAS;

public class EjemploPilas {
    public static void main(String[] args) {
        Pila pila = new Pila();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.imprimirPila(); 
        System.out.println(pila.pop());  
        System.out.println(pila.peek()); 
        pila.imprimirPila(); 
    }
}