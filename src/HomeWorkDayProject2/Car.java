package HomeWorkDayProject2;

public class Car {
   double carPrice;
    String color;
    void calculateSalePrice(){
        double sPrice;
        sPrice = carPrice * 0.0415;
        System.out.println(sPrice);
    }
}
class Truck extends Car{
    int weight;

    Truck(int weight,int carPrice){
        super.carPrice=carPrice;
        this.weight=weight;
    }
    void calculateSalePrice() {
        if (weight>2000){
            carPrice=carPrice-(carPrice*0.1);
        }else {
            carPrice =carPrice-(carPrice * 0.2);
        }
        System.out.println(carPrice);
    }
}
class Sedan extends Car{
    int length;

    Sedan(int l,int carPrice) {
        this.length = l;
        super.carPrice=carPrice;

    }
    void calculateSalePrice() {
        if (length>20) {
            carPrice = carPrice-(carPrice * 0.05);
        } else {
            carPrice =carPrice-(carPrice * 0.1);
        }
        System.out.println(carPrice);
    }

}
