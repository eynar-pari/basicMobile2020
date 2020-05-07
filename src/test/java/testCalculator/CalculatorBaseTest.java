package testCalculator;

import org.junit.After;
import session.DriverManager;

public class CalculatorBaseTest {
    @After
    public void tearDown() throws Exception {
        DriverManager.getInstance().CloseSession();
    }

    public void waitTimeSec(int time) throws InterruptedException {
        Thread.sleep(time*1000);
    }

}
