package hanna.app.calcTests;

import hanna.app.source.CalculatorApplication;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AddingMethodTest extends BaseTest{

    //CalculatorApplication calc = new CalculatorApplication(); - required for running in groups = smoke in xml ??

    @Test(groups = {"smoke"}, dataProvider = "numbersForCalculation", description = "Test of Adding Method", invocationCount = 2, threadPoolSize = 2)
    public void testSumPositive(int expected, int firstNumber, int secondNumber) {
        Assert.assertEquals(expected, calc.addNumbers(firstNumber,secondNumber));
    }

    @DataProvider
    public Object[][] numbersForCalculation() {
        return new Object[][]{
                {5, 2, 3},
                {-4, -1, -3},
                {0, 0, 0}
        };
    }

    @Test(groups = {"extended"}, description = "Testing of Adding Method With Negative Numbers")
    public void testSumNegative() {
        Assert.assertEquals(-3, calc.addNumbers(0,-3));
    }

    @Test(groups = {"extended"}, description = "Testing of Adding Method With Null")
    public void testSumWithNull() {
        Assert.assertEquals(10, calc.addNumbers(0,11));
    }
}
