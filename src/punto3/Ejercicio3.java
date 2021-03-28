package punto3;

import java.util.Scanner;

import Principal.IEjercicio;

import javax.swing.*;

public class Ejercicio3 implements IEjercicio{

	public void ejecutar() {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		Programacion_C cursoProgramacionC = new Programacion_C();


		int count = 0;
		while(count<2)
		{
			Alumno carlos = new Alumno("Carlos_"+count);
			cursoProgramacionC.agregarAlumno(carlos);
			count++;
		}
		
		cursoProgramacionC.mostrarPorPantalla();

	}
	

}