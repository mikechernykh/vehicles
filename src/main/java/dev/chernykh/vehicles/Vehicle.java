package dev.chernykh.vehicles;

public abstract class Vehicle {
    private String name;
    private int wheelsCount;
    private int maxSpeed;

    public Vehicle(String name, int wheelsCount, int maxSpeed) {
        this.name = name;
        this.wheelsCount = wheelsCount;
        this.maxSpeed = maxSpeed;
    }

    public void getCharacteristics() {
        commonCharacteristics();
    }

    private void commonCharacteristics() {
        System.out.println("Наименование транспорта: " + name);
        System.out.println("Кол-во колес: " + wheelsCount);
        System.out.println("Максимальная скорость: " + maxSpeed + "км/ч");
    }
}
