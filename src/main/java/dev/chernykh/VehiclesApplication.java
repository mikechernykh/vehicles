package dev.chernykh;

import dev.chernykh.vehicles.Vehicle;
import dev.chernykh.factory.VehicleFactory;
import dev.chernykh.factory.VehicleTypeNotRecognizedException;

public class VehiclesApplication {
    public static void main(String[] args) {

        VehicleFactory factory = new VehicleFactory();

        for (String arg : args) {
            try {
                Vehicle vehicle = factory.createVehicle(arg);
                vehicle.getCharacteristics();
            } catch (VehicleTypeNotRecognizedException e) {
                System.out.println("НЕИЗВЕСТНЫЙ ТИП ТРАНСПОРТА");
            }
            System.out.println();
        }
    }
}
