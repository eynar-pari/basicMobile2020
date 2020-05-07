package testCalculator;

import activityCalculator.CalculatorActivity;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest extends CalculatorBaseTest {

    public CalculatorActivity calculatorActivity = new CalculatorActivity();

    @Test
    public void testSuma() throws InterruptedException {

        calculatorActivity.button8.click();
        calculatorActivity.plusButton.click();
        calculatorActivity.button7.click();
        calculatorActivity.equalButton.click();

        this.waitTimeSec(5);
        String actualResult=calculatorActivity.resultLabel.getText();
        String expectedResult="15";
        Assert.assertEquals("ERROR la suma es incorrecta",expectedResult,actualResult);

    }

}
