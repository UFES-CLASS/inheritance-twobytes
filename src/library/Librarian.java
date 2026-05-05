package library;

/**
 * Librarian class represents the administrator of the system.
 *
 * Developed by:
 * - Nada
 * - Laraib
 *
 * Responsibilities:
 * - Add books
 * - Register members
 */
public class Librarian extends Person {

    /**
     * Constructor to create a librarian.
     */
    public Librarian(String staffId, String name) {
        super(staffId, name); //  inheritance here
    }

    /**
     * Adds a new book to the system.
     */
    public void addBook(Book book) {
        System.out.println("\n[Add Book]");
        System.out.println("Book added: \"" + book.getTitle() + "\" by " + book.getAuthor());
    }

    /**
     * Registers a new member.
     */
    public void registerMember(Member member) {
        System.out.println("\n[Register Member]");
        System.out.println("New member: " + member.getName());
    }

    /**
     * Overrides the abstract displayRole method.
     * Demonstrates polymorphism through method overriding.
     */
    @Override
    public void displayRole() {
        System.out.println("Role: Librarian | ID: " + id + " | Name: " + name);
    }
}