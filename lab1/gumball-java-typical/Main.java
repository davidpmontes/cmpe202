

public class Main {

	public static void main(String[] args) {
		GumballMachineOneQuarter gumballMachine = new GumballMachineOneQuarter(5);
		GumballMachineTwoQuarters gumballMachine2 = new GumballMachineTwoQuarters(1);
		GumballMachineAllCoins gumballMachine3 = new GumballMachineAllCoins(1);

		System.out.println(gumballMachine);

		gumballMachine.insertCoin( 25 );
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);

		gumballMachine.insertCoin( 25 );
		gumballMachine.turnCrank();
		gumballMachine.insertCoin( 25 );
		gumballMachine.turnCrank();

		System.out.println(gumballMachine2);
		
		gumballMachine2.turnCrank();
		gumballMachine2.insertCoin(25);
		gumballMachine2.turnCrank();
		gumballMachine2.insertCoin(25);
		gumballMachine2.turnCrank();
		gumballMachine2.insertCoin(25);
		gumballMachine2.insertCoin(25);
		gumballMachine2.turnCrank();
		
		System.out.println(gumballMachine3);
		
		gumballMachine3.turnCrank();
		gumballMachine3.insertCoin(5);
		gumballMachine3.turnCrank();
		gumballMachine3.insertCoin(25);
		gumballMachine3.turnCrank();
		gumballMachine3.insertCoin(25);
		gumballMachine3.turnCrank();
		gumballMachine3.turnCrank();
	}
}
