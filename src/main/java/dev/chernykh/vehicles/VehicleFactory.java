package dev.chernykh.vehicles;

/**
 * Factory class to build a vehicle by given type.
 * If type doesn't recognize then IllegalStateException will be thrown.
 */
public class VehicleFactory {

    /**
     * Create a vehicle by given type.
     *
     * @param vehicleType a vehicle type
     * @return a vehicle built according to the specified type
     */
    public Vehicle createVehicle(VehicleType vehicleType) {
        Vehicle vehicle;

        switch (vehicleType) {
            case Motorbike:
                vehicle = new Motorbike(2, 250, "Дисковые", "Спортивный");
                break;
            case Scooter:
                vehicle = new Scooter(2, 30, true, true);
                break;
            case Car:
                vehicle = new Car(4, 280, "Автомат", "Седан");
                break;
            case Bus:
                vehicle = new Bus(6, 160, "Городской", 95);
                break;
            default:
                throw new IllegalStateException("Vehicle type: " + vehicleType + " has not recognized");
        }
        return vehicle;
    }
}
