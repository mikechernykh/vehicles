package dev.chernykh.factory;

import dev.chernykh.vehicles.*;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.Is.isA;
import static org.junit.Assert.*;

public class VehicleFactoryTest {

    @Test
    public void shouldCreateMotorbikeWhenTypeIs0() {
        VehicleFactory factory = new VehicleFactory();
        Vehicle vehicle = factory.createVehicle(VehicleType.Motorbike);
        assertNotNull(vehicle);
        assertThat(vehicle.getType().getTitle(), is("Мотоцикл"));
        assertThat(vehicle.getWheelsCount(), is(2));
        assertThat(vehicle.getMaxSpeed(), is(250));
        assertThat((Motorbike) vehicle, isA(Motorbike.class));
        assertThat(((Motorbike) vehicle).getBrakes(), is("Дисковые"));
        assertThat(((Motorbike) vehicle).getMotoClass(), is("Спортивный"));
    }

    @Test
    public void shouldCreateScooterWhenTypeIs1() {
        VehicleFactory factory = new VehicleFactory();
        Vehicle vehicle = factory.createVehicle(VehicleType.Scooter);
        assertNotNull(vehicle);
        assertThat(vehicle.getType().getTitle(), is("Самокат"));
        assertThat(vehicle.getWheelsCount(), is(2));
        assertThat(vehicle.getMaxSpeed(), is(30));
        assertThat((Scooter) vehicle, isA(Scooter.class));
        assertTrue(((Scooter) vehicle).isAmortization());
        assertTrue(((Scooter) vehicle).isElectricDrive());
    }

    @Test
    public void shouldCreateCarWhenTypeIs2() {
        VehicleFactory factory = new VehicleFactory();
        Vehicle vehicle = factory.createVehicle(VehicleType.Car);
        assertNotNull(vehicle);
        assertThat(vehicle.getType().getTitle(), is("Автомобиль"));
        assertThat(vehicle.getWheelsCount(), is(4));
        assertThat(vehicle.getMaxSpeed(), is(280));
        assertThat((Car) vehicle, isA(Car.class));
        assertThat(((Car) vehicle).getTransmissionType(), is("Автомат"));
        assertThat(((Car) vehicle).getCarcass(), is("Седан"));
    }

    @Test
    public void shouldCreateBusWhenTypeIs3() {
        VehicleFactory factory = new VehicleFactory();
        Vehicle vehicle = factory.createVehicle(VehicleType.Bus);
        assertNotNull(vehicle);
        assertThat(vehicle.getType().getTitle(), is("Автобус"));
        assertThat(vehicle.getWheelsCount(), is(6));
        assertThat(vehicle.getMaxSpeed(), is(160));
        assertThat((Bus) vehicle, isA(Bus.class));
        assertThat(((Bus) vehicle).getPurpose(), is("Городской"));
        assertThat(((Bus) vehicle).getSeatsCount(), is(95));
    }
}