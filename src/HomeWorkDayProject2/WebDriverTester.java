package HomeWorkDayProject2;

public class WebDriverTester {
    public static void main(String[] args) {

        WebDriver[] browsers={new ChromeDriver(),new FireFoxDriver(),new SafariDriver()};

        for(WebDriver w:browsers){
            w.open();
            w.close();
            w.getTitle();
            //w.navigate(); is not available
        }
    }
}
