package dev.chernykh.vehicles;

import lombok.Getter;
import lombok.Setter;

/**
 * Motorbike class extending the vehicle class.
 */
@Getter
@Setter
public class Motorbike extends Vehicle {
    private String brakes;
    private String type;

    public Motorbike(String name, int wheelsCount, int maxSpeed, String brakes, String type) {
        super(name, wheelsCount, maxSpeed);
        this.brakes = brakes;
        this.type = type;
    }

    /**
     * Displaying unique characteristics of a motorbike.
     */
    @Override
    public void getCharacteristics() {
        super.getCharacteristics();
        System.out.println("Уникальные характеристики мотоцикла");
        System.out.println("Тормаза: " + brakes);
        System.out.println("Тип мотоцикла: " + type);
    }
}
