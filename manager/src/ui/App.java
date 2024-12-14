package ui;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import model.Biblioteca;
import model.Libro;
import model.Person;

public class App {

    private static Biblioteca biblio = new Biblioteca();
    private static Scanner sc = new Scanner(System.in);
    private static Person persona = new Person("John", "Doe", new ArrayList<>());

    public static void main(String[] args) throws Exception {

        biblio.agregarLibro(new Libro("Gabriel García Márquez", 417, "Cien años de soledad", false));
        biblio.agregarLibro(new Libro("J.K. Rowling", 309, "Harry Potter y la piedra filosofal", false));
        biblio.agregarLibro(new Libro("George Orwell", 328, "1984", false));
        biblio.agregarLibro(new Libro("J.R.R. Tolkien", 423, "El Señor de los Anillos: La Comunidad del Anillo", false));
        biblio.agregarLibro(new Libro("Jane Austen", 279, "Orgullo y prejuicio", false));
        biblio.agregarLibro(new Libro("F. Scott Fitzgerald", 180, "El gran Gatsby", false));
        biblio.agregarLibro(new Libro("Markus Zusak", 584, "La ladrona de libros", false));
        biblio.agregarLibro(new Libro("Harper Lee", 281, "Matar a un ruiseñor", false));
        biblio.agregarLibro(new Libro("Herman Melville", 635, "Moby Dick", false));
        biblio.agregarLibro(new Libro("LeoTolstoy", 1225, "Guerra y paz", false));

        options();
    }

    public static void menu() {
        System.out.println("""
                \t MENU
                1. Mostrar libros
                2. Agregar libro
                3. Prestar libro
                4. Devolver libro
                5. Salir
                -------------------
                """);
    }

    public static void options() {
        int op;
        do {
            menu();
            try {
                op = Integer.parseInt(sc.nextLine());

                switch (op) {
                    case 1 -> biblio.mostrarCatalogo();
                    case 2 -> biblio.agregarLibro(obtenerInfo());
                    case 3 -> prestarLibro();
                    case 4 -> devolverLibro();
                    case 5 -> System.out.println("Byee..");
                    default -> System.out.println("opcion invalida");
                }
            } catch (InputMismatchException e) {
                System.out.println("Por favor, ingrese un número válido.");
                sc.nextLine(); // Consume the invalid input
                op = 0; // Reset op to avoid exiting the loop
            }

        } while (op != 5);
    }

    public static Libro obtenerInfo() {
        Libro libroFinal = new Libro();
        System.out.print("\tNuevo libro\n");
        System.out.print("Nombre: ");
        String name = sc.nextLine();
        System.out.print("autor: ");
        String autor = sc.nextLine();
        System.out.print("paginas: ");
        int paginas = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        libroFinal.setTitulo(name);
        libroFinal.setAutor(autor);
        libroFinal.setNumeroPaginas(paginas);

        return libroFinal;
    }

    public static void prestarLibro() {
        System.out.print("Ingrese el título del libro a prestar: ");
        String titulo = sc.nextLine();
        if (biblio.prestarLibro(titulo, persona)) {
            System.out.println("Libro prestado exitosamente.");
        } else {
            System.out.println("No se pudo prestar el libro.");
        }
    }

    public static void devolverLibro() {
        System.out.print("Ingrese el título del libro a devolver: ");
        String titulo = sc.nextLine();
        if (biblio.devolverLibro(titulo, persona)) {
            System.out.println("Libro devuelto exitosamente.");
        } else {
            System.out.println("No se pudo devolver el libro.");
        }
    }
}