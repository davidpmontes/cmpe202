package fiveGuys;

enum FRIES
{
	LTL_CAJ;
}

enum FRIES_SIZE
{
	LITTLE;
}

enum FRIES_STYLE
{
	CAJUN;
}

public class Fry implements FryItem, MenuItem
{
	private FRIES_SIZE size;
	private FRIES_STYLE style;
	private String name;
	private int quantity;
	private double cost;
	
	public Fry(FRIES f, int quantity)
	{
		if (f == FRIES.LTL_CAJ)
		{
			this.name = "LTL CAJ";
			this.size = FRIES_SIZE.LITTLE;
			this.style = FRIES_STYLE.CAJUN;
			this.quantity = quantity;
			this.cost = 2.79;
		}
	}

	@Override
	public double getCost() {
		return this.cost;
	}

	@Override
	public String printUnsorted() {
		String result = "";
		result += this.quantity + "\t" + this.name + "\n";
		
		return result;
	}

	@Override
	public String printSorted() {
		String result = "";
		result += this.quantity + "\t" + this.name + "\t\t\t\t" + this.cost + "\n";
		
		return result;
	}
}
