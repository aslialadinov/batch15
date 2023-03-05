package HomeWorkDay3And4;

public class task2 {
    public static void main(String[] args) {
        /*Create a Java program and store values of mortgage rate and mortgage price.
         First, program should check if rate is higher than 4.5 user will not buy a house, otherwise user will consider buying.
         Once user decides to buy a house, if price of the house is larger than 200000 than user will take a loan, otherwise user will pay cash.
         */
        int mortgagePrice=280000;
        double mortgageRate=3.5;

        if(mortgageRate>4.5){
            System.out.println("User will not buy a house");
        }else{
            System.out.println("User will consider buying");
        }
        if(mortgagePrice>200000){
            System.out.println("User will consider a loan");
        }
        else{
            System.out.println("User will pay cash");
        }
    }
}
