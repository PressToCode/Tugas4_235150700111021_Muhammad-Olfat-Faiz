public class Novel extends Book implements BookOperations {
    // Attribute
    private String genre;

    // Constructor
    public Novel(String title, String author, int year, String genre) {
        super(title, author, year);
        this.genre = genre;
    }

    // Method Overriding
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("- Novel Genre -\t: " + this.genre);
    }

    // Interface
    @Override
    public void borrowBook() {
        if(isBorrowed()) {
            System.out.println("Novel\t\t: " + getTitle() + " is already borrowed (cannot borrow book)");
        } else {
            setBorrowed(true);
            System.out.println("Novel\t\t: " + getTitle() + " is borrowed successfully");
        }
    }

    @Override
    public void returnBook() {
        if(isBorrowed()) {
            setBorrowed(false);
            System.out.println("Novel\t\t: " + getTitle() + " is returned successfully");
        } else {
            System.out.println("Novel\t\t: " + getTitle() + " is not borrowed (cannot return book)");
        }
    }
}
