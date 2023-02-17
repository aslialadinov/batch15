package HomeWorkDayProject2;

public class ShapeTester {
    public static void main(String[] args) {
        Shape[] shapes={new square(8),new circle()};

        for(Shape s:shapes){
            s.calculateArea();
            s.calculatePerimeter();
        }
    }
}
