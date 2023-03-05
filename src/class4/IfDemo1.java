package class4;

public class IfDemo1 {
    public static void main(String[] args) {

        int money=15000;

        if(money>1000){
            System.out.println("Lets buy an Iphone");
        }
        if(money>2000){
            System.out.println("Lets also buy a Macbook");
        }

        boolean motherDay=true;

        if(motherDay){
            System.out.println("Happy mothers day");
        }


        String name="Asli";
        //equals method is only for non primitives
        if(name.equals("Asli")){
            System.out.println("I love football");
        }
    }

}
