public class Main {
    public static void main(String[] args) {
        // Objek Textbook
        TextBook buku_A = new TextBook("Java Programming", "John Smith", 2020, "Computer Science");

        // Objek Novel 
        Novel buku_B = new Novel("To Kill a Mockingbird", "Harper Lee", 1960, "Fiction");

        // Objek Magazine 
        Magazine buku_C = new Magazine("National Geographic", "Various", 2021, "Geography, History, etc.");

        // Grouping untuk memudahkan output
        Book[] buku = new Book[3];
        buku[0] = buku_A;
        buku[1] = buku_B;
        buku[2] = buku_C;

        // Output
        System.out.println("---- Book Information ----");
        for(Book currentBook : buku) {
            currentBook.displayInfo();
            System.out.println();
        }

        System.out.println("---- Borrowing & Returning Books ----");
        // Kasus A: Objek berjenis Textbook telah dipinjam dan berhasil dikembalikan
        buku_A.borrowBook();
        buku_A.returnBook();

        // Kasus B: Objek berjenis Novel tidak dipinjam, namun dikembalikan
        buku_B.returnBook();

        // Kasus C: Objek berjenis Magazine telah dipinjam, namun tidak dikembalikan (hanya dipinjam???)
        buku_C.borrowBook();

        // space for output purposes :)
        System.out.println();
        System.out.println();
    }
}
