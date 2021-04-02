package punto9;

import java.util.ArrayList;
import java.util.List;

public class Estudiante9
{
    public List<Curso> cursos;
    public String nombre;
    public int 	  edad;
    public float   promedioHastaLaFecha;

    public Estudiante9()
    {
        this.cursos = new ArrayList<Curso>();
    }

    public void agregarCurso(Curso curso)
    {
        this.cursos.add(curso);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void mostrarPorPantalla() {
        System.out.println("Estudiante{" +
                "cursos=" + cursos +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}');
    }
}
