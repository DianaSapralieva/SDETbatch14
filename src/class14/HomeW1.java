package class14;

import java.util.Scanner;

public class HomeW1 {
    /*
    Create a method that will take 2 parameters as a numbers
     and prints which number is larger.
     */
    void largestNum(int n1, int n2)

    {
        if (n1 > n2) {
            System.out.println(n1 + " is the largest number");
        } else {
            System.out.println(n2 + " is the largest number");
        }
    }
       public static void main(String[] args){
           Scanner scan=new Scanner(System.in);
           System.out.println("Enter the first number:");
           int n1= scan.nextInt();
           System.out.println("Enter the second number:");
           int n2= scan.nextInt();
            HomeW1 ln=new HomeW1();

            ln.largestNum(n1,n2);



        }

    }

