package model;

public class Libro extends ItemBiblioteca implements Catalogable{

    private String titulo;
    private String autor;
    private int numeroPaginas;

    public Libro(String autor, int numeroPaginas, String titulo) {
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.titulo = titulo;
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
        String result = "Libro: "+titulo
                        +"\nAutor: "+autor
                        +"\nPaginas: "+numeroPaginas;
        return result;
    }


}
