import java.util.*;
import java.text.SimpleDateFormat;
public class Booking
{
    String passenger_name;
    int bus_no;
    Date date;
    Booking()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Passenger Name:");
        passenger_name=sc.next();
        System.out.println("Enter the bus_no");
        bus_no=sc.nextInt();
        System.out.println("Enter the date dd-mm-yyy");
        String dateInput=sc.next();
        SimpleDateFormat dateFormat= new SimpleDateFormat("dd-mm-yyyy");
        try {
            date = dateFormat.parse(dateInput);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus> buses)
    {
        int capacity=0;
        for(Bus b:buses)
        {
            if(b.getBus_no()==bus_no)
            {
                capacity=b.getCapacity();
            }
        }
        int booked=0;
        for (Booking book:bookings)
        {
            if(book.bus_no==bus_no && book.date.equals(date))
            {
                booked++;
            }

        }
        return booked<capacity?true:false;
    }

}
