package bus;

public class bus {
	
//	String bus_name;
	private int bus_number;
	private boolean ac;
	private int capacity;
	
	bus(int bus_number,boolean ac,int capacity)
	{
		this.bus_number=bus_number;
		this.ac=ac;
		this.capacity=capacity;
	}
	
	public int getbusnumber(){
		return bus_number;
	}
//	public void setbus_number(int bus_number)
//	{
//		this.bus_number=bus_number;
//	}
	
	public boolean getac()
	{
		return ac;
	}
	public void setac(boolean ac)
	{
		this.ac=ac;
	}
	public int getcapacity()
	{
		return capacity;
	}
	public void setcapacity(int capacity)
	{
		this.capacity=capacity;
	}
	
	
	public void displaydetails()
	{
		System.out.println("bus_number:"+bus_number+"\t\tAc:"+ac+"\t\tTotal capacity:"+capacity);
	}
	

}
