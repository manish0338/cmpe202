/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardNum implements IDisplayComponent, IKeyEventHandler
{

	private IKeyEventHandler nextHandler ;
	private String number = "" ;
	private NumberDecorator decorator;

    public void setNext( IKeyEventHandler next) {
    	this.nextHandler = next ;
    }	

	public String display() {
		if ( number.equals("") )
			return "[4444 4444 4444 4444]" + "  " ;
		else
			return "[" + decorator.display(number) + "]" + "  " ;
	}	

	public void key(String ch, int cnt) {
		if ( cnt <= 16 ){
			if(ch.equalsIgnoreCase("X") && number.length()>0)
				number = number.substring(0, number.length()-1);
			else if (Character.isDigit(ch.charAt(0)))
				number += ch ;
			
		}
		else if ( nextHandler != null )
			nextHandler.key(ch, cnt) ;
	}	

	public void addSubComponent( IDisplayComponent c ) {
		return ; // do nothing
	}
	
	public void wrapDecorator(NumberDecorator decorator ){
		this.decorator = decorator;
	}

}