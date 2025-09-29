import java.util.*;
import java.util.stream.Collectors;

public class order {


    public static void main(String[] args) {
        List<Ecommerce_management> orders = Arrays.asList(new Ecommerce_management(1,"Rahul","Completed",1200),
                new Ecommerce_management(2,"Naveen","Pending",4200),
                new Ecommerce_management(3,"Huthyfa","Cancelled",1700),
                new Ecommerce_management(4,"Mohan","Completed",1000),
                new Ecommerce_management(5,"Navabeethan","Cancelled",1800)
                );
        //List all completed orders.
        System.out.println("All Completed Orders:");
         orders.stream()
                .filter(o -> o.getStatus().equalsIgnoreCase("Completed"))
                 .forEach(o -> System.out.println(o));
        //Calculate total revenue from completed orders.
        double totalRevenue = orders.stream()
                .filter(o -> o.getStatus().equalsIgnoreCase("Completed"))
                .mapToDouble(Ecommerce_management::getAmount)
                .sum();
        //Find the highest order amount safely using Optional.
       Optional<Ecommerce_management> highestamount = orders.stream()
                .max(Comparator.comparing(Ecommerce_management::getAmount));
       System.out.println("Highest amount of Orders:"+highestamount.orElse(null));
       //Filter orders above a certain amount (e.g., > 500) and list customer names.
        List<String> customer_name=orders.stream()
                .filter(o->o.getAmount()>500)
                .map(Ecommerce_management::getCustomer_name)
                .collect(Collectors.toList());
        System.out.println("Customer name:"+customer_name);
        //Count number of cancelled orders.
        long count=orders.stream()
                .filter(o->o.getStatus().equalsIgnoreCase("Cancelled")).
                count();
        System.out.println("Order Count:"+count);



    }
}