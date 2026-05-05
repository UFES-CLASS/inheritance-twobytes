package library;

/**
 * Book class represents a single book in the library system.
 *
 * Developed by:
 * - Nada
 * - Laraib
 *
 * Responsibilities:
 * - Store book details (title, author)
 * - Track availability status
 */
public class Book {

    // Attributes
    private String title;
    private String author;
    private boolean isAvailable;

    /**
     * Constructor to initialize a new book.
     */
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true; // default
    }

    /**
     * Returns the book title.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Returns the book author.
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Checks if the book is available.
     */
    public boolean isAvailable() {
        return isAvailable;
    }

    /**
     * Marks the book as borrowed.
     */
    public void borrow() {
        isAvailable = false;
    }

    /**
     * Marks the book as returned.
     */
    public void returnBook() {
        isAvailable = true;
    }

    /**
     * Displays book details.
     */
    public void displayInfo() {
        System.out.println("Book: " + title + " | Author: " + author);
    }
}