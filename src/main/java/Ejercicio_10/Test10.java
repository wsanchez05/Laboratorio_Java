package Ejercicio_10;

import Ejercicio_9.Reemplazar;

import java.util.Scanner;

public class Test10 {

    public static void main(String[] args) {

        String frase;
        Scanner palabra = new Scanner(System.in);

        System.out.println("ingrese frase");
        frase = palabra.nextLine();
        BorrarEspacios remplazo = new BorrarEspacios(frase);
        System.out.println("La frase ingresada sin los espacios es: ");
        remplazo.borrarEspacio();

        palabra.close();
    }
}
