
public class GumballMachineOneQuarter extends GumballMachine {

	public GumballMachineOneQuarter(int size) {
		super(size);
	}
	
	public void insertCoin( int value )
    {
		if ( 25 == value )
			num_money = value;
    }
    
    public void turnCrank()
    {
    	if ( 25 == num_money )
    	{
    		if ( num_gumballs > 0 )
    		{
    			num_gumballs-- ;
    			num_money = 0 ;
    			System.out.println( "Thanks for your quarter.  Gumball Ejected!" ) ;
    		}
    		else
    		{
    			System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
    		}
    	}
    	else 
    	{
    		System.out.println( "Please insert a quarter" ) ;
    	}        
    }
}
