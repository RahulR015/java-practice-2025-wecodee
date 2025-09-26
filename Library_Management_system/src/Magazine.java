 class Magazine extends LibraryItem implements Borrowable {
    private String category;
    private int year;
    public Magazine(String title, String category, int year, int id) {
        super(title, id);
        this.category = category;
        this.year = year;
    }
    @Override
    public void displayInfo() {
        System.out.println("MagazineTitle: "+getTitle()+"\nCategory: "+this.category+"\nID: "+getId());
    }
    @Override
    public void borrow() {
        System.out.println("Magazine:"+getTitle()+"has been borrowed");
    }
    @Override
    public void returnBorrow() {
        System.out.println("Magazine:"+getTitle()+"has been return back");
    }
    @Override
    public double calculateFine(int daysOverdue) {
        if(daysOverdue <= 0){
            return 0.0;
        }
        return daysOverdue*Borrowable.LATE_FEE;
    }

}
