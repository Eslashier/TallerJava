package taller.sofka.e9;


public class CambiarLetraFrase{

    String frase;
    String nuevaFrase;

    //Constructor

    public CambiarLetraFrase() {

        frase = "La sonrisa sera la mejor arma contra la tristeza";

    }

    public CambiarLetraFrase(String frase) {

        this.frase = frase;

    }


    //Metodos

    public String cambiarLetra(){

        nuevaFrase = frase.replace("a","e");

        return nuevaFrase;

    }

    public String cambiarLetra(String frase){

        nuevaFrase = frase.replace("a","e");

        return nuevaFrase;

    }

}




