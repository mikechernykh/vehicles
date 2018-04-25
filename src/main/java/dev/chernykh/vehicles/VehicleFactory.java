package dev.chernykh.vehicles;

public class VehicleFactory {

    public Vehicle createVehicle(String vehicleType) throws VehicleTypeNotFoundException {
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
                throw new VehicleTypeNotFoundException();
        }
        return vehicle;
    }
}
