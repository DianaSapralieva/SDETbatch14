package class14;

public class HomeW4 {
    /*
    Create a method that will say Hello
     in different language based on the country
     that will pass when method is executed
     */
    void printHello(String country){
        switch (country) {
            case "Germany":
                System.out.println("Hallo");
                break;
            case "France":
                System.out.println("Bonjour");
                break;
            case "Luxembourg":
                System.out.println("Moien");
                break;
        }

    }

    public static void main(String[] args) {
        HomeW4 country=new HomeW4();
        country.printHello("Germany");
    }
}
