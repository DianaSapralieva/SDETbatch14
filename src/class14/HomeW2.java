package class14;

public class HomeW2 {
    /*
    Create a method that will take a number and prints
     whether the number is even or odd.
     */

    void evenOdd(int num){
        if(num%2==0){
            System.out.println("the number is even");
        }else{
            System.out.println("the number is odd");
        }

    }

    public static void main(String[] args) {
        HomeW2 theNumber=new HomeW2();
        theNumber.evenOdd(33);
    }
}
