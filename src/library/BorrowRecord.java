package library;

import java.time.LocalDate;

/**
 * BorrowRecord class represents a borrowing transaction.
 *
 * Developed by:
 * - Nada
 * - Laraib
 *
 * Responsibilities:
 * - Link a member with a book
 * - Track borrowing and returning dates
 */
public class BorrowRecord {

    private String recordId;
    private LocalDate borrowDate;
    private LocalDate returnDate;

    private Member member;
    private Book book;

    /**
     * Constructor to create a borrow record.
     */
    public BorrowRecord(String recordId, LocalDate borrowDate, Member member, Book book) {
        this.recordId = recordId;
        this.borrowDate = borrowDate;
        this.member = member;
        this.book = book;
    }

    /**
     * Closes the record when the book is returned.
     */
    public void closeRecord(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    /**
     * Displays full borrow record details.
     */
    public void displayDetails() {
        System.out.println("\n========== BORROW RECORD ==========");
        System.out.println("Record ID : " + recordId);
        System.out.println("Member    : " + member.getName());
        System.out.println("Book      : " + book.getTitle());
        System.out.println("Borrowed  : " + borrowDate);
        System.out.println("Returned  : " + returnDate);

        if (returnDate != null) {
            System.out.println("Status    : Completed");
        } else {
            System.out.println("Status    : Active");
        }

        System.out.println("==================================");
    }

    /**
     * Returns a string representation of the borrow record.
     */
    @Override
    public String toString() {
        return "BorrowRecord{" +
                "recordId='" + recordId + '\'' +
                ", borrowDate=" + borrowDate +
                ", returnDate=" + returnDate +
                ", member=" + member.getName() +
                ", book=" + book.getTitle() +
                '}';
    }
}