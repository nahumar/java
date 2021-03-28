package punto2;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    public  String        especialidad;
    private List<Recluta> reclutas;

    public Curso(String especialidad)
    {
        this.especialidad = especialidad;
        this.reclutas = new ArrayList<Recluta>();
    }

    public void addRecluta( Recluta recluta )
    {
        reclutas.add(recluta);
    }

    public int getCantidadInscriptos()
    {
        return reclutas.size();
    }
    public int getCantidadInscriptosMujeres()
    {
        int cant_mujeres = 0;
        for ( Recluta recluta : reclutas) {
            if ( recluta.getGenero() == 1 )
            {
                cant_mujeres++;
            }
        }
        return cant_mujeres;
    }

    public int getCantidadInscriptosHombres()
    {
        int cant_hombres = 0;
        for ( Recluta recluta : reclutas) {
            if ( recluta.getGenero() == 2 )
            {
                cant_hombres++;
            }
        }
        return cant_hombres;
    }
}