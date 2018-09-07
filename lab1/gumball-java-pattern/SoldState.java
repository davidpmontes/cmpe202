

public class SoldState implements State {
 
    GumballMachine gumballMachine;
 
    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
       
	public void insertCoin( int value, GumballMachine.Type type ) {
		System.out.println("Please wait, we're already giving you a gumball");
	}
 
	public void ejectMoney( GumballMachine.Type type ) {
		System.out.println("Sorry, you already turned the crank");
	}
 
	public void turnCrank( GumballMachine.Type type ) {
		System.out.println("Turning twice doesn't get you another gumball!");
	}
 
	public void dispense( GumballMachine.Type type ) {
		gumballMachine.releaseBall();
		if (gumballMachine.getCount() > 0) {
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		} else {
			System.out.println("Oops, out of gumballs!");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
	}
 
	public String toString() {
		return "dispensing a gumball";
	}
}


