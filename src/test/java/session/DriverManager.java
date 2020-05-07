package session;

import factoryDevices.FactoryDevices;
import io.appium.java_client.AppiumDriver;

public class DriverManager {
    private static DriverManager driverManager=null;
    private AppiumDriver driver;

    private DriverManager(){
        driver= FactoryDevices.make("android").create();
    }


    public static DriverManager getInstance(){
        if (driverManager==null)
            driverManager= new DriverManager();
        return  driverManager;
    }

    public AppiumDriver getDriver(){
        return driver;
    }

    public void CloseSession(){
        driver.quit();
        driverManager=null;
    }
}
