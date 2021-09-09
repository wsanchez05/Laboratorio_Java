package Ejercicio_2;


import Ejercicio_1.Comparador;

import java.util.Scanner;

public class Test2 extends Comparador {

    public static void main(String[] args) {


        Scanner numero = new Scanner(System.in);
        int numero_1;
        int numero_2;

        System.out.println("Ingrese el primer numero ");
        numero_1 = numero.nextInt();
        System.out.println("Ingrese el segundo numero ");
        numero_2 = numero.nextInt();

        comparar_numero(numero_1,numero_2);

    }
}
