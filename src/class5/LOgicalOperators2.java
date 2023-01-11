package class5;

public class LOgicalOperators2 {
    public static void main(String[] args) {

        System.out.println(true&&true);
        System.out.println(true&&false);
        System.out.println(false&false);

        double mathScore=92.5;
        double historyScore=91.5;
        double ScienceScore=93.5;

        if(mathScore>90&&historyScore>90&&ScienceScore>90){
            System.out.println("Brilliant student");
        }else{
            System.out.println("You need to work hard");
        }
    }
}
