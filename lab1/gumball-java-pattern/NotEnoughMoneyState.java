

public class NotEnoughMoneyState implements State {
    GumballMachine gumballMachine;
 
    public NotEnoughMoneyState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
	public void insertCoin( int value, GumballMachine.Type type  ) {
		gumballMachine.money += value;
		
		switch(type)
		{
			case OneQuarter:
				System.out.println("You inserted a quarter");
				gumballMachine.setState(gumballMachine.getHasEnoughMoneyState());
				break;
			case TwoQuarters:
				System.out.println("You inserted a quarter");
				if (gumballMachine.money == 50)
				{
					gumballMachine.setState(gumballMachine.getHasEnoughMoneyState());
				}
				break;
			case AllCoins:
				System.out.println(String.format("You inserted %d cents", value));
				if (gumballMachine.money >= 50)
				{
					gumballMachine.setState(gumballMachine.getHasEnoughMoneyState());
				}
				break;
			default:
				break;
		}
	}
 
	public void ejectMoney( int money, GumballMachine.Type type ) {
		switch(type)
		{
			case OneQuarter:
				System.out.println("You haven't inserted a quarter");
				break;
			case TwoQuarters:
				if (gumballMachine.money > 0)
				{
					System.out.println("Quarters returned");
					gumballMachine.money = 0;
					gumballMachine.setState(gumballMachine.getNotEnoughMoneyState());
				}
				else
				{
					System.out.println("You haven't inserted a quarter");
					break;
				}
				break;
			case AllCoins:
				if (gumballMachine.money > 0)
				{
					System.out.println("Coins returned");
					gumballMachine.money = 0;
					gumballMachine.setState(gumballMachine.getNotEnoughMoneyState());
				}
				else
				{
					System.out.println("You haven't inserted a coin");
					break;
				}
				break;
			default:
				break;
		}
	}
 
	public void turnCrank( GumballMachine.Type type ) {
		switch(type)
		{
			case OneQuarter:
				System.out.println("You turned, but there's no quarter");
				break;
			case TwoQuarters:
				System.out.println("You turned, but there's not enough quarters");
				break;
			case AllCoins:
				System.out.println("You turned, but there's not enough money");
				break;
			default:
				break;
		}
	 }
 
	public void dispense( GumballMachine.Type type ) {
		switch(type)
		{
			case OneQuarter:
			case TwoQuarters:
			case AllCoins:
				System.out.println("You need to pay first");
				break;
			default:
				break;
		}
	} 
 
	public String toString() {
		return "waiting for money";
	}
}
