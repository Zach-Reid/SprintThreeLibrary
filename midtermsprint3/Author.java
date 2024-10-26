import java.util.ArrayList;
import java.util.List;

// Class for an Author
class Author {
    private String name;
    private String dateOfBirth;
    private List<String> writtenItems;

    // Constructor
    public Author(String name, String dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.writtenItems = new ArrayList<>();
    }

    // The method for adding a written item
    public void addWrittenItem(String item) {
        writtenItems.add(item);
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getDateOfBirth() {
        return dateOfBirth; 
    }

    public List<String> getWrittenItems() {
        return writtenItems;
    }
}



