package Ejercicio_9;

import java.util.Scanner;
import java.util.logging.Logger;

public class Test9 {

    public static void main(String[] args) {

        String fraseConcatena;
        Scanner palabra = new Scanner(System.in);

        System.out.println("ingrese frase a concatenar");
        fraseConcatena = palabra.nextLine();
        Reemplazar remplazo = new Reemplazar(fraseConcatena);
        remplazo.reemplazarLetraA();

        palabra.close();
    }
}
