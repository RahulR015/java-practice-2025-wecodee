import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        ArrayList<Bus> buses=new ArrayList<>();
        ArrayList<Booking> bookings = new ArrayList<>();
        buses.add(new Bus(1,true,2));
        buses.add(new Bus(2,false,1));
        buses.add(new Bus(3,true,3));

        int opt=1;
        Scanner sc =new Scanner(System.in);
       for (Bus bus:buses)
       {
           bus.display();
       }
                while(opt==1)
                {
                    System.out.println("Enter 1 to book and 2 for exit");
                    opt=sc.nextInt();
                    if(opt==1)
                    {
                        Booking booking=new Booking();
                        if(booking.isAvailable(bookings,buses))
                        {
                            bookings.add(booking);
                            System.out.println("Booking success full...");
                        }
                        else
                        {
                            System.out.println("Sorry seat was filled please select some other tentative dates");
                        }
                    }
                }
    }
}