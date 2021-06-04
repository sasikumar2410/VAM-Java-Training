package com.vm.training.java.casestudy;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.Date;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;



public class Ticket
{
	
	private int counter = 100;
	private String pnr;
	private Date travelDate;
	private Train train1;
	private TreeMap<Passenger, Integer> passengers;
	
	/**
	 * Default constucture
	 */
	public Ticket() 
	{
		super();
	}
	/**
	 * this is parameterized constructor  of class ticket by its class variable
	 * @param travelDate
	 * @param train
	 */
	public Ticket(Date travelDate, Train train) 
	{
		super();
		this.travelDate = travelDate;
		this.train1 = train;
	}

	/**
	 * here we generate getter and setters methods for varables of class train 
	 * @return
	 */
	public int getCounter() 
	{
		return counter;
	}

	public void setCounter(int counter) 
	{
		this.counter = counter;
	}

	public String getPnr() 
	{
		return pnr;
	}

	public void setPnr(String pnr) 
	{
		this.pnr = pnr;
	}

	public Date getTravelDate() 
	{
		return travelDate;
	}

	public void setTravelDate(Date travelDate) 
	{
		this.travelDate = travelDate;
	}

	public Train getTrain() 
	{
		return train1;
	}

	public void setTrain(Train train) 
	{
		this.train1 = train;
	}

	public TreeMap<Passenger, Integer> getPassengers() 
	{
		return passengers;
	}

	public void setPassengers(TreeMap<Passenger, Integer> passengers) 
	{
		this.passengers = passengers;
	}
	
	/**
	 * this toString method is used to genetare the data of class train
	 */
	@Override
	public String toString() 
	{
		return "pnr=" + pnr + ", travelDate=" + travelDate + ", train=" + train1 + ", passengers=" + passengers;
	}

	/**
	 * This method is used to generate PNR number
	 * @return
	 */
	public String generatePNR() 
	{
        String sc = String.valueOf(train1.getTrain_source().charAt(0));
		String dest = String.valueOf(train1.getTrain_destination().charAt(0));
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String strDate = dateFormat.format(travelDate);
		String pnr = sc + dest + "_" + strDate + "_" + counter++;
		return pnr;
	

	}
	/**
	 * this method is used to calculate the fare of passenger based on there age
	 * @param train_number
	 * @param age
	 * @return
	 * @throws Exception
	 */
	public double calcPassengerFare(Passenger passenger) 
	{
		double fare=0;

		if(passenger.getPassenger_age()<=12)
		{
			fare=train1.getTrain_ticketPrice()-0.50*(train1.getTrain_ticketPrice());
		}
		else if(passenger.getPassenger_age()>=60)
		{
			fare=train1.getTrain_ticketPrice()-0.60*(train1.getTrain_ticketPrice());

		}
		else if(passenger.getPassenger_gender()=='F'||passenger.getPassenger_gender()=='f' )
		{
			fare=train1.getTrain_ticketPrice()-0.25*(train1.getTrain_ticketPrice());
		}
		else
		{
			fare=train1.getTrain_ticketPrice();
		}
		System.out.println(fare);
	         return fare;
	}
    /**
     * this method is used to add data of passinger to treeset
     * @param name
     * @param age
     * @param gender
     */
	public void addPassenger(String name, int age, char gender) 
	{
		Passenger passenger=new Passenger(name,age,gender);
		Integer ticfare=(int)calcPassengerFare(new Passenger(name,age,gender));
		passengers=new TreeMap<Passenger,Integer>();
		passengers.put(passenger, ticfare);
		calculateTotalTicketPrice();
		for(Map.Entry<Passenger,Integer> entry : passengers.entrySet())
		{
			Passenger key = entry.getKey();
			Integer value = entry.getValue();
		}

	}
	/**
	 * this method is used to calculate the price of ticket
	 * @return
	 */
	public double calculateTotalTicketPrice() 
	{
		Integer totalTicketPrice=0;
		for(Map.Entry<Passenger,Integer> entry : passengers.entrySet()) 
		{
			Integer value = entry.getValue();
			 totalTicketPrice=totalTicketPrice+value;
			 }
            return totalTicketPrice;
	}
	/**
	 * this method is used to generate ticket by using StingBuffer
	 * @return
	 */
	public StringBuffer generateTicket()
	{
		StringBuffer sb=new StringBuffer();
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");  
		String strDate = dateFormat.format(getTravelDate());
	    sb.append("PNR         : "+generatePNR()+"\n");
		sb.append("Train no    : "+train1.getTrain_number()+"\n");
		sb.append("Train Name  : "+train1.getTrain_name()+"\n");
		sb.append("Source      : "+train1.getTrain_source()+"\n");
		sb.append("Destination : "+train1.getTrain_destination()+"\n");
		sb.append("Travel Date : "+strDate+"\n");
		sb.append("Passengers\n");
		sb.append("Name          Age        Gender      TicketFare\n");
		sb.append(getPassengers()+"\n");
		sb.append("Total Price: "+calculateTotalTicketPrice());
        return sb;
	}
	/**
	 * this methos is used to print the data in file by naming the file by PNR.txt
	 * @throws IOException
	 */
	public void writeTicket()throws IOException
	{
		String ticketFile=generatePNR();
		
	File file=new File(ticketFile+".txt");
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
			
		    writer.write(generateTicket().toString());
		}
		
	}
}
