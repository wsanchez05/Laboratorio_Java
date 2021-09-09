package Ejercicio_14;

public class ImprimirNumeros {

     int numero;
     int inicial;

    public ImprimirNumeros(int numero)
    {
        this.numero = numero;
        this.inicial = 0;
    }

    public int getNumero()
    {
        return numero;
    }

    public void setNumero(int numero)
    {
        this.numero = numero;
    }

    public void imprimir()
    {
        this.inicial = this.numero;
        for (int i = this.inicial; i< 1000; i++)
        {
            System.out.print(" "+ this.numero +"");
            this.numero+=2;
            if(this.numero >1000)
            {
                break;
            }
        }

    }
}
