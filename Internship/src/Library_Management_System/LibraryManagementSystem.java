package Library_Management_System;
import java.util.Scanner;
public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("The Catcher in the Rye", "J.D. Salinger", "123456");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "789012");
        Book book3 = new Book("1984", "George Orwell", "345678");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nOptions:");
            System.out.println("1. Borrow a Book");
            System.out.println("2. Return a Book");
            System.out.println("3. View Available Books");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter ISBN of the book to borrow: ");
                    String borrowISBN = scanner.nextLine();
                    for (Book book : library.books) {
                        if (book.getISBN().equals(borrowISBN)) {
                            book.borrowBook();
                            break;
                        }
                    }
                    break;
                case 2:
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter ISBN of the book to return: ");
                    String returnISBN = scanner.nextLine();
                    for (Book book : library.books) {
                        if (book.getISBN().equals(returnISBN)) {
                            book.returnBook();
                            break;
                        }
                    }
                    break;
                case 3:
                    library.displayAvailableBooks();
                    break;
                case 4:
                    System.out.println("Exiting the Library Management System.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
