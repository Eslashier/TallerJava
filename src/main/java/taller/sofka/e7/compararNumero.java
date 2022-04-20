package taller.sofka.e7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class compararNumero {

    double numero;
    InputStreamReader in = new InputStreamReader(System.in);
    BufferedReader buffer = new BufferedReader(in);

    //Constructor

    public compararNumero(){
    }

    //Metodos

    public String compararNumero(){

        boolean continuar = false;

        do{
            try{
                continuar = false;
                System.out.println("Ingrese un numero para comparar: ");
                numero = Double.parseDouble(buffer.readLine());
            }catch(Exception e){
                System.out.println("Debes ingresar un numero");
                continuar = true;
            }
            if(numero < 0){
                continuar = true;
            }

        }while(continuar);

        String respuesta = "Ha salido del programa";
        return respuesta;

    }

}


