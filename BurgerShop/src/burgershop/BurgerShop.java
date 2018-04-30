/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burgershop;

import java.util.LinkedList;
import java.util.Scanner;

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

class Chicken implements Burger {

    private MadeBurger newBurger = new MadeBurger();

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

class Beef implements Burger {

    private MadeBurger newBurger = new MadeBurger();

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

class MadeBurger {

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

class Waiter {

    Burger aBurger;

    public void Make(Burger b) {
        aBurger = b;
        aBurger.addPatty();
        aBurger.addSauce();
        aBurger.addCheese();
    }

}

public class BurgerShop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("\t***Welcome to TakeOut,Dhanmondi***\t\t\n");

        System.out.println("\tWhich would you prefer?? Beef or Chicken?? :\n \t//for Beef press 'b' and 'c' for chicken!!\\ \n");

        Scanner sc = new Scanner(System.in);
        char choice;
        choice = sc.next().charAt(0);

        System.out.println("==================================================");
        System.out.println("\tYour Juicy and Hot Burger is on the way......\n");

        Waiter newWaiter = new Waiter();

        if (choice == 'c') {
            Burger chickenBurger = new Chicken();
            newWaiter.Make(chickenBurger);
            MadeBurger b1 = chickenBurger.getBurger();
            b1.Show();
        } else if (choice == 'b') {
            Burger beefBurger = new Beef();
            newWaiter.Make(beefBurger);
            MadeBurger b1 = beefBurger.getBurger();
            b1.Show();
        }
        System.exit(0);
    }

}
