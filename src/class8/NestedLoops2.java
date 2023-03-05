package class8;

public class NestedLoops2 {
    public static void main(String[] args) {

        for(int i = 0; i < 10; i++) { // controls how many lines

            for(int j = 0; j< 5; j++) { // controls how many stars
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
