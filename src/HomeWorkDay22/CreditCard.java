package HomeWorkDay22;

public class CreditCard{

    /* Create a class CreditCard and define variable balance and interest. Create an instance method that will calculate interest based on the given balance.
       Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
       Call the method by creating an object of each of the three classes.
     */
        long balance;
        double interest;
        double CalculateInterest () {
        balance = 200;
        interest = 2.1;

        return (interest / 12) * balance;
    }
    }

class Visa extends CreditCard{

}
class AX extends CreditCard{
    double CalculateInterest(){
        balance=300;
        interest=3.1;

        return (interest/12)*balance;
    }
}
class CreditCardTester {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard();
        System.out.println(creditCard.CalculateInterest());
        Visa visa = new Visa();
        System.out.println(visa.CalculateInterest());
        AX ax = new AX();
        System.out.println(ax.CalculateInterest());
    }
}

