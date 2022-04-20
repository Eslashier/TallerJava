package taller.sofka.e15;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Menu {

    String display_menu="****** GESTION CINEMATOGRÁFICA ********\n" +
            "1-NUEVO ACTOR\n" +
            "2-BUSCAR ACTOR\n" +
            "3-ELIMINAR ACTOR\n" +
            "4-MODIFICAR ACTOR\n" +
            "5-VER TODOS LOS ACTORES\n" +
            "6- VER PELICULAS DE LOS ACTORES\n" +
            "7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n" +
            "8-SALIR\n";
    int opcion;
    InputStreamReader in = new InputStreamReader(System.in);
    BufferedReader buffer = new BufferedReader(in);

    //Constructor

    public Menu(){

    }

    //Metodos

    public void opcionMenu() {

        boolean continuar = false;

        do{
            try{
                continuar = false;
                System.out.println(display_menu);
                System.out.println("Ingrese un numero del menu ");
                opcion = Integer.parseInt(buffer.readLine());
            }catch(Exception e){
                continuar = true;
            }

            if( opcion < 1 || opcion > 8 ){
                System.out.println("OPCION INCORRECTA");
                continuar = true;
            }

        }while(continuar);

        if( opcion == 8){
            System.out.println("Programa terminado");
            System.exit(0);
        }

        opcionMenu();

    }
}


