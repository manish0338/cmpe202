
public class NumberDecorator {
	
	private int distance;
	private String divider;
	
	public NumberDecorator(int distance, String divider){
		this.distance = distance;
		this.divider = divider;
	}

	
	public String display(String display) {
		
		StringBuffer rval = new StringBuffer("");
		for(int i = 0; i < display.length(); i++){
			rval.append(display.charAt(i));
			if((i+1)%distance==0 && i!=display.length()-1)
				rval.append(divider);
		}
		return rval.toString();
	}

	
}
