package bus;

import java.sql.Connection;
import java.util.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;

import java.text.SimpleDateFormat;
import java.util.*;
public class booking {
	
	String passanger_name;
	int bus_no;
	Date date;//Date->present in util class
	
	booking()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter passanger_name=");
		passanger_name=sc.next();
		System.out.print("Enter bus_no=");
		bus_no=sc.nextInt();
		System.out.print("Enter date dd-mm-yyyy:");
		String dateInput=sc.next();
		SimpleDateFormat dateformat=new SimpleDateFormat("dd-MM-yyyy");
		try {
			date=dateformat.parse(dateInput);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public boolean isAvailability(ArrayList<booking> bookings, ArrayList<bus> buses) {
		int capacity=0;
		for(bus Bus:buses)
		{
			if(Bus.getbusnumber()==bus_no)
			{
				capacity=Bus.getcapacity();
			}
		}
		int booked=0;
		for(booking b:bookings)
		{
			if(b.bus_no==bus_no&&b.date.equals(date))
			{
				booked++;
			}
		}
//		return booked<capacity?true:false;
		if(booked<capacity)
		{
			doconnection();
			return true;
		}
		else {
			return false;
		}
	}
	
	public void doconnection()
	{

	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/bus_db","root","root");
		
		//preparedstatement
		PreparedStatement ps=c.prepareStatement("insert into booking values(?,?,?)");
		ps.setString(1,passanger_name);
		ps.setInt(2, bus_no);
		ps.setDate(3, new java.sql.Date(date.getTime()));
		
		ps.executeUpdate();
		System.out.println("data inserted");
		
	}catch(ClassNotFoundException|SQLException e)
	{
		e.printStackTrace();
	}
	}

}
