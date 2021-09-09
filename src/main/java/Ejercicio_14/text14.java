package Ejercicio_14;

import java.util.Scanner;

public class text14 {

    public static void main(String[] args) {
        int numero = 0;
        Scanner dato = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        numero = dato.nextInt();
        ImprimirNumeros imprimirnumero = new ImprimirNumeros(numero);
        imprimirnumero.imprimir();
        dato.close();
    }
}
