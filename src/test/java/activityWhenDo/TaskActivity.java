package activityWhenDo;

import controls.Button;
import controls.TextBox;
import org.openqa.selenium.By;

public class TaskActivity {

    public TextBox titleTextBox;
    public Button saveButton;

    public TaskActivity(){
        titleTextBox= new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextTitle"));
        saveButton= new Button(By.id("com.vrproductiveapps.whendo:id/saveItem"));

    }
}
