package punto3;

import java.util.Scanner;

import Principal.IEjercicio;

public class Ejercicio3 implements IEjercicio{

	public void ejecutar() {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		Programacion_C cursoProgramacionC = new Programacion_C();
		
		int limit = 2;
		while(limit>2)
		{
			cursoProgramacionC.agregarAlumno(new Alumno());
			limit++;
		}
		
		cursoProgramacionC.mostrarPorPantalla();
		
	}
	

}