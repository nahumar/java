package punto02;

import java.util.Scanner;
import java.util.Vector;

import Principal.IEjercicio;

public class Ejercicio02 implements IEjercicio{

	public void ejecutar() {
		// TODO Esbozo de método generado automáticamente

		Scanner sc = new Scanner(System.in);
		
		Infanteria infante = new Infanteria();
		
		Vector<Infanteria> infantes = new Vector<Infanteria>();
		
		// TODO --> carga de datos
		while(true)
		{
			System.out.println("Ingrese 1 para mujer y 2 para hombre(0 = Terminar)");
			infante.cantidad = sc.nextInt();
			
			if(infante.cantidad == 0)
				break;
			System.out.println("Ingrese en que curso esta inscripto(1 = 1 año | 2 = 2 año | 3 = 3 año): ");
			infante.curso = sc.nextInt();
			
			System.out.println("Ingrese en que especialidad(1 = Infanteria ligera | 2 = infanteria pesada | 3 = Infanteria motorizada):");
			infante.especialidad = sc.nextInt();
			
			if(infante.curso == 1 && infante.especialidad == 1)
			{
				if(infante.cantidad == 1)
				{
					infante.suma_mujeres_uno = infante.suma_mujeres_uno + 1;
				}
				if(infante.cantidad == 2)
				{
					infante.suma_hombres_uno = infante.suma_hombres_uno + 1;
				}
			}
			if(infante.curso == 2 && infante.especialidad == 2)
			{
				if(infante.cantidad == 1)
				{
					infante.suma_mujeres_dos = infante.suma_mujeres_dos + 1;
				}
				if(infante.cantidad == 2)
				{
					infante.suma_hombres_dos = infante.suma_hombres_dos + 1;
				}
			}
			if(infante.curso == 3 && infante.especialidad == 3)
			{
				if(infante.cantidad == 1)
				{
					infante.suma_mujeres_tres = infante.suma_mujeres_tres + 1;
				}
				if(infante.cantidad == 2)
				{
					infante.suma_hombres_tres = infante.suma_hombres_tres + 1;
				}
			}
			
			infante.cantidad_total_1 = infante.suma_hombres_uno + infante.suma_mujeres_uno;
			infante.cantidad_total_2 = infante.suma_hombres_dos + infante.suma_mujeres_dos;
			infante.cantidad_total_3 = infante.suma_hombres_tres + infante.suma_mujeres_tres;
			
		}
		
		
		System.out.println("Cantidad inscripta en el primer curso: " + infante.cantidad_total_1);
		System.out.println("Cantidad inscripta en el segundo curso: " + infante.cantidad_total_2);
		System.out.println("Cantidad inscripta en el tercer curso: " + infante.cantidad_total_3);
		System.out.println("Infanteria ligera(Hombres): " + infante.suma_hombres_uno + "| Infanteria ligeria(Mujeres): " + infante.suma_mujeres_uno );
		System.out.println("Infanteria pesada(Hombres): " + infante.suma_hombres_dos + "| Infanteria pesada(Mujeres): " + infante.suma_mujeres_dos );
		System.out.println("Infanteria motorizada(Hombres): " + infante.suma_hombres_tres + "| Infanteria motorizada(Mujeres): " + infante.suma_mujeres_dos );
		
		sc.close();
	}
}