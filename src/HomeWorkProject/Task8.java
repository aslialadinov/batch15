package HomeWorkProject;

public class Task8 {
    public static void main(String[] args) {
        // 8)Write a Java Program to print the first 10 numbers of Fibonacci series.

        int i=0;
        int n=10;
        int firstTerm=0;
        int secondTerm=1;

        System.out.println("Fibonachi Series from 0 to "+n+" ");

        while(i<=n) {
            System.out.println(firstTerm+",");
            int nextTerm=firstTerm+secondTerm;
            firstTerm=secondTerm;
            secondTerm=nextTerm;
            i++;

        }
    }
}
