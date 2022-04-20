package taller.sofka.e4;

public class App {

	public static void main(String[] args) {

		Producto producto = new Producto();
		producto.calcularIva();
		producto.impuesto();
		System.out.println("El iva del producto ingresado es: "+producto.impuesto());

	}
}
