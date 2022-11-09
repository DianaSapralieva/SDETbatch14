package class20;

public class Task3 {
    /*Create 1 class with a static method that has
     3 overloaded forms. Then call each overloaded
      method with specific arguments and observe result.*/
    static void method(String name){
        System.out.println("overloaded form with 1 argument: " +name);
    }
    static void method(int a, int b){
        System.out.println("overloaded form with 2 arguments: "+a+" "+b);
    }
    static void method(String name,int a, int b){
        System.out.println("overloaded form with 3 arguments: "+name+a+" "+b);
    }

    public static void main(String[] args) {
        Task3.method("Gigi");
        Task3.method("Gigi",3,5);
        Task3.method(66,88);
    }
}

