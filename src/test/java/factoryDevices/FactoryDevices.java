package factoryDevices;

import com.sun.xml.internal.bind.v2.model.core.ID;

public class FactoryDevices {

    public static IDevices make(String type){

        IDevices devices;

        switch (type){

            case "android":
                devices= new Android();
                break;
            case "ios":
                devices= new IOS();
                break;

            case "cloud":
                devices= new AndroidCloud();
                break;
            default:
                devices= new Android();
                break;

        }
        return devices;

    }
}
