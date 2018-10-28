/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

/**
 *  Main App Class for Displaying Screen.
 */
public class App {

    private Screen screen;
    private CreditCardNum num;
    private CreditCardExp exp;
    private CreditCardCVC cvc;
    private int count;

    public App() {

        screen = new Screen();
        num = new CreditCardNum();
        exp = new CreditCardExp();
        cvc = new CreditCardCVC();

        num.wrapDecorator(new NumberDecorator(4," "));
        exp.wrapDecorator(new NumberDecorator(2,"/"));
        screen.addSubComponent(num);
        screen.addSubComponent(exp);
        screen.addSubComponent(cvc);

        count = 0;

    }

    public String display() {
        String output = "";
        output += "========================================\n";
        output += screen.name() + "\n";
        output += "========================================\n";
        output += "\n\n\n\n";
        output += screen.display() + "\n";
        output += "\n\n\n\n";
        output += "========================================\n";
        return output;
    }

    public void key(String ch) {
    	if(ch.length()>1)
    		return;
    	
    	if(count<23 && Character.isDigit(ch.charAt(0))){
    		count++;
    		System.out.println(count + "   count");
    		screen.key(ch, count);
    	}else if(ch.equalsIgnoreCase("X") && count>0){
        	
        	System.out.println(count + "   count");
        	screen.key(ch, count);
        	count--;
    	}
        
    }

}

