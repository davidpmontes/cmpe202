

public class NotEnoughMoneyState implements State {
    GumballMachine gumballMachine;
 
    public NotEnoughMoneyState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
	public void insertCoin( int value ) {
		
		switch(gumballMachine.type)
		{
			case OneQuarter:
				if (value == 25)
				{
					System.out.println("You inserted a quarter");
					gumballMachine.setState(gumballMachine.getHasEnoughMoneyState());
					gumballMachine.money += value;
				}
				else
				{
					System.out.println("Quarter not accepted");
				}
				break;
			case TwoQuarters:
				if (value == 25)
				{
					System.out.println("You inserted a quarter");
					gumballMachine.money += value;
					if (gumballMachine.money == gumballMachine.cost)
					{
						gumballMachine.setState(gumballMachine.getHasEnoughMoneyState());
					}
				}
				else
				{
					System.out.println("Quarter not accepted");
				}
				break;
			case AllCoins:
				if (value > 0)
				{
					System.out.println(String.format("You inserted %d cents", value));
					gumballMachine.money += value;
					
					if (gumballMachine.money >= gumballMachine.cost)
					{
						gumballMachine.setState(gumballMachine.getHasEnoughMoneyState());
					}
				}
				else
				{
					System.out.println("Coin not accepted");
				}
				break;
			default:
				break;
		}
	}
 
	public void ejectMoney( ) {
		switch(gumballMachine.type)
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
 
	public void turnCrank( ) {
		switch(gumballMachine.type)
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
 
	public void dispense( ) {
		switch(gumballMachine.type)
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
