package class17;

public class StaticConstructor {
    /*
    Write program that have static constructor and observe result.
     */
     StaticConstructor(){
        System.out.println("Static constructor");
    }

    public static void main(String[] args) {
        StaticConstructor observe=new StaticConstructor();
    }
}
