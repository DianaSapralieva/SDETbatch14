package class19;

public class UserClass {
    /* Write program: userClass  that has a constructor that
    initializes instance variable name and mobile number.
    Create a subclass  userInfo that will have user address
    variable and it also being initialized through constructor call.
     Print users name, mobile number and address in userDetails method. Test your code.
     */
    String name;
    String MNumber;

    public UserClass(String name, String MNumber) {
        this.name = name;
        this.MNumber = MNumber;
    }
}
class userInfo extends UserClass{
    String userAddress;

    public userInfo(String name, String MNumber, String userAddress) {
        super(name, MNumber);
        this.userAddress = userAddress;
    }

    void userDetail(){
        System.out.println("name: " +name+" mobile number: "+MNumber+ " Address: "+userAddress);

    }
}
class tester{
    public static void main(String[] args) {
        userInfo user1=new userInfo("Sean","+352-654-82-31", "1140 St Jones");
        user1.userDetail();
    }
}