
public class HasEnoughMoneyState implements State {
	GumballMachine gumballMachine;
 
	public HasEnoughMoneyState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
  
	public void insertCoin( int value, GumballMachine.Type type) {
		switch (type)
		{
			case OneQuarter:
			case TwoQuarters:
				System.out.println("You can't insert another quarter");
				break;
			case AllCoins:
				System.out.println("You can't insert another coin");
				break;
			default:
				break;
		}
	}
 
	public void ejectMoney( int money, GumballMachine.Type type ) {
		switch (type)
		{
			case OneQuarter:
				System.out.println("Quarter returned");
				break;
			case TwoQuarters:
				System.out.println("Quarters returned");
				break;
			case AllCoins:
				System.out.println("Coins returned");
				break;
			default:
				break;
		}
		gumballMachine.setState(gumballMachine.getNotEnoughMoneyState());
	}
 
	public void turnCrank( GumballMachine.Type type ) {
		switch (type)
		{
			case OneQuarter:
			case TwoQuarters:
			case AllCoins:
				System.out.println("You turned...");
				break;
			default:
				break;
		}
		gumballMachine.setState(gumballMachine.getSoldState());
	}

    public void dispense( GumballMachine.Type type ) {
    	switch (type)
		{
			case OneQuarter:
			case TwoQuarters:
			case AllCoins:
		        System.out.println("No gumball dispensed");
				break;
			default:
				break;
		}
    }
 
	public String toString() {
		return "waiting for turn of crank";
	}
}
