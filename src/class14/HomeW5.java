package class14;

public class HomeW5 {
   /*
   Create a method createEmail().
    Based on values of users name,
     lastName and email type, your method should return
      complete email Address. Example:
        createEmail(John, Snow, gmail) → johnsnow@gmail.com
    */

    void createEmail(String firstName,String lastName, String emailType){
        System.out.println(firstName.toLowerCase()+lastName.toLowerCase()
                +"@"+emailType.toLowerCase()+".com");
    }

    public static void main(String[] args) {
        HomeW5 details=new HomeW5();

        details.createEmail("Diana","Sapralieva","gmail");
    }
}
