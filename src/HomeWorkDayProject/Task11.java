package HomeWorkDayProject;

public class Task11 {
    public static void main(String[] args) {
     // 11)Write a program to print out duplicate elements from an Array of Strings?

        String [] names = {"flower","vase","flower","table","desk"};
        for (int i = 0; i < names.length; i++) {
            for (int j = i+1; j < names.length; j++) {
                if(names[i] == names[j]){
                    System.out.println(" The duplicate elements are : "+names[j]);
                }
            }
        }
    }
}
