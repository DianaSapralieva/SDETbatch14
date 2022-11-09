package class16;

public class HomeWork1 {
    /*
    Create a method that will accept an array as parameters
     and will return a sum of all elements from that array.
      Method should be visibly only within same package and
      accessible by the creating an instance of the class.*/

    int arraySum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        HomeWork1 sumElements = new HomeWork1();
        int[] array = {55, 77, 88, 99};
        System.out.println(sumElements.arraySum(array));
    }
}
