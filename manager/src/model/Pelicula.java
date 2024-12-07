package model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pelicula extends ItemBiblioteca implements Catalogable{

    private int cantidadEjemplares;
    private String nombrePelicula;
    private LocalDate fechaEntrega;
    private final int TARIFA_MULTA_POR_DIA = 4500;

    public Pelicula() {
    }

    public Pelicula(int cantidadEjemplares, String nombrePelicula, LocalDate fechaEntrega) {
        this.cantidadEjemplares = cantidadEjemplares;
        this.nombrePelicula = nombrePelicula;
        this.fechaEntrega = fechaEntrega;
    }

    public int getCantidadEjemplares() {
        return cantidadEjemplares;
    }

    public void setCantidadEjemplares(int cantidadEjemplares) {
        this.cantidadEjemplares = cantidadEjemplares;
    }

    public String getNombrePelicula() {
        return nombrePelicula;
    }

    public void setNombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
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
        String result = "Pelicula: "+nombrePelicula
                        +"\nCantidad: "+cantidadEjemplares;
        return result;
    }

}
