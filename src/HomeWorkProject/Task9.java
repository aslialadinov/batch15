package HomeWorkProject;

public class Task9 {
    public static void main(String[] args) {
        // 9)Maximum and minimum number in the array?
        int num1[] = new int[]{5,2033,47,52,11,21,30,44,62};

        int SmallNum=num1[0];
        int LargeNum=num1[0];

        for (int i = 0; i < num1.length; i++) {
          if(num1[i]>LargeNum){
              LargeNum=num1[i];
          }else if(num1[i]<SmallNum){
              SmallNum=num1[i];
          }
        }
        System.out.println("Smallest number is "+SmallNum);
        System.out.println("Large number is "+LargeNum);
    }
}
