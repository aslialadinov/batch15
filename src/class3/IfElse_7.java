package class3;

import java.sql.SQLOutput;

public class IfElse_7 {
    public static void main(String[] args) {

        int money=150;
        System.out.println(money>=300);
        if(money>=300)
        {
            System.out.println("yay lets go for shopping");
        }

        if(money<300){
            System.out.println("Lets save more");
            System.out.println("Maybe I am spending too much on food");
        }
    }
}
