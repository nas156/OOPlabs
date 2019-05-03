package Lab6;


import java.util.Arrays;
import java.util.Comparator;

public class House {
    public  Device[] devices;
    private int numberOfSockets;
    private int counter=0;
    House(int numberOfSockets){
        this.numberOfSockets=numberOfSockets;
        devices=new Device[numberOfSockets];
    }


    public void turnOnARefrigirator(double power, double radiation, double cost, String mark, double lenghth, double heighth, double width){
        if (counter<numberOfSockets) {
            devices[counter] = new Refrigirator(power, radiation, cost, mark, lenghth, heighth, width);
            counter++;
        }
        else{
            System.out.println("There is no free sockets");
        }
    }
    public void turnOnAWashingMachine(double power, double radiation,double cost, String mark, double allowedWeight){
        if (counter<numberOfSockets) {
            devices[counter] = new WashingMachine(power, radiation, cost, mark, allowedWeight);
            counter++;
        }
        else{
            System.out.println("There is no free sockets");
        }
    }
    public void turnOnAVacuumCleaner(double power, double radiation,double cost, String mark, double weight){
        if (counter<numberOfSockets){
            devices[counter]= new VaccumCleaner(power, radiation, cost, mark, weight);
            counter++;
        }
        else {
            System.out.println("There in no free sockets");
        }
    }
    public double countPower(){
        double power=0;
        for (int i = 0;i<numberOfSockets;i++) {
            power+=devices[i].getPower();
        }
        return power;
    }

    @Override
    public String toString() {
        for (int i = 0; i < numberOfSockets; i++) {
            System.out.println(devices[i]);
        }
        return "---------------------------------------------------------";
    }
    public void sortByPower(){
        Arrays.sort(devices, Comparator.comparing(Device::getPower));
    }



    public void findDevicesWithRadiation(double start, double end){
        for (int i=0;i<numberOfSockets;i++){
            if(start<=devices[i].getRadiation() && devices[i].getRadiation()<=end)
                System.out.println(devices[i]);
        }
    }

}
