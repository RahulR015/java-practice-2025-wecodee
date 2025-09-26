
import java.util.*;

public class Library {
    ArrayList<LibraryItem> items = new ArrayList<>();
    public void addItem(LibraryItem item) {
        items.add(item);
    }
    public LibraryItem searchBook(String title) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getTitle().equalsIgnoreCase(title)) {
                return items.get(i);
            }
        }
        return null;
    }
    // Overloading (int)
    public LibraryItem searchBook(int id) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getId() == id) {
                return items.get(i);
            }
        }
        return null;
    }
    public void listAllItems() {
        for (int i = 0; i < items.size(); i++) {
            items.get(i).displayInfo();
        }
    }



}
