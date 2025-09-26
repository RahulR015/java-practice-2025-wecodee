abstract class LibraryItem {
    private String title;
    private int id;

    LibraryItem(String title, int id) {
        this.title = title;
        this.id = id;

    }
    public String getTitle() {
        return title;
    }
    public int getId() {
        return id;
    }
    public abstract void displayInfo();
}
