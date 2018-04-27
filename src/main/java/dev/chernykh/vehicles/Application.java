package dev.chernykh.vehicles;

import static com.google.common.primitives.Ints.tryParse;

public class Application {
    public static void main(String[] args) {
        if (args.length == 0) {
            String info = "Необходимо указать 1 или более типов транспортного средства:\n" +
                    "\t 0 - Мотоцикл\n" +
                    "\t 1 - Самокат\n" +
                    "\t 2 - Автомобиль\n" +
                    "\t 3 - Автобус\n";

            System.out.println(info);
        }

        VehicleFactory factory = new VehicleFactory();
        Vehicle vehicle;

        for (String arg : args) {
            Integer vehicleType = tryParse(arg);

            if (vehicleType != null && vehicleType >= 0 && vehicleType < VehicleType.values().length) {
                vehicle = factory.createVehicle(VehicleType.values()[vehicleType]);
                vehicle.print(System.out);
            } else {
                System.out.println("НЕИЗВЕСТНЫЙ ТИП ТРАНСПОРТА");
            }
            System.out.println();
        }
    }
}
