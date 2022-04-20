package taller.sofka.e3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import static java.lang.Math.pow;

public class Circulo {

    double radio;
    double pi_const= Math.PI;
    double area;
    InputStreamReader in = new InputStreamReader(System.in);
    BufferedReader buffer = new BufferedReader(in);

    //Constructor

    public Circulo(){
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    //Metodos

    public void areaCirculo(){
        boolean continuar = false;

        do{
            try{
                continuar = false;
                System.out.println("Ingrese el radio del circulo para calcular su area: ");
                radio = Double.parseDouble(buffer.readLine());
            }catch(Exception e){
                System.out.println("Debes ingresar un numero");
                continuar = true;
            }
        }while(continuar);

        area = pi_const*pow(radio,2);

    }


    public void areaCirculo(double radio){

        area = pi_const*pow(radio,2);

    }

    public double radio() {
        return radio;
    }

    public double area() {
        return area;
    }

    public String areaDosDecimales() {
        return String.format("%.2f", area);
    }

    public void asignarRadio(double radio) {
        this.radio = radio;
    }


}


