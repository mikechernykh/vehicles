package dev.chernykh.factory;

/**
 * Indicates that vehicle has not recognized for the specified type.
 */
public class VehicleTypeNotRecognizedException extends Exception {

    VehicleTypeNotRecognizedException(String message) {
        super(message);
    }
}
