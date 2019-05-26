package Lab7;

import Lab6.Device;
import Lab6.Refrigirator;
import Lab6.VaccumCleaner;
import Lab6.WashingMachine;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


import java.util.ArrayList;
import java.util.Iterator;

public class MySetTest {
    ArrayList<Device> dev;
    Device device1 = new Refrigirator(1, 2, 3, "S", 1, 2, 3);
    Device device2 = new VaccumCleaner(2, 6, 8, "H", 7);
    Device device3 = new WashingMachine(1, 2, 3, "st", 3);

    MySet set1;

    @Before
    public void setUp() throws Exception {
        dev = new ArrayList<>();
        dev.add(device1);
        dev.add(device2);
        set1 = new MySet(dev);
        System.out.println("Setting up______");

    }

    @After
    public void tearDown() throws Exception {
        set1 = null;
        System.out.println("__________Teared");
    }


    @Test
    public void size() {
        int expected = 2;
        int actual = set1.size();
        Assert.assertEquals(expected, actual);
        System.out.println(" Size pracue");
    }

    @Test
    public void isEmpty() {
        Assert.assertFalse(set1.isEmpty());
        System.out.println(" isEmpty pracue");
    }

    @Test
    public void contains() {
        Assert.assertTrue(set1.contains(device1));
        Assert.assertFalse(set1.contains(device3));
        System.out.println(" Contains pracue");

    }

    @Test
    public void iterator() {
        Iterator<Device> iter = set1.iterator();
        Assert.assertTrue(iter.hasNext());
        Device expected = device1;
        Device expected1 = device2;
        Assert.assertEquals(expected, iter.next());
        Assert.assertEquals(expected1, iter.next());
        Assert.assertFalse(iter.hasNext());
        System.out.println(" Iter works");
    }

    @Test
    public void toArray() {
        Object[] expected = new Object[2];
        expected[0] = device1;
        expected[1] = device2;
        Assert.assertEquals(expected, set1.toArray());
        System.out.println(" ToArray works");

    }

    @Test
    public void toArray1() {
        Device[] expected = new Device[2];
        expected[0] = device1;
        expected[1] = device2;
        Device[] tested = new Device[1];
        Device[] actual = set1.toArray(tested);
        Assert.assertArrayEquals(expected, actual);
        System.out.println(" ToArray1 works");
    }

    @Test
    public void add() {
        set1.add(device3);
        Assert.assertTrue(set1.contains(device3));
        Assert.assertEquals(3, set1.size());
        System.out.println(" Add works");
    }

    @Test
    public void remove() {
        set1.remove(device2);
        Assert.assertFalse(set1.contains(device2));
        Assert.assertEquals(1, set1.size());
        System.out.println(" Remove works");
    }

    @Test
    public void containsAll() {
        Assert.assertTrue(dev.containsAll(set1));
        Assert.assertTrue(set1.containsAll(dev));
        System.out.println(" ContainsAll works");
    }

    @Test
    public void addAll() {
        ArrayList<Device> test = new ArrayList<>();
        test.add(device3);
        test.add(new Refrigirator(1, 2, 3, "s", 3, 4, 5));
        Assert.assertTrue(set1.addAll(test));
        Assert.assertTrue(set1.containsAll(test));
        Assert.assertEquals(4, set1.size());
        System.out.println(" AddAll works");

    }

    @Test
    public void retainAll() {
        ArrayList<Device> test = new ArrayList<>();
        test.add(device3);
        test.add(new Refrigirator(1, 2, 3, "s", 3, 4, 5));
        set1.addAll(test);
        test.add(device1);
        Assert.assertTrue(set1.retainAll(test));
        Assert.assertEquals(3, set1.size());
        Assert.assertFalse(set1.contains(device2));
        System.out.println(" Retain all works");


    }

    @Test
    public void removeAll() {
        ArrayList<Device> test = new ArrayList<>();
        test.add(device3);
        test.add(new Refrigirator(1, 2, 3, "s", 3, 4, 5));
        set1.addAll(test);
        test.add(device1);
        Assert.assertTrue(set1.removeAll(test));
        Assert.assertEquals(1, set1.size());
        Assert.assertFalse(set1.contains(device1));
        System.out.println(" Remove all works");

    }

    @Test
    public void clear() {
        set1.clear();
        Assert.assertEquals(0, set1.size());
        Assert.assertFalse(set1.contains(device1));
        System.out.println(" Clear works");
    }
}