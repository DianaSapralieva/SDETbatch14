package class18;

public class Cat extends Animal {


    public void printInfo(){
        System.out.println("Name "+name+" Breed "+ breed+
                " Age "+ age+ " Weight "+ weight);
    }
    public Cat(String catName, String catBreed){ //we can access thought all the project
        name=catName;
        breed=catBreed;

    }

   public Cat(String catName, String catBreed,
              int catAge, double catWeight){ //we can access thought all the project
    name=catName;
    breed=catBreed;
    age=catAge;
    weight=catWeight;
    }


}
