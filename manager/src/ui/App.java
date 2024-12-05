package ui;

import java.time.LocalDate;
import model.Revista;

public class App {
    public static void main(String[] args) throws Exception {
        Revista[] revistas = new Revista[3];
        LocalDate entregaFecha = LocalDate.of(2024, 12, 28);

        revistas[0] = new Revista(101, 5, "Ciencia Hoy", entregaFecha);
        revistas[1] = new Revista(202, 2, "Naturaleza", entregaFecha);
        revistas[2] = new Revista(303, 0, "Historia Viva", entregaFecha);

        for (Revista revista : revistas) {
            revista.obtenerInfo();
            revista.calcularMultas();
            System.out.println();
        }
    }
}
