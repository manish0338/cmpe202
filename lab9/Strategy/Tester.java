public class Tester {

    public static void main( String[] args)
    {
        DataSet dataset = new DataSet() ; 
        dataset.changeStrategy( new PrimeStrategy() );
        dataset.display();
        dataset.changeStrategy( new EvenStrategy() );
        dataset.display();
        
    }
 
}
 
