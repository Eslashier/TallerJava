package taller.sofka.e16;

import taller.sofka.e16.DNI.generaDNI;

public class Persona {

    private String nombre;
    private int edad;
    private String dni;
    char genero;
    final String M = "M";
    final String H = "H";
    private double  peso;
    private double altura;
    //Constructor

    public Persona(){
        nombre = "";
        edad = 0;
        generaDNI dnigenerado = new generaDNI();
        dni = dnigenerado.generarDNI();
        genero = H.charAt(0);;
        peso = 0;
        altura = 0;
    }

    public Persona(String nombre, int edad, String genero){
        this.nombre = nombre;
        this.edad = edad;
        generaDNI dnigenerado = new generaDNI();
        dni = dnigenerado.generarDNI();
        this.genero = genero.charAt(0);
        comprobarGenero();
        peso = 0;
        altura = 0;
    }

    public Persona(String nombre, int edad, String genero, double peso, double altura){
        this.nombre = nombre;
        this.edad = edad;
        generaDNI dnigenerado = new generaDNI();
        dni = dnigenerado.generarDNI();
        this.genero = genero.charAt(0);
        comprobarGenero();
        this.peso = peso;
        this.altura = altura;
    }

    public String calcularIMC(){
        double imc = peso/Math.pow(altura,2);
        if(20>imc && imc>0){
            int resultado = -1;
            return "Su peso esta debajo del ideal";
        }else if (25>=imc && imc>=20){
            int resultado = 0;
            return "Su peso es ideal";
        }else if (imc>25) {
            int resultado = 1;
            return "Su peso esta por encima del ideal, sobrepeso";
        }
        return "Error, por favor ingrese peso en kilogramos y altura en metros";
    }


    public boolean esMayorDeEdad(){

        if (edad>17){
            return true;
        }
        return false;

    }

    public void comprobarGenero(){

        if (genero == M.charAt(0) || genero == H.charAt(0)){
            return;
        }
        genero = H.charAt(0);
    }

    public String toString(){
        String string;

        string = "Nombre: "+nombre+"\nEdad: "+edad+"\n DNI:"+dni+"\n Genero:"+genero+"\nPeso: "+peso+" kilogramos"+"\nAltura: "+altura+" metros" ;

        return string;
    }



    public void asignarNombre(String nombre) {
        this.nombre = nombre;
    }

    public void asignarEdad(int edad) {
        this.edad = edad;
    }

    public void asignarGenero(String genero){
        this.genero = genero.charAt(0);
    }

    public void asignarPeso(double peso) {
        this.peso = peso;
    }

    public void asignarAltura(double altura) {
        this.altura = altura;
    }

}


