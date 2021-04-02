package punto7;

public class AlumnoEjercicio7
{
	public void mostrarPorPantalla() {
		System.out.println("AlumnoEjercicio7{" +
				"nombre='" + nombre + '\'' +
				", apellido='" + apellido + '\'' +
				'}');
	}

	public String nombre;
	public String apellido;

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

}