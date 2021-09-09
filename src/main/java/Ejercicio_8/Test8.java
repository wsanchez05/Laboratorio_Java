package Ejercicio_8;

import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        DiaLaboral dialaboral = new DiaLaboral();
        String dia = "";
        System.out.println("Ingrese por favor un dia de la semana");
        dia = dato.nextLine();
        dialaboral.CompararDia(dia);
        System.out.println(dia);

        dato.close();
    }

}
