import java.util.*;
public class NewsPapper extends LibraryItem implements Borrowable{
    private String borrowDate;
    public NewsPapper(String title,int id,String borrowDate) {
        super(title,id);
        this.borrowDate = borrowDate;
    }
    @Override
    public void displayInfo() {
        System.out.println("NewspaperTitle: "+getTitle()+"\nDate: "+this.borrowDate+"\nID: "+getId());
    }
    @Override
    public void borrow() {
        System.out.println("NewsPaper:"+getTitle()+"has been borrowed");
    }
    @Override
    public void returnBorrow() {
        System.out.println("NewsPaper:"+getTitle()+"has been return back");
    }
    @Override
    public double calculateFine(int daysOverdue) {
        if(daysOverdue <= 0){
            return 0.0;
        }
        return daysOverdue*Borrowable.LATE_FEE;
    }
}
