public class GumballMachine {
 
	State soldOutState;
	State insufficientMoneyState;
	State hasMoneyState;
	State soldState;
 
	State state = soldOutState;
	int count = 0;
 
	public GumballMachine(int numberGumballs,int costNeeded, Integer[] acceptableCoins) {
		soldOutState = new SoldOutState(this);
		insufficientMoneyState = new InsufficientMoneyState(this,costNeeded,acceptableCoins);
		hasMoneyState = new HasMoneyState(this);
		soldState = new SoldState(this);

		this.count = numberGumballs;
 		if (numberGumballs > 0) {
			state = insufficientMoneyState;
		}
	}
 
	public void insertCoin(int coin) {
		state.insertCoin(coin);
	}
 
	public void ejectCoin() {
		state.ejectQuarter();
	}
 
	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}

	void setState(State state) {
		this.state = state;
	}
 
	void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		if (count != 0) {
			count = count - 1;
		}
	}
 
	int getCount() {
		return count;
	}
 
	void refill(int count) {
		this.count = count;
		state = insufficientMoneyState;
	}

    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getInsufficientMoneyState() {
        return insufficientMoneyState;
    }

    public State getHasMoneyState() {
        return hasMoneyState;
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
