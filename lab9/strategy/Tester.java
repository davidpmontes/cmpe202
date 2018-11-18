package strategy;

public class Tester
{    
    SortingStrategy bubbleSort = (int a[]) -> {
        for (int i = a.length; --i>=0; ) {
            boolean flipped = false;
            for (int j = 0; j<i; j++) {
                if (a[j] > a[j+1]) {
                    int T = a[j];
                    a[j] = a[j+1];
                    a[j+1] = T;
                    flipped = true;
                }
            }
            if (!flipped) {
                return;
            }
        }
    };
    
   	SortingStrategy2 mergeSort2 = (int a[], int lo0, int hi0) -> {
        int lo = lo0;
        int hi = hi0;

        if (lo >= hi) {
            return;
        }
        int mid = (lo + hi) / 2;

        /*
         *  Partition the list into two lists and sort them recursively
         */
        this.mergeSort2.sort(a, lo, mid);
        this.mergeSort2.sort(a, mid + 1, hi);

        /*
         *  Merge the two sorted lists
         */
        int end_lo = mid;
        int start_hi = mid + 1;
        while ((lo <= end_lo) && (start_hi <= hi)) {
            if (a[lo] < a[start_hi]) {
                lo++;
            } else {
                /*
                 *  a[lo] >= a[start_hi]
                 *  The next element comes from the second list,
                 *  move the a[start_hi] element into the next
                 *  position and shuffle all the other elements up.
                 */
                int T = a[start_hi];
                for (int k = start_hi - 1; k >= lo; k--) {
                    a[k+1] = a[k];
                }
                a[lo] = T;
                lo++;
                end_lo++;
                start_hi++;
            }
        }
    };
    
    SortingStrategy mergeSort = (int a[]) -> {
        mergeSort2.sort(a, 0, a.length-1);
    };
	
    public static void main( String[] args)
    {
    	Tester tester = new Tester() ;
        DataSet dataset = new DataSet() ; // defaults to BubbleSort
        dataset.display();
        dataset.doSort();
        dataset.display();
        dataset.resetData();
        dataset.display();
        dataset.changeStrategy( tester.bubbleSort );
        dataset.doSort();
        dataset.display();
        dataset.resetData();
        dataset.display();
        dataset.changeStrategy( tester.mergeSort );
        dataset.doSort();
        dataset.display();
    }
    
    
 
}
 
