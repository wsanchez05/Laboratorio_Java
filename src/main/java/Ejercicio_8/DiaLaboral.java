package Ejercicio_8;

public class DiaLaboral {

    private String dia="";

    public DiaLaboral()
    {
        this.dia = dia;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public void CompararDia(String dia){

        switch (dia){

            case  "lunes":
                System.out.println("El dia " + dia +" es laboral");
                break;
            case  "martes":
                System.out.println("El dia " + dia +" es laboral");
                break;
            case  "miercoles":
                System.out.println("El dia " + dia +" es laboral");
                break;
            case  "jueves":
                System.out.println("El dia " + dia +" es laboral");
                break;
            case  "viernes":
                System.out.println("El dia " + dia +" es laboral");
                break;
            case  "sabado":
                System.out.println("El dia " + dia +" no es laboral");
                break;
            case  "domingo":
                System.out.println("El dia " + dia +" no es laboral");
                break;
             default :
                 System.out.println("El dia no se puede definir como laboral");
                 break;
        }





    }
}
