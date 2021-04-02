package punto6;

public class Estudiantes {

    public Estudiante amigos[];
    public int i = 0;

    public Estudiantes(int cant) {
        amigos = new Estudiante[cant];
    }

    void agregarEstudiante(Estudiante amigo)
    {
        if ( i <= 5 )
            amigos[i++] = amigo;
    }
    public void imprimirPorPantalla()
    {
        for (Estudiante amigo : amigos) {
            amigo.mostrarPorPantalla();
        }
    }
}
