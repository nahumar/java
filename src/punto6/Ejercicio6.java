package punto6;

import java.util.Scanner;
import Principal.IEjercicio;

public class Ejercicio6 implements IEjercicio{

	public void ejecutar() {
		// TODO Esbozo de m?todo generado autom?ticamente

		Scanner sc = new Scanner(System.in);
		int cant = 10;

		Estudiantes estudiantes = new Estudiantes(cant);

		for ( int i = 0 ; i < cant ; i++ )
		{
			Estudiante estudiante = new Estudiante();

			System.out.println("Nombre: ");
			estudiante.setNombre(sc.next());

			System.out.println("Edad: ");
			estudiante.setEdad(sc.nextInt());

			System.out.println("Calificacion: ");
			estudiante.setCalificacion(sc.nextInt());

			System.out.println("Coeficiente: ");
			estudiante.setCoeficiente(sc.nextInt());

			estudiantes.agregarEstudiante(estudiante);
		}

		estudiantes.imprimirPorPantalla();

		sc.close();
	}

}
