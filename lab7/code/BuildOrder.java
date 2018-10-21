  

public class BuildOrder {

    public static Component getOrder()
    {
        Composite order = new Composite( "Order" ) ;
//        order.addChild(new Leaf("Crispy Onion Strings", 5.50 ));
//        order.addChild(new Leaf("The Purist", 8.00 ));

        CustomBurger customBurger = new CustomBurger( "Build Your Own Burger" ) ;
        // base price for 1/3 lb
        Burger b = new Burger( "Burger Options" ) ;
        String[] bo = { "Organic Bison", "1/2lb.", "On A Bun" } ;
        b.setOptions( bo ) ;
        // 1 cheese free, extra cheese +1.00
        Cheese c = new Cheese( "Cheese Options" ) ;
        String[] co = { "Yellow American", "Spicy Jalapeno Jack" } ;
        c.setOptions( co ) ;
        c.wrapDecorator( b ) ;
        
        PremiumCheese pc = new PremiumCheese("Premium Cheese Options");
        String[] pco = {"Danish Blue Cheese"};
        pc.setOptions( pco ) ;
        pc.wrapDecorator( c ) ;
        
        // 4 toppings free, extra +.75
        Toppings t = new Toppings( "Toppings Options" ) ;
        String[] to = { "Dill Pickle Chips", "Black Olives", "Spicy Pickles" } ;
        t.setOptions( to ) ;
        t.wrapDecorator( pc ) ;
        // premium topping +1.50
        Premium p = new Premium( "Premium Options" ) ;
        String[] po = { "Marinated Tomatoes" } ;
        p.setOptions( po ) ;
        p.wrapDecorator( t ) ;
        // 1 sauce free, extra +.75
        Sauce s = new Sauce( "Sauce Options" ) ;
        String[] so = { "Mayonnaise", "Thai Peanut Sauce" } ;
        s.setOptions( so ) ;
        s.wrapDecorator( p ) ;
        
        Bun bun = new Bun( "Bun Options" );
        String[] buno = { "Ciabatta" };
        bun.setOptions( buno ) ;
        bun.wrapDecorator( s ) ;
        
        Side side = new Side ( "Side Options" );
        String[] sideo = { "Shoestring Fries" };
        side.setOptions( sideo ) ;
        side.wrapDecorator( bun ) ;
        
        // Setup Custom Burger Ingredients
        customBurger.setDecorator( side ) ;
        customBurger.addChild( b ) ;
        customBurger.addChild( c ) ;
        customBurger.addChild( pc ) ;
        customBurger.addChild( t ) ;
        customBurger.addChild( p ) ;
        customBurger.addChild( s ) ;
        customBurger.addChild( bun ) ;
        customBurger.addChild( side ) ;
        
        CustomBurger customBurger1 = new CustomBurger( "Build Your Own Burger" ) ;
        // base price for 1/3 lb
        Burger b1 = new Burger( "Burger Options" ) ;
        String[] bo1 = { "Hormone & Antibiotic Free Beef*", "1/3lb.", "On A Bun" } ;
        b1.setOptions( bo1 ) ;
        // 1 cheese free, extra cheese +1.00
        Cheese c1 = new Cheese( "Cheese Options" ) ;
        String[] co1 = { "Smoked Gouda", "Greek Feta" } ;
        c1.setOptions( co1 ) ;
        c1.wrapDecorator( b1 ) ;
        
        PremiumCheese pc1 = new PremiumCheese("Premium Cheese Options");
        String[] pco1 = {"Fresh Mozzarella"};
        pc1.setOptions( pco1 ) ;
        pc1.wrapDecorator( c1 ) ;
        
        // 4 toppings free, extra +.75
        Toppings t1 = new Toppings( "Toppings Options" ) ;
        String[] to1 = { "Crushed Peanuts" } ;
        t1.setOptions( to1 ) ;
        t1.wrapDecorator( pc1 ) ;
        // premium topping +1.50
        Premium p1 = new Premium( "Premium Options" ) ;
        String[] po1 = { "Sunny Side Up Egg*","Marinated Tomatoes" } ;
        p1.setOptions( po1 ) ;
        p1.wrapDecorator( t1 ) ;
        // 1 sauce free, extra +.75
        Sauce s1 = new Sauce( "Sauce Options" ) ;
        String[] so1 = { "Habanero Salsa" } ;
        s1.setOptions( so1 ) ;
        s1.wrapDecorator( p1 ) ;
        
        Bun bun1 = new Bun( "Bun Options" );
        String[] buno1 = { "Gluten-Free Bun" };
        bun1.setOptions( buno1 ) ;
        bun1.wrapDecorator( s1 ) ;
        
        Side side1 = new Side ( "Side Options" );
        String[] sideo1 = { "Shoestring Fries" };
        side1.setOptions( sideo1 ) ;
        side1.wrapDecorator( bun1 ) ;
        
        // Setup Custom Burger Ingredients
        customBurger1.setDecorator( side1 ) ;
        customBurger1.addChild( b1 ) ;
        customBurger1.addChild( c1 ) ;
        customBurger1.addChild( pc1 ) ;
        customBurger1.addChild( t1 ) ;
        customBurger1.addChild( p1 ) ;
        customBurger1.addChild( s1 ) ;
        customBurger1.addChild( bun1 ) ;
        customBurger1.addChild( side1 ) ;
        
        // Add Custom Burger to the ORder
        order.addChild( customBurger );
        order.addChild( customBurger1 );
        return order ;
    }

}


/*

Counter Burger Menu:
https://thecounterburger.emn8.com/?store=Times%20Square

*/