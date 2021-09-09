package Ejercicio_10;

public class BorrarEspacios {

    private String frase = "";

    public BorrarEspacios(String frase)
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
    public void borrarEspacio()
    {
        System.out.println(this.frase.replace(" ",""));
    }
}
