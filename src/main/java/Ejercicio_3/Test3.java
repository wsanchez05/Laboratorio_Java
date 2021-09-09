package Ejercicio_3;

import java.util.Scanner;

public class Test3 {

    public static void main(String[] args) {

        double radio;
        double area;
        Scanner numero = new Scanner(System.in);
        AreaCirculo areacirculo  = new AreaCirculo();
        System.out.println("Ingrese el radio del Circulo");
        radio = numero.nextInt();
        areacirculo. area_circulo(radio);


    }
}
