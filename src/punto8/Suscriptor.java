package punto8;


public class Suscriptor
{
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public void setMesInscripcion(byte mesInscripcion) {
		this.mesInscripcion = mesInscripcion;
	}

	public void setAnioInscripcion(short anioInscripcion) {
		this.anioInscripcion = anioInscripcion;
	}

	public String nombre;

	public void mostrar() {
		System.out.println("Suscriptor{" +
				"nombre='" + nombre + '\'' +
				", cedula='" + cedula + '\'' +
				", mesInscripcion=" + mesInscripcion +
				", anioInscripcion=" + anioInscripcion +
				'}');
	}

	public String cedula;
	public byte mesInscripcion;
	public short anioInscripcion;

}