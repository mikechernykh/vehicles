package dev.chernykh.vehicles;

import lombok.Getter;
import lombok.Setter;

import java.io.PrintStream;

/**
 * Car class extending the vehicle class.
 */
@Getter
@Setter
public class Car extends Vehicle {
    private String transmissionType;
    private String carcass;

    public Car(int wheelsCount, int maxSpeed, String transmissionType, String carcass) {
        super(wheelsCount, maxSpeed);
        this.transmissionType = transmissionType;
        this.carcass = carcass;
    }

    /**
     * Print common and unique characteristics of a car.
     */
    @Override
    public void print(PrintStream out) {
        super.print(out);
        out.println("Уникальные характеристики автомобиля");
        out.print("Тип трансмиссии: ");
        out.println(transmissionType);
        out.print("Кузов: ");
        out.println(carcass);
    }

    @Override
    public VehicleType getType() {
        return VehicleType.Car;
    }
}
