package HomeWorkDay20;
/*
 Write program: userClass  that has a constructor that initializes instance variable name and mobile number.
 Create a subclass  userInfo that will have user address variable and it also being initialized
 through constructor call. Print users name, mobile number and address in userDetails method. Test your code.
 */
public class UserClass {
    String name;
    String mobileNum;

    UserClass(String name,String mobileNum){
        this.name=name;
        this.mobileNum=mobileNum;
    }
}
class UserInfo extends UserClass{
    String address;
    UserInfo(String name,String mobileNum,String address){
        super(name,mobileNum);
        this.address=address;
    }
    void userDetails(){
        System.out.println("Name: "+name+"\n"+" Mobile number: "+mobileNum+"\n"+" Address: "+address);
    }
}