/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program2;

import java.util.ArrayList;

/**
 *
 * @author Mason
 */
public class PaperBoy {

    //Declare variables
    private float totalCollected;
    private ArrayList<Customer> myCustomers;

    //@Constructor, create new paperboy
    public PaperBoy() {
        myCustomers = new ArrayList();
    }

    //@Return, collect money from all customers
    public float collectFromCustomers() {
        //Declare variables
        float payment = 2;
        float total = 0;
        float paidAmount;

        System.out.println("Payments: ");

        //get and display payments from each customer
        for (int i = 0; i < myCustomers.size(); i++) {
            paidAmount = myCustomers.get(i).getPayment(payment);
            System.out.print("  Customer: ");
            System.out.println(myCustomers.get(i).getLastName() + ", " + myCustomers.get(i).getFirstName());

            if (paidAmount == payment) {
                System.out.println("        Payment: $ " + payment);
                total += payment;
            } else {
                System.out.println("     Payment: MISSED PAYMENT");
            }
        }

        System.out.println();

        //Update total collected and return value
        totalCollected += total;
        return total;
    }

    //@Param, add new customer to paperboy
    public void addCustomer(Customer customer) {

        myCustomers.add(customer);
    }

    //display each customer of paperboy
    public void display() {
        System.out.println("Customer List: ");

        for (int i = 0; i < myCustomers.size(); i++) {
            myCustomers.get(i).display();
        }

        System.out.println();

    }
}
