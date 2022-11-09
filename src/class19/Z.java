package class19;

public class Z {
    /* Write program to inherit class Z that has method
     printF which is static and call or reuse that method into class W
     */

    static void printF(){
        System.out.println("printF which is static");
    }
}

class W extends Z{

}
class testIt{
    public static void main(String[] args) {

        Z.printF();
        W.printF();

    }
}