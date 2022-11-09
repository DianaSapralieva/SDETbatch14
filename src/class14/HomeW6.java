package class14;

public class HomeW6 {
    /*
    Write a method to return whether given number is prime or not?
     */
    String prime(int a) {


        label:
        for (int i = 2; i <= a; i += 2) {
            switch (a % i) {
                case 0:
                    System.out.println("the number is NOT prime");
                    break label;
                default:
                    System.out.println("the number is prime");
                    break label;
            }
        }


        return null;
    }
    public static void main(String[] args) {
        HomeW6 number = new HomeW6();

        number.prime(44);
    }
}