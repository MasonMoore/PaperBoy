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
public class Wallet {

    //Initialize new value
    private float value;

    //@Constructor create new wallet with value
    public Wallet(float value) {
        this.value = value;
    }

    //@Return, return value in wallet
    public float getTotalMoney() {
        return value;
    }

    //@Param, set new wallet value
    public void setTotalMoney(float newValue) {
        value = newValue;
    }

    //@Param, add to value
    public void addMoney(float deposit) {
        value += deposit;
    }

    //@Param, subtract from value
    public void subtractMoney(float debit) {
        value -= debit;
    }

    //display wallet value
    public void display() {
        System.out.println("        Wallet has $ " + value);
    }
}
