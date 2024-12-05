package model;

public class Pelicula extends ItemBiblioteca implements Catalogable{
    
    private int nroEdicion;
    private int cantidadEjemplares;
    private String nombreRevista;

    public Pelicula(int cantidadEjemplares, String nombreRevista, int nroEdicion) {
        this.cantidadEjemplares = cantidadEjemplares;
        this.nombreRevista = nombreRevista;
        this.nroEdicion = nroEdicion;
    }

    public Pelicula() {
    }

    public int getNroEdicion() {
        return nroEdicion;
    }

    public void setNroEdicion(int nroEdicion) {
        this.nroEdicion = nroEdicion;
    }

    public int getCantidadEjemplares() {
        return cantidadEjemplares;
    }

    public void setCantidadEjemplares(int cantidadEjemplares) {
        this.cantidadEjemplares = cantidadEjemplares;
    }

    public String getNombreRevista() {
        return nombreRevista;
    }

    public void setNombreRevista(String nombreRevista) {
        this.nombreRevista = nombreRevista;
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
    public void calcularMultas() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void obtenerInfo() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
