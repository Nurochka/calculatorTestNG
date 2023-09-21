package hanna.app.calcTests;

import hanna.app.source.CalculatorApplication;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListener.class)
public class BaseTest {

    CalculatorApplication calc;

    @BeforeClass(groups = {"smoke"})
    public void beforeClass() {
        calc = new CalculatorApplication();
    }

   @AfterClass
    public void afterClass() {
        calc = null;
    }

}
