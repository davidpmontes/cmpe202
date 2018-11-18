package strategy;
import java.util.ArrayList;
import java.util.stream.IntStream;

public class DataSet {

    private ArrayList<Integer> data = new ArrayList<Integer>()  ;
	private SortingStrategy strategy;
	private int num = 3;
    private int[] sortedList = new int[num] ;

    public DataSet()
    {
        strategy = new BubbleSort() ;
        data.clear();
        data.add( 3 ) ;
        data.add( 1 ) ;
        data.add( 5 ) ;
        

        //for ( int i = 0; i < data.size(); i++ )
        //  sortedList[i] = data.get(i) ;
        
        IntStream
        	.range(0, data.size())
	        .forEach(i -> sortedList[i] = data.get(i));
    }
	 
	public void doSort() {
        try {
            strategy.sort( sortedList );
            System.out.println( "List sorted with " + strategy.toString() );
        } catch ( Exception e )
        {
            System.out.println( e.toString() );
        }
	}
	 
	public void display() {
        //for ( int i = 0; i < num; i++ )
        //    System.out.println( sortedList[i] );
        
        IntStream
	    	.range(0, num)
	        .forEach(i -> System.out.println( sortedList[i]));
	}
	 
	public void resetData() {
        //for ( int i = 0; i < data.size(); i++ )
        //    sortedList[i] = data.get(i) ;
		
        IntStream
	    	.range(0, data.size())
	        .forEach(i -> sortedList[i] = data.get(i));
		
        System.out.println( "Data Reset Done!");
	}
	 
	public void changeStrategy(SortingStrategy s) {
	    strategy = s ;
	}
	 
}
 
