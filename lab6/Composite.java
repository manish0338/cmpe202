import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {

	private List<Component> components = new ArrayList<Component>()  ;
    private String description ;
    private float price = 0.00f;
    private PrintStrategy currentPrintStrategy;
    private PrintStrategy customerPrintStrategy;
    private PrintStrategy kitchenPrintStrategy;
    
    public Composite ( String d )
    {
    	this.customerPrintStrategy = new CustomerReceipt();
    	this.kitchenPrintStrategy = new KitchenReceipt();
        description = d ;
    }
    
    public Composite ( String d ,float price)
    {
    	this.customerPrintStrategy = new CustomerReceipt();
    	this.kitchenPrintStrategy = new KitchenReceipt();
    	this.price = price;
        description = d ;
    }

	public void printDescription() {
        if(this.currentPrintStrategy == this.customerPrintStrategy)
        	System.out.println(this.description + "           " + price);
        else
        	System.out.println(this.description );
		
        this.currentPrintStrategy.printReceipt(components);
		
		if(this.currentPrintStrategy == this.customerPrintStrategy)
        	System.out.println("\nTotal:    " + price);
        
    }

	public void addChild(Component c) {
        components.add( c ) ;
	}
	 
	public void removeChild(Component c) {
        components.remove(c) ;
	}
	 
	public Component getChild(int i) {
	    return components.get( i ) ;
	}
	
	public void customerReceiptStrategy(){
		this.currentPrintStrategy = this.customerPrintStrategy;
	}
	
	public void kitchenReceiptStrategy(){
		this.currentPrintStrategy = this.kitchenPrintStrategy;
	}

	public String getDescription() {
		return description;
	}
}
