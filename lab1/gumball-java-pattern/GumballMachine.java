

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
	Type type;
 
	public GumballMachine(int numberGumballs, Type type) {
		soldOutState = new SoldOutState(this);
		notEnoughMoneyState = new NotEnoughMoneyState(this);
		hasEnoughMoneyState = new HasEnoughMoneyState(this);
		soldState = new SoldState(this);
		
		this.type = type;
		this.count = numberGumballs;
 		if (numberGumballs > 0) {
			state = notEnoughMoneyState;
		} 
	}
 
	public void insertCoin( int value) {
		state.insertCoin( value, this.type );
	}
 
	public void ejectMoney() {
		state.ejectMoney( money, this.type);
	}
 
	public void turnCrank() {
		state.turnCrank(this.type);
		state.dispense(this.type);
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
