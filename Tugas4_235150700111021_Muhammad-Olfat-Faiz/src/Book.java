// Interface
interface BookOperations {
    public void borrowBook();
    public void returnBook();
}

// Class
public class Book {
    // Attributes
    private String title;
    private String author;
    private int year;
    private boolean borrowed;

    // Constructor
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    // Methods
    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void displayInfo() {
        System.out.println("Title\t\t: " + getTitle());
        System.out.println("Author\t\t: " + getAuthor());
        System.out.println("Year\t\t: " + getYear());
        System.out.println("Borrowed\t: " + isBorrowed());
    }
}
