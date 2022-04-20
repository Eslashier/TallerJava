package taller.sofka.e2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Comparar {

    double comparado;
    double comparador;
    double mayor;
    double menor;
    InputStreamReader in = new InputStreamReader(System.in);
    BufferedReader buffer = new BufferedReader(in);

    //Constructor

    public Comparar(){
    }

    public Comparar(double comparado, double comparador) {
        this.comparado = comparado;
        this.comparador = comparador;

    }

    //Metodos

    public void mayorQue(double comparado, double comparador){

        if(comparado>comparador){
            System.out.println("El numero mayor es "+comparado);
            mayor = comparado;
            menor = comparador;
            return;
        }
        else if (comparado<comparador){
            System.out.println("El numero mayor es "+comparador);
            mayor = comparador;
            menor = comparado;
            return;
        }

        System.out.println("Los numeros son iguales");

    }

    public void mayorQue(){

        if(comparado>comparador){
            System.out.println("El numero mayor es "+comparado);
            mayor = comparado;
            menor = comparador;
            return;
        }
        else if (comparado<comparador){
            System.out.println("El numero mayor es "+comparador);
            mayor = comparador;
            menor = comparado;
            return;
        }

        System.out.println("Los numeros son iguales");

    }

    public void numeros() {

        boolean continuar = false;

        do{
            try{
                continuar = false;
                System.out.println("Ingrese el primer numero: ");
                comparado = Double.parseDouble(buffer.readLine());
            }catch(Exception e){
                System.out.println("Debes ingresar un numero");
                continuar = true;
            }
        }while(continuar);

        do{
            try{
                continuar = false;
                System.out.println("Ingrese el primer numero: ");
                comparador = Double.parseDouble(buffer.readLine());
            }catch(Exception e){
                System.out.println("Debes ingresar un numero");
                continuar = true;
            }
        }while(continuar);

    }

    public void numeroComparado(double comparado) {
        this.comparado = comparado;
    }

    public void numeroComparador(double comparador) {
        this.comparador = comparador;
    }

    public double numeroMayor() {
        return mayor;
    }

    public double numeroMenor() {
        return menor;
    }

}


