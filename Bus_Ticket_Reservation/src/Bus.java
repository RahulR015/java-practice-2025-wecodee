public class Bus {
    private int bus_no;
    private boolean ac;
    private int capacity;
    Bus(int no,boolean ac,int cap)
    {
        this.bus_no=no;
        this.ac=ac;
        this.capacity=cap;
    }
    public int getBus_no() {
        return bus_no;
    }
    public boolean isac()
    {
        return ac;
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int cap) {
        capacity = cap;
    }
    public void setac(boolean val) {
        this.ac = val;
    }
    public void display()
    {
        System.out.println("Bus_no:"+bus_no+" "+"AC:"+ac+" "+"Capacity:"+capacity);
    }
}
