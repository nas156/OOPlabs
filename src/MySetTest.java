import Lab6.Device;
import Lab6.Refrigirator;
import Lab6.VaccumCleaner;
import Lab7.MySet;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Iterator;

public class MySetTest {
    Device a = new Refrigirator(1, 2, 3, "d", 8, 5, 7);
    Device kol = new VaccumCleaner(18, 12, 1, "y", 11);
    MySet a1 = new MySet(a);


    @Test
    public void SizeTest() {
        int expected = 1;
        int real = a1.size();
        Assert.assertEquals(expected, real);

    }

    @Test
    public void IsEmptyTest() {
        boolean expected = false;
        boolean real = a1.isEmpty();
        Assert.assertEquals(expected, real);
    }

    @Test
    public void ContainsTest() {
        boolean expected = true;
        boolean real = a1.contains(a);
        Assert.assertEquals(expected, real);
    }

    @Test
    public void IteratorTesy(){
        a1.add(kol);
        Iterator<Device> iter =a1.iterator();
        boolean expected=true;
        boolean real=a1.iterator().hasNext();
        iter.next();
        Device expected1=kol;
        Device real1= iter.next();
        Assert.assertEquals(expected,real);
        Assert.assertEquals(expected1,real1);

    }


}
