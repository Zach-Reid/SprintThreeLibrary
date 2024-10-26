import java.util.ArrayList;
import java.util.List;

// Class for the Library
class Library {
    private List<LibraryItem> items;
    private List<Author> authors;
    private List<Patron> patrons;

    // The constructor
    public Library() {
        this.items = new ArrayList<>();
        this.authors = new ArrayList<>();
        this.patrons = new ArrayList<>();
    }

    // Method for adding a library item
    public void addItem(LibraryItem item) {
        items.add(item);
    }

    // The method to remove a library item
    public void removeItem(LibraryItem item) {
        items.remove(item);
    }

    // The method to get all library items
    public List<LibraryItem> getItems() {
        return items;
    }

    // The method for adding an author
    public void addAuthor(Author author) {
        authors.add(author);
    }

    // For removing an author
    public void removeAuthor(Author author) {
        authors.remove(author);
    }

    // Method to add a patron
    public void addPatron(Patron patron) {
        patrons.add(patron);
    }

    // Method to find an item by title
    public LibraryItem findItemByTitle(String title) {
        for (LibraryItem item : items) {
            if (item.getTitle().equalsIgnoreCase(title)) {
                return item;
            }
        }
        return null;
    }
}


