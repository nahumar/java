package punto5;

public class CintaDeVideo {
    private String titulo;
    private int longitud;
    private String fechaDeVenta;
    private float precioAlquiler;
    private String clasificacion;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public void setFechaVenta(String fechaDeVenta) {
        this.fechaDeVenta = fechaDeVenta;
    }

    public void setPrecioAlquiler(float precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public void mostrar() {
        System.out.println("CintaDeVideo{" +
                "titulo='" + titulo + '\'' +
                ", longitud=" + longitud +
                ", fechaDeVenta='" + fechaDeVenta + '\'' +
                ", precioAlquiler=" + precioAlquiler +
                ", clasificacion='" + clasificacion + '\'' +
                '}');
    }
}
