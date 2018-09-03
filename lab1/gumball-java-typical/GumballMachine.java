
public abstract class GumballMachine implements Machine
{
	private int num_gumballs;
	private int num_money;
	private int cost;
	
	protected int getNum_gumballs() {
		return num_gumballs;
	}

	protected void setNum_gumballs(int num_gumballs) {
		this.num_gumballs = num_gumballs;
	}

	protected int getNum_money() {
		return num_money;
	}

	protected void setNum_money(int num_money) {
		this.num_money = num_money;
	}

	protected int getCost() {
		return cost;
	}

	protected void setCost(int cost) {
		this.cost = cost;
	}

	public GumballMachine( int size )
	{
		num_gumballs = size;
		num_money = 0;
	}
}
