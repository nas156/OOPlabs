package Lab6;

public class Refrigirator extends Device {
    private double lenghth;
    private double heighth;
    private double width;
    Refrigirator(double power,double radiation, double cost, String mark, double lenghth, double heighth, double width){
        super(power, radiation, cost, mark);
        this.lenghth=lenghth;
        this.heighth=heighth;
        this.width=width;
    }

    public double getHeighth() {
        return heighth;
    }

    public double getLenghth() {
        return lenghth;
    }

    public double getWidth() {
        return width;
    }
    @Override
    public String toString(){
        return "Power: "+power+", radiation: "+radiation+", cost: "+cost+", mark: "+mark+", lenghth: "+lenghth+", height: "+heighth+", width: "+width;
    }
}
