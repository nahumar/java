package punto8;

import java.util.ArrayList;
import java.util.List;

public class Revista {
	
	private List<Suscriptor> suscriptores;

	public Revista()
	{
		this.suscriptores = new ArrayList<Suscriptor>();
	}
	
	public void agregarSuscriptor(Suscriptor alumnoNuevo)
	{
		suscriptores.add(alumnoNuevo);
	}
	
	public void mostrarPorPantalla()
	{
		for (Suscriptor alumno : suscriptores) {
			alumno.mostrar();
		}
	}
}