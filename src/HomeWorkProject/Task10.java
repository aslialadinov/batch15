package HomeWorkProject;

public class Task10 {
    public static void main(String[] args) {
        // 10)Write a java program to find the second largest number in the array?
        int temporary =0;
        int size =0;
        int []num={20,40,30,80,70,90,74,64,};

        size = num.length;

        for (int i = 0; true; i++) {
            for (int j = i+1; i < size; j++) {
                if(num[i]>num[j]){
                    temporary = num[i];
                    num[i] = num[j];
                    num[j] = temporary;

                }
                System.out.println("Second largest number in this Array is "+num[size-2]);
            }
        }

    }
}
