

public class Main {

	public static void main(String[] args) {
		GumballMachine gumballMachine = new GumballMachine(5,  GumballMachine.Type.OneQuarter );
		GumballMachine gumballMachine2 = new GumballMachine(5,  GumballMachine.Type.TwoQuarters );
		GumballMachine gumballMachine3 = new GumballMachine(5,  GumballMachine.Type.AllCoins );

		System.out.println(gumballMachine);

		gumballMachine.insertCoin( 25 );
		
		gumballMachine.turnCrank();
		
		System.out.println(gumballMachine2);

		gumballMachine2.insertCoin( 25 );
		
		gumballMachine2.insertCoin( 25 );
		
		gumballMachine2.turnCrank();
		
		System.out.println(gumballMachine3);

		gumballMachine3.insertCoin( 25 );
		
		gumballMachine3.insertCoin( 3 );
		gumballMachine3.insertCoin( 50 );
		
		gumballMachine3.turnCrank();
	}
}
