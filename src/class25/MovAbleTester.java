package class25;

public class MovAbleTester {
    public static void main(String[] args) {
        MovAble [] washAble={new Car(),new Dog()};

        for(MovAble m:washAble){
            m.move();
        }
    }

}
