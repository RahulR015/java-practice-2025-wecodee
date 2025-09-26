//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
public class LibraryManagement {
    public static void main(String[] args) {
        Library items = new Library();
        items.addItem(new Book("Java", "Rahul", 2004, 120));
        items.addItem(new Magazine("Dance spirit", "Dance", 2024, 420));
        items.addItem(new NewsPapper("Hindu", 777, "2025-09-14"));
        System.out.println("--- Library Collection ---");
        items.listAllItems();

        System.out.println("--- BOOK (ID: 120) ---");
        LibraryItem itemBook = items.searchBook(120);
        Book theBook = (Book) itemBook;
        int bookDaysOverdue = 7;

        theBook.borrow();
        theBook.returnBorrow();
        double bookTotalFine = theBook.calculateFine(bookDaysOverdue);

        System.out.println("Days Overdue: " + bookDaysOverdue);
        System.out.println("Total Late Fee: $" + bookTotalFine);

        System.out.println("----Magazine (Title: Dance spirit) ---");
        LibraryItem itemMag= items.searchBook("Dance spirit");
        Magazine theMag = (Magazine) itemMag;
        int magDaysOverdue = 7;
        theMag.borrow();
        theMag.returnBorrow();
        double magTotalFine = theMag.calculateFine(magDaysOverdue);
        System.out.println("Total Late Fee: $" + magTotalFine);
        System.out.println("Days Overdue: " +magDaysOverdue);
        System.out.println("----Final Constant Check ---");
        System.out.println("Daily Late Fee (final constant): $" + Borrowable.LATE_FEE);

    }
}