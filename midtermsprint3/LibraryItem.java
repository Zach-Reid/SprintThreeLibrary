// Class representing a Library Item
class LibraryItem {
    private String id;
    private String title;
    private String author;
    private String isbn;
    private String publisher;
    private int copiesAvailable;
    private String itemType; // Either "Book" or "Periodical"
    private String format; // "printed", "electronic", etc.
    private Status status;

    // Constructor
    public LibraryItem(String id, String title, String author, String isbn, String publisher, int copiesAvailable, String itemType, String format) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publisher = publisher;
        this.copiesAvailable = copiesAvailable;
        this.itemType = itemType;
        this.format = format;
        this.status = Status.AVAILABLE; // This is the default status
    }

    // Getters, and also setters
    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getCopiesAvailable() {
        return copiesAvailable;
    }

    public void setCopiesAvailable(int copiesAvailable) {
        this.copiesAvailable = copiesAvailable;
    }

    public String getItemType() {
        return itemType;
    }

    public String getFormat() {
        return format;
    }

    public Status getStatus() {
        return status; 
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}



