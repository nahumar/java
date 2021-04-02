package punto4;

public class Amigo {

	public String nombre;
	public String apellido;
	public int edad;
	public String sexo;
	public String direccion;
	public int telefono;
	
	public Amigo(String nombre, String apellido, int edad, String sexo, String direccion, int telefono)
	{
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.sexo = sexo;
		this.direccion = direccion;
		this.telefono = telefono;
	}

	public void mostrarPorPantalla() {
		System.out.println( "Amigo{" +
				"nombre='" + nombre + '\'' +
				", apellido='" + apellido + '\'' +
				", edad=" + edad +
				", sexo='" + sexo + '\'' +
				", direccion='" + direccion + '\'' +
				", telefono=" + telefono +
				'}');
	}

}
