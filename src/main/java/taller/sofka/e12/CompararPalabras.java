package taller.sofka.e12;

public class CompararPalabras {

    String primeraPalabra;
    String segundaPalabra;
    int longitudPrimeraPalabra;
    int longitudSegundaPalabra;

    //Constructor

    public CompararPalabras(String primeraPalabra, String  segundaPalabra) {

        this.primeraPalabra = primeraPalabra;
        this.segundaPalabra = segundaPalabra;

    }

    //Metodos


    public void comparar(){

        if(primeraPalabra.equals(segundaPalabra)){
            System.out.println("Las palabras son iguales");
            return;
        }
        longitudPrimeraPalabra = primeraPalabra.length();
        longitudSegundaPalabra = segundaPalabra.length();

        System.out.println("Las palabras son distintas, a continuacion se muestran las diferencias");

        for(int x = 0; x < Math.min(longitudPrimeraPalabra,longitudSegundaPalabra); x++){
            if(primeraPalabra.charAt(x) != segundaPalabra.charAt(x)){
                System.out.println("Posicion:"+x+"Primera palabra: "+primeraPalabra.charAt(x)+ " - Segunda palabra: "+segundaPalabra.charAt(x));
            }
        }
        for(int y = Math.min(longitudPrimeraPalabra,longitudSegundaPalabra); y < Math.max(longitudPrimeraPalabra,longitudSegundaPalabra); y++){
            if(primeraPalabra.length()==Math.max(longitudPrimeraPalabra,longitudSegundaPalabra)){
                System.out.println("Posicion:"+y+"Primera palabra: "+primeraPalabra.charAt(y)+ " - Segunda palabra: ");
            }else if(segundaPalabra.length()==Math.max(longitudPrimeraPalabra,longitudSegundaPalabra)){
                System.out.println("Posicion:"+y+"Primera palabra:  - Segunda palabra: "+segundaPalabra.charAt(y));
            }
        }

    }

    public String devolverPrimeraPalabra() {
        return primeraPalabra;
    }

    public void asignarPrimeraPalabra(String primeraPalabra) {
        this.primeraPalabra = primeraPalabra;
    }

    public String devolverSegundaPalabra() {
        return segundaPalabra;
    }

    public void asignarSegundaPalabra(String segundaPalabra) {
        this.segundaPalabra = segundaPalabra;
    }


}




