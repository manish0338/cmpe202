import java.util.List;

public class CustomerReceipt implements PrintStrategy{

	@Override
	public void printReceipt(List<Component> components) {
		
		for (Component obj  : components)
        {
            obj.printDescription();
        }
	}
	
}
