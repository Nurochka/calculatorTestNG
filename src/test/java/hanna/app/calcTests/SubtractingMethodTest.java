package hanna.app.calcTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SubtractingMethodTest extends BaseTest{

    @Test(groups = {"smoke"})
    public void testMinusPositive() {
        Assert.assertEquals(2, calc.subtractNumbers(7,5));
    }

    @Test(groups = {"extended"}, retryAnalyzer = Retry.class)
    public void testMinusNegative() {
        Assert.assertEquals(1, calc.subtractNumbers(2,-3));
    }

    @Test(groups = {"extended"})
    public void testMinusWithNull() {
        Assert.assertEquals(-8, calc.addNumbers(0,-8));
    }

}
