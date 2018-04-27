package dev.chernykh;

/**
 * Indicates that vehicle has not recognized for the specified motoClass.
 */
public class VehicleTypeNotRecognizedException extends Exception {

    VehicleTypeNotRecognizedException(String message) {
        super(message);
    }
}
