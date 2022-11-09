package class26;

import java.util.ArrayList;

public abstract class Insurance {
    /*Create a class Insurance that will have an
    attribute as insuranceName and unimplemented
    behaviour as getQuote and cancelInsurance*/

    String insuranceName;

    public Insurance(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    abstract void getQuote();
   abstract void cancelInsurance();

    public String toString() {
        return "Insurance{" +
                "insuranceName='" + insuranceName + '\'' +
                '}';
    }




}
//Create 3 subclasses Car, Pet, Health. Car class has
// it’s own attribute as carModel and Class Pet has petType attribute.
class Car extends Insurance {
    String carModel;

    public Car(String insuranceName, String carModel) {
        super(insuranceName);
        this.carModel = carModel;
    }

    @Override
    void getQuote() {
        System.out.println(insuranceName + " charges 3% of the car value for " + carModel);
    }

    @Override
    void cancelInsurance() {
        System.out.println(insuranceName + " has been canceled for: " +
                carModel);
    }

    public String toString() {
        return "Car{" +
                "carModel='" + carModel + '\'' +
                ", insuranceName='" + insuranceName + '\'' +
                '}';
    }
}
class Pet extends  Insurance{
    String petType;

    public Pet(String insuranceName,String petType) {
        super(insuranceName);
        this.petType=petType;
    }

    @Override
    void getQuote() {
        System.out.println(insuranceName+ " charges 200€ per month for "+petType);
    }

    @Override
    void cancelInsurance() {
        System.out.println(insuranceName+ " has been canceled for: "+ petType);

    }
    public String toString() {
        return "Pet{" +
                "petType='" + petType + '\'' +
                ", insuranceName='" + insuranceName + '\'' +
                '}';
    }
}

class Health extends Insurance{

    public Health(String insuranceName) {
        super(insuranceName);
    }

    @Override
    void getQuote() {
        System.out.println(insuranceName+ " charges 3% of the salary for Health Insurance");
    }

    @Override
    void cancelInsurance() {
        System.out.println(insuranceName+ " has been canceled");
    }
    public String toString() {
        return super.toString();
    }
}
class Task1{
    public static void main(String[] args) {
        //Create 3 objects of the sub classes and store them in ArrayList.
        // Using for loop/advanced for loop/ iterator access all methods of the class.
        ArrayList<Car> objCar=new ArrayList<>();
        ArrayList<Pet> objPet=new ArrayList<>();
        ArrayList<Health> objHealth=new ArrayList<>();

        ArrayList<Insurance> insurances=new ArrayList<>();
        insurances.add(new Car("Adam","Tesla Model s"));
        insurances.add(new Pet("Geico","Dog"));
        insurances.add(new Health("State life"));
        System.out.println(insurances);

        System.out.println("---------------");

        for (Insurance i:insurances
        ) {
            i.getQuote();
            i.cancelInsurance();
        }
    }
}