package fiveGuys;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Order
{
	private ArrayList<MenuItem> menuItems = new ArrayList<MenuItem>();
	private double totalCost = 0.0;
	
	public void addItem(MenuItem mi)
	{
		menuItems.add(mi);
		totalCost += mi.getCost();
	}
	
	public String getTotalCostString()
	{
		return String.format("%.2f", this.totalCost);
	}
	
	public String getChangeString(double payment)
	{
		return String.format("%.2f", payment - this.totalCost);
	}
	
	public String paperReceipt()
	{
		String receipt = "";
		
		for (MenuItem item : menuItems) {
			receipt += item.printSorted();
		}
		
		return receipt;
	}
	
	public String packingSlip()
	{
		String slip = "";
		
		for (MenuItem item : menuItems) {
			slip += item.printUnsorted();
		}
		
		return slip;
	}
}
