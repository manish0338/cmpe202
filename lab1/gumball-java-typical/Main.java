

public class Main {

	public static void main(String[] args) {
		GumballMachine gumballMachine = new GumballMachine(5,25,new Integer[]{25});

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter( 25 );
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter( 25 );
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter( 25 );
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);
	}
}
