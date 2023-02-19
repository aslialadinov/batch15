package class28;

import java.util.ArrayList;

public class BoxingDemo {
    public static void main(String[] args) {

        Integer integer=new Integer(10);
        int number=integer; // auto-unboxing
        int number2=integer.intValue();// unboxing manual part

        double d=12.3;
        Double wrapperD=new Double(d);// was called boxing manul part
        Double wrapperP=d;// auto-boxing;

        Float f=12f;
        ArrayList<Double> arrayList=new ArrayList<>();
        arrayList.add(12.0);

        double fg=12f;// it works because it is up casting, and it works automaticly


    }


}
