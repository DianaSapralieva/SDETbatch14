package class13;

public class task3 {
    public static void main(String[] args) {


        String a = "Hello";
        String b = "World";

        a = a + b;

        b = a.replace(b,"");
        a = a.replace(b,"");
        System.out.println("Strings after swap: a = " +
                a + " and b = " + b);
    }
}