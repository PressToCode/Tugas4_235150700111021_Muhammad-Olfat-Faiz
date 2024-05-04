public class Magazine extends Book implements BookOperations {
    // Attribute
    private String category;

    // Constructor
    public Magazine(String title, String author, int year, String category) {
        super(title, author, year);
        this.category = category;
    }

    // Method Overriding
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("- Mg Category -\t: " + this.category);
    }

    // Interface
    @Override
    public void borrowBook() {
        if(isBorrowed()) {
            System.out.println("Magazine\t: " + getTitle() + " is already borrowed (cannot borrow book)");
        } else {
            setBorrowed(true);
            System.out.println("Magazine\t: " + getTitle() + " is borrowed successfully");
        }
    }

    @Override
    public void returnBook() {
        if(isBorrowed()) {
            setBorrowed(false);
            System.out.println("Magazine\t: " + getTitle() + " is returned successfully");
        } else {
            System.out.println("Magazine\t: " + getTitle() + " is not borrowed (cannot return book)");
        }
    }
}
