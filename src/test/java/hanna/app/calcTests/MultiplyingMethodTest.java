package hanna.app.calcTests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MultiplyingMethodTest extends BaseTest{

    @BeforeMethod
    public void beforeMethodMessage(){
        System.out.println(" ==== Preparation for Test Method ===");
    }

    @AfterMethod
    public void afterMethodMessage(){
        System.out.println(" ==== Cleaning after Test Method ===");
    }

    @Test(groups = {"smoke"})
    public void testMultiPositive() {
        Assert.assertEquals(20, calc.multiplyNumbers(4,5));
    }

    @Test(groups = {"extended"})
    public void testMultiNull() {
        Assert.assertEquals(0, calc.multiplyNumbers(0,-3));
    }
}
