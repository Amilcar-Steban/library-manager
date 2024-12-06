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
    public void calcularMultas() {
        LocalDate fechaActual = LocalDate.now();
        if (fechaEntrega.isBefore(fechaActual)) {
            long diasDeRetraso = ChronoUnit.DAYS.between(fechaEntrega, fechaActual);
            double multa = diasDeRetraso * TARIFA_MULTA_POR_DIA; // Asumiendo que tienes una constante TARIFA_MULTA_POR_DIA
            System.out.println("Multa actual: " + multa);
        }
        else {
            System.out.println("Quedan "+(ChronoUnit.DAYS.between(fechaActual, fechaEntrega))+ " dias");
        }
    }

    @Override
    public void obtenerInfo() {
        System.out.println("Revista: " + nombreRevista);
        System.out.println("Número de Edición: " + nroEdicion);
        System.out.println("Cantidad de Ejemplares: " + cantidadEjemplares);
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
 