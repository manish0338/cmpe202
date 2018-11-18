import java.util.ArrayList;

public class EvenStrategy implements FilterStrategy{

	@Override
	public void print(ArrayList<Integer> data) {
		for (int i=0; i < data.size(); i++) {
			int num = data.get(i);

			if (num%2==0)
				System.out.print(num + " ");
			
		}
		System.out.println("");
	}

}
