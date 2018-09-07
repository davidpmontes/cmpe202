

public class NotEnoughMoneyState implements State {
    GumballMachine gumballMachine;
 
    public NotEnoughMoneyState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
	public void insertCoin( int value, GumballMachine.Type type  ) {
		System.out.println("You inserted a quarter");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}
 
	public void ejectMoney( GumballMachine.Type type ) {
		System.out.println("You haven't inserted a quarter");
	}
 
	public void turnCrank( GumballMachine.Type type ) {
		System.out.println("You turned, but there's no quarter");
	 }
 
	public void dispense( GumballMachine.Type type ) {
		System.out.println("You need to pay first");
	} 
 
	public String toString() {
		return "waiting for quarter";
	}
}
