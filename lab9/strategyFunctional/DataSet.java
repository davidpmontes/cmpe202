package strategyFunctional;
import java.util.ArrayList;
import java.util.stream.IntStream;

public class DataSet {

    private ArrayList<Integer> data = new ArrayList<Integer>()  ;
	private SortingStrategy strategy;
	private int num = 12;
    private int[] sortedList = new int[num] ;

    public DataSet(SortingStrategy ss)
    {
        strategy = ss ;
        data.clear();
        data.add( 198 ) ;
        data.add( 56  ) ;
        data.add( 12  ) ;
        data.add( 34  ) ;
        data.add( 62  ) ;
        data.add( 99  ) ;
        data.add( 145  ) ;
        data.add( 87  ) ;
        data.add( 26  ) ;
        data.add( 37  ) ;
        data.add( 13  ) ;
        data.add( 16  ) ;  
        

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
 
