/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardNum implements IDisplayComponent, IKeyEventHandler
{

	private IKeyEventHandler nextHandler ;
	private String number = "" ;

    public void setNext( IKeyEventHandler next) {
    	this.nextHandler = next ;
    }	

	public String display() {
		if ( number.equals("") )
			return "[4444 4444 4444 4444]" + "  " ;
		else
			return "[" + number + "]" + "  " ;
	}	

	public void key(String ch, int cnt)
	{

		if (ch.equalsIgnoreCase("X")) 
		{
			if ( cnt < 16)
			{
				number = number.substring(0, number.length() - 1);

				if ( cnt == 4 || cnt == 8 || cnt == 12)
					number = number.substring(0, number.length() - 1);
			}
			else if ( nextHandler != null )
			{
				nextHandler.key(ch, cnt) ;
			}
		}
		else
		{
			if (cnt <= 16)
			{
				if ( cnt == 5 || cnt == 9 || cnt == 13)
					number += " ";

				number += ch ;
			}
			else if ( nextHandler != null )
			{
				nextHandler.key(ch, cnt) ;
			}
		}
	}	

	public void addSubComponent( IDisplayComponent c ) {
		return ; // do nothing
	}

}