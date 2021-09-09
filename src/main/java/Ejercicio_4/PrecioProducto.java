package Ejercicio_4;

public class PrecioProducto {


    public void precioProducto(float precio)
    {
        double masIva = 0;
        masIva = (float) (precio * 1.21);

        System.out.println("EL precio de producto con el iva es de: "+masIva);
    }
}
