package model;

import java.util.ArrayList;

public class Biblioteca {

    @SuppressWarnings("FieldMayBeFinal")
    private ArrayList<Libro> libros;

    public Biblioteca() {
        libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void mostrarCatalogo() {
        for (Libro libro : libros) {
            System.out.println(libro.obtenerInfo());
        }
    }

    public boolean prestarLibro(String libro, Person persona){
        for (Libro lib : libros) {
            if (lib.getTitulo().equalsIgnoreCase(libro) && !lib.isPrestado()) {
                lib.setPrestado(true);
                persona.getListaLibros().add(lib);
                return true;
            }
        }
        return false;
    }

    public boolean devolverLibro(String libro, Person persona){
        for (Libro lib : persona.getListaLibros()) {
            if (lib.getTitulo().equalsIgnoreCase(libro)) {
                lib.setPrestado(false);
                persona.getListaLibros().remove(lib);
                return true;
            }
        }
        return false;
    }

}
