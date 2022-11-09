package class17;

public class Person {
    String name;
    String color;
    String country;
    int age;
    double weight;
    String hairColor;
    String eyeColor;
    double height;
    char gender;
    public Person(){

    }
    public Person(String perName){
        name=perName;
    }

    public Person(String name, String color, String country, int age, double weight, String hairColor, String eyeColor, double height, char gender) {
        name = name;
        color = color;
        country = country;
        age = age;
        weight = weight;
        hairColor = hairColor;
        eyeColor = eyeColor;
        height = height;
        gender = gender;
    }

    public static void main(String[] args) {
        Person person=new Person();

        Person person2=new Person("Diana");


    }
}
