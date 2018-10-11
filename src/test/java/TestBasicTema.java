import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static jdk.nashorn.internal.objects.Global.Infinity;

public class TestBasicTema {

    static Basic basicCalc;
    static public void printMessage(String message){
        System.out.println(message);
    }

    @BeforeClass

    static public void initSetUp(){
        basicCalc=new Basic();
        printMessage("Initial Basic Calculator Set Up - OK");
    }

    @Before

    public void setUpTest(){
        printMessage("Running test - Basic");
    }

    @Test

    public void testAddSingleValue() {
        int result = basicCalc.add(1);
        Assert.assertNotEquals(2, result);
    }

    @Test

    public void testAddNegativeNumbers(){
        Assert.assertTrue(basicCalc.add(-5,-5)==-10);
    }

    @Test

    public void testSubstractNegativeValue(){
        int result = basicCalc.substract(1,-2);
        Assert.assertEquals(3,result,0);
    }

    @Test

    public void testSubstractTwoZero(){
        int result = basicCalc.substract(0,0);
        Assert.assertNotNull(result);
    }

    @Test

    public void testMultiplyWithZero(){
        int result = basicCalc.multiply(3,0);
        Assert.assertEquals(0,result,0);
    }

    @Test

    public void testMultiplySingleValue(){
        int result = basicCalc.multiply(2);
        Assert.assertNotEquals(0,result);
    }

    @Test

    public void testDivideToZero(){
        double result = basicCalc.divide(1,0);
        Assert.assertEquals(Infinity,result,0);
    }

    @Test

    public void testDivideDoubleResult(){
        double result = basicCalc.divide(5,2);
        Assert.assertNotEquals(3,result);
    }
}
