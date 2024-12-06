package model;

public class Libro extends ItemBiblioteca implements Catalogable{
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
