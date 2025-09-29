public class Ecommerce_management {
    private int order_id;
    private String Customer_name;
    private String Status;
    private double amount;
    public Ecommerce_management(int order_id, String Customer_name, String Status, double amount) {
        this.order_id = order_id;
        this.Customer_name = Customer_name;
        this.Status = Status;
        this.amount = amount;
    }
    public int getOrder_id() {
        return order_id;
    }
   public String  getCustomer_name() {
        return Customer_name;
   }
   public String getStatus() {
        return Status;
   }
   public double getAmount() {
        return amount;
   }
   @Override
    public String toString() {
        return "Ecommerce_management [order_id=" + order_id  + ", Customer_name=" + Customer_name + ", Status=" + Status + ", amount=" + amount + "]";
   }

}
