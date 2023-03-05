package HomeWorkDay25;

public interface WebDriver {
    /*
    Create a WebDriver Interface that will have the following unimplemented behaviour:
    openBrowser(), closeBrowser(), maximizeWindow(),
    findElement(). Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
     */
    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();
}
class ChromeDriver implements WebDriver {
    @Override
    public void openBrowser() {
        System.out.println("Open Google Chrome");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing Google Chrome");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximize Window");
    }

    @Override
    public void findElement() {
        System.out.println("Finding Element");
    }
}
    class FireFoxDriver implements WebDriver{
        @Override
        public void openBrowser() {
            System.out.println("Open Fire Fox Driver");
        }

        @Override
        public void closeBrowser() {
            System.out.println("Closing Fire Fox Driver");
        }

        @Override
        public void maximizeWindow() {
            System.out.println("Maximize Window");
        }

        @Override
        public void findElement() {
            System.out.println("Finding Element");
        }

}
