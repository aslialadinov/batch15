package HomeWorkDay11;

public class PhoneTester {
    public static void main(String[] args) {

        Phone samsung = new Phone();
        samsung.name = "Andriud";
        samsung.color = "White";

        samsung.samsungPictures();
        samsung.batteryStamina();


        Phone pixel = new Phone();
        pixel.name = "Pixel";
        pixel.weight = 10.4;
        pixel.operator = "iOS";

        pixel.pixelQuality();

        Phone iPhone = new Phone();
        iPhone.color = "Blue";
        iPhone.price = 1299;

        iPhone.iPhoneQuality();




    }
}



