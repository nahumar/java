package punto5;

import java.util.ArrayList;
import java.util.List;

public class TiendaVideo {

    public List<CintaDeVideo> cintas;

    public TiendaVideo()
    {
        cintas = new ArrayList<CintaDeVideo>();
    }

    public void ingresarCintaDeVideo( CintaDeVideo cinta)
    {
        this.cintas.add(cinta);
    }

    public void mostrarInventarioCintas()
    {
        for (CintaDeVideo cinta : cintas) {
            cinta.mostrar();
        }
    }
}
