package model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Revista extends ItemBiblioteca implements Catalogable {

    private int nroEdicion;
    private int cantidadEjemplares;
    private String nombreRevista;
    private LocalDate fechaEntrega;
    private final int TARIFA_MULTA_POR_DIA = 2500;

    

    public Revista(int nroEdicion, int cantidadEjemplares, String nombreRevista, LocalDate fechaEntrega) {
        this.nroEdicion = nroEdicion;
        this.cantidadEjemplares = cantidadEjemplares;
        this.nombreRevista = nombreRevista;
        this.fechaEntrega = fechaEntrega;
    }

    public Revista() {
    }

    /* OVERRIDE METHODS ABSTRACT AND INTERFACE */
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
    public double calcularMultas() {
        LocalDate fechaActual = LocalDate.now();
        double multa = 0.0;
        if (fechaEntrega.isBefore(fechaActual)) {
            long diasDeRetraso = ChronoUnit.DAYS.between(fechaEntrega, fechaActual);
            multa = diasDeRetraso * TARIFA_MULTA_POR_DIA;
        }
        return multa;
    }

    @Override
    public String obtenerInfo() {
        String result = "Nombre Revista: "+nombreRevista
                        +"\nNumero de edicion: "+nroEdicion
                        +"\nCantidad de Ejemplares: " + cantidadEjemplares;
        return result;
    }

    /* GETTERS AND SETTERS */
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

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }
}
 