package Lab6;

public class Labor6 {
    public static void main(String[] args) {
        double start=2,end=3;
        House house=new House(5);
        house.turnOnARefrigirator(12,3,1000,"Samsung", 1,3,1.5);
        house.turnOnAVacuumCleaner(11,4,60,"Zanusi",10);
        house.turnOnAWashingMachine(15,1,80,"Sony",5);
        house.turnOnAWashingMachine(15,2.6,1700,"Bosh",6);
        house.turnOnAVacuumCleaner(16,2.88,600,"Xiaomi",2.5);
        System.out.println("Turned devices:");
        System.out.println(house);
        System.out.println("Power of all devices: "+house.countPower());
        System.out.println("---------------------------------------------------------");
        house.sortByPower();
        System.out.println("Sorted by power:");
        System.out.println(house);
        System.out.println("Devices with radiation in range form "+start+" to "+end+":");
        house.findDevicesWithRadiation(start,end);


    }
}
