package class20;

public class MetthodOverloading2 {

    void F1(String name, int n){
        System.out.println(" String name, int n");
    }
    void F1(int n2, int n){
        System.out.println("  int n2, int n");
    }
    void F1( int n,String name){
        System.out.println("  int n, String name");
    }
}
