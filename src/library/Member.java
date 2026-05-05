package library;

/**
 * Member class represents a user who can borrow books.
 *
 * Developed by:
 * - Nada
 * - Laraib
 *
 * Responsibilities:
 * - Store member information
 * - Borrow and return books
 */
public class Member extends Person {

    private String email;

    /**
     * Constructor to create a new member.
     */
    public Member(String memberId, String name, String email) {
        super(memberId, name); //  inheritance here
        this.email = email;
    }

    /**
     * Returns the member name.
     */
    public String getName() {
        return name;
    }

    /**
     * Allows a member to borrow a book.
     * Includes availability check.
     */
    public void borrowBook(Book book) {
        System.out.println("\n[Borrow Attempt]");

        if (!email.contains("@")) {
            System.out.println("Invalid email format.");
            return;
        }

        if (book.isAvailable()) {
            book.borrow();
            System.out.println(name + " borrowed \"" + book.getTitle() + "\"");
        } else {
            System.out.println("Sorry, this book is currently unavailable.");
        }
    }

    /**
     * Allows a member to return a book.
     */
    public void returnBook(Book book) {
        System.out.println("\n[Return Process]");
        book.returnBook();
        System.out.println(name + " returned \"" + book.getTitle() + "\"");
    }

    /**
     * Overrides the abstract displayRole method.
     * Demonstrates polymorphism through method overriding.
     */
    @Override
    public void displayRole() {
        System.out.println("Role: Member | ID: " + id + " | Name: " + name + " | Email: " + email);
    }
}