
public class GumballMachineTwoQuarters extends GumballMachine {
	
	public GumballMachineTwoQuarters(int size) {
		super(size);
	}
	
	public void insertCoin( int value ) {
		if ( 25 == value )
			num_money += value;
		
		if (num_money > 50)
			num_money = 50;
	}

	public void turnCrank() {
		if ( 50 == num_money )
    	{
    		if ( num_gumballs > 0 )
    		{
    			num_gumballs-- ;
    			num_money = 0 ;
    			System.out.println( "Thanks for your quarters.  Gumball Ejected!" ) ;
    		}
    		else
    		{
    			System.out.println( "No More Gumballs!  Sorry, can't return your quarters." ) ;
    		}
    	}
    	else 
    	{
    		if ( 0 == num_money )
    			System.out.println( "Please insert two quarters" ) ;
    		else if ( 25 == num_money )
    			System.out.println( "Please insert a quarter" );
    	}        
	}
}
