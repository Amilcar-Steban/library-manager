package model;

import java.util.ArrayList;

/* Crea la clase “Persona” que represente a un usuario de la biblioteca. Debe contener atributos como nombre, apellido y una lista de libros que ha pedido prestado. */

public class Person {
    private String nombre;
    private String apellido;
    private ArrayList<Libro> listaLibros = new ArrayList<>();

    
    public Person() {
        
    }
    public Person(String nombre, String apellido, ArrayList<Libro> listaLibros) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.listaLibros = listaLibros;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public ArrayList<Libro> getListaLibros() {
        return listaLibros;
    }
    public void setListaLibros(ArrayList<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }

    
    
}
