package fiveGuys;



public class Toppings
{
	enum LOCATION
	{
		TOP, BURGER, BOTTOM;
	}
	
	private BURGER_TOPPING_CHOICES tc;
	private LOCATION l;
	
	public BURGER_TOPPING_CHOICES getTc()
	{
		return tc;
	}

	public LOCATION getL()
	{
		return l;
	}
	

}
