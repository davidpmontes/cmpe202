

public class GumballMachine {
	
	public enum Type {
	    OneQuarter,
	    TwoQuarters,
	    AllCoins,
	}
 
	State soldOutState;
	State notEnoughMoneyState;
	State hasEnoughMoneyState;
	State soldState;
 
	State state = soldOutState;
	int count = 0;
	int money = 0;
	int cost = 0;
	Type type;
 
	public GumballMachine(int numberGumballs, Type type) {
		soldOutState = new SoldOutState(this);
		notEnoughMoneyState = new NotEnoughMoneyState(this);
		hasEnoughMoneyState = new HasEnoughMoneyState(this);
		soldState = new SoldState(this);
		
		this.type = type;
		this.count = numberGumballs;
		
		switch(type)
		{
			case OneQuarter:
				this.cost = 25;
			case TwoQuarters:
			case AllCoins:
				this.cost = 50;
				break;
			default:
				break;
		}
 		if (numberGumballs > 0) {
			state = notEnoughMoneyState;
		} 
	}
 
	public void insertCoin( int value) {
		state.insertCoin( value );
	}
 
	public void ejectMoney() {
		state.ejectMoney( );
	}
 
	public void turnCrank() {
		state.turnCrank( );
		state.dispense( );
	}

	void setState(State state) {
		this.state = state;
	}
 
	void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		if (count != 0) {
			count--;
		}
	}
 
	int getCount() {
		return count;
	}
	
	int getMoney()
	{
		return money;
	}
	
	int getCost()
	{
		return cost;
	}
	
	void refill(int count) {
		this.count = count;
		state = notEnoughMoneyState;
	}

    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNotEnoughMoneyState() {
        return notEnoughMoneyState;
    }

    public State getHasEnoughMoneyState() {
        return hasEnoughMoneyState;
    }

    public State getSoldState() {
        return soldState;
    }
 
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nMighty Gumball, Inc.");
		result.append("\nJava-enabled Standing Gumball Model #2004");
		result.append("\nInventory: " + count + " gumball");
		if (count != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("Machine is " + state + "\n");
		return result.toString();
	}
}
