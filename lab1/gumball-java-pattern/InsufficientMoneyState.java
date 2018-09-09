import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsufficientMoneyState implements State {
    GumballMachine gumballMachine;
    private List<Integer> coins;
    private List<Integer> acceptable_coins;
    private int cost_needed;
    
    public InsufficientMoneyState(GumballMachine gumballMachine,int cost_needed, Integer[] acceptable_coins) {
        this.gumballMachine = gumballMachine;
        this.cost_needed = cost_needed;
		this.acceptable_coins = Arrays.asList(acceptable_coins);
		this.coins = new ArrayList<Integer>();
    }
 
	public void insertCoin(int coin) {
		
		if (!this.acceptable_coins.contains(coin)) {
			System.out.println("The "+ coin +" coin entered is not acceptable");
			return;
		}
		
		this.coins.add(coin);
		
		if (this.cost_needed != coins.stream().mapToInt(i -> i.intValue()).sum()) {
			System.out.println("Please insert more coins");
			return;
		}
		
		System.out.println("You inserted "+this.cost_needed+" cents");
		this.coins.clear();
		gumballMachine.setState(gumballMachine.getHasMoneyState());
	}
 
	public void ejectQuarter() {
		System.out.println("You haven't inserted a quarter");
	}
 
	public void turnCrank() {
		System.out.println("You turned, but sufficient money is not inserted");
	 }
 
	public void dispense() {
		System.out.println("You need to pay first");
	} 
 
	public String toString() {
		return "waiting for quarter";
	}
}
