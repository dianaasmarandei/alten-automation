package Tests;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static Utils.BrowserUtils.getDriver;
import static Utils.Constants.CURRENT_BROWSER;
import static Utils.Constants.URL_BASE;

public class TestClasses {

    WebDriver driver;

    @Before
    public void beforeTest(){
        System.out.println("This surely runs each time before any test!");
        driver = getDriver(CURRENT_BROWSER);
        driver.navigate().to(URL_BASE);
    }

    @Test
    public void test01(){
        System.out.println("TEST01");
    }

    @Test
    public void test02(){
        System.out.println("TEST02");
        //identify the search button place a string and fit run
    }


    @After
    public void afterTest(){
        System.out.println("This is the after method that runs after each test");
        driver.close();
    }

}
