package dev.chernykh;

import lombok.Getter;
import lombok.Setter;

import java.io.PrintStream;

/**
 * Scooter class extending the vehicle class.
 */
@Getter
@Setter
public class Scooter extends Vehicle {
    private boolean amortization;
    private boolean electric;

    public Scooter(int wheelsCount, int maxSpeed, boolean amortization, boolean electric) {
        super(wheelsCount, maxSpeed);
        this.amortization = amortization;
        this.electric = electric;
    }

    /**
     * Print common and unique characteristics of a scooter.
     */
    @Override
    public void printCharacteristics(PrintStream out) {
        super.printCharacteristics(out);
        out.println("Уникальные характеристики самоката");
        out.print("Наличие амортизаторов: ");
        out.println(amortization ? "есть" : "нет");
        out.print("Электрический: ");
        out.println(electric ? "да" : "нет");
    }

    @Override
    public VehicleType getType() {
        return VehicleType.Scooter;
    }
}
