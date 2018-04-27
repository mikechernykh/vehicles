package dev.chernykh.vehicles;

import lombok.Getter;
import lombok.Setter;

import java.io.PrintStream;

/**
 * Bus class extending the vehicle class.
 */
@Getter
@Setter
public class Bus extends Vehicle {
    private String purpose;
    private int seatsCount;

    public Bus(int wheelsCount, int maxSpeed, String purpose, int seatsCount) {
        super(wheelsCount, maxSpeed);
        this.purpose = purpose;
        this.seatsCount = seatsCount;
    }

    /**
     * Print common and unique characteristics of a bus.
     */
    @Override
    public void print(PrintStream out) {
        super.print(out);
        out.println("Уникальные характеристики автобуса");
        out.print("Назначение: ");
        out.println(purpose);
        out.print("Кол-во посадочных мест: ");
        out.println(seatsCount);
    }

    @Override
    public VehicleType getType() {
        return VehicleType.Bus;
    }
}
