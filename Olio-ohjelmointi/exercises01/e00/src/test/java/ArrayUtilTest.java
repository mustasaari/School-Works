
import org.junit.Test;
import org.junit.Assert;
import fi.tamk.tiko.olioohjelmointi.util.ArrayUtil;

public class ArrayUtilTest {    
   @Test
   public void testIsInArray() {
        // Expects that returned value is true
        Assert.assertTrue("jussi should be found", ArrayUtil.isInArray("jussi", "jussi", "kalle"));
        // Expects that returned value is false
        Assert.assertFalse("jack should not be found", ArrayUtil.isInArray("jack", "jussi", "kalle"));

        Assert.assertEquals("testitestiviesti", ArrayUtil.filterAndUpperCase("jack", "jussi", "kalle"), "JUSSIKALLE" );

        Assert.assertEquals("testitestiviesti", ArrayUtil.filterAndUpperCase("jussi", "jussi", "kalle"), "KALLE" );

        Assert.assertEquals("testitestiviesti", ArrayUtil.filterAndUpperCase("mikko", "jussi", "mikko" , "kalle"), "JUSSIKALLE" );

        Assert.assertEquals("testitestiviesti", ArrayUtil.filterAndUpperCase("mikko", "jussi", "mikko" , "kalle"), "JUSSIKALLE" );

        Assert.assertNotEquals("testitestiviesti", ArrayUtil.filterAndUpperCase("mikko", "jussi", "mikko" , "kalle"), "MIKKOJUSSIKALLE" );
   }
}