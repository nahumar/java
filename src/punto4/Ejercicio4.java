package punto4;

import java.util.Scanner;

import Principal.IEjercicio;

public class Ejercicio4 implements IEjercicio{

	public void ejecutar() {
		// TODO Esbozo de método generado automáticamente

		Scanner sc = new Scanner(System.in);
		
		Amigos vector[] = new Amigos[5];
		
		vector[0] = new Amigos("Ezequiel", "Maydana", 23, "Hombre", "Colon", 1128503574);
		
		System.out.println(vector[0].nombre + " " + vector[0].apellido + " " + vector[0].edad + " " + vector[0].sexo + " " + vector[0].direccion + " " + vector[0].telefono);
		
		vector[1] = new Amigos("Sofia", "Montiel", 21, "Mujer", "Colon", 1128503574);
		
		System.out.println(vector[1].nombre + " " + vector[1].apellido + " " + vector[1].edad + " " + vector[1].sexo + " " + vector[1].direccion + " " + vector[1].telefono);

		vector[2] = new Amigos("Cristian", "Montiel", 23, "Mujer", "Colon", 1128503574);
		
		System.out.println(vector[2].nombre + " " + vector[2].apellido + " " + vector[2].edad + " " + vector[2].sexo + " " + vector[2].direccion + " " + vector[2].telefono);

		vector[3] = new Amigos("Katherina", "Maydana", 23, "Mujer", "Colon", 1128503574);
		
		System.out.println(vector[3].nombre + " " + vector[3].apellido + " " + vector[3].edad + " " + vector[3].sexo + " " + vector[3].direccion + " " + vector[3].telefono);

		vector[4] = new Amigos("Marcos", "Gaitan", 23, "Hombre", "Colon", 1128503574);
		
		System.out.println(vector[4].nombre + " " + vector[4].apellido + " " + vector[4].edad + " " + vector[4].sexo + " " + vector[4].direccion + " " + vector[4].telefono);

		sc.close();
	}

}
