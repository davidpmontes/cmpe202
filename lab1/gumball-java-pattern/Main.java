

public class Main {

	public static void main(String[] args) {
		GumballMachine gumballMachine1 = new GumballMachine(5,  GumballMachine.Type.OneQuarter );

		System.out.println(gumballMachine1);

		gumballMachine1.insertCoin( 25 );
//		gumballMachine1.turnCrank();
//
//		System.out.println(gumballMachine1);
//
//		gumballMachine1.insertCoin( 25 );
//		gumballMachine1.turnCrank();
//		gumballMachine1.insertCoin( 25 );
//		gumballMachine1.turnCrank();
//
//		System.out.println(gumballMachine1);
	}
}
