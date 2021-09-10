package Ejercicio_17;

public class Electrodomesticos {

    public static final String blanco = "BLANCO";
    public static final String negro = "NEGRO";
    public static final String rojo = "ROJO";
    public static final String azul = "AZUL";
    public static final String gris = "GRIS";

    public static final char A = 'A';
    public static final char B = 'B';
    public static final char C = 'C';
    public static final char D = 'D';
    public static final char E = 'E';
    public static final char F = 'F';

    public static final int precioPorDefecto = 100;
    public static final float pesoPorDefecto = 5;

    private float precioBase;
    private float peso;
    private String color;
    private char consumoEnergetico;


    public Electrodomesticos(){
        this.precioBase = precioPorDefecto;
        this.peso = pesoPorDefecto;
        this.color = blanco;
        this.consumoEnergetico = F;
    }

    public Electrodomesticos(float precioBase, float peso){
        this.precioBase = precioBase;
        this.peso = peso;
        this.color = blanco;
        this.consumoEnergetico = F;
    }

    public Electrodomesticos(float precioBase, float peso, String color, char consumoEnergetico){
        this.precioBase = precioBase;
        this.peso = peso;
        this.color = comprobarColor(color);
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
    }
    public float getPrecioBase() {
        return precioBase;
    }

    public float getPeso() {
        return peso;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }
    private char comprobarConsumoEnergetico(char consumoEnergetico){
        if(consumoEnergetico != A && consumoEnergetico != B && consumoEnergetico != C
                && consumoEnergetico != D && consumoEnergetico != E && consumoEnergetico != F)
            return F;
        else
            return consumoEnergetico;
    }

    private String comprobarColor(String color){
        if(color != blanco && color != negro && color != rojo
                && color != azul && color != gris)
            return blanco;
        else
            return color;
    }

    public float precioFinal(){
        float precioFinal = precioBase;

        switch (this.consumoEnergetico){
            case A:
                precioFinal += 100;
                break;
            case B:
                precioFinal += 80;
                break;
            case C:
                precioFinal += 60;
                break;
            case D:
                precioFinal += 50;
                break;
            case E:
                precioFinal += 30;
                break;
            case F:
                precioFinal += 10;
                break;
        }

        if(this.peso >= 0 && this.peso <= 19)
            precioFinal += 10;
        else if(this.peso >= 20 && this.peso <= 49)
            precioFinal += 50;
        else if(this.peso >= 50 && this.peso <= 79)
            precioFinal += 80;
        else if(this.peso > 80)
            precioFinal += 100;

        return precioFinal;
    }



}
