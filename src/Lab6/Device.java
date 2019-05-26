package Lab6;

import java.util.Objects;

public class Device {
    double power;
    double radiation;
    double cost;
    String mark;

    Device(double power, double radiation, double cost, String mark) {
        this.power = power;
        this.radiation = radiation;
        this.cost = cost;
        this.mark = mark;
    }

    public double getPower() {
        return power;
    }

    public double getRadiation() {
        return radiation;
    }

    public double getCost() {
        return cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Device device = (Device) o;
        return Double.compare(device.power, power) == 0 &&
                Double.compare(device.radiation, radiation) == 0 &&
                Double.compare(device.cost, cost) == 0 &&
                Objects.equals(mark, device.mark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(power, radiation, cost, mark);
    }

    public String getMark() {
        return mark;
    }

}
