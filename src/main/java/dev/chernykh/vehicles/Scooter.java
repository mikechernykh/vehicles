package dev.chernykh.vehicles;

public class Scooter extends Vehicle {
    private boolean hasAmortization;
    private boolean isElectric;

    public Scooter(String name, int wheelsCount, int maxSpeed, boolean hasAmortization, boolean isElectric) {
        super(name, wheelsCount, maxSpeed);
        this.hasAmortization = hasAmortization;
        this.isElectric = isElectric;
    }

    @Override
    public void getCharacteristics() {
        super.getCharacteristics();
        System.out.println("Уникальные характеристики самоката");
        System.out.println("Наличие амортизаторов: " + (hasAmortization ? "есть" : "нет"));
        System.out.println("Электрический: " + (isElectric ? "да" : "нет"));
    }
}
