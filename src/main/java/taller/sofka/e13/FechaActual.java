package taller.sofka.e13;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FechaActual {

    LocalDateTime fechaActual;

    //Constructor

    public FechaActual() {

        fechaActual = LocalDateTime.now();

    }

    //Metodos

    public void fechaConFormato(){

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println("Fecha y hora actual: " + dtf.format(fechaActual));

    }



}




