

public class SoldOutState implements State {
    GumballMachine gumballMachine;
 
    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
	public void insertCoin( int value ) {
		switch(gumballMachine.type)
		{
			case OneQuarter:
			case TwoQuarters:
				System.out.println("You can't insert a quarter, the machine is sold out");
				break;
			case AllCoins:
				System.out.println("You can't insert a coin, the machine is sold out");
				break;
			default:
				break;
		}
	}
 
	public void ejectMoney( int money ) {
		switch(gumballMachine.type)
		{
			case OneQuarter:
			case TwoQuarters:
				System.out.println("You can't eject, you haven't inserted a quarter yet");
				break;
			case AllCoins:
				System.out.println("You can't eject, you haven't inserted a coin yet");
				break;
			default:
				break;
		}
	}
 
	public void turnCrank( ) {
		switch(gumballMachine.type)
		{
			case OneQuarter:
			case TwoQuarters:
			case AllCoins:
				System.out.println("You turned, but there are no gumballs");
				break;
			default:
				break;
		}
	}
 
	public void dispense( ) {
		switch(gumballMachine.type)
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
		return "sold out";
	}
}
