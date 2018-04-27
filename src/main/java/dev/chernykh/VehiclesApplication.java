package dev.chernykh;

public class VehiclesApplication {
    public static void main(String[] args) {

        VehicleFactory factory = new VehicleFactory();

        for (String arg : args) {
            try {
                Vehicle vehicle = factory.createVehicle(arg);
                vehicle.printCharacteristics(System.out);
            } catch (VehicleTypeNotRecognizedException e) {
                System.out.println("НЕИЗВЕСТНЫЙ ТИП ТРАНСПОРТА");
            }
            System.out.println();
        }
    }
}
