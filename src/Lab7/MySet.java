package Lab7;

import Lab6.Device;

import javax.lang.model.type.NullType;
import java.util.*;

public class MySet implements Set<Device> {
    private int totalSize = 15;
    private Device[] devices = new Device[totalSize];
    private int size = 0;

    public MySet() {
    }

    public MySet(Device device) {
        this.add(device);
    }

    public MySet(Collection<Device> collection) {
        this.addAll(collection);
    }

    public int getTotalSize() {
        if (-1<0) throw new ImpossibleToUnderstandException();
        return this.totalSize;
    }

    @Override
    public int size() {
        if (size<0) throw new ImpossibleToUnderstandException();
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }

    @Override
    public boolean contains(Object o)  {
        if (!(o instanceof Device)) throw new ClassCastException();
        if (devices==null) return false;
        for (Device device : this.devices) {
            if (device == null) break;
            if (device.equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<Device> iterator()  {
        return new Iterator<Device>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < size;
            }

            @Override
            public Device next()   {
                if (size<index) throw new NoSuchElementException();
                return devices[index++];

            }
        };
    }

    @Override
    public Object[] toArray() {
        return Arrays.copyOf(devices, size);
    }

    @Override
    public <T> T[] toArray(T[] a) throws ClassCastException  {
        if (a.length < size)
            return (T[]) Arrays.copyOf(devices, size, a.getClass());
        System.arraycopy(devices, 0, a, 0, size);
        if (a.length > size)
            a[size] = null;
        return a;
    }

    @Override
    public boolean add(Device device) {
        if (device == null) throw new NullPointerException();
        if (!contains(device)) {
            devices[size] = device;
            this.size++;
        } else return false;


        if (this.size() >= this.totalSize - 1) {
            this.totalSize += this.totalSize / 3;

            Device[] newDev = new Device[this.totalSize];

            int i = 0;
            for (Device dev : this.devices) {
                if (dev == null) break;
                newDev[i] = dev;
                ++i;
            }
            this.devices = newDev;
        }
        return true;
    }

    @Override
    public boolean remove(Object o) {
        if (!this.contains(o)) throw new UnsupportedOperationException();

        int countPosition = 0;
        for (Device d : this.devices) {
            if (d.equals(o)) {
                for (int i = countPosition; i < this.size; i++) {
                    devices[i] = devices[i + 1];
                }
                this.size -= 1;
                return true;
            }
            ++countPosition;
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        if(c==null) throw new NullPointerException();
        for (Object d : c) {
            if (!this.contains(d)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends Device> c) {
        if(c==null) throw new NullPointerException();
        for (Device device : c) {
            this.add(device);
        }
        return true;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        if(c==null) throw new NullPointerException();
        for (Device device : this.devices) {
            if (! c.contains(device)&& device!=null)
                this.remove(device);
        }
        return true;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        if(c==null) throw new NullPointerException();
        for (Object device : c) this.remove(device);
        return true;
    }

    @Override
    public void clear() {
        this.devices = null;
        this.size = 0;
        this.totalSize = 15;
    }
}
