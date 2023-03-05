package HomeWorkDay17;

public class Task3 {
    /*
    3) Write a java class that have 4 constructors with 4 different access levels of constructors
    (private,public,default,protected)
    and create 4 objects of this class: 1 - inside same class; 2 - from outside the class;
     3 - from different class inside different package  and observe result.
     */
    String name;
    int ssn;
    String state;
    String phoneNumber;

    private Task3(String name2,int ssn2,String state2,String number){
        name=name2;
        ssn=ssn2;
        state=state2;
        phoneNumber=number;

    }
    Task3(String name2,String number,String state2) {
        name = name2;
        state = state2;
        phoneNumber = number;
    }
    protected Task3(String name2,int ssn2,String number) {
        name = name2;
        ssn = ssn2;
        phoneNumber = number;
    }
    public Task3(int ssn2,String state2,String number,String name2) {
        ssn = ssn2;
        state = state2;
        phoneNumber = number;
        name=name2;
    }

    public void printInfo(){
        System.out.println(name+ssn+state+phoneNumber);
    }

    public static void main(String[] args) {
        Task3 pri=new Task3("Linda ",15468," Ca "," (309)458-4785");
        pri.printInfo();
    }
}

