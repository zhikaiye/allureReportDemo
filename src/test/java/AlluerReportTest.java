import org.testng.Assert;
import org.testng.annotations.Test;

public class AlluerReportTest {

    @Test
    public void testCase01(){
        System.out.println("this is report");
    }

    @Test
    public void testCase02(){
        System.out.println("This is failure case");
        Assert.assertEquals("1","2");
    }
}
