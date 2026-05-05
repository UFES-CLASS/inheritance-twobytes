package library;

import java.time.LocalDate;

/**
 * Main class runs the library system simulation.
 *
 * Developed by:
 * - Nada
 * - Laraib
 *
 * Responsibilities:
 * - Execute all scenarios
 * - Demonstrate system functionality
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("=========================================");
        System.out.println("        LIBRARY MANAGEMENT SYSTEM        ");
        System.out.println("=========================================");
        System.out.println("Developed by: Nada & Laraib");
        System.out.println("Course: Object-Oriented Programming");
        System.out.println("=========================================");

        System.out.println("\nSystem initialized successfully.");
        System.out.println("All components are ready.");

        // Create objects
        Librarian librarian = new Librarian("L001", "Admin");
        Member member1 = new Member("M001", "Nada", "nada@email.com");
        Member member2 = new Member("M002", "Laraib", "laraib@email.com");
        Book book = new Book("Clean Code", "Robert Martin");

        // Demonstrate Method Overriding (Polymorphism)
        System.out.println("\n[Method Overriding Demonstration]");
        librarian.displayRole();
        member1.displayRole();

        // Scenario 1: Add Book
        System.out.println("\n=== Scenario 1: Add Book ===");
        librarian.addBook(book);
        book.displayInfo();

        // Scenario 2: Register Members
        System.out.println("\n=== Scenario 2: Register Member ===");
        librarian.registerMember(member1);
        librarian.registerMember(member2);

        // Scenario 3: Borrow Book
        System.out.println("\n=== Scenario 3: Borrow Book ===");
        member1.borrowBook(book);
        BorrowRecord record = new BorrowRecord("R001", LocalDate.parse("2026-04-23"), member1, book);

        // Scenario 4: Borrow Unavailable Book
        System.out.println("\n=== Scenario 4: Borrow Unavailable Book ===");
        member2.borrowBook(book);

        // Scenario 5: Return Book
        System.out.println("\n=== Scenario 5: Return Book ===");
        member1.returnBook(book);
        record.closeRecord(LocalDate.parse("2026-04-25"));

        // Scenario 6: Display Record
        System.out.println("\n=== Scenario 6: Display Record ===");
        record.displayDetails();

        // Scenario 7: Search Book
        System.out.println("\n=== Scenario 7: Search Book ===");
        System.out.println("[Search]");
        System.out.println("Searching for \"" + book.getTitle() + "\"...");
        String status = book.isAvailable() ? "Available" : "Unavailable";
        System.out.println("Book found: \"" + book.getTitle() + "\" by " + book.getAuthor() + " (" + status + ")");

        // Summary
        System.out.println("\n=========================================");
        System.out.println("        SYSTEM EXECUTION SUMMARY         ");
        System.out.println("=========================================");
        System.out.println("Summary: 1 book processed, 2 members registered, 7 scenarios completed.");
        System.out.println("All scenarios executed successfully.");

        System.out.println("\n=========================================");
        System.out.println("        SYSTEM EXECUTION COMPLETED       ");
        System.out.println("=========================================");
    }
}