package Ejercicio_9;

public class Reemplazar {
    private String frase;
    private String fraseIngresada;

    public Reemplazar(String fraseIngresada) {
        this.frase = "La sonrisa sera la mejor arma contra la tristeza";
        this.fraseIngresada = fraseIngresada;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public String getFraseIngresada() {
        return fraseIngresada;
    }

    public void setFraseIngresada(String fraseIngresada) {
        this.fraseIngresada = fraseIngresada;
    }

    public void reemplazarLetraA(){

        System.out.println(this.frase.replace("a","e")+" "+this.fraseIngresada);
    }
}
