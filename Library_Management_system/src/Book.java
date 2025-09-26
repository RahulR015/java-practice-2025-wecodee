import java.util.*;
public class Book extends LibraryItem implements Borrowable{
    private String author;
    private int year;
    public Book(String title,  String author, int year,int id) {
        super(title,id);
        this.author = author;
        this.year = year;
    }
    @Override
    public void displayInfo() {
        System.out.println("Book Name: "+getTitle()+"\nAuthor: "+this.author+"\nID: "+getId());
    }
    @Override
    public void borrow() {
        System.out.println("Book Name: "+getTitle()+"has been borrowed");
    }
    @Override
    public void returnBorrow() {
        System.out.println("Book Name: "+getTitle()+"has been returned");
    }
    @Override
    public double calculateFine(int daysOverdue) {
        if(daysOverdue <= 0){
            return 0.0;
        }
        return daysOverdue * Borrowable.LATE_FEE;

    }
}
