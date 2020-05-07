package controls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import session.DriverManager;

public class Control {
    protected WebElement control;
    private By locator;

    public Control(By locator){
        this.locator=locator;
    }

    protected void find(){
        this.control= DriverManager.getInstance().getDriver().findElement(this.locator);
    }

    public void click(){
        find();
        control.click();
    }
    public void type(String value){
        find();
        control.clear();
        control.sendKeys(value);
    }

    public boolean isDisplayed(){
        try {
            find();
            return control.isDisplayed();
        }catch (Exception e){
            return false;
        }
    }

    public String getText(){
        find();
        return  control.getText();
    }

}
