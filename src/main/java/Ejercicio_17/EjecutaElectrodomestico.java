package Ejercicio_17;

import java.util.ArrayList;

public class EjecutaElectrodomestico {

    ArrayList<Electrodomesticos> electrodomesticos;

    public EjecutaElectrodomestico(){

        electrodomesticos = new ArrayList<>();
    }

    public void ArregloElectrodomestico(){

        Electrodomesticos electrodomestico_1 = new Electrodomesticos();
        Electrodomesticos electrodomestico_2 = new Electrodomesticos(150, 15);
        Electrodomesticos electrodomestico_3 = new Electrodomesticos(120, 25, Electrodomesticos.negro, Electrodomesticos.B);
        Lavadora lavadora_1 = new Lavadora();
        Lavadora lavadora_2 = new Lavadora(180, 9);
        Lavadora lavadora_3 = new Lavadora(87);
        Tv tv_1 = new Tv();
        Tv tv_2 = new Tv(83, 17);
        Tv tv_3 = new Tv(27, true);
        Tv tv_4 = new Tv(97, true);

        electrodomesticos.add(electrodomestico_1);
        electrodomesticos.add(electrodomestico_2);
        electrodomesticos.add(electrodomestico_3);
        electrodomesticos.add(lavadora_1);
        electrodomesticos.add(lavadora_2);
        electrodomesticos.add(lavadora_3);
        electrodomesticos.add(tv_1);
        electrodomesticos.add(tv_2);
        electrodomesticos.add(tv_3);
        electrodomesticos.add(tv_4);

    }

    public void PrecioElectrodomesticos(){

        float Electrodomesticos = 0;
        float precioLavadoras = 0;
        float precioTvs = 0;

        for(int i = electrodomesticos.size() -1; i >= 0; i--){
            if(electrodomesticos.get(i) instanceof Tv){
                System.out.println("Precio del tv en la posicion "+ i +": " + electrodomesticos.get(i).precioFinal());
                precioTvs += electrodomesticos.get(i).precioFinal();
            }else if (electrodomesticos.get(i) instanceof Lavadora){
                System.out.println("Precio de la lavadora en la posicion" + i + ": " + electrodomesticos.get(i).precioFinal());
                precioLavadoras += electrodomesticos.get(i).precioFinal();
            }else{
                System.out.println("Precio del electrodomestico en la posicion" +i+": " + electrodomesticos.get(i).precioFinal());
                Electrodomesticos += electrodomesticos.get(i).precioFinal();
            }

        }

        System.out.println("Precio tvs: " + precioTvs);
        System.out.println("Precio lavadoras: " + precioLavadoras);
        System.out.println("Precio electrodomesticos: " + (precioTvs + precioLavadoras + Electrodomesticos));
    }
}
