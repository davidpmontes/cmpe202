
public class HasEnoughMoneyState implements State {
	GumballMachine gumballMachine;
 
	public HasEnoughMoneyState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
  
	public void insertCoin( int value, GumballMachine.Type type) {
//		switch (type)
//		{
//			case "OneQuarter":
//				break;
//				
//		}
		System.out.println("You can't insert another quarter");
	}
 
	public void ejectMoney( GumballMachine.Type type ) {
		System.out.println("Quarter returned");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}
 
	public void turnCrank( GumballMachine.Type type ) {
		System.out.println("You turned...");
		gumballMachine.setState(gumballMachine.getSoldState());
	}

    public void dispense( GumballMachine.Type type ) {
        System.out.println("No gumball dispensed");
    }
 
	public String toString() {
		return "waiting for turn of crank";
	}
}
