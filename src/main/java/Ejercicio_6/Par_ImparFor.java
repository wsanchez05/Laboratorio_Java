package Ejercicio_6;

public class Par_ImparFor {
    protected int contador;

    public Par_ImparFor(){
        this.contador = 1;
    }

    public void parimpar() {
        System.out.println("Números Pares");
            for (int i= 0; i<= 100; i++)
            {
                if((this.contador % 2) == 0) System.out.print(this.contador+" ");
                this.contador += 1;

            }
                       System.out.println();
                this.contador = 1;
                System.out.println("Números Impares");
            for (int i= 0; i<= 100; i++)
            {
                if((this.contador % 2) != 0) System.out.print(this.contador+" ");
                this.contador += 1;

            }
        }
}

