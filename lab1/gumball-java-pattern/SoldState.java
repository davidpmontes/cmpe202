

public class SoldState implements State {
 
    GumballMachine gumballMachine;
 
    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
       
	public void insertCoin( int value ) {
		switch(gumballMachine.type)
		{
			case OneQuarter:	
			case TwoQuarters:
			case AllCoins:
				System.out.println("Please wait, we're already giving you a gumball");
				break;
			default:
				break;
		}
	}
 
	public void ejectMoney( ) {
		switch(gumballMachine.type)
		{
			case OneQuarter:	
			case TwoQuarters:
			case AllCoins:
				System.out.println("Sorry, you already turned the crank");
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
				System.out.println("Turning twice doesn't get you another gumball!");
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
				gumballMachine.releaseBall();
				if (gumballMachine.count > 0) {
					gumballMachine.setState(gumballMachine.getNotEnoughMoneyState());
				} else {
					System.out.println("Oops, out of gumballs!");
					gumballMachine.setState(gumballMachine.getSoldOutState());
				}
				break;
			default:
				break;
		}
	}
 
	public String toString() {
		return "dispensing a gumball";
	}
}


