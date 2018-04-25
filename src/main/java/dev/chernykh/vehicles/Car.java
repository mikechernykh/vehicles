package dev.chernykh.vehicles;

import lombok.Getter;
import lombok.Setter;

/**
 * Car class extending the vehicle class.
 */
@Getter
@Setter
public class Car extends Vehicle {
    private String transmissionType;
    private String carcass;

    public Car(String name, int wheelsCount, int maxSpeed, String transmissionType, String carcass) {
        super(name, wheelsCount, maxSpeed);
        this.transmissionType = transmissionType;
        this.carcass = carcass;
    }

    /**
     * Displaying unique characteristics of a car.
     */
    @Override
    public void getCharacteristics() {
        super.getCharacteristics();
        System.out.println("Уникальные характеристики автомобиля");
        System.out.println("Тип трансмиссии: " + transmissionType);
        System.out.println("Кузов: " + carcass);
    }
}
