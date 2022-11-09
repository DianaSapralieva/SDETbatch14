package class20;

public class Task4 {
    /*Create 1 class with a private method that has 3 overloaded forms.
     Then call each overloaded method with specific arguments and observe result.*/
    private void method(String name){
        System.out.println("overloaded form with 1 argument: " +name);
    }
    private void method(int a, int b){
        System.out.println("overloaded form with 2 arguments: "+a+" "+b);
    }
    private void method(String name,int a, int b){
        System.out.println("overloaded form with 3 arguments: "+name+a+" "+b);
    }

    public static void main(String[] args) {
        Task4 obj1=new Task4();
        obj1.method("Gigi");
        obj1.method("Gigi",3,5);
        obj1.method(66,88);
    }
}
