package Ejercicio_12;
import java.lang.String;

public class CompararFrases {

    private String frase_1;
    private String frase_2;
    private String diferencia_1;
    private String diferencia_2;
    private int longitud_1;
    private int longitud_2;
    int longitudCadena;

    public CompararFrases(String frase_1, String frase_2) {
        this.frase_1 = frase_1;
        this.frase_2 = frase_2;
        this.diferencia_1 ="";
        this.diferencia_2 ="";
        this.longitud_1 = 0;

        int longitudCadena=0;
    }

    public String getFrase_1()
    {
        return frase_1;
    }

    public void setFrase_1(String frase_1)
    {
        this.frase_1 = frase_1;
    }

    public String getFrase_2()
    {
        return frase_2;
    }

    public void setFrase_2(String frase_2)
    {
        this.frase_2 = frase_2;
    }

    public void comparaFrases()
    {
        this.longitud_1 = frase_1.length();
        this.longitud_2 = frase_2.length();

        if (this.longitud_1>=this.longitud_2)
        {
            this.longitudCadena = this.longitud_2;
        }
        else
        {
            this.longitudCadena = this.longitud_1;
        }
        if (this.frase_1.equals(this.frase_2))
        {
            System.out.println("Las dos frases son iguales");
        }
        else
        {
            for(int i=0; i< this.longitudCadena; i++)
            {
                if((this.frase_1.charAt(i)) !=(this.frase_2.charAt(i)))
                {
                    diferencia_1 = diferencia_1 + this.frase_1.charAt(i);
                }
            };
            for(int i=0; i< this.longitudCadena; i++)
            {
                if((this.frase_2.charAt(i)) !=(this.frase_1.charAt(i)))
                {
                    diferencia_2 = diferencia_2 + this.frase_2.charAt(i);
                }
            };

            // Completar cadena
            if (this.longitud_1>this.longitud_2)
            {
                for(int i=diferencia_1.length(); i< this.frase_1.length(); i++)
                {

                    diferencia_1 = diferencia_1 + this.frase_1.charAt(i);

                };
            }
            if (this.longitud_2>this.longitud_1)
            {
                for(int i=diferencia_2.length(); i< this.frase_2.length(); i++)
                {

                    diferencia_2 = diferencia_2 + this.frase_2.charAt(i);
                };
            }
        }
        System.out.println("diferencia de frase 1: " +diferencia_1);
        System.out.println("diferencia de frase 2: " +diferencia_2);

    }
}
