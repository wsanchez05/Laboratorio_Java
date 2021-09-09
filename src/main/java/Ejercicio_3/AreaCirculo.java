package Ejercicio_3;

public class AreaCirculo {

    public static void area_circulo(double radio)
    {
        double area;

        if (radio >=0)
        {
            area =  Math.pow(radio, 2) * Math.PI;
            System.out.println("El area del circulo con radio "+ radio + " es: "+ area);
        }
        else
        {
            System.out.println("El circulo con radio "+ radio + " no existe ");
        }
    }


}
