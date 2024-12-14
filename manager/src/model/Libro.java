package model;

/* 
Implementa métodos en la clase “Biblioteca” para permitir que una persona tome prestado un libro (marcándolo como prestado) y para devolver un libro (marcándolo como disponible nuevamente).

Mejora el menú de consola para permitir a los usuarios seleccionar opciones para prestar y devolver libros.

 */
public class Libro extends ItemBiblioteca implements Catalogable {

    private String titulo;
    private String autor;
    private int numeroPaginas;
    private boolean prestado;


    public Libro(String autor, int numeroPaginas, String titulo, boolean prestado) {
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.titulo = titulo;
        this.prestado = prestado;
    }

    public Libro() {
    }

    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public void prestar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void devolver() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public double calcularMultas() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String obtenerInfo() {
        String result = "Libro: " + titulo
                + "\nAutor: " + autor
                + "\nPaginas: " + numeroPaginas
                + "\nPrestamo: "+ prestado
                + "\n---------------------------\n";
        return result;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    

}
