package cput.ac.za;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class AppTest 
{

    @Test
    // Testing Equality
    public void staffEquals() throws Exception
    {

        Staff staff = new Staff(102);
        Staff staff2 = staff;
        Assert.assertEquals(staff,staff2);
    }
    @Test
    // Testing Identity
    public void StringIdentity() throws Exception
    {
        Staff staff = new Staff(103);
        Staff staff2 = staff;
        Assert.assertSame(staff,staff2);
    }

    @Test
    //Fail Test
    public void failTest() throws Exception
    {
        Staff staff = new Staff(104);
        Staff staff2 = new Staff(103);
        Assert.assertEquals(staff,staff2);
    }

    @Test(timeout = 3000)
    //Timeout Test (Failing it on purpose)
    public void timeoutTest()throws Exception
    {

        Staff staff = new Staff(104);
        Staff staff2 = staff;
        Assert.assertEquals(staff,staff2);
        while(true);
    }

    @Ignore
    @Test     // Disabling Test
    public void disabling()
    {
        System.out.print("This test is Disabled");
    }
}
