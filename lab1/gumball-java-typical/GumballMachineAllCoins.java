
public class GumballMachineAllCoins extends GumballMachine
{
	public GumballMachineAllCoins( int size )
	{
		super(size);
		setCost(50);
	}
	
	public void insertCoin( int value )
    {
		if ( getNum_money() < getCost())
			if (5 == value || 10 == value || 25 == value)
				setNum_money(getNum_money() + value);	
    }
    
    public void turnCrank()
    {
    	if ( getCost() <= getNum_money() )
    	{
    		if ( getNum_gumballs() > 0 )
    		{
    			setNum_gumballs(getNum_gumballs() - 1) ;
    			setNum_money(0) ;
    			System.out.println( "Thanks for your money.  Gumball Ejected!" ) ;
    		}
    		else
    		{
    			System.out.println( "No More Gumballs!  Sorry, can't return your money." ) ;
    		}
    	}
    	else 
    	{
	    	System.out.println( String.format( "Please insert %d cents. (Quarters, dimes and nickels only).", getCost() - getNum_money()) );
    	}        
    }
}
