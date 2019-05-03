package Lab6;

public class Device {
    double power;
    double radiation;
    double cost;
    String mark;
    Device(double power,double radiation,double cost,String mark){
        this.power=power;
        this.radiation=radiation;
        this.cost=cost;
        this.mark=mark;
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

    public String getMark() {
        return mark;
    }
}
