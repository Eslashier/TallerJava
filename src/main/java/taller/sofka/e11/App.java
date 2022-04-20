package taller.sofka.e11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {

	public static void main(String[] args) throws IOException {

		String fraseAContar;

		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader buffer = new BufferedReader(in);
		System.out.println("Ingrese una frase:");
		fraseAContar = buffer.readLine();

		ContarLetras frase = new ContarLetras(fraseAContar);
		System.out.println("La frase tiene "+frase.contarcaracteres()+ " caracteres");
		System.out.println("La frase tiene "+frase.obtenerLetrasA()+" vocales A");
		System.out.println("La frase tiene "+frase.obtenerLetrasE()+" vocales E");
		System.out.println("La frase tiene "+frase.obtenerLetrasI()+" vocales I");
		System.out.println("La frase tiene "+frase.obtenerLetrasO()+" vocales O");
		System.out.println("La frase tiene "+frase.obtenerLetrasU()+" vocales U");
		System.out.println("La frase tiene "+frase.obtenerEspacios()+" espacios");

	}
}
