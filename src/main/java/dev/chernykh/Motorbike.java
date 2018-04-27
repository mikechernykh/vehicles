package dev.chernykh;

import lombok.Getter;
import lombok.Setter;

import java.io.PrintStream;

/**
 * Motorbike class extending the vehicle class.
 */
@Getter
@Setter
public class Motorbike extends Vehicle {
    private String brakes;
    private String motoClass;

    public Motorbike(int wheelsCount, int maxSpeed, String brakes, String motoClass) {
        super(wheelsCount, maxSpeed);
        this.brakes = brakes;
        this.motoClass = motoClass;
    }

    /**
     * Print common and unique characteristics of a motorbike.
     */
    @Override
    public void printCharacteristics(PrintStream out) {
        super.printCharacteristics(out);
        out.print("Тормоза: ");
        out.println(brakes);
        out.print("Тип: ");
        out.println(motoClass);
    }

    @Override
    public VehicleType getType() {
        return VehicleType.Motorbike;
    }
}
