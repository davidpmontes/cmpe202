
public class GumballMachineOneQuarter extends GumballMachine
{
	public GumballMachineOneQuarter( int size )
	{
		super(size);
		cost = 25;
	}
	
	public void insertCoin( int value )
    {
		if ( 25 == value )
			num_money = value;
    }
    
    public void turnCrank()
    {
    	if ( cost <= num_money )
    	{
    		if ( num_gumballs > 0 )
    		{
    			num_gumballs-- ;
    			num_money -= cost ;
    			System.out.println( "Thanks for your quarter.  Gumball Ejected!" ) ;
    		}
    		else
    		{
    			System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
    		}
    	}
    	else 
    	{
    		System.out.println( "Please insert a quarter." ) ;
    	}        
    }
}
