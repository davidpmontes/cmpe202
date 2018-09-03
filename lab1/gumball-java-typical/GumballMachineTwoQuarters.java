
public class GumballMachineTwoQuarters extends GumballMachine
{	
	public GumballMachineTwoQuarters(int size)
	{
		super(size);
		setCost(50);
	}
	
	public void insertCoin( int value )
	{
		if ( getNum_money() < getCost())
			if (25 == value )
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
    			System.out.println( "Thanks for your quarters.  Gumball Ejected!" ) ;
    		}
    		else
    		{
    			System.out.println( "No More Gumballs!  Sorry, can't return your quarters." ) ;
    		}
    	}
    	else 
    	{
    		if ( 0 == getNum_money() )
    			System.out.println( "Please insert two quarters." ) ;
    		else if ( 25 == getNum_money() )
    			System.out.println( "Please insert a quarter." );
    	}        
	}
}
