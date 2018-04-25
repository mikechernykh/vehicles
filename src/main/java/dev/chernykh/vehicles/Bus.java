package dev.chernykh.vehicles;

import lombok.Getter;
import lombok.Setter;

/**
 * Bus class extending the vehicle class.
 */
@Getter
@Setter
public class Bus extends Vehicle {
    private String purpose;
    private int seatsCount;

    public Bus(String name, int wheelsCount, int maxSpeed, String purpose, int seatsCount) {
        super(name, wheelsCount, maxSpeed);
        this.purpose = purpose;
        this.seatsCount = seatsCount;
    }

    /**
     * Displaying unique characteristics of a bus.
     */
    @Override
    public void getCharacteristics() {
        super.getCharacteristics();
        System.out.println("Уникальные характеристики автобуса");
        System.out.println("Назначение: " + purpose);
        System.out.println("Кол-во посадочных мест: " + seatsCount);
    }
}
