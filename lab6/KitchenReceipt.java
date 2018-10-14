import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class KitchenReceipt implements PrintStrategy{

	@Override
	public void printReceipt(List<Component> components) {
		
		Collections.sort(components, new Comparator<Component>() {

			@Override
			public int compare(Component o1, Component o2) {
				if(o1.getDescription().startsWith("-")&& (!(o2.getDescription().startsWith("-")||o2.getDescription().startsWith("{"))))
					return 1;
				
				return o1.getDescription().compareTo(o2.getDescription());
			}
			
		});
		for (Component obj  : components)
        {
            obj.printDescription();
        }
	}
}
