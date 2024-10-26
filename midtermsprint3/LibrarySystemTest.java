//Main class for part 3-1. Has data specifically to show the working.
import java.util.List;

public class LibrarySystemTest {
    public static void main(String[] args) {
        Library library = new Library();
        loadSampleData(library);

        // Display the initial status of items
        System.out.println("Initial Status of Items:");
        displayLibraryItems(library.getItems());

        // Searching for an item
        System.out.println("Searching for '1984':");
        LibraryItem searchedItem = library.findItemByTitle("1984");
        if (searchedItem != null) {
            System.out.println("Found: " + searchedItem.getTitle() + " - Copies Available: " + searchedItem.getCopiesAvailable());
        } else {
            System.out.println("Item not found.");
        }

        // Adding a new patron
        Patron patron1 = new Patron("John", "1 Main Street", "321-0012");
        library.addPatron(patron1);

        // Borrowing multiple items
        patron1.borrowItem(searchedItem); // Borrowing 1984
        patron1.borrowItem(library.findItemByTitle("Harry Potter and the Sorcerer's Stone")); // Borrowing another book, Harry Potter

        // Display status after borrowing
        System.out.println("\nAfter Borrowing:");
        displayLibraryItems(library.getItems());

        // For returning an item
        patron1.returnItem(searchedItem); // Returning 1984 in this case

        // Display the status after returning
        System.out.println("\nAfter Returning:");
        displayLibraryItems(library.getItems());
    }

    private static void loadSampleData(Library library) {
        // Authors
        Author author1 = new Author("J.K. Rowling", "1965-07-31");
        library.addAuthor(author1);

        Author author2 = new Author("George Orwell", "1903-06-25");
        library.addAuthor(author2);

        Author author3 = new Author("F. Scott Fitzgerald", "1896-09-24");
        library.addAuthor(author3);

        // Library Items
        LibraryItem book1 = new LibraryItem("1", "Harry Potter and the Sorcerer's Stone", "J.K. Rowling", "978-0439708180", "Scholastic", 5, "Book", "printed");
        library.addItem(book1);
        author1.addWrittenItem(book1.getTitle());

        LibraryItem book2 = new LibraryItem("2", "1984", "George Orwell", "978-0451524935", "Harcourt Brace", 3, "Book", "electronic");
        library.addItem(book2);
        author2.addWrittenItem(book2.getTitle());

        LibraryItem book3 = new LibraryItem("3", "The Great Gatsby", "F. Scott Fitzgerald", "978-0743273565", "Scribner", 4, "Book", "printed");
        library.addItem(book3);
        author3.addWrittenItem(book3.getTitle());

        LibraryItem book4 = new LibraryItem("4", "To Kill a Mockingbird", "Harper Lee", "978-0060935467", "Harper Perennial Modern Classics", 6, "Book", "printed");
        library.addItem(book4);

        LibraryItem book5 = new LibraryItem("5", "Pride and Prejudice", "Jane Austen", "978-1503290563", "CreateSpace Independent Publishing Platform", 7, "Book", "printed");
        library.addItem(book5);

        LibraryItem periodical1 = new LibraryItem("6", "National Geographic", "Various", "0027-9358", "National Geographic Partners", 10, "Periodical", "printed");
        library.addItem(periodical1);

        LibraryItem periodical2 = new LibraryItem("7", "Time Magazine", "Various", "0040-781X", "Time Inc.", 8, "Periodical", "printed");
        library.addItem(periodical2);

        LibraryItem book6 = new LibraryItem("8", "Moby Dick", "Herman Melville", "978-1503280786", "CreateSpace Independent Publishing Platform", 5, "Book", "printed");
        library.addItem(book6);

        LibraryItem book7 = new LibraryItem("9", "War and Peace", "Leo Tolstoy", "978-1505577122", "CreateSpace Independent Publishing Platform", 2, "Book", "printed");
        library.addItem(book7);

        LibraryItem book8 = new LibraryItem("10", "The Catcher in the Rye", "J.D. Salinger", "978-0316769488", "Little, Brown and Company", 3, "Book", "printed");
        library.addItem(book8);
    }

    private static void displayLibraryItems(List<LibraryItem> items) {
        for (LibraryItem item : items) {
            System.out.println(item.getTitle() + " - Copies Available: " + item.getCopiesAvailable() + " - Status: " + item.getStatus());
        }
    }
}


