import java.util.Scanner;

public class LibrarySystemDemo {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        // Adding Authors
        Author author1 = new Author("J.K. Rowling", "1965-07-31");
        library.addAuthor(author1);

        Author author2 = new Author("George Orwell", "1903-06-25");
        library.addAuthor(author2);

        // Adding example books for the system
        LibraryItem book1 = new LibraryItem("1", "Harry Potter and the Sorcerer's Stone", "J.K. Rowling", "978-0439708180", "Scholastic", 5, "Book", "printed");
        library.addItem(book1);
        author1.addWrittenItem(book1.getTitle());

        LibraryItem book2 = new LibraryItem("2", "1984", "George Orwell", "978-0451524935", "Harcourt Brace", 3, "Book", "electronic");
        library.addItem(book2);
        author2.addWrittenItem(book2.getTitle());

        LibraryItem periodical1 = new LibraryItem("3", "National Geographic", "Various", "0027-9358", "National Geographic Partners", 10, "Periodical", "printed");
        library.addItem(periodical1);

        // Adding a person for the example
        Patron patron1 = new Patron("Alice", "10 Example Lane", "333-2210");
        library.addPatron(patron1);

        // Display the stock of items
        System.out.println("Initial Status of Items:");
        for (LibraryItem item : library.getItems()) {
            System.out.println(item.getTitle() + " - Status: " + item.getStatus());
        }

        // Search for an item
        System.out.println("Searching for '1984':");
        LibraryItem searchedItem = library.findItemByTitle("1984");
        if (searchedItem != null) {
            System.out.println("Found: " + searchedItem.getTitle() + " - Copies Available: " + searchedItem.getCopiesAvailable());
        } else {
            System.out.println("Item not found.");
        }

        // Borrowing a book
        patron1.borrowItem(book2); // In this case, 1984
        System.out.println("After borrowing:");
        System.out.println(book2.getTitle() + " - Status: " + book2.getStatus());

        // Returning a book
        patron1.returnItem(book2); // Returning 1984
        System.out.println("After returning:");
        System.out.println(book2.getTitle() + " - Status: " + book2.getStatus());

        // Editing the information of an item
        book1.setCopiesAvailable(10); // Editing number of copies for book 1
        System.out.println("Updated Copies of " + book1.getTitle() + ": " + book1.getCopiesAvailable());

        // Removing an author
        library.removeAuthor(author2);
        System.out.println("Author " + author2.getName() + " removed.");

        // Removing an item
        library.removeItem(book1);
        System.out.println("Item " + book1.getTitle() + " removed from the library.");

        scanner.close();
    }
}


