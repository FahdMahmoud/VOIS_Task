package Step_Definations;

import Pages.*;
import io.cucumber.java.After;
import io.github.bonigarcia.wdm.managers.FirefoxDriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class Setup {

    public static FirefoxDriver driver;
    public static Home_Page home;
    public static Authontication_Page Authentication;
    public static SoftAssert soft;
    public static Registration_Page Register;

    public static User_Profile_Page profile_page;

    public static Actions action;

    public static Blouses_SubCategory_Page Blouses;

    public static Order_page order;

    public static WebDriverWait wait;

    public static int sleepTime = 60;

    public static void Page_setup() {
        // web driver manger will create compatible driver and setup it
        FirefoxDriverManager.firefoxdriver().setup();

        home = new Home_Page();
        Authentication = new Authontication_Page();
        Register = new Registration_Page();
        soft = new SoftAssert();
        profile_page = new User_Profile_Page();
        Blouses = new Blouses_SubCategory_Page();
        order = new Order_page();
        driver = new FirefoxDriver();
        action = new Actions(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(sleepTime));
        driver.manage().window().maximize();
        driver.navigate().to("http://automationpractice.com/index.php");
    }

    @After
    public static void CloseDriver() {
        driver.quit();
    }
}
