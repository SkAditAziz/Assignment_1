/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burgershop;

import java.util.LinkedList;

/**
 *
 * @author AZ
 */
interface Burger {

    void addPatty();

    void addSauce();

    void addCheese();

    MadeBurger getBurger();
}

class Chicken implements Burger{

    private MadeBurger newBurger = new madeBurger();

    @Override
    public void addPatty() {
        newBurger.Add("Chicken Patty...Added!!");
    }

    @Override
    public void addSauce() {
        newBurger.Add("Chicken Burger Sauce...Added!!");
    }

    @Override
    public void addCheese() {
        newBurger.Add("Chicken Burger Cheese...Added!!");
    }

    @Override
    public MadeBurger getBurger() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return newBurger;
    }

    
}

class Beef implements Burger{

    private madeBurger newBurger = new madeBurger();

    @Override
    public void addPatty() {
        newBurger.Add("Beef Patty...Added!!");
    }

    @Override
    public void addSauce() {
        newBurger.Add("Beef Burger Sauce...Added!!");
    }

    @Override
    public void addCheese() {
        newBurger.Add("Beef Burger Cheese...Added!!");
    }

    @Override
    public MadeBurger getBurger() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return newBurger;
    }
    
}

class MadeBurger{
    
    private LinkedList<String> ingredients;
    
    public MadeBurger() {
        ingredients = new LinkedList<>();
    }
    
        public void Add(String i) {
        ingredients.addLast(i);
    }

    public void Show() {
        System.out.println("\n Burger served as below:");
        for (int i = 0; i < ingredients.size(); i++) {
            System.out.println(ingredients.get(i));
        }
    }
    
}

public class BurgerShop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
