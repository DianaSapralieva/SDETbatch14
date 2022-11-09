package class14;

public class HomeW3 {
    /*
    Create a method that
    will print whether given String is palindrome or not.
     */
    void polidrome(String var){
        StringBuilder st=new StringBuilder(var);
        st.reverse();
        boolean v=false;
        if (var.toLowerCase().equals(st.toString())) {
            v=true;
            System.out.println("is polidrome: "+v);
        }
        else {
            System.out.println("is polidrome: "+v);
        }

        }

    public static void main(String[] args) {
        HomeW3 p=new HomeW3();
        p.polidrome("ada");
        p.polidrome("ugikh");
    }
    }

