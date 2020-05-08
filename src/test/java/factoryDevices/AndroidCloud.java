package factoryDevices;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AndroidCloud implements IDevices {

    public static String userName = "gamersite1";
    public static String accessKey = "iq8NKxgpVmPZL7uZeqF5";

    @Override
    public AppiumDriver create() {

        AndroidDriver<AndroidElement> driver = null;
        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("device", "Google Pixel 3 XL");
        caps.setCapability("os_version", "9.0");
        caps.setCapability("project", "UPB Appium");
        caps.setCapability("build", "Build_1.0");
        caps.setCapability("name", "App WhenDo");
        caps.setCapability("app", "bs://baf4289573be8d089657458c0c7608033831cf6d");

        try {
            driver = new AndroidDriver<AndroidElement>(new URL("https://" + userName + ":" + accessKey + "@hub-cloud.browserstack.com/wd/hub"), caps);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        return driver;

    }
}
