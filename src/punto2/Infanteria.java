package punto2;

import java.util.ArrayList;
import java.util.List;

public class Infanteria
{
    private List<Curso> cursos;

    public List<Curso> getCursos() {
        return cursos;
    }

    public Infanteria()
    {
        cursos = new ArrayList<Curso>();
    }

    public void addCurso(Curso curso)
    {
        cursos.add(curso);
    }

    public int getCant_infantes()
    {
        int cant = 0;
        for (Curso curso: cursos) {
            cant += curso.getCantidadInscriptos();
        }
        return cant;
    }

    public int getCant_mujeres() {
        int cant = 0;
        for (Curso curso: cursos) {
            cant += curso.getCantidadInscriptosMujeres();
        }
        return cant;
    }

    public int getCant_hombres() {
        int cant = 0;
        for (Curso curso: cursos) {
            cant += curso.getCantidadInscriptosHombres();
        }
        return cant;
    }
}