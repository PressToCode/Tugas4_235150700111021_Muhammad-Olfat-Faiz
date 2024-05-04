// import java.util.LinkedList;
// import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // ! Kode dibawah digunakan jika ingin mengimplementasi user-input
        // Import scanner dan LinkedList terlebih dahulu sebelum menjalankan kode
        // Scanner input = new Scanner(System.in);

        // System.out.println("---- Sistem Input Buku ----");
        // LinkedList<Book> bukuUser = new LinkedList<>();

        // loop: while(true) {
        //     System.out.print("Nama buku\t\t: ");
        //     String namaBuku = input.nextLine();

        //     System.out.print("Author\t\t\t: ");
        //     String author = input.nextLine();

        //     System.out.print("Tahun rilis\t\t: ");
        //     int year = input.nextInt();
        //     input.nextLine();

        //     String spesifik = "";
        //     run: while(true) {
        //         System.out.print("Jenis buku (TB/N/M)\t: ");
        //         switch (input.nextLine().toLowerCase()) {
        //             case "tb":
        //                 System.out.print("Subjek\t\t\t: ");
        //                 spesifik = input.nextLine();
        //                 bukuUser.offer(new TextBook(namaBuku, author, year, spesifik));
        //                 break run;
    
        //             case "n":
        //                 System.out.print("Genre\t\t\t: ");
        //                 spesifik = input.nextLine();
        //                 bukuUser.offer(new TextBook(namaBuku, author, year, spesifik));
        //                 break run;
                    
        //             case "m":
        //                 System.out.print("Category\t\t: ");
        //                 spesifik = input.nextLine();
        //                 bukuUser.offer(new TextBook(namaBuku, author, year, spesifik));
        //                 break run;
                
        //             default:
        //                 System.out.println("invalid");
        //                 break;
        //         }
        //     }

        //     System.out.print("Pinjam buku? (Y/N)\t: ");
        //     if(input.nextLine().equalsIgnoreCase("Y")) {
        //         bukuUser.getLast().setBorrowed(true);
        //     }

        //     System.out.print("Berhenti input? (X untuk berhenti): ");
        //     if(input.nextLine().equalsIgnoreCase("x")) {
        //         input.close();
        //         break loop;
        //     }
        // }

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

        // Output user books (Jika menggunakan user input)
        // for(Book currentBook : bukuUser) {
        //     currentBook.displayInfo();
        //     System.out.println();
        // }

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
