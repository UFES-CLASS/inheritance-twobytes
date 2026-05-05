package library;

/**
 * Abstract class representing a general person in the system.
 * This demonstrates inheritance in the system.
 *
 * Developed by:
 * - Nada
 * - Laraib
 *
 * Responsibilities:
 * - Store common attributes such as ID and name
 * - Provide shared functionality for subclasses
 */
public abstract class Person {

    // Attributes shared by Member and Librarian
    protected String id;
    protected String name;

    /**
     * Constructor to initialize a person.
     */
    public Person(String id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Returns the person's ID.
     */
    public String getId() {
        return id;
    }

    /**
     * Returns the person's name.
     */
    public String getName() {
        return name;
    }

    /**
     * Displays basic person information.
     */
    public void displayInfo() {
        System.out.println("ID: " + id + ", Name: " + name);
    }

    /**
     * Abstract method to be overridden by subclasses.
     */
    public abstract void displayRole();
}