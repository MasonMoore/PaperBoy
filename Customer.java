package Program2;

/**
 *
 * @author Mason
 */
public class Customer {

    //Declare variables
    private String firstName;
    private String lastName;
    private Wallet myWallet;

    //@Constructor, create new customer with wallet
    public Customer(String firstName, String lastName, Wallet myWallet) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.myWallet = myWallet;
    }

    //@Return, return first name
    public String getFirstName() {
        return firstName;
    }

    //@Return, return last name
    public String getLastName() {
        return lastName;
    }

    //@Return, @Param, get payment from customer
    public float getPayment(float bill) {
        if (myWallet != null) {
            if (myWallet.getTotalMoney() >= bill) {
                myWallet.subtractMoney(bill);
                return bill;
            }
        }
        return 0;
    }

    //display customer and their wallet
    public void display() {
        System.out.println("    " + lastName + ", " + firstName);
        myWallet.display();
    }
}
