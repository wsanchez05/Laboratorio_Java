package Ejercicio_11;

public class IndicarLongitud {

    private String frase = "";
    private int cantidad;
    private int contador = 0;

    public IndicarLongitud(String frase)
    {
        this.frase = frase;
    }
    public String getFrase()
    {
        return frase;
    }
    public void setFrase(String frase)
    {
        this.frase = frase;
    }

    public int indicarLongitud()
    {
        cantidad = frase.length();
        return cantidad;
    }

    public int contarVocales()
    {
        for(int i=0; i< this.frase.length(); i++)
        {
            if((this.frase.charAt(i) =='a') || (this.frase.charAt(i) =='e') || (this.frase.charAt(i) =='i') || (this.frase.charAt(i) =='o')
                                        || (this.frase.charAt(i) =='u'))
            {
                contador ++;
            }
        };
        return contador;

    }

}
