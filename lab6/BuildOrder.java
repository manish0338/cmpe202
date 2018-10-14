
public class BuildOrder {

	public static Component getOrder()
    {
		
		Composite burger = new Composite("LBB",5.59f);
		burger.addChild(new Leaf("{{{{ BACON }}}}"));
		burger.addChild(new Leaf("LETTUCE"));
		burger.addChild(new Leaf("TOMATO"));
		burger.addChild(new Leaf("->|G ONION"));
		burger.addChild(new Leaf("->|JALA Grilled"));
		
		return burger;
    }
}
