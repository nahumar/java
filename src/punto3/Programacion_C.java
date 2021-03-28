package punto3;

import java.util.ArrayList;
import java.util.List;

public class Programacion_C {
	
	private List<Alumno> alumnos;

	public Programacion_C()
	{
		this.alumnos = new ArrayList<Alumno>();
	}
	
	public void agregarAlumno(Alumno alumnoNuevo)
	{
		alumnos.add(alumnoNuevo);
	}
	
	public void mostrarPorPantalla()
	{
		for (Alumno alumno : alumnos) {
			System.out.println(alumno);
		}
	}
}