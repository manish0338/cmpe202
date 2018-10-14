
public class Main {

	public static void main(String[] args) {
		Component theOrder = BuildOrder.getOrder() ;
		((Composite)theOrder).customerReceiptStrategy();
		
		System.out.println("Customer Receipt\n");
        theOrder.printDescription();
        
        System.out.println("\n\nKitchen Receipt\n");
        ((Composite)theOrder).kitchenReceiptStrategy();
        theOrder.printDescription();
	}

}
