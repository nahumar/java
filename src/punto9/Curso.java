package punto9;

public class Curso {
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String nombre;
    public int nota;

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nombre='" + nombre + '\'' +
                ", nota=" + nota +
                '}';
    }

}
