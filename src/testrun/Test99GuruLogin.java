package testrun;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.pomtest.Guru99Homepage;
import com.pomtest.Guru99Login;
public class Test99GuruLogin {

	String driverPath = "D:\\Softwares\\chromedriver.exe";
	
	WebDriver driver;

    Guru99Login objLogin;

    Guru99Homepage objHomePage;
    
    @SuppressWarnings("deprecation")
    @Parameters("url")
	@Test(priority=0)

    public void setup(String url){

	System.setProperty("webdriver.chrome.driver", driverPath);
        
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get(url);

    }
    @Parameters({"username" , "password" , "title" , "username1"})
 
    @Test(priority=1)

    public void test_Home_Page_Appear_Correct(String username , String password , String title , String username1  ){

        //Create Login Page object

    objLogin = new Guru99Login(driver);

    //Verify login page title

    String loginPageTitle = objLogin.getLoginTitle();

    Assert.assertTrue(loginPageTitle.toLowerCase().contains(title));

    //login to application

    objLogin.loginToGuru99(username , password);

    // go the next page

    objHomePage = new Guru99Homepage(driver);

    //Verify home page

    Assert.assertEquals(objHomePage.getHomePageDashboardUserName(), "Manger Id :"+username1);
    }
    
       
    @AfterTest
    
    public void test_close() {
    	driver.close();
    }
    
    
    }
