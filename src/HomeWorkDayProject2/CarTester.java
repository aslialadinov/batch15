package HomeWorkDayProject2;

public class CarTester {
    public static void main(String[] args) {

        Car [] cars={new Truck(350,70000),new Sedan(20,60000)};
        for(Car c:cars){
            c.calculateSalePrice();
        }
    }
}
