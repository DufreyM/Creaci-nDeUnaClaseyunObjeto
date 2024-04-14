public class Principal {

    public static void main(String[] args) {

        Libro Libro1 = new Libro();
        Libro Libro2 = new Libro("Mil años de soledad", 50.00, "Gabriel García Marquez", "Editorial Sudamericana");

        //Mostrando detalle de libro 1 para ver los valores por defecto
        Libro1.mostrarDetalles();
        System.out.println("");
        //Mostrar detalles del libro 2 con parametros creados
        Libro2.mostrarDetalles();
        System.out.println("");
        //Actualizar precio del libro 2
        Libro2.actualizarPrecio(30.32);
        //Probando método para confirmar si se actualizo el precio
        Libro2.mostrarDetalles();
    }
}