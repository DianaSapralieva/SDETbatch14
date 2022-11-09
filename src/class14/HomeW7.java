package class14;

public class HomeW7 {
    /*
    Create  class Student that will have a method getGrade.
     Your method should accept the score of a student and
     return a grade:
score > 90 - A
score >80 - B
score >70 - C
score > 50 - D
anything else - F
     */

    void getGrade(int score){
        if(score > 90){
            System.out.println("A");
        }else if(score > 80){
            System.out.println("B");
        }else if(score > 70){
            System.out.println("C");
        }else if(score > 50){
            System.out.println("D");
        }else{
            System.out.println("F");
        }
    }

    public static void main(String[] args) {
        HomeW7 grade=new HomeW7();

        grade.getGrade(49);
    }
}
