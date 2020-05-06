import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class JunitBasic {

    private AppiumDriver driver;

    @Before
    public void setUp() throws Exception {
        // set up appium
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "EynarH");
        capabilities.setCapability("platformVersion", "9");
        capabilities.setCapability("appPackage", "com.android.calculator2");
        capabilities.setCapability("appActivity", ".Calculator");
        capabilities.setCapability("platformName", "Android");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void verifySumCalculator() throws InterruptedException {
        // Ejercicio ---> 12345+67890=
        // click boton 7
        driver.findElement(By.id("com.android.calculator2:id/digit_7")).click();
        // click boton +
        driver.findElement(By.id("com.android.calculator2:id/op_add")).click();
        // click boton 8
        driver.findElement(By.id("com.android.calculator2:id/digit_8")).click();
        // click boton =
        driver.findElement(By.id("com.android.calculator2:id/eq")).click();
        Thread.sleep(5000);
        //Verificacion
        String actualResult=driver.findElement(By.id("com.android.calculator2:id/formula")).getText();
        String expectedResult="15";
        Assert.assertEquals("",expectedResult,actualResult);
    }
}