package taller.sofka.e8;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class diaDelaSemana {

    int dia = 0;
    String resultado;
    InputStreamReader in = new InputStreamReader(System.in);
    BufferedReader buffer = new BufferedReader(in);

    //Constructor

    public diaDelaSemana() {
        boolean continuar = false;

        do{
            try{
                System.out.println("Ingrese un dia de la semana entre 1 y 7 ");
                dia = Integer.parseInt(buffer.readLine());
                continuar = false;
            }catch(Exception e){
                System.out.println("Debes ingresar un numero entre 1 y 7");
                continuar = true;
            }
            if(dia < 1 || dia >7){
                continuar = true;
            }

        }while(continuar);
    }



    //Metodos

    public String diaLaboral(){

            switch (dia) {
                case 1:
                    resultado = "El lunes es un dia laboral";
                    break;
                case 2:
                    resultado = "El martes es un dia laboral";
                    break;
                case 3:
                    resultado = "El miercoles es un dia laboral";
                    break;
                case 4:
                    resultado = "El jueves es un dia laboral";
                    break;
                case 5:
                    resultado = "El viernes es un dia laboral";
                    break;
                default:
                    resultado = "No es un dia laboral";
            }
            return resultado;

    }

}




