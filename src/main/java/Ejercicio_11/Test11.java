package Ejercicio_11;

import Ejercicio_10.BorrarEspacios;

import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {

        String frase;
        Scanner palabra = new Scanner(System.in);

        System.out.println("ingrese frase");
        frase = palabra.nextLine();
        IndicarLongitud cantidad = new IndicarLongitud(frase);
        System.out.println("La longitud de la frase ingresada es: " + cantidad.indicarLongitud());
        System.out.println("La cantidad de vocales es: " + cantidad.contarVocales());

        palabra.close();
    }
}
