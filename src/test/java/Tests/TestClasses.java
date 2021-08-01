package Tests;

import Utils.Constants;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static Utils.BrowserUtils.getBrowser;
import static Utils.BrowserUtils.getDriver;
import static Utils.Constants.CURRENT_BROWSER;

public class TestClasses {

    public static final String URL_BASE = "https://github.com/";
    public static final String DRIVERS_PATH ="src/test/resources/drivers/";

    public WebDriver getDriver(String browser){
        WebDriver driver = null;
        switch (browser){
            case "chrome": {
                System.setProperty("webdriver.chrome.driver", DRIVERS_PATH+"chromedriver.exe");
                driver =  new ChromeDriver();
                break;
            }
            case "firefox": {
                System.setProperty("webdriver.gecko.driver", DRIVERS_PATH+"geckodriver.exe");
                driver = new FirefoxDriver();
                break;
            }
            case "edge": {
                System.setProperty("webdriver.edge.driver", DRIVERS_PATH+"msedgedriver.exe");
                driver = new EdgeDriver();
                break;
            }
            default: {
                throw new IllegalArgumentException("The value provided for the browser type is ilegal: "  + browser);
            }
        }
        return driver;
    }

    @Before
    public void beforeTest(){
        System.out.println("This surely runs each time before any test!");
    }


    @Test
    public void test01(){
        System.out.println("TEST01");
        WebDriver driver = getDriver("chrome");
        driver.navigate().to(URL_BASE);
        driver.close();
    }

    @Test
    public void test02(){
        System.out.println("TEST02");
        WebDriver driver = getDriver("firefox");
        driver.navigate().to(URL_BASE);
        driver.close();
    }

    @Test
    public void test03() {
        System.out.println("TEST03");
        WebDriver driver = getDriver("eedge");
        driver.navigate().to(URL_BASE);
        driver.close();
    }


    @After
    public void afterTest(){
        System.out.println("This is the after method that runs after each test");
    }

}
