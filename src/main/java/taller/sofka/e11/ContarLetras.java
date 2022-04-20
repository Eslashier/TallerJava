package taller.sofka.e11;

public class ContarLetras {

    String frase;
    int longitudfrase;

    int espacios;
    int a=0;
    int e=0;
    int i=0;
    int o=0;
    int u=0;

    //Constructor

    public ContarLetras() {

        frase = "La sonrisa sera la mejor arma contra la tristeza";

    }

    public ContarLetras(String frase) {

        this.frase = frase;

    }


    //Metodos


    public int contarcaracteres(){

        longitudfrase = frase.length();

        for (int i = 0; i < frase.length(); i++) {

            if (frase.charAt(i) == 'a' || frase.charAt(i) == 'A' ){
                a++;
            }else if (frase.charAt(i) == 'e' || frase.charAt(i) == 'E' ){
                e++;
            }else if (frase.charAt(i) == 'i' || frase.charAt(i) == 'I' ){
                i++;
            }
            else if (frase.charAt(i) == 'o' || frase.charAt(i) == 'O' ){
                o++;
            }
            else if (frase.charAt(i) == 'u' || frase.charAt(i) == 'U' ){
                u++;
            }
            else if (frase.charAt(i) == ' ' ){
                espacios++;
            }

        }

        return longitudfrase;
    }


    public String devolverFrase() {
        return frase;
    }

    public void ingresarFrase(String frase) {
        this.frase = frase;
    }

    public int obtenerEspacios() {
        return espacios;
    }

    public int obtenerLetrasA() {
        return a;
    }

    public int obtenerLetrasE() {
        return e;
    }

    public int obtenerLetrasI() {
        return i;
    }

    public int obtenerLetrasO() {
        return o;
    }

    public int obtenerLetrasU() {
        return u;
    }


}




