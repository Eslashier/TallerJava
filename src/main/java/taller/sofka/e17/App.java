package taller.sofka.e17;

import taller.sofka.e17.Electrodomesticos.Electrodomesticos;
import taller.sofka.e17.Electrodomesticos.Lavadora;
import taller.sofka.e17.Electrodomesticos.Television;

public class App {

	public static void main(String[] args) {

		int precioLavadoras = 0;
		int precioTelevision = 0;
		int precioElectrodomesticos = 0;

		Electrodomesticos electrodomesticos[] = new Electrodomesticos[10];
		electrodomesticos[0] = new Electrodomesticos();
		electrodomesticos[1] = new Electrodomesticos(200,20);
		electrodomesticos[2] = new Electrodomesticos(150,"BlAnco",'A',90);
		electrodomesticos[3] = new Lavadora();
		electrodomesticos[4] = new Lavadora(250,80);
		electrodomesticos[5] = new Lavadora(0,"blanco",'A',90,40);
		electrodomesticos[6] = new Television();
		electrodomesticos[7] = new Television(350,20);
		electrodomesticos[8] = new Television(450,20);
		electrodomesticos[9] = new Television(0,"blanco",'A',10,42,true);


		for(int i=0;i<electrodomesticos.length;i++){
			if(electrodomesticos[i] instanceof  Lavadora){
				precioLavadoras = precioLavadoras + electrodomesticos[i].precioFinal();
				precioElectrodomesticos = precioElectrodomesticos + electrodomesticos[i].precioFinal();
				continue;
			}
			else if(electrodomesticos[i] instanceof  Television){
				precioTelevision = precioTelevision + electrodomesticos[i].precioFinal();
				precioElectrodomesticos = precioElectrodomesticos + electrodomesticos[i].precioFinal();
				continue;
			}
			precioElectrodomesticos = precioElectrodomesticos + electrodomesticos[i].precioFinal();
		}

		System.out.println("El valor total de las lavadores es de: "+precioLavadoras);
		System.out.println("El valor total de las televisiones es de: "+precioTelevision);
		System.out.println("El valor total de los electrodomesticos es de: "+precioElectrodomesticos);
	}
}
