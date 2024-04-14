public class Libro {
    private String titulo;
    private double precio;
    private String autor;
    private String editorial;

    public Libro(){
        this.titulo = "Desconocido";
        this.precio = 0.00;
        this.autor = "Sin autor";
        this.editorial = "Sin editorial";
    }

    public Libro(String titulo, double precio, String autor, String editorial){
        this.titulo = titulo;
        this.precio = precio;
        this.autor = autor;
        this.editorial = editorial;
    }

    public void actualizarPrecio(double nuevoPrecio) {
        this.precio = nuevoPrecio;
    }

    public void mostrarDetalles(){
        System.out.println("Libro:"  + titulo);
        System.out.println("Autor:" + autor);
        System.out.println("Precio: Q." + precio);
        System.out.println("Editorial: "  + editorial);
    }
}