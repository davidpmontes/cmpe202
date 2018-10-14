package fiveGuys;

public class Main
{	
    public static void main(final String[] args)
    {
    	Register register = new Register();
    	
    	register.createOrder();
    	register.pay();
    	register.printPaperReceipt();
    	register.printPackingSlip();
    }
}
