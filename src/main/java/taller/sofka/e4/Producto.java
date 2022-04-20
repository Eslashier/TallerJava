package taller.sofka.e4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import static java.lang.Math.pow;

public class Producto {

    double precio;
    double iva_const = 0.21;
    double impuesto;
    InputStreamReader in = new InputStreamReader(System.in);
    BufferedReader buffer = new BufferedReader(in);

    //Constructor

    public Producto(){
    }

    public Producto(double precio) {

        this.precio = precio;
    }

    //Metodos

    public void calcularIva(){
        boolean continuar = false;

        do{
            try{
                continuar = false;
                System.out.println("Ingrese el valor del producto al que desea calcular el iva: ");
                precio = Double.parseDouble(buffer.readLine());
            }catch(Exception e){
                System.out.println("Debes ingresar un numero");
                continuar = true;
            }
        }while(continuar);

        impuesto = precio*iva_const;

    }

    public void calcularIva(double precio){

        impuesto = precio*iva_const;

    }

    public double precioProducto() {
        return precio;
    }

    public double iva() {
        return iva_const;
    }

    public String impuestoDosDecimales() {

        return String.format("%.2f", impuesto);
    }

    public double impuesto() {

        return impuesto;
    }

    public void asignarprecioProducto(double precio) {
        this.precio = precio;
    }


}


