package testWhenDo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import session.DriverManager;

public class WhendoTest {

    @Before
    public void before(){
        DriverManager.getInstance();
    }
    @Test
    public void createTask(){


    }
    @After
    public void after(){
        DriverManager.getInstance().CloseSession();
    }
}
