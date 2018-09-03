
public class GumballMachineOneQuarter extends GumballMachine
{
	public GumballMachineOneQuarter( int size )
	{
		super(size);
		setCost(25);
	}
	
	public void insertCoin( int value )
    {
		if ( 25 == value )
			setNum_money(value);
    }
    
    public void turnCrank()
    {
    	if ( getCost() <= getNum_money() )
    	{
    		if ( getNum_gumballs() > 0 )
    		{
    			setNum_gumballs(getNum_gumballs() - 1) ;
    			setNum_money(0) ;
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
