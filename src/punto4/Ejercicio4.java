package punto4;

import java.util.Scanner;
import Principal.IEjercicio;

public class Ejercicio4 implements IEjercicio{

	public void ejecutar() {
		// TODO Esbozo de m?todo generado autom?ticamente

		Scanner sc = new Scanner(System.in);
		
		Amigos amigos = new Amigos(5);
		
		amigos.agregarAmigo(new Amigo("Ezequiel", "Maydana", 23, "Hombre", "Colon", 1128503574));
		amigos.agregarAmigo(new Amigo("Sofia", "Montiel", 21, "Mujer", "Colon", 1128503574));
		amigos.agregarAmigo(new Amigo("Cristian", "Montiel", 23, "Mujer", "Colon", 1128503574));
		amigos.agregarAmigo(new Amigo("Katherina", "Maydana", 23, "Mujer", "Colon", 1128503574));
		amigos.agregarAmigo(new Amigo("Marcos", "Gaitan", 23, "Hombre", "Colon", 1128503574));

		amigos.imprimirPorPantalla();

		sc.close();
	}

}
