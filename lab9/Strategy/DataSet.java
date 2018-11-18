
import java.util.ArrayList;

public class DataSet {

    private ArrayList<Integer> data = new ArrayList<Integer>()  ;
	private FilterStrategy strategy;

    public DataSet()
    {
        strategy = new EvenStrategy() ;
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
    }
	 
	public void display() {
		strategy.print(this.data);
	}
	 
	public void resetData() {
		this.data.clear();
	}
	 
	public void changeStrategy(FilterStrategy s) {
	    strategy = s ;
	}
	 
}
 
