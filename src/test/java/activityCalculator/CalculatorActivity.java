package activityCalculator;

import controls.Button;
import controls.Label;
import org.openqa.selenium.By;
import testCalculator.CalculatorBaseTest;

public class CalculatorActivity {
    public Button button8;
    public Button button7;
    public Button plusButton;
    public Button equalButton;
    public Label resultLabel;

    public CalculatorActivity(){

        button7 = new Button(By.id("com.android.calculator2:id/digit_7"));
        button8 = new Button(By.id("com.android.calculator2:id/digit_8"));
        plusButton = new Button(By.id("com.android.calculator2:id/op_add"));
        equalButton = new Button(By.id("com.android.calculator2:id/eq"));
        resultLabel = new Label(By.id("com.android.calculator2:id/formula"));

    }
}
