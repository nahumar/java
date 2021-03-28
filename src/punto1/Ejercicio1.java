package punto1;

import java.util.Scanner;

import Principal.IEjercicio;

public class Ejercicio1 implements IEjercicio{

	public void ejecutar() {

		Scanner sc = new Scanner(System.in);
		
		Tienda producto = new Tienda();
		
		while(true)
		{
			System.out.println("1-Azucar");
			System.out.println("2-Leche");
			System.out.println("3-Yogur");
			System.out.println("4-Fideos");
			System.out.println("5-Arroz");
			System.out.println("6-Galletas");
			System.out.println("7-Gaseosa");
			System.out.println("8-Agua");
			System.out.println("9-Prepizza");
			System.out.println("10-Aceite");
			
			System.out.println("Elija el producto(0 = Terminar): ");
			producto.decision = sc.nextInt();
			
			if(producto.decision == 0)
				break;
			
			if(producto.decision == 1)
			{
				System.out.println("Ingrese el precio del costo: ");
				producto.precio_costo = sc.nextInt();
				System.out.println("Ingrese el precio de venta: ");
				producto.precio_venta = sc.nextInt();
				System.out.println("Ingrese el codigo: ");
				producto.codigo = sc.nextInt();
				System.out.println("Ingrese la cantidad vendida: ");
				producto.cant_vendida = sc.nextInt();
				
				producto.decision = (producto.precio_venta - producto.precio_costo) * producto.cant_vendida;
			}
			if(producto.decision == 2)
			{
				System.out.println("Ingrese el precio del costo: ");
				producto.precio_costo = sc.nextInt();
				System.out.println("Ingrese el precio de venta: ");
				producto.precio_venta = sc.nextInt();
				System.out.println("Ingrese el codigo: ");
				producto.codigo = sc.nextInt();
				System.out.println("Ingrese la cantidad vendida: ");
				producto.cant_vendida = sc.nextInt();
				
				producto.decision = (producto.precio_venta - producto.precio_costo) * producto.cant_vendida;
			}
			if(producto.decision == 3)
			{
				System.out.println("Ingrese el precio del costo: ");
				producto.precio_costo = sc.nextInt();
				System.out.println("Ingrese el precio de venta: ");
				producto.precio_venta = sc.nextInt();
				System.out.println("Ingrese el codigo: ");
				producto.codigo = sc.nextInt();
				System.out.println("Ingrese la cantidad vendida: ");
				producto.cant_vendida = sc.nextInt();
				
				producto.decision = (producto.precio_venta - producto.precio_costo) * producto.cant_vendida;
			}
			if(producto.decision == 4)
			{
				System.out.println("Ingrese el precio del costo: ");
				producto.precio_costo = sc.nextInt();
				System.out.println("Ingrese el precio de venta: ");
				producto.precio_venta = sc.nextInt();
				System.out.println("Ingrese el codigo: ");
				producto.codigo = sc.nextInt();
				System.out.println("Ingrese la cantidad vendida: ");
				producto.cant_vendida = sc.nextInt();
				
				producto.decision = (producto.precio_venta - producto.precio_costo) * producto.cant_vendida;
			}
			if(producto.decision == 5)
			{
				System.out.println("Ingrese el precio del costo: ");
				producto.precio_costo = sc.nextInt();
				System.out.println("Ingrese el precio de venta: ");
				producto.precio_venta = sc.nextInt();
				System.out.println("Ingrese el codigo: ");
				producto.codigo = sc.nextInt();
				System.out.println("Ingrese la cantidad vendida: ");
				producto.cant_vendida = sc.nextInt();
				
				producto.decision = (producto.precio_venta - producto.precio_costo) * producto.cant_vendida;
			}
			if(producto.decision == 6)
			{
				System.out.println("Ingrese el precio del costo: ");
				producto.precio_costo = sc.nextInt();
				System.out.println("Ingrese el precio de venta: ");
				producto.precio_venta = sc.nextInt();
				System.out.println("Ingrese el codigo: ");
				producto.codigo = sc.nextInt();
				System.out.println("Ingrese la cantidad vendida: ");
				producto.cant_vendida = sc.nextInt();
				
				producto.decision = (producto.precio_venta - producto.precio_costo) * producto.cant_vendida;
			}
			if(producto.decision == 7)
			{
				System.out.println("Ingrese el precio del costo: ");
				producto.precio_costo = sc.nextInt();
				System.out.println("Ingrese el precio de venta: ");
				producto.precio_venta = sc.nextInt();
				System.out.println("Ingrese el codigo: ");
				producto.codigo = sc.nextInt();
				System.out.println("Ingrese la cantidad vendida: ");
				producto.cant_vendida = sc.nextInt();
				
				producto.decision = (producto.precio_venta - producto.precio_costo) * producto.cant_vendida;
			}
			if(producto.decision == 8)
			{
				System.out.println("Ingrese el precio del costo: ");
				producto.precio_costo = sc.nextInt();
				System.out.println("Ingrese el precio de venta: ");
				producto.precio_venta = sc.nextInt();
				System.out.println("Ingrese el codigo: ");
				producto.codigo = sc.nextInt();
				System.out.println("Ingrese la cantidad vendida: ");
				producto.cant_vendida = sc.nextInt();
				
				producto.decision = (producto.precio_venta - producto.precio_costo) * producto.cant_vendida;
			}
			if(producto.decision == 9)
			{
				System.out.println("Ingrese el precio del costo: ");
				producto.precio_costo = sc.nextInt();
				System.out.println("Ingrese el precio de venta: ");
				producto.precio_venta = sc.nextInt();
				System.out.println("Ingrese el codigo: ");
				producto.codigo = sc.nextInt();
				System.out.println("Ingrese la cantidad vendida: ");
				producto.cant_vendida = sc.nextInt();
				
				producto.decision = (producto.precio_venta - producto.precio_costo) * producto.cant_vendida;
			}
			if(producto.decision == 10)
			{
				System.out.println("Ingrese el precio del costo: ");
				producto.precio_costo = sc.nextInt();
				System.out.println("Ingrese el precio de venta: ");
				producto.precio_venta = sc.nextInt();
				System.out.println("Ingrese el codigo: ");
				producto.codigo = sc.nextInt();
				System.out.println("Ingrese la cantidad vendida: ");
				producto.cant_vendida = sc.nextInt();
				
				producto.decision = (producto.precio_venta - producto.precio_costo) * producto.cant_vendida;
			}
			
			producto.total_ganancia += producto.decision;
			
			
		}
		
		System.out.println("Ganancias de la tienda: " + producto.total_ganancia);
		
		sc.close();
	}

}