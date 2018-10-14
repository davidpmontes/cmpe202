package fiveGuys;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

enum BURGERS
{
	LBB;
}

enum BURGERS_SIZE
{
	LITTLE;
}

enum BURGER_TOPPING_CHOICES
{
	BACON, LETTUCE, TOMATO, G_ONION, G_JALAPENO;
}

public class Burger implements BurgerItem, MenuItem
{	
	private ArrayList<String> toppings = new ArrayList<String>();
	private BURGERS_SIZE size;
	private double cost;
	private String name;
	private int quantity;
	
	public Burger(BURGERS type, int quantity)
	{
		if (type == BURGERS.LBB)
		{
			this.size = BURGERS_SIZE.LITTLE;
			this.cost = 5.59;
			this.name = "LBB";
			this.quantity = quantity;
			addTopping(BURGER_TOPPING_CHOICES.BACON);
		}
	}
	
	public void addTopping(BURGER_TOPPING_CHOICES btc)
	{
		switch(btc)
		{
			case BACON:
				toppings.add("{{{{ BACON }}}}");
				break;
			case LETTUCE:
				toppings.add("LETTUCE");
				break;
			case TOMATO:
				toppings.add("TOMATO");
				break;
			case G_ONION:
				toppings.add("->|G_ONION");
				break;
			case G_JALAPENO:
				toppings.add("->|G_JALAPENO");
				break;
			default:
				break;
		}
	}

	@Override
	public String printUnsorted() {
		String result = "";
		result += this.quantity + "\t" + this.name + "\n";

		for (String top : toppings) {
			result += "\t " + top + "\n";
		}
		
		return result;
	}

	@Override
	public double getCost() {
		return this.cost;
	}

	@Override
	public String printSorted() {
		String result = "";
		result += this.quantity + "\t" + this.name + "\t\t\t\t" + this.cost + "\n";

		
		Collections.sort(toppings, new Comparator<String>() {
		    @Override
		    public int compare(String o1, String o2) {
		    	int result;
		    	
		    	if (o1.charAt(0) >= 'A' && o1.charAt(0) <= 'Z' && o2.charAt(0) >= 'A' && o2.charAt(0) <= 'Z')
		    		result = o1.compareTo(o2);
		    	else if (o1.charAt(0) == '-' && o2.charAt(0) == '-')
		    		result = o1.compareTo(o2);
		    	else if (o1.charAt(0) == '{' && o2.charAt(0) == '{')
		    		result = o1.compareTo(o2);
		    	else if (o1.charAt(0) == '-' && o2.charAt(0) == '{')
		    		result = -1;
		    	else if (o1.charAt(0) == '-')
		    		result = 1;
		    	else if (o1.charAt(0) == '{' && o2.charAt(0) == '-')
		    		return 1;
		    	else
		    		return -1;
		    			    	
		    	return result;
		    }
		}); 

		for (String top : toppings) {
			result += "\t " + top + "\n";
		}
		
		return result;
	}
}
