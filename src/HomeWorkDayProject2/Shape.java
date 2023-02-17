package HomeWorkDayProject2;
/*
    Create an Interface 'Shape' with undefined
    methods as calculateArea and
    calculatePerimeter. Create 2 classes Circle &
    Square that implements functionality defined in
    the Shape Interface. Test your code.
 */
public interface Shape {
       void calculateArea();
       void calculatePerimeter();
}
class circle implements Shape{

    double pi=1.12;
    double radius;

     void cirlce(double radius){
        this.radius=radius;
    }
    @Override
    public void calculateArea() {
    double area= (radius*radius)*pi;
        System.out.println(area);
    }

    @Override
    public void calculatePerimeter() {
     double perimeter= (2*pi)*radius;
        System.out.println(perimeter);
    }
}
class square implements Shape{

    int a;

    square(int a){
        this.a=a;
    }

    @Override
    public void calculateArea() {
        int area=a*a;
        System.out.println(area);
    }

    @Override
    public void calculatePerimeter() {
        int perimeter=4*a;
        System.out.println(perimeter);
    }
}

