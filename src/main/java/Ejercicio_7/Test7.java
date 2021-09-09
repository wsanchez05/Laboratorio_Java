package Ejercicio_7;

import java.util.Scanner;

public class Test7 {

    public static void main(String[] args) {

        double numero;
        ComparadorCero comparacero = new ComparadorCero();
        Scanner dato = new Scanner(System.in);
        do {
            System.out.println("Ingrese un nunero mayor a cero");
            numero = Double.parseDouble(dato.nextLine());


        }while (numero < 0);
        comparacero.comparar_numero(numero);
    }


}

