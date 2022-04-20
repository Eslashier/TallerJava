package taller.sofka.e10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {

	public static void main(String[] args) throws IOException {

		String fraseVieja;

		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader buffer = new BufferedReader(in);
		System.out.println("Ingrese una frase:");
		fraseVieja = buffer.readLine();

		CambiarLetraFrase frase = new CambiarLetraFrase(fraseVieja);
		System.out.println(frase.cambiarLetra());

	}
}
