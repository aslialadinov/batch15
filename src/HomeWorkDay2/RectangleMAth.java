package HomeWorkDay2;

public class RectangleMAth {
    public static void main(String[] args) {
        double width=5.0;
        double height=8.0;
        double perimeter=width*height;
        double volume= 2*width+2*height;

        System.out.println("The perimeter of a rectangle width is 5.0 "+"and height 8.0is equal"+ volume +
                " and are"+ perimeter+ "");

        System.out.println("The perimeter of a ractangle width 5.0"+"and height 8.0 is equal"+perimeter);
/*5) Write a program to print the area and perimeter of a rectangle with width = 5 and  height = 8. Your program should say. “The perimeter of a rectangle with width  and height __ is equal to __ and the area is __”
The perimeter of a rectangle with width 5.0 and height 8.0 is equal to 26.0 and the area is 40.0*/

        int w=5;
        int h=8;
        int v= w*h;
        int o=2*w+2*h;
        System.out.println("The perimeter of a rectangle width "+ w +"and the height" + h +"is equal to" +
                ""+ o +"and area is" + v +" ");

    }
}
