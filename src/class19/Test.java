package class19;

public class Test {
    public static void main(String[] args) {

        BankAccount ba=new BankAccount();
        ba.accountNumber=765765875875l;
        ba.money=1000;
        ba.deposit();

        System.out.println(ba.accountNumber);
        System.out.println(ba.money);
        //ba.tranfer(); methods defined inside child class not available to the parent class

        System.out.println("  -- Creating an Object of Checking account");

        Checking check=new Checking();
        //features from parent
        check.accountNumber=5765;
        check.money=780;
        //features from checking class itself
        check.interest=0;

        check.deposit(); //from parent
        check.transfer(); //from child

        System.out.println("  -- Creating an Object of Savings account");

        Savings save=new Savings();
        save.accountNumber=8758585985l;
        save.money=7657;
        save.profit=100;
        //save.interest=0; siblings features are not available

        save.deposit();//from parent
        save.takeProfit();//comes from savings
        //save.transfer(); not available

        //finish creating SuperSavings object and see which feature available to that class

        SuperSavings superSave=new SuperSavings();
        superSave.accountNumber=14578569l;
        superSave.money=4578;
        superSave.profit=200;

        superSave.deposit();
        superSave.takeProfit();
        superSave.superSaving();

        System.out.println("Account number: "+superSave.accountNumber);
        System.out.println("Money: "+superSave.money);
        System.out.println("Profit: "+superSave.profit);

    }
}
