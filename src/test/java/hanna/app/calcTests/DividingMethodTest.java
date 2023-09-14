package hanna.app.calcTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DividingMethodTest extends BaseTest{

    @Test(groups = {"smoke"}, priority = 1)
    public void testDividePositive() {
        Assert.assertEquals(2, calc.getQuotientByDividingNumbers(6,3));
    }

    @Test(groups = {"extended"}, retryAnalyzer = Retry.class, priority = 2)
    public void testDivideNegative() {
        Assert.assertEquals(-5, calc.getQuotientByDividingNumbers(3,-6));
    }

    @Test(expectedExceptions = ArithmeticException.class, groups = {"smoke", "exceptions"}, retryAnalyzer = Retry.class)
    public void testDivideByNull() {
        calc.getQuotientByDividingNumbers(3,0);
    }
}
