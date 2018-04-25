package dev.chernykh.vehicles;

public class VehiclesApplication {
    public static void main(String[] args) {
        if (args != null) {

            VehicleFactory factory = new VehicleFactory();

            for (String arg : args) {
                try {
                    Vehicle vehicle = factory.createVehicle(arg);
                    vehicle.getCharacteristics();
                } catch (VehicleTypeNotFoundException e) {
                    System.out.println("НЕИЗВЕСТНЫЙ ТИП ТРАНСПОРТА");
                }
                System.out.println();
            }
        }
    }
}
