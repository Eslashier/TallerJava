package taller.sofka.e16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {

	public static void main(String[] args) throws IOException {

		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader buffer = new BufferedReader(in);

		System.out.println("Ingrese su nombre");
		String nombre = buffer.readLine();
		System.out.println("Ingrese su edad");
		int edad = Integer.parseInt(buffer.readLine());
		System.out.println("Ingrese su genero M o H");
		String genero = buffer.readLine();
		System.out.println("Ingrese su peso en kilogramos");
		double peso = Double.parseDouble(buffer.readLine());
		System.out.println("Ingrese su altura en metros");
		double altura = Double.parseDouble(buffer.readLine());

		Persona persona1 = new Persona(nombre,edad,genero,peso,altura);
		Persona persona2 = new Persona("Isabela Castro", 40, "M");
		Persona persona3 = new Persona();

		persona3.asignarNombre("Javier Batista");
		persona3.asignarEdad(30);
		persona3.asignarGenero("H");
		persona3.asignarPeso(80);
		persona3.asignarAltura(1.9);

		System.out.println(persona1.esMayorDeEdad());
		System.out.println("Calculo de IMC: "+persona1.calcularIMC());
		System.out.println(persona1);

		System.out.println(persona2.esMayorDeEdad());
		System.out.println("Calculo de IMC: "+persona2.calcularIMC());
		System.out.println(persona2);

		System.out.println(persona3.esMayorDeEdad());
		System.out.println("Calculo de IMC: "+persona3.calcularIMC());
		System.out.println(persona3);


	}
}
