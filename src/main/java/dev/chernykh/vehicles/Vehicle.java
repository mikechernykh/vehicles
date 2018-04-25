package dev.chernykh.vehicles;

import lombok.Getter;
import lombok.Setter;

/**
 * The base class representing a vehicle.
 */
@Getter
@Setter
public abstract class Vehicle {
    private String name;
    private int wheelsCount;
    private int maxSpeed;

    Vehicle(String name, int wheelsCount, int maxSpeed) {
        this.name = name;
        this.wheelsCount = wheelsCount;
        this.maxSpeed = maxSpeed;
    }

    /**
     * Displaying common vehicle characteristics.
     */
    public void getCharacteristics() {
        commonCharacteristics();
    }

    private void commonCharacteristics() {
        System.out.println("Наименование транспорта: " + name);
        System.out.println("Кол-во колес: " + wheelsCount);
        System.out.println("Максимальная скорость: " + maxSpeed + "км/ч");
    }
}
