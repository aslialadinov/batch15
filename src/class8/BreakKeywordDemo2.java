package class8;

public class BreakKeywordDemo2 {
    public static void main(String[] args) {

        //Create boolean program without break keyword before

        int temp=75;

        while (temp<=105){
            if(temp<=100){
                System.out.println("I love summer because temperature id "+temp);
            }else {
                System.out.println("It is very hot "+temp);
            }
            temp+=5;
        }
    }
}
