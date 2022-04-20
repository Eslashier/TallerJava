package taller.sofka.e10;


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

        nuevaFrase = frase.replace(" ","");

        return nuevaFrase;

    }

    public String cambiarLetra(String frase){

        nuevaFrase = frase.replace(" ","");

        return nuevaFrase;

    }

}




