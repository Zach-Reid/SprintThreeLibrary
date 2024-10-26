import java.util.ArrayList;
import java.util.List;

// A patron of the library
class Patron {
    private String name;
    private String address;
    private String phoneNumber;
    private List<LibraryItem> borrowedItems;

    // The constructor
    public Patron(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.borrowedItems = new ArrayList<>();
    }

    // Method for borrowing an item
    public void borrowItem(LibraryItem item) {
        if (item.getCopiesAvailable() > 0) {
            borrowedItems.add(item);
            item.setCopiesAvailable(item.getCopiesAvailable() - 1);
            item.setStatus(Status.CHECKED_OUT); // Update status to CHECKED_OUT
            System.out.println(name + " successfully borrowed: " + item.getTitle());
        } else {
            System.out.println("Item is currently checked out: " + item.getTitle());
        }
    }

    // And one to return an item
    public void returnItem(LibraryItem item) {
        if (borrowedItems.remove(item)) {
            item.setCopiesAvailable(item.getCopiesAvailable() + 1);
            item.setStatus(Status.AVAILABLE); // Update status back to AVAILABLE
            System.out.println(name + " successfully returned: " + item.getTitle());
        } else {
            System.out.println(name + " did not borrow this item: " + item.getTitle());
        }
    }

    // The getters
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public List<LibraryItem> getBorrowedItems() {
        return borrowedItems;
    }
}



