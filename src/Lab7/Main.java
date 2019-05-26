package Lab7;

import Lab6.Device;
import Lab6.Refrigirator;
import Lab6.VaccumCleaner;
import Lab6.WashingMachine;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Device vakuum = new VaccumCleaner(18, 12, 1, "J", 1);
        Device refr = new Refrigirator(1, 2, 3, "H", 1, 2, 3);
        Device wash = new WashingMachine(1, 2, 3, "D", 5);
        Device clen = new VaccumCleaner(8, 12, 1, "l", 1);
        Device nel = new Refrigirator(1, 2, 3, "m", 1, 2, 5);
        Device jok = new Refrigirator(1, 2, 3, "o", 12, 2, 5);
        Device kol = new VaccumCleaner(18, 12, 1, "y", 11);
        ArrayList<Device> dev = new ArrayList<>();
        dev.add(vakuum);
        dev.add(refr);
        ArrayList<Device> nr = new ArrayList<>();

        for (int i = 0; i < 15; i++) {
            nr.add(refr);
        }
        MySet go1 = new MySet(vakuum);
        System.out.println(go1.getTotalSize());
        go1.add(refr);
        go1.add(clen);
        go1.add(wash);
        go1.add(nel);
        go1.add(jok);
        go1.add(kol);
        System.out.println(go1.getTotalSize() + " " + go1.size());
        for (Device u : go1
        ) {
            System.out.println(u);
        }
        go1.remove(vakuum);
        go1.remove(jok);
        System.out.println(go1.getTotalSize() + " " + go1.size());
        for (Device u : go1
        ) {
            System.out.println(u);
        }

    }

}
