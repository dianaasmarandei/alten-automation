package Tests;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static Utils.BrowserUtils.getDriver;
import static Utils.Constants.URL_BASE;

public class TestClasses {

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
        WebDriver driver = getDriver("edge");
        driver.navigate().to(URL_BASE);
        driver.close();
    }


    @After
    public void afterTest(){
        System.out.println("This is the after method that runs after each test");
    }

}
