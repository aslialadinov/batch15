package class10;

public class ForEachLoopDemo3 {
    public static void main(String[] args) {

        int[] arr={10,13,20,25,45,50};
        //We can not update the elements in for each loop because we do not have access to index;
        for(int x:arr){
            if(x%2!=0){
                x=0;

            }
        }


    }
}
