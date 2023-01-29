package HomeWorkDay15;


public class Task5 {
    
    // 5) Write a method to return whether given number is prime or not?

    boolean isPrime (int num){
        if(num<1){
            return false;
        }
        for (int i = 2; i < num; i++) {
            if(num %2==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
         Task5 task=new Task5();
        System.out.println(task.isPrime(11));
    }

}

