package taller.sofka.e16.DNI;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class generaDNI {

    public String generarDNI() {
        String numero = "";

        for(int i = 0; i<9; i++) {
            String numeroaleatorio = String.valueOf(ThreadLocalRandom.current().nextInt(0, 9 + 1));
            numero = numero+numeroaleatorio;
        }
        Random r = new Random();
        char letra = (char)(r.nextInt(26) + 'a');
        String dni = numero + letra;

        return dni;
    }
}
