package dev.chernykh.vehicles;

import lombok.Getter;
import lombok.Setter;

import java.io.PrintStream;

/**
 * The base class representing a vehicle.
 */
@Getter
@Setter
public abstract class Vehicle {
    private int wheelsCount;
    private int maxSpeed;

    /**
     * @param wheelsCount count of wheels
     * @param maxSpeed    max speed of a vehicle
     */
    Vehicle(int wheelsCount, int maxSpeed) {
        if (wheelsCount < 0) {
            throw new IllegalArgumentException("Кол-во колес не может быть отрицательным");
        }
        if (maxSpeed < 0) {
            throw new IllegalArgumentException("Максимальная скорость не может быть отрицательной");
        }

        this.wheelsCount = wheelsCount;
        this.maxSpeed = maxSpeed;
    }

    /**
     * Print common vehicle characteristics.
     */
    public void print(PrintStream out) {
        out.print("Наименование транспорта: ");
        out.println(this.getType().getTitle());
        out.print("Кол-во колес: ");
        out.println(wheelsCount);
        out.print("Максимальная скорость: ");
        out.println(maxSpeed);
    }

    public abstract VehicleType getType();
}
