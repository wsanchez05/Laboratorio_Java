package Ejercicio_1;

import java.util.Scanner;

public class main
{

    public static void main(String[] args)
    {
        Scanner numero = new Scanner(System.in);
        Comparador compara = new Comparador();
        int numero_1;
        int numero_2;

        System.out.println("Por favor ingrese el primer numero a comparar");
        numero_1 = numero.nextInt();
        System.out.println("Por favor ingrese el primer numero a comparar");
        numero_2 = numero.nextInt();
        compara.comparar_numero(numero_1,numero_2);


    }

}




class Comparador {

    public static void comparar_numero(int numero_1, int numero_2) {
        if (numero_1 > numero_2) {
            System.out.println("El numero mayor es " + numero_1);
        }
        ;
        if (numero_2 > numero_1) {
            System.out.println("El numero mayor es " + numero_2);
        }
        ;
        if (numero_2 == numero_1) {
            System.out.println("Los numeros son iguales");
        }
        ;

    }
}