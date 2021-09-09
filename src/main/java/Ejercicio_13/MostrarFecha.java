package Ejercicio_13;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MostrarFecha {

    public void fecha(){

        DateTimeFormatter dtf5 = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm");
        System.out.println(dtf5.format(LocalDateTime.now()));
    }

}
