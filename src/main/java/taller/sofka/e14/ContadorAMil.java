package taller.sofka.e14;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ContadorAMil {

    int contador;
    int valorMax;
    InputStreamReader in = new InputStreamReader(System.in);
    BufferedReader buffer = new BufferedReader(in);

    //Constructor

    public ContadorAMil(){
        valorMax = 1000;
    }

    public ContadorAMil(int valorMax){
        this.valorMax=valorMax;
    }

    //Metodos

    public void contar() {

        boolean continuar = false;

        do{
            try{
                continuar = false;
                System.out.println("Ingrese un numero inicial desde el que se va a contar hasta 1000: ");
                contador = Integer.parseInt(buffer.readLine());
            }catch(Exception e){
                System.out.println("Debes ingresar un numero");
                continuar = true;
            }
            if( contador < 1000){
                continuar = false;
            }

        }while(continuar);


        while(contador<valorMax){
            System.out.println(contador);
            contador+=2;
        }
        System.out.println(valorMax);
    }

    public int valorMaximo() {
        return valorMax;
    }

    public void establecerValorMax(int valorMax) {
        this.valorMax = valorMax;
    }

    public int valorInicial() {
        return contador;
    }

    public void establecerValorInicial(int valorInicial) {
        contador = valorInicial;
    }



}


