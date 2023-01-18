package class10;

public class ForEachLoopDemo2 {
    public static void main(String[] args) {
        //Limitations of each Loop
        int [] arr={10,13,20,25,45,50};
       // arr[1]=0; this is how we update a single element in an array

        for (int i = 0; i <arr.length; i++) {
            if(arr[i]%2!=0){
                System.out.println(arr[i]);
            }

        }
        //Replace all the odd numbers in this array with the help a normal loop
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]%2!=0){
                arr[i] =0; // this how to replace all odd numbers

            }

        }
        System.out.println("After replacing all the odd numbers with zero");
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);

        }

    }
}
