/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffee;

/**
 *
 * @author AZ
 */

interface CoffeeMaker {

    void milk();

    void caffein();

    void sugar();

}
class CoffeeA implements CoffeeMaker {

    @Override
    public void milk() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Milk...poured!!");
    }

    @Override
    public void caffein() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Caffein...Added!!");
    }

    @Override
    public void sugar() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Sugar...Added");
    }

}

class CoffeeB implements CoffeeMaker {

    @Override
    public void milk() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Milk...poured!!");
    }

    @Override
    public void caffein() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Caffein...Added!!");
    }

    @Override
    public void sugar() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("No Sugar added!!");
    }

}

class CoffeeC implements CoffeeMaker {

    @Override
    public void milk() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Milk...poured!!");
    }

    @Override
    public void caffein() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Caffein...Added!!");
    }

    @Override
    public void sugar() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Sugar...Added");
    }

}


class CoffeeFactory {

    private static CoffeeFactory cFactory;

    private CoffeeFactory() {
    }


}

public class Coffee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
