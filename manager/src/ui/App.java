package ui;

import java.util.Scanner;
import model.Biblioteca;
import model.Libro;

public class App {

    private static Biblioteca biblio = new Biblioteca();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        biblio.agregarLibro(new Libro("Gabriel García Márquez", 417, "Cien años de soledad"));
        biblio.agregarLibro(new Libro("J.K. Rowling", 309, "Harry Potter y la piedra filosofal"));
        biblio.agregarLibro(new Libro("George Orwell", 328, "1984"));
        biblio.agregarLibro(new Libro("J.R.R. Tolkien", 423, "El Señor de los Anillos: La Comunidad del Anillo"));
        biblio.agregarLibro(new Libro("Jane Austen", 279, "Orgullo y prejuicio"));
        biblio.agregarLibro(new Libro("F. Scott Fitzgerald", 180, "El gran Gatsby"));
        biblio.agregarLibro(new Libro("Markus Zusak", 584, "La ladrona de libros"));
        biblio.agregarLibro(new Libro("Harper Lee", 281, "Matar a un ruiseñor"));
        biblio.agregarLibro(new Libro("Herman Melville", 635, "Moby Dick"));
        biblio.agregarLibro(new Libro("Leo Tolstoy", 1225, "Guerra y paz"));

        options();


    }

    public static void menu(){
        System.out.println("""
                \t MENU
                1. Mostrar libros
                2. Agregar libro
                3. Salir
                -------------------
                """);
    }

    public static void options(){
        int op;
        do {
            menu();
            op = sc.nextInt();

            switch (op) {
                case 1 -> biblio.mostrarCatalogo();
                case 2 -> biblio.agregarLibro(obtenerInfo());
                case 3 -> System.out.println("Byee..");
                default -> System.out.println("opcion invalida");
            }

        } while (op!=3);
    }
    public static Libro obtenerInfo(){
        Libro libroFinal = new Libro();
        System.out.print("\tNuevo libro\n");
        System.out.print("Nombre: ");
        String name = sc.next();
        System.out.print("autor: ");
        String autor = sc.next();
        System.out.print("paginas: ");
        int paginas = sc.nextInt();

        libroFinal.setTitulo(name);
        libroFinal.setAutor(autor);
        libroFinal.setNumeroPaginas(paginas);

        return libroFinal;
    }
}
