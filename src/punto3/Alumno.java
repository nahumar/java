package punto3;

public class Alumno
{
	public String nombre;

	public Alumno ( String nombre )
	{
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return "Alumno [nombre=" + this.nombre+"]";
	}
	
}