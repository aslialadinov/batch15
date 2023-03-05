package class15;

public class MPractice4 {
    /*
    create a method that takes two numbers as parameter and return the larger number
    return type=> int
  name => largerNumber
  parameters=> int num1, int num2
  {
  if
  }
    */

    int largerNUmber(int num1, int num2){
        if(num1>num2){
            return num1;
        }else{
            return num2;
        }
    }


    public static void main(String[] args) {
         MPractice4 mp=new MPractice4();
        System.out.println(mp.largerNUmber(12,13));
    }
  }

