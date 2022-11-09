package class16;

public class HomeWorkVolves {
/*
Create a method that will accept a String as a parameter
 and return a new String that consist only of vowels.
 Method should be available inside the class only where
 it was declared and executed by calling it is name.
 */
    private static String printVolves(String word){
       return word.replaceAll("[^aeiouAEIOU]","");

    }

    public static void main(String[] args) {
        HomeWorkVolves obj=new HomeWorkVolves();
        System.out.println(obj.printVolves("logic LOGIC"));




    }

}
