public class TextBook extends Book implements BookOperations {
    // Attribute
    private String subject;

    // Constructor
    public TextBook(String title, String author, int year, String subject) {
        super(title, author, year);
        this.subject = subject;
    }

    // Method overriding
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("- TB Subject -\t: " + this.subject);
    }

    // Interface
    @Override
    public void borrowBook() {
        if(isBorrowed()) {
            System.out.println("Textbook\t: " + getTitle() + " is already borrowed (cannot borrow book)");
        } else {
            setBorrowed(true);
            System.out.println("Textbook\t: " + getTitle() + " is borrowed successfully");
        }
    }

    @Override
    public void returnBook() {
        if(isBorrowed()) {
            setBorrowed(false);
            System.out.println("Textbook\t: " + getTitle() + " is returned successfully");
        } else {
            System.out.println("Textbook\t: " + getTitle() + " is not borrowed (cannot return book)");
        }
    }
}
