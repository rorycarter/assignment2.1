import junit.framework.TestCase;
import junit.framework.Assert;
/**
 * Created by Rory on 2017-03-19.
 */
public class MainAppTest extends TestCase {

    MainApp a = new MainApp();
    public void testInt()throws Exception {
        {
            Assert.assertEquals(6, a.testInt());

        }
    }

    public void testdouble()throws Exception
    {
        Assert.assertEquals(10.0,a.testDouble());
    }

    public void testString() throws Exception {

        Assert.assertEquals(a.testString(),"Rory");
    }


    public void testObjectsEquality() throws Exception {
        String name1=new String("a");
        String name2=new String("a");
        Assert.assertEquals(name1,name2);

    }


    public void testObjectIdentity() throws Exception {

        String n1=new String("l");
        String n2= n1;
        Assert.assertSame(n1,n2);
    }

    public void testsTruth() throws Exception {
        Assert.assertTrue(a.testTruth());
    }









    public void testFalse() throws Exception {
        Assert.assertFalse(a.getFalse());
    }


    public void testNullness() throws Exception {
        Assert.assertNull(a.getName());
    }



    public void testNulless() throws Exception {
        Assert.assertNotNull(a.getSurname());

    }


/*filling test
    public void testFailing() throws Exception {
        a.getArrayNums();
    }
*/


    public void testExceptions() throws Exception {
        a.generateNums();
    }




    public void testDisabling() throws Exception {
        System.out.print("");
    }



    public void testArrayContent() throws Exception {
        int nums[]=new int[2];
        nums[1]=1;
        Assert.assertEquals(nums[1],nums[1]);
    }

}