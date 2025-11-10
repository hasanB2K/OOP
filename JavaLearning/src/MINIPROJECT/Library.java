package MINIPROJECT;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.HashMap;

public class Library {
    private HashMap<String, Book> inventory;
    private HashMap<String, Member> members;
    private static final String LOG_FILE = "library_log.txt";

    public Library() {
        inventory = new HashMap<>();
        members = new HashMap<>();
    }

    public void addBook(Book book) {
        inventory.put(book.getId(), book);
        logOperation("Added Book: " + book);
    }

    public void addMember(Member member) {
        members.put(member.getMemberId(), member);
        logOperation("Added Member: " + member);
    }

    public void issueBook(String bookId, String memberId) throws BookNotAvailableException {
        Book book = inventory.get(bookId);
        Member member = members.get(memberId);

        if (book == null)
            throw new BookNotAvailableException("Book not found!");
        if (book.isIssued())
            throw new BookNotAvailableException("Book is already issued!");
        if (member == null)
            throw new BookNotAvailableException("Member not found!");

        book.setIssued(true);
        member.borrowBook(bookId);
        logOperation("Book Issued: " + book.getTitle() + " to " + member.getName());
    }

    public void returnBook(String bookId, String memberId, int daysLate)
            throws InvalidReturnException {
        Book book = inventory.get(bookId);
        Member member = members.get(memberId);

        if (book == null || member == null || !member.getBorrowedBookIds().contains(bookId))
            throw new InvalidReturnException("Invalid return operation!");

        book.setIssued(false);
        member.returnBook(bookId);

        int fine = daysLate * 2; // ₹2 per day late
        logOperation("Book Returned: " + book.getTitle() + " by " + member.getName()
                + (fine > 0 ? " | Fine: ₹" + fine : ""));
    }

    public void showInventory() {
        if (inventory.isEmpty()) {
            System.out.println("No books in the library.");
            return;
        }
        for (Book book : inventory.values()) {
            System.out.println(book);
        }
    }

    public void logOperation(String message) {
        try (FileWriter writer = new FileWriter(LOG_FILE, true)) {
            writer.write(LocalDateTime.now() + " - " + message + "\n");
        } catch (IOException e) {
            System.out.println("Error writing to log file: " + e.getMessage());
        }
    }
}
