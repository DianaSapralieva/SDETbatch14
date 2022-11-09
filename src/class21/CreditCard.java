package class21;

public class CreditCard {
    /*Create a class CreditCard and define variable balance and interest.
     Create an instance method that will calculate interest based on the given balance.
Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
Call the method by creating an object of each of the three classes.*/

    double balance;
    double interest;
    void calculate(double balance,double interest){
        this.balance=balance;
        this.interest=interest;
        System.out.println(balance*interest/100);
    }
}
class Visa extends CreditCard{

}
class AX extends  CreditCard{
    @Override
    void calculate(double balance,double interest){
        System.out.println(balance*(interest/365)*30);//interest due for month
    }

    public static void main(String[] args) {
        CreditCard interest=new CreditCard();
        interest.calculate(20.000,0.5);
        Visa interest2=new Visa();
        interest2.calculate(30.000,1.7);
        AX interest3=new AX();
        interest3.calculate(20.000,5);
    }
}
