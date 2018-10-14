package fiveGuys;

import java.util.ArrayList;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    

public class Register
{
	private Order order;
	private int currOrder = 45;
	private int tranSeqNo = 57845;
	private double payment;
	private String cashier = "Sakda* S.";
	private int registerNum = 1;
	
	
	public void createOrder()
	{	
		order = new Order();

		Burger newBurger = new Burger(BURGERS.LBB, 1);
		newBurger.addTopping(BURGER_TOPPING_CHOICES.LETTUCE);
		newBurger.addTopping(BURGER_TOPPING_CHOICES.TOMATO);
		newBurger.addTopping(BURGER_TOPPING_CHOICES.G_ONION);
		newBurger.addTopping(BURGER_TOPPING_CHOICES.G_JALAPENO);
		
		Fry newFry = new Fry(FRIES.LTL_CAJ, 1);

		order.addItem(newBurger);
		order.addItem(newFry);
	}
	
	public void pay()
	{
		this.payment = 20.0;
	}
	
	public void printPaperReceipt()
	{
		System.out.println(storeHeader());
		System.out.print("\n\n");
		System.out.println(dateTime());
		System.out.print("\n");
		System.out.println("FIVE GUYS");
		System.out.println(orderNumber());
		System.out.print("\n");
		System.out.println(order.paperReceipt());
		System.out.print("\n");
		System.out.println("\tSub. Total: \t\t\t" + order.getTotalCostString());
		System.out.print("\n");
		System.out.println("\tCash $" + this.payment + "\t\t\t" + "$" + this.payment);
		System.out.println("\tChange\t\t\t\t" + order.getChangeString(this.payment));
		System.out.println("\tRegister:" + this.registerNum + "\tTran Seq No:\t" + this.tranSeqNo);
		System.out.println("\tCashier:" + this.cashier);
		System.out.println("\t\t***************************");
		System.out.println("\t\tDon't throw away your receipt!!!");
		System.out.print("\n\n\n\n\n");
	}
	
	public void printPackingSlip()
	{
		System.out.println(orderNumber());
		System.out.print("\n");
		System.out.println(dateTime());
		System.out.print("\n");
		System.out.println("FIVE GUYS");
		System.out.print("\n");
		System.out.println(order.packingSlip());
		System.out.print("\n");
		System.out.println("\tRegister:" + this.registerNum + "\tTran Seq No:\t" + this.tranSeqNo);
		System.out.println("\tCashier:" + this.cashier);
	}
	
	String storeHeader()
	{
		return "FIVE GUYS\n" +
			   "BURGERS AND FRIES\n" +
		       "STORE # CA-1294\n" +
		       "5353 ALMANDEN EXPY N60\n" +
		       "SAN JOSE, CA 95118\n" +
		       "(P) 408-264-9300";
	}
	
	String dateTime()
	{
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss a");
		LocalDateTime now = LocalDateTime.now();
		
		return dtf.format(now);  
	}
	
	String orderNumber()
	{
		return "Order Number: " + this.currOrder;
	}
}
