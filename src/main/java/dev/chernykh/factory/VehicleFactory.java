package dev.chernykh.factory;

import dev.chernykh.vehicles.*;

/**
 * Factory class to build a vehicle by given type.
 * If type doesn't recognize then VehicleTypeNotRecognizedException will be thrown.
 */
public class VehicleFactory {

    /**
     * Create a vehicle by given type.
     *
     * @param vehicleType a vehicle type
     * @return a vehicle built according to the specified type
     * @throws VehicleTypeNotRecognizedException if the type not recognized
     */
    public Vehicle createVehicle(String vehicleType) throws VehicleTypeNotRecognizedException {
        Vehicle vehicle;

        switch (vehicleType) {
            case "0":
                vehicle = new Motorbike("Мотоцикл", 2, 250, "Дисковые", "Спортивный");
                break;
            case "1":
                vehicle = new Scooter("Самокат", 2, 30, true, true);
                break;
            case "2":
                vehicle = new Car("Автомобиль", 4, 280, "Автомат", "Седан");
                break;
            case "3":
                vehicle = new Bus("Автобус", 6, 160, "Городской", 95);
                break;
            default:
                throw new VehicleTypeNotRecognizedException("Vehicle type: " + vehicleType + " has not recognized");
        }
        return vehicle;
    }
}
