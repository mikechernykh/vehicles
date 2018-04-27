package dev.chernykh.vehicles;

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
    private boolean electricDrive;

    public Scooter(int wheelsCount, int maxSpeed, boolean amortization, boolean electricDrive) {
        super(wheelsCount, maxSpeed);
        this.amortization = amortization;
        this.electricDrive = electricDrive;
    }

    /**
     * Print common and unique characteristics of a scooter.
     */
    @Override
    public void print(PrintStream out) {
        super.print(out);
        out.println("Уникальные характеристики самоката");
        out.print("Наличие амортизаторов: ");
        out.println(amortization ? "есть" : "отсутствуют");
        out.print("Наличие электропривода: ");
        out.println(electricDrive ? "есть" : "отсутствует");
    }

    @Override
    public VehicleType getType() {
        return VehicleType.Scooter;
    }
}
