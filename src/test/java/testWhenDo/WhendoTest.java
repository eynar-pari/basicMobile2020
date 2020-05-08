package testWhenDo;

import activityWhenDo.MainActivity;
import activityWhenDo.TaskActivity;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import session.DriverManager;

public class WhendoTest {
    MainActivity mainActivity = new MainActivity();
    TaskActivity taskActivity = new TaskActivity();

    @Test
    public void createTask(){
        mainActivity.addTaskButton.click();
        taskActivity.titleTextBox.type("CLOUD");
        taskActivity.saveButton.click();
        Assert.assertTrue("ERROR ! la tarea no fue creada",mainActivity.isDisplayed("CLOUD"));
    }

    @After
    public void after(){
        DriverManager.getInstance().CloseSession();
    }
}
