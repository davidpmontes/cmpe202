

public interface State {
 
	public void insertCoin( int value, GumballMachine.Type type );
	public void ejectMoney( int money, GumballMachine.Type type );
	public void turnCrank( GumballMachine.Type type );
	public void dispense( GumballMachine.Type type );
}
