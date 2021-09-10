package Ejercicio_18;

import javax.swing.*;

public class Pelicula {
    private static void completingSeries(Serie[] series){
        series[0] = new Serie("Sin senos si hay paraiso", 4, "violencia", "NA");
        series[1] = new Serie("La casa de papel", 5, "Drama", "Alex pinal");
        series[2] = new Serie("Prision Break", 6, "Acción", "Paul Scheuring");
        series[3] = new Serie("vis a vis", 4, "drama","Alex pina");
        series[4] = new Serie("Elite", 4, "Drama", "Lucas Vidal");
    }
    private static void completingGames(Videojuegos[] videojuegos){
        videojuegos[0] = new Videojuegos("fifa2021", 39, "deporte", "NA");
        videojuegos[1] = new Videojuegos("Age Of Empires II: DEdreamleagueSoccer", 40, "deporte", "NA");
        videojuegos[2] = new Videojuegos("Mortal Combat", 14, "Estrategia", "NA");
        videojuegos[3] = new Videojuegos("Nascar", 70, "deporte", "NA");
        videojuegos[4] = new Videojuegos("Call of Dutty",50,"Estrategia", "NA");
    }

    private static void deliverSeries(Serie[] series){
        series[0].entregar();
        series[3].entregar();
        series[4].entregar();
    }

    private static void deliverJuegos(Videojuegos[] Videojuegos){
        Videojuegos[1].entregar();
        Videojuegos[4].entregar();
    }

    private static void countSeriesDelivered(Serie[] series){
        int numberSeries = 0;
        for(Serie serie : series){
            if(serie.isEntregado()){
                numberSeries++;
                serie.devolver();
            }
        }
        System.out.println("Hay " + numberSeries + " series entregadas");
    }

    private static void countSeriesDelivered(Videojuegos[] videojuegos){
        int numberGames = 0;

        for(Videojuegos game : videojuegos){
            if(game.isEntregado()){
                numberGames++;
                game.devolver();
            }
        }
        System.out.println("Hay " + numberGames + " videojuegos entregados");    }

    private static void seriesAndSeason(Serie[] series){
        Serie seriesAndSeason = new Serie("temporal", 0, "temporal", "temporal");

        for(int i = 0; i < series.length; i++){
            if(series[i].compareTo(seriesAndSeason)){
                seriesAndSeason = series[i];
            }
        }
        System.out.println("La serie con mas horas estimadas es: ");
        System.out.println(seriesAndSeason);
    }

    private static void hoursGame(Videojuegos[] videojuegos){
        Videojuegos hoursGame = new Videojuegos("Temporal", 0);

        for(Videojuegos juego : videojuegos){
            if(juego.compareTo(hoursGame)){
                hoursGame = juego;
            }
        }
        System.out.println("El video juego con mas horas estimadas es: "+ hoursGame);
    }

    public static void main(String[] args) {

        Serie[] series = new Serie[5];
        Videojuegos[] videojuegos = new Videojuegos[5];

        completingSeries(series);
        completingGames(videojuegos);

        deliverSeries(series);
        deliverJuegos(videojuegos);


        countSeriesDelivered(series);
        countSeriesDelivered(videojuegos);
        seriesAndSeason(series);
        hoursGame(videojuegos);
    }
}
