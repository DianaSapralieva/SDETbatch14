package class23;

public interface IWedDriver {
    /*Create a WebDriver Interface that will have the following
    unimplemented behaviour: openBrowser(), openBrowser(),
    maximizeWindow(), findElement(). Create 2 classes that
     implements WebDriver interface: ChromeDriver and FirefoxDriver.*/
    void openBrowser();

    void maximizeWindow();

    void findElement();

}

class ChromeDriver implements IWedDriver{

    @Override
    public void openBrowser() {
        System.out.println("Open Chrome Browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximize Chrome Window");
    }

    @Override
    public void findElement() {
        System.out.println("Find Chrome Element");

    }
}

class FirefoxDriver implements IWedDriver{

    @Override
    public void openBrowser() {
        System.out.println("Open Fire Fox Browser ");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximize Fire Fox Window ");
    }

    @Override
    public void findElement() {
        System.out.println("Find Fire Fox Element");
    }
}
class IWebDriverTest{
    public static void main(String[] args) {


    IWedDriver [] webDrivers={new ChromeDriver(),new FirefoxDriver()};

    for(IWedDriver webDriver:webDrivers){
        webDriver.openBrowser();
        webDriver.maximizeWindow();
        webDriver.findElement();
        System.out.println("*************");
    }

}}