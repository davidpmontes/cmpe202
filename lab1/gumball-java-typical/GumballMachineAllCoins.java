
public class GumballMachineAllCoins extends GumballMachine
{
	public GumballMachineAllCoins( int size )
	{
		super(size);
		setCost(50);
	}
	
	public void insertCoin( int value )
    {
		if ( num_money < cost)
			if (5 == value || 10 == value || 25 == value)
				num_money += value;	
    }
    
    public void turnCrank()
    {
    	if ( cost <= num_money )
    	{
    		if ( num_gumballs > 0 )
    		{
    			num_gumballs-- ;
    			num_money -= cost ;
    			System.out.println( "Thanks for your money.  Gumball Ejected!" ) ;
    		}
    		else
    		{
    			System.out.println( "No More Gumballs!  Sorry, can't return your money." ) ;
    		}
    	}
    	else 
    	{
	    	System.out.println( String.format( "Please insert %d cents. (Quarters, dimes and nickels only).", cost - num_money) );
    	}        
    }
}
