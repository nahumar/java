package punto8;

import java.util.Scanner;

import Principal.IEjercicio;

public class Ejercicio8 implements IEjercicio{

	public void ejecutar() {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		Revista curso = new Revista();

		while(true) {
			System.out.println("Nueva suscriptor: ");

			Suscriptor alumno = new Suscriptor();

			System.out.println("Nonbre: ");
			alumno.setNombre(sc.next());

			System.out.println("Cedula: ");
			alumno.setCedula(sc.next());

			System.out.println("Mes inscripcion: ");

			//validacion del mes
			byte mes = sc.nextByte();
			while (true)
			{
				if ( ValidadorFecha.esMesValido(mes) ) {
					break;
				} else {
					System.out.println("Mes: ");
					mes = sc.nextByte();
				}
			}

			alumno.setMesInscripcion(mes);

			System.out.println("Anio incripcion: ");
			alumno.setAnioInscripcion(sc.nextShort());

			curso.agregarSuscriptor(alumno);

			System.out.println("Continuar carga (Si:1/No:0)?");
			int continuar = sc.nextInt();

			if ( continuar == 0 ) break;
		}
		
		curso.mostrarPorPantalla();

	}
	

}