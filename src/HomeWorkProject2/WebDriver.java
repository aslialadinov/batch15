package HomeWorkProject2;
/*
. Provide Implementation for the diagram below. Then
create a test class in which you need to create Objects of
ChromeDriver, FirefoxDrive and SafariDriver classes and
see which methods available to them.
* */

public interface WebDriver {
    void open();
    void close();
    String getTitle();
}
interface RemoteWbDriver extends WebDriver{
    void navigate();
}
interface TakesScreenshot extends RemoteWbDriver{
    void getScreenshot();
}
class ChromeDriver implements RemoteWbDriver{

    @Override
    public void open() {
        System.out.println("Open Chrome browser");
    }

    @Override
    public void close() {
        System.out.println("Close Chrome browser");
    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void navigate() {
        System.out.println("Navigate Chrome browser");
    }
}
class FireFoxDriver implements RemoteWbDriver{

    @Override
    public void open() {
        System.out.println("Open Firefox browser");
    }

    @Override
    public void close() {
        System.out.println("Close Firefox browser");
    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void navigate() {
        System.out.println("Navigate Firefox browser");
    }
}
class SafariDriver implements RemoteWbDriver{

    @Override
    public void open() {
        System.out.println("Open Safari browser");
    }

    @Override
    public void close() {
        System.out.println("Close Safari browser");
    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void navigate() {
        System.out.println("Navigate Safari browser");
    }
}
