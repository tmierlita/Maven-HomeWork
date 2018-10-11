import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestExpertTema {

    static Expert expertCalc;
    static public void printMessage(String message){
        System.out.println(message);
    }

    @BeforeClass

    static public void initSetUp(){
        expertCalc=new Expert();
        printMessage("Initial Expert Calculator Set Up - OK");
    }

    @Before

    public void setUpTest(){
        printMessage("Running test - Expert");
    }

    @Test

    public void testPowZeroExponent(){
        Assert.assertTrue(expertCalc.pow(2,0)==1);
    }

    @Test

    public void testPowNegativeExponent(){
        double result = expertCalc.pow(2,-1);
        Assert.assertNotEquals(0.5,result,0);
    }

    @Test

    public void testPerfectSqrt(){
        int result = expertCalc.sqrt(9,2);
        Assert.assertEquals(3,result,0);
    }

    @Test

    public void testSqrtNegativeNumber(){
        int result = expertCalc.sqrt(-9,2);
        Assert.assertNotEquals(3,result);
    }

    @Test

    public void testZeroFactorial(){
        int result = expertCalc.factorial(0);
        Assert.assertNotNull(result);
    }

    @Test

    public void testNegativeNumberFactorial(){
        int result = expertCalc.factorial(-3);
        Assert.assertEquals(-3,result,0);
    }
}
