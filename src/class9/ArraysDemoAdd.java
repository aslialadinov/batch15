package class9;

public class ArraysDemoAdd {
    public static void main(String[] args) {

        // 10 20 30 45 50
        // write code to add all the numbers from array

        int sum=0;
        int [] num={10,20,30,45,50};

        for (int i=0; i<num.length; i++){
            sum+=num[i]; //sum=sum+num[i]
        }
        System.out.println(sum);
    }
}

