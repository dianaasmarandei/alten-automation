package Tests;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static Utils.Constants.URL_BASE;


public class TestNgClasses {

    @Before
    public void BeforeTest(){
        System.out.println("This surely runs each time before any test!");
    }

    @Test
    public void Test01(){
        System.out.println("TEST01");
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to(URL_BASE);
        driver.close();
    }

    @Test
    public void Test02(){
        System.out.println("TEST02");
        System.setProperty("webdriver.gecko.driver","src/test/resources/drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to(URL_BASE);
        driver.close();
    }

    @Test
    public void Test03(){
        System.out.println("TEST03");
        System.setProperty("webdriver.edge.driver","src/test/resources/drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.navigate().to(URL_BASE);
        driver.close();

        //Thread.sleep is NOT RECOMMENDED to be used in an auto
        try {
            System.out.println("Starting to sleep");
            Thread.sleep(500);
            System.out.println("Finished sleeping");
        }
        catch (InterruptedException iex) {
            System.out.println(iex.getMessage());
        }
    }
}
