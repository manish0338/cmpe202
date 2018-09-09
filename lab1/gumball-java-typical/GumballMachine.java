import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GumballMachine
{
	private int num_gumballs;
	private List<Integer> coins;
	private int cost_needed;
	private List<Integer> acceptable_coins;

	public GumballMachine(int size, int cost_needed, Integer[] acceptable_coins) {
		// initialise instance variables
		this.num_gumballs = size;
		this.cost_needed = cost_needed;
		this.acceptable_coins = Arrays.asList(acceptable_coins);
		this.coins = new ArrayList<Integer>();
	}

	public void insertQuarter(int coin) {
		coins.add(coin);
	}

	public void turnCrank() {
		System.out.println(coins.stream().mapToInt(i -> i.intValue()).sum());

		if (!this.acceptable_coins.containsAll(coins)) {
			System.out.println("The coins entered are not acceptable");
			return;
		}

		if (this.cost_needed != coins.stream().mapToInt(i -> i.intValue()).sum()) {
			System.out.println("Please insert more coins");
			return;
		}

		if (this.num_gumballs > 0) {
			this.num_gumballs--;
			System.out.println("Thanks for your quarter.  Gumball Ejected!");
		} else {
			System.out.println("No More Gumballs!  Sorry, can't return your quarter.");
		}
		this.coins.clear();
	}
}
