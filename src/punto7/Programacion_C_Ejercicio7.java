package punto7;

import java.util.ArrayList;
import java.util.List;

public class Programacion_C_Ejercicio7 {
	
	private List<AlumnoEjercicio7> alumnos;

	public Programacion_C_Ejercicio7()
	{
		this.alumnos = new ArrayList<AlumnoEjercicio7>();
	}
	
	public void agregarAlumno(AlumnoEjercicio7 alumnoNuevo)
	{
		alumnos.add(alumnoNuevo);
	}
	
	public void mostrarPorPantalla()
	{
		for (AlumnoEjercicio7 alumno : alumnos) {
			alumno.mostrarPorPantalla();
		}
	}
}