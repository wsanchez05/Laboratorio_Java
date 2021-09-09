package Ejercicio_5;

public class ParesImpares {

    protected int contador;

    public ParesImpares(){
        this.contador = 1;
    }

    public void parimpar() {
        while(true){
            System.out.println("Números Pares");
            while (this.contador <= 100){
                if((this.contador % 2) == 0) System.out.print(this.contador+" ");
                this.contador += 1;
            }
            System.out.println();
            this.contador = 1;
            System.out.println("Números Impares");
            while (contador <= 100){
                if((this.contador % 2) != 0) System.out.print(this.contador+" ");
                this.contador += 1;
            }
            break;
        }
    }
}


