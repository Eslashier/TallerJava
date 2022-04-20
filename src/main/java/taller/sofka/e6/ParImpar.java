package taller.sofka.e6;

public class ParImpar {

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

        for(int contador = 1;contador<=valorMax;contador++) {
            if (contador % 2 == 1) {
                System.out.println("El numero " + contador + " es impar");
            }
            System.out.println("El numero " + contador + " es par");
        }

    }


    public int ValorMaximo() {
        return valorMax;
    }

    public void establecerValorMax(int valorMax) {
        this.valorMax = valorMax;
    }



}


