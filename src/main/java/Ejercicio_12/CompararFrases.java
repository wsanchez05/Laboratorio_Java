package Ejercicio_12;
import java.lang.String;

public class CompararFrases {

    private String frase_1;
    private String frase_2;

    public CompararFrases(String frase_1, String frase_2) {
        this.frase_1 = frase_1;
        this.frase_2 = frase_2;
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
        if (this.frase_1.equals(this.frase_2))
        {
            System.out.println("Las dos frases son iguales");
        }
        else
        {

        }
    }
}
