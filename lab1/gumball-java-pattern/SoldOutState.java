

public class SoldOutState implements State {
    GumballMachine gumballMachine;
 
    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
	public void insertCoin( int value, GumballMachine.Type type ) {
		System.out.println("You can't insert a quarter, the machine is sold out");
	}
 
	public void ejectMoney( int money, GumballMachine.Type type ) {
		System.out.println("You can't eject, you haven't inserted a quarter yet");
	}
 
	public void turnCrank( GumballMachine.Type type ) {
		System.out.println("You turned, but there are no gumballs");
	}
 
	public void dispense( GumballMachine.Type type ) {
		System.out.println("No gumball dispensed");
	}
 
	public String toString() {
		return "sold out";
	}
}
