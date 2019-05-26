package Lab6;

public class WashingMachine extends Device {
    double allowedWeight;

    public WashingMachine(double power, double radiation, double cost, String mark, double allowedWeight) {
        super(power, radiation, cost, mark);
        this.allowedWeight = allowedWeight;
    }

    public double getAllowedWeightWeight() {
        return allowedWeight;
    }

    @Override
    public String toString() {
        return "Power: " + power + ", radiation: " + radiation + ", cost: " + cost + ", mark: " + mark + ", allowedWeight: " + allowedWeight;
    }
}
