package class25;

public class WrapperClass {
    public static void main(String[] args) {

        int num = 19;
        //boxing or manual conversion from primitive data type
        //Integer wrapperNum = Integer.valueOf(num);
        //Autoboxing or automatic conversion of a primitive to a wrapper type
        Integer wrappedNum = num;
        System.out.println(wrappedNum);
        /*Unboxing:
    converting a wrapper to a primitive by calling a method.
    Integer wnum=new Integer(10);
    int pnum=wnum.intValue();
          AutoUnboxing:
    converting a wrapper to a primitive without calling any methods.
    Integer wnum=new Integer(10);
    int pnum=wnum;
    */


    }
}
