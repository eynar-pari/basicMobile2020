package activityWhenDo;

import controls.Button;
import controls.Label;
import org.openqa.selenium.By;

public class MainActivity {

        public Button  addTaskButton;

        public MainActivity(){
            addTaskButton = new Button(By.id("com.vrproductiveapps.whendo:id/fab"));
        }

        public boolean isDisplayed(String nameTask){
            Label labelTask = new Label(By.xpath(" //*[@text=\""+nameTask+"\"]"));
            return labelTask.isDisplayed();
        }

}
