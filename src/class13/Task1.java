package class13;

public class Task1 {
    public static void main(String [] args){
        String a="This is a sentance i want to reverse";
       String [] arr= a.split(" ");
       StringBuilder str = new StringBuilder();

       for(int i=0; i<=arr.length-1; i++){
           String word=arr[i];

           StringBuilder st=new StringBuilder(word);
           st.reverse();
           arr[i]=st.toString();
           str.append(arr[i]).append(" ");
       }
        System.out.println(str);






    }
}
