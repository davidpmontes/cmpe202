
public abstract class GumballMachine implements Machine
{
	protected int num_gumballs;
	protected int num_money;
	protected int cost;
	
	protected void setCost(int cost) {
		this.cost = cost;
	}

	public GumballMachine( int size )
	{
		num_gumballs = size;
		num_money = 0;
	}
}
