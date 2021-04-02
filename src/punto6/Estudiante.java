package punto6;

public class Estudiante
{
	public String nombre;

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setCalificacion(float calificacion) {
		this.calificacion = calificacion;
	}

	public void setCoeficiente(float coeficiente) {
		this.coeficiente = coeficiente;
	}

	public int 	  edad;
	public float  calificacion;
	public float  coeficiente;

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public float getCalificacion() {
		return calificacion;
	}

	public float getCoeficiente() {
		return coeficiente;
	}

	public void mostrarPorPantalla() {
		System.out.println("Estudiante{" +
				"nombre='" + nombre + '\'' +
				", edad=" + edad +
				", calificacion=" + calificacion +
				", coeficiente=" + coeficiente +
				'}');
	}

}
