package model;

public class Revista extends ItemBiblioteca implements Catalogable{

    private int nroEdicion;
    private int cantidadEjemplares;
    private String nombreRevista;

    public Revista(int cantidadEjemplares, String nombreRevista, int nroEdicion) {
        this.cantidadEjemplares = cantidadEjemplares;
        this.nombreRevista = nombreRevista;
        this.nroEdicion = nroEdicion;
    }

    public Revista() {
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
        if (cantidadEjemplares<1) {
            cantidadEjemplares--;
        }else{
            System.out.println("No hay stock, sorry");
        }
        
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
