package Ejercicio_15;

import java.util.Scanner;

public class MostrarMenu {

    private int opcion;
    private boolean salir;


    public MostrarMenu() {
        this.opcion = opcion;
        this.salir = true;
    }

    public int getOpcion() {
        return opcion;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }

    public void opcionesmenu()
        {
            Scanner numero = new Scanner(System.in);
            int entrada;
            do {
                System.out.println("****** GESTION CINEMATOGRÁFICA ********");
                System.out.println("1-NUEVO ACTOR");
                System.out.println("2-BUSCAR ACTOR");
                System.out.println("3-ELIMINAR ACTOR");
                System.out.println("4-MODIFICAR ACTOR");
                System.out.println("5-VER TODOS LOS ACTORES");
                System.out.println("6-VER PELICULAS DE LOS ACTORES");
                System.out.println("7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES");
                System.out.println("8-SALIR");
                System.out.println("ESCOGE UNA OPCION");
                entrada = numero.nextInt();


                switch (entrada)
                {
                    case 8:
                        System.out.println("hASTA LA PROXIMA");
                        break;
                    default :
                        System.out.println("_____OPCION INCORRECTA_____");
                        break;
                }

            }while (entrada !=8);

            numero.close();
        }

}
