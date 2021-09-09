package Ejercicio_4;

import java.util.Scanner;

public class Text4 {


    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        PrecioProducto precio = new PrecioProducto();
        float valor =0;

        System.out.println("Por favor digite el precio del producto sin iva");
        valor = numero.nextFloat();

        precio.precioProducto(valor);
    }
}
