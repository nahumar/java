package punto4;

public class Amigos {

    public Amigo amigos[];
    public int i = 0;

    public Amigos(int cant) {
        amigos = new Amigo[cant];
    }

    void agregarAmigo(Amigo amigo)
    {
        if ( i <= 5 )
            amigos[i++] = amigo;
    }
    public void imprimirPorPantalla()
    {
        for (Amigo amigo : amigos) {
            amigo.mostrarPorPantalla();
        }
    }
}
