package taller.sofka.e12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {

	public static void main(String[] args) throws IOException {
		String primeraPalabra;
		String segundaPalabra;

		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader buffer = new BufferedReader(in);
		System.out.println("Ingrese una palabra:");
		primeraPalabra = buffer.readLine();
		System.out.println("Ingrese otra palabra para comparar");
		segundaPalabra = buffer.readLine();

		CompararPalabras comparar = new CompararPalabras(primeraPalabra,segundaPalabra);
		comparar.comparar();

	}
}
