
public class GumballMachineTwoQuarters extends GumballMachine
{	
	public GumballMachineTwoQuarters(int size)
	{
		super(size);
		cost = 50;
	}
	
	public void insertCoin( int value )
	{
		if ( num_money < cost)
			if (25 == value )
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
    			System.out.println( "Please insert two quarters." ) ;
    		else if ( 25 == num_money )
    			System.out.println( "Please insert a quarter." );
    	}        
	}
}
