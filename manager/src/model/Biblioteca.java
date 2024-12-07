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
            System.out.println(libro.obtenerInfo());;
        }
    }

}
