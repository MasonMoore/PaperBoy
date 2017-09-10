/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program2;

/**
 *
 * @author Mason
 */
public class TestDriver {

    public static void main(String[] arg) {
        //create new paperboy
        PaperBoy paperBoy = new PaperBoy();

        //add five new customers with wallets
        paperBoy.addCustomer(new Customer("Jet", "Li", new Wallet(50)));
        paperBoy.addCustomer(new Customer("Wesley", "Snipes", new Wallet(0)));
        paperBoy.addCustomer(new Customer("Jason", "Statham", new Wallet(30)));
        paperBoy.addCustomer(new Customer("Sylvester", "Stallone", new Wallet(25)));
        paperBoy.addCustomer(new Customer("Arnold", "Swhartzenegger", new Wallet(10)));

        //display paperboy customers
        paperBoy.display();

        //collect payment from customers
        paperBoy.collectFromCustomers();

        //display customer
        paperBoy.display();
    }
}
