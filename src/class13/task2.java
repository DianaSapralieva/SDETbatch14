package class13;

public class task2 {
    public static void main(String[] args) {
        String str = "aba";
         StringBuilder st=new StringBuilder(str);
         st.reverse();
         boolean var=false;
         if (str.toLowerCase().equals(st.toString())) {
            var=true;
            System.out.println("is polidrome: "+var);
        }
        else {
            System.out.println("is polidrome: "+var);
        }

    }
}
