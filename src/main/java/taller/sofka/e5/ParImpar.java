package taller.sofka.e5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ParImpar {

    int contador = 1;

    int valorMax;

    //Constructor

    public ParImpar(){
        valorMax = 100;
    }

    public ParImpar(int valorMax){
        this.valorMax=valorMax;
    }

    //Metodos

    public void numerosParesImpares() {

        while(contador<valorMax){
            if(contador%2 == 1){
                System.out.println("El numero "+ contador + " es impar");
                contador++;
            }
            System.out.println("El numero "+ contador + " es par");
            contador++;
        }
    }

    public int ValorMaximo() {
        return valorMax;
    }

    public void establecerValorMax(int valorMax) {
        this.valorMax = valorMax;
    }



}


