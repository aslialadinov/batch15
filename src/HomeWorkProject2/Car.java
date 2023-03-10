package HomeWorkProject2;
/*
  Create a Class Car that would have the
  following fields: carPrice and color and method
  calculateSalePrice() which should be returning
  a price of the car.
  Create 2 sub classes: Sedan and Truck. The Truck
  class has a field as weight and has its own
  implementation of calculateSalePrice() method
  in which returned price is calculated as
  following: if weight>2000 then returned price
  car should include 10% discount, otherwise 20%
  discount.
  The Sedan class has field as length and also
  does it is own implementation of
  calculateSalePrice(): if length of sedan is >20
  feet then returned car price should include 5%
  discount, otherwise 10% discount
* */

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
