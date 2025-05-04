package bus;

import java.util.*;
import java.util.Scanner;

public class BusDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		bus buses=new bus();
		ArrayList<bus>buses=new ArrayList<bus>();
		ArrayList<booking>bookings=new ArrayList<booking>();
		buses.add(new bus(1,true,1));
		buses.add(new bus(2,false,3));
		buses.add(new bus(3,true,6));
		buses.add(new bus(4,true,2));
		buses.add(new bus(5,false,0));
		
		
		for(bus b:buses)
		{
			b.displaydetails();
		}
		int userinput=1;
		while(userinput==1)
		{
			System.out.println("Enter 1 to booking and 2 to exit");
			userinput=sc.nextInt();
			if(userinput==1)
			{
				booking Booking=new booking();
				
				if(Booking.isAvailability(bookings,buses))
				{
					bookings.add(Booking);
					System.out.println("\n\t\tYOUR BOOKING IS CONFIRMED!!!!!!!");
				}
				else {
					System.out.println("\n\t\tSORRY...BUS IS FULL.TRY ANOTHER BUS OR DATE😒😒😒");
				}
			}
			else {
				System.out.println("\n\t\tThanks for booking😊😊😊");
			}
		}
		
		

	}

	

}
