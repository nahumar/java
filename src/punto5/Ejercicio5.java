package punto5;

import Principal.IEjercicio;

import java.util.Scanner;

public class Ejercicio5 implements IEjercicio{

	public void ejecutar() {

		Scanner sc = new Scanner(System.in);

		TiendaVideo tienda = new TiendaVideo();

		while(true)
		{
			System.out.println("Nueva cinta de video: ");

			CintaDeVideo cinta = new CintaDeVideo();

			System.out.println("Titulo: ");
			cinta.setTitulo(sc.next());

			System.out.println("Longitud: ");
			cinta.setLongitud(sc.nextInt());

			System.out.println("Precio alquiler: ");
			cinta.setPrecioAlquiler(sc.nextInt());

			System.out.println("Fecha de venta: ");
			cinta.setFechaVenta(sc.next());

			System.out.println("Clasificacion: ");
			cinta.setClasificacion(sc.next());

			tienda.ingresarCintaDeVideo(cinta);

			System.out.println("¿Continuar carga (Si:1/No:0)?");
			int continuar = sc.nextInt();

			if ( continuar == 0 ) break;
		}

		tienda.mostrarInventarioCintas();
	}

}
