package dev.chernykh.vehicles;

public class Bus extends Vehicle {
    private String purpose;
    private int seatsCount;

    public Bus(String name, int wheelsCount, int maxSpeed, String purpose, int seatsCount) {
        super(name, wheelsCount, maxSpeed);
        this.purpose = purpose;
        this.seatsCount = seatsCount;
    }

    @Override
    public void getCharacteristics() {
        super.getCharacteristics();
        System.out.println("Уникальные характеристики автобуса");
        System.out.println("Назначение: " + purpose);
        System.out.println("Кол-во посадочных мест: " + seatsCount);
    }
}
