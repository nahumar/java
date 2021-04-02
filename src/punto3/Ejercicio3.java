package punto3;

import java.util.Scanner;

import Principal.IEjercicio;

public class Ejercicio3 implements IEjercicio{

	public void ejecutar() {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		Programacion_C cursoProgramacionC = new Programacion_C();


		int count = 0;
		while(count<10)
		{
			AlumnoEjercicio7 carlos = new AlumnoEjercicio7("Carlos_"+count);
			cursoProgramacionC.agregarAlumno(carlos);
			count++;
		}
		
		cursoProgramacionC.mostrarPorPantalla();

	}
	

}