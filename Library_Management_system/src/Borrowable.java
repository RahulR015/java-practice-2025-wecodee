public interface Borrowable {
    final double LATE_FEE = 2.00;
    void borrow();
    void returnBorrow();
    double calculateFine(int daysOverdue);
}
