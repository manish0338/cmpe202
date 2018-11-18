import java.util.ArrayList;

public class PrimeStrategy implements FilterStrategy {

	@Override
	public void print(ArrayList<Integer> data) {
		System.out.println("\nPrime numbers");
		
		for (int i=0; i < data.size(); i++) {
			int num = data.get(i);
			boolean flag = false;
			for (int j = 2; j <= num / 2; ++j) {
				if (num % j == 0) {
					flag = true;
					break;
				}
			}

			if (!flag)
				System.out.println(num + " ");
			
		}
	}

}
