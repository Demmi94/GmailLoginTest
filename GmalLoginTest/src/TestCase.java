import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;

public class TestCase
{

    public static void main(String[] args) throws Exception {


        // Setting an executable route
        System.setProperty("webdriver.chrome.driver","/Users/lukas/Downloads/chromedriver_win32/chromedriver.exe");

        // Create a new instance of the Firefox driver
        WebDriver driver = new ChromeDriver();

        //Launch the Online Store Website
        driver.get("https://mail.google.com");

        // Print a Log In message to the screen
        System.out.println("Successfully opened the website mail.google.com");

        //Wait for 5 Sec
        Thread.sleep(5);

        //Maximize window
        driver.manage().window().maximize();

        //Enter Username
        driver.findElement(By.cssSelector("#identifierId")).sendKeys("Test.web.java2019");

        //Click on Next
        driver.findElement(By.cssSelector("#identifierNext > span")).click();

        // Wait For Page To Load
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        //Enter Password
        driver.findElement(By.cssSelector("#password > div.aCsJod.oJeWuf > div > div.Xb9hP > input")).sendKeys("Seleniumtest");

        Thread.sleep(1500);
        // Click on 'Sign In' button
        driver.findElement(By.cssSelector("#passwordNext > span > span")).click();

        //Waiting for server response
        Thread.sleep(6000);

        // Open logout session
        driver.findElement(By.cssSelector("#gb > div.gb_Nd.gb_4d.gb_Vd > div.gb_Uc.gb_Ma.gb_Tc.gb_2d > div > div.gb_Ha.gb_ed.gb_yg.gb_g.gb_If > div > a > span")).click();

        Thread.sleep(3000);
        //Press a logout button
        driver.findElement(By.cssSelector("#gb_71")).click();

        //close driver
        driver.close();
        driver.quit();
    }
}