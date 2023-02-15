package HomeWorkDay25;

public class WebDriverTester {
    public static void main(String[] args) {
        WebDriver[] webDrivers={new ChromeDriver(),new FireFoxDriver()};
        for(WebDriver w:webDrivers){
           w.closeBrowser();
           w.findElement();
           w.maximizeWindow();
           w.openBrowser();
        }
    }
}
