package frameworkproject.hooks;

import io.cucumber.java.Before;
import io.cucumber.java.After;

public class Hooks {
    
    @Before
    public void setUp() {
        System.out.println("Before Scenario");
    }

    @After
    public void tearDown() {
        System.out.println("After Scenario");
    }

}
