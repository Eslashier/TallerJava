package taller.sofka.e8;

public class App {

	public static void main(String[] args) {

	System.out.println("Ingrese un valor entre 1 y 7:");
	System.out.println("1 - Lunes \n2 - Martes \n3 - Miercoles \n4 - Jueves \n5 - Viernes \n6 - Sabado \n7 - Domingo \n");
	diaDelaSemana dia = new diaDelaSemana();
	System.out.println(dia.diaLaboral());

	}
}
