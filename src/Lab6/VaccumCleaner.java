package Lab6;

public class VaccumCleaner extends Device {
    double weight;
    VaccumCleaner(double power, double radiation,double cost, String mark, double weight){
        super(power,radiation,cost,mark);
        this.weight=weight;
    }

    public double getWeight() {
        return weight;
    }
    @Override
    public String toString(){
        return "Power: "+power+", radiation: "+radiation+", cost: "+cost+", mark: "+mark+", weight: "+weight;
    }
}
