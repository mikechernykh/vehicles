package dev.chernykh.factory;

import dev.chernykh.vehicles.*;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class VehicleFactoryTest {
    private VehicleFactory factory;

    @Before
    public void init() {
        factory = new VehicleFactory();
    }

    @Test
    public void shouldCreateMotorbikeIfTypeIs0() throws VehicleTypeNotRecognizedException {
        Vehicle vehicle = factory.createVehicle("0");
        assertNotNull(vehicle);
        assertThat(vehicle.getName(), is("Мотоцикл"));
        assertThat(vehicle.getWheelsCount(), is(2));
        assertThat(vehicle.getMaxSpeed(), is(250));
        assertThat(((Motorbike) vehicle).getBrakes(), is("Дисковые"));
        assertThat(((Motorbike) vehicle).getType(), is("Спортивный"));
    }

    @Test
    public void shouldCreateScooterIfTypeIs1() throws VehicleTypeNotRecognizedException {
        Vehicle vehicle = factory.createVehicle("1");
        assertNotNull(vehicle);
        assertThat(vehicle.getName(), is("Самокат"));
        assertThat(vehicle.getWheelsCount(), is(2));
        assertThat(vehicle.getMaxSpeed(), is(30));
        assertTrue(((Scooter) vehicle).isHasAmortization());
        assertTrue(((Scooter) vehicle).isElectric());
    }

    @Test
    public void shouldCreateCarIfTypeIs2() throws VehicleTypeNotRecognizedException {
        Vehicle vehicle = factory.createVehicle("2");
        assertNotNull(vehicle);
        assertThat(vehicle.getName(), is("Автомобиль"));
        assertThat(vehicle.getWheelsCount(), is(4));
        assertThat(vehicle.getMaxSpeed(), is(280));
        assertThat(((Car) vehicle).getTransmissionType(), is("Автомат"));
        assertThat(((Car) vehicle).getCarcass(), is("Седан"));
    }

    @Test
    public void shouldCreateBusIfTypeIs3() throws VehicleTypeNotRecognizedException {
        Vehicle vehicle = factory.createVehicle("3");
        assertNotNull(vehicle);
        assertThat(vehicle.getName(), is("Автобус"));
        assertThat(vehicle.getWheelsCount(), is(6));
        assertThat(vehicle.getMaxSpeed(), is(160));
        assertThat(((Bus) vehicle).getPurpose(), is("Городской"));
        assertThat(((Bus) vehicle).getSeatsCount(), is(95));
    }

    @Test(expected = VehicleTypeNotRecognizedException.class)
    public void shouldThrowExceptionIfTypeIs4() throws VehicleTypeNotRecognizedException {
        factory.createVehicle("4");
    }

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void shouldThrowExceptionIfTypeIs4AndCheckErrorMessage() throws VehicleTypeNotRecognizedException {
        exception.expect(VehicleTypeNotRecognizedException.class);
        exception.expectMessage("Vehicle type: 4 has not recognized");
        factory.createVehicle("4");
    }
}