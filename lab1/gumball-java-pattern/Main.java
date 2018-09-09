

public class Main {

	public static void main(String[] args) {
		GumballMachine gumballMachine = new GumballMachine(50,50,new Integer[]{1,5,10,25,50});

		System.out.println(gumballMachine);

		gumballMachine.insertCoin(25);
		gumballMachine.insertCoin(25);
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);

		gumballMachine.insertCoin(50);
		gumballMachine.turnCrank();
		gumballMachine.insertCoin(50);
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);
	}
}
