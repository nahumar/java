package punto7;

import java.util.Scanner;

import Principal.IEjercicio;

public class Ejercicio7 implements IEjercicio{

	public void ejecutar() {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		Programacion_C_Ejercicio7 curso = new Programacion_C_Ejercicio7();

		while(true)
		{
			System.out.println("Nueva alumno: ");

			AlumnoEjercicio7 alumno = new AlumnoEjercicio7();

			System.out.println("Nonbre: ");
			alumno.setNombre(sc.next());

			System.out.println("Apellido: ");
			alumno.setApellido(sc.next());

			curso.agregarAlumno(alumno);

			System.out.println("Continuar carga (Si:1/No:0)?");
			int continuar = sc.nextInt();

			if ( continuar == 0 ) break;
		}
		
		curso.mostrarPorPantalla();

	}
	

}