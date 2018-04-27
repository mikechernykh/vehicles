package dev.chernykh;

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
        this.wheelsCount = wheelsCount;
        this.maxSpeed = maxSpeed;
    }

    /**
     * Print common vehicle characteristics.
     */
    public void printCharacteristics(PrintStream out) {
        out.print("Наименование транспорта: ");
        out.println(this.getType().getTitle());
        out.print("Кол-во колес: ");
        out.println(wheelsCount);
        out.print("Максимальная скорость: ");
        out.println(maxSpeed);
    }

    public abstract VehicleType getType();
}
