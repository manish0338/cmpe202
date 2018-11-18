package lambda;

import java.util.ArrayList;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class Tester {

	public static boolean isPrime(int i) {
        IntPredicate isDivisible = index -> i % index == 0;
        return i > 1 && IntStream.range(2, i).noneMatch(isDivisible);
	}
	
    public static void main( String[] args)
    {
        DataSet dataset = new DataSet() ; 
        
        dataset.changeStrategy( new FilterStrategy(){
			@Override
			public void print(ArrayList<Integer> data) {
				System.out.println("\nEven numbers");
				data.stream().map(number -> number).filter(number -> number%2==0).forEach(System.out::println);
			}} );
        
        dataset.display();
        
        dataset.changeStrategy( new FilterStrategy(){
			@Override
			public void print(ArrayList<Integer> data) {
				System.out.println("\nPrime numbers");
				data.stream().map(number -> number).filter(Tester::isPrime).forEach(System.out::println);
			}} );
        
        dataset.display();
        
    }
 
}