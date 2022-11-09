package class19;

public class A {
    /*Write program for multilevel inheritance where class C
    inherits from class B and Class B inherits from Class A.
*/

    public A() {
        System.out.println("A");
    }
}
class B extends A{

    public B() {
        System.out.println("B");
    }


}
class C extends B{

    public C(){
        System.out.println("C");
    }
}
class Testing{
    public static void main(String[] args) {
        C abc=new C();
    }

}
