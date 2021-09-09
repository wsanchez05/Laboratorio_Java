package Ejercicio_12;

import java.util.Scanner;

public class Test12 {

    public static void main(String[] args) {

        Scanner frase = new Scanner(System.in);
        String frase_1 = "";
        String frase_2 = "";


        System.out.println("ingrese frase 1");
        frase_1 = frase.nextLine();
        System.out.println("ingrese frase 2");
        frase_2 = frase.nextLine();
        CompararFrases entrada = new CompararFrases(frase_1,frase_2);
        entrada.comparaFrases();


    }
}
