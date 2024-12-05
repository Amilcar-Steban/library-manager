package ui;

import model.Revista;

public class App {
    public static void main(String[] args) throws Exception {
        Revista[] revistas = new Revista[3];

        revistas[0] = new Revista(5, "Ciencia Hoy", 101);
        revistas[1] = new Revista(2, "Naturaleza", 202);
        revistas[2] = new Revista(0, "Historia Viva", 303);

        for (Revista revista : revistas) {
            revista.obtenerInfo();
            revista.prestar();
            revista.devolver();
            System.out.println();
        }
    }
}
