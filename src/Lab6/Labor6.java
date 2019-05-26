package Lab6;

import javax.management.StandardEmitterMBean;

public class Labor6 {
    public static void main(String[] args) {
        double start = 2, end = 3;

        House house = new House(5);
        house.turnOnARefrigirator(12, 3, 1000, "Samsung", 1, 3, 1.5);
        house.turnOnAVacuumCleaner(11, 4, 60, "Zanusi", 10);
        house.turnOnAWashingMachine(15, 1, 80, "Sony", 5);
        house.turnOnAWashingMachine(15, 2.6, 1700, "Bosh", 6);
        house.turnOnAVacuumCleaner(16, 2.88, 600, "Xiaomi", 2.5);
        System.out.println("Turned devices:");
        System.out.print(house);
        System.out.println("---------------------------------------------------------");
        System.out.println("Power of all devices: " + house.countPower());
        System.out.println("---------------------------------------------------------");
        house.sortByPower();
        System.out.println("Sorted by power:");
        System.out.print(house);
        System.out.println("---------------------------------------------------------");
        System.out.printf("Devices with radiation in range form %.2f to %.2f: \n",start,end);
        house.findDevicesWithRadiation(start, end);


    }
}
