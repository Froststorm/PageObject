import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

    public class GithubLogin{

        public WebDriver driver;
        String baseUrl = "https://github.com/login";

        @BeforeMethod
        public void setUp() throws Exception {
            driver = new FirefoxDriver();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }

        @Test
        public void testUntitled2() {
            driver.get(baseUrl);
            LoginPage loginpage = new LoginPage(driver);
            loginpage.login("Froststorm","123456");
            System.out.println(driver.getTitle());
            System.out.println("Test message!");
        }

        @AfterMethod
        public void tearDown() throws Exception {
            driver.quit();
        }


    }
