package MINIPROJECT;

import java.util.Scanner;

public class LibraryMain {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Library Management System ===");
            System.out.println("1. Add a Book");
            System.out.println("2. Add a Member");
            System.out.println("3. Issue a Book");
            System.out.println("4. Return a Book");
            System.out.println("5. Show Inventory");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter Book ID: ");
                        String id = sc.nextLine();
                        System.out.print("Enter Title: ");
                        String title = sc.nextLine();
                        System.out.print("Enter Author: ");
                        String author = sc.nextLine();
                        library.addBook(new Book(id, title, author));
                        System.out.println("Book added successfully!");
                        break;

                    case 2:
                        System.out.print("Enter Member ID: ");
                        String mid = sc.nextLine();
                        System.out.print("Enter Member Name: ");
                        String name = sc.nextLine();
                        library.addMember(new Member(mid, name));
                        System.out.println("Member added successfully!");
                        break;

                    case 3:
                        System.out.print("Enter Book ID to Issue: ");
                        String bid = sc.nextLine();
                        System.out.print("Enter Member ID: ");
                        String memId = sc.nextLine();
                        library.issueBook(bid, memId);
                        System.out.println("Book issued successfully!");
                        break;

                    case 4:
                        System.out.print("Enter Book ID to Return: ");
                        String rbId = sc.nextLine();
                        System.out.print("Enter Member ID: ");
                        String rMemId = sc.nextLine();
                        System.out.print("Enter Days Late: ");
                        int daysLate = sc.nextInt();
                        sc.nextLine();
                        library.returnBook(rbId, rMemId, daysLate);
                        System.out.println("Book returned successfully!");
                        break;

                    case 5:
                        library.showInventory();
                        break;

                    case 6:
                        System.out.println("Exiting... Goodbye!");
                        break;

                    default:
                        System.out.println("Invalid choice! Try again.");
                }
            } catch (BookNotAvailableException | InvalidReturnException e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (choice != 6);

        sc.close();
    }
}
