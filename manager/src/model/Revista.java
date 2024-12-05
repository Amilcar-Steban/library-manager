package model;

public class Revista extends ItemBiblioteca implements Catalogable {

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
        if (cantidadEjemplares > 0) {
            cantidadEjemplares--;
            System.out.println("Listo!. Quedan " + cantidadEjemplares + " ejemplares.");
        } else {
            System.out.println("No hay stock disponible.");
        }
    }

    @Override
    public void devolver() {
        cantidadEjemplares++;
        System.out.println("Listo!. Hay " + cantidadEjemplares + " ejemplares disponibles.");
    }

    @Override
    public void calcularMultas() {
        System.out.println("El cálculo de multas no está implementado para revistas.");
    }

    @Override
    public void obtenerInfo() {
        System.out.println("Revista: " + nombreRevista);
        System.out.println("Número de Edición: " + nroEdicion);
        System.out.println("Cantidad de Ejemplares: " + cantidadEjemplares);
    }
}
