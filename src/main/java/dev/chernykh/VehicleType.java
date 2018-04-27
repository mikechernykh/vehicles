package dev.chernykh;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum VehicleType {
    Motorbike("Мотоцикл"),
    Scooter("Самокат"),
    Car("Автомобиль"),
    Bus("Автобус");

    private String title;
}
