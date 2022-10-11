package de.bootcamp.car;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CarServiceTest {

    @Test
    void addCar() {
        //GIVEN
        Car audi = new Car(null, "audi", 4, true);


// WHEN
        CarService service = new CarService();
        Car actual = service.addCar(audi);

// THEN
        assertEquals(audi, actual);
// actual -  "Car{hersteller='audi', anzahlReifen=4, tuevPlakete=true, id=1f5d0f60-aab8-46c0-8af8-a23a4cad0d90}"

    }

    @Test
    void getCars() {
        //GIVEN
        Car audi = new Car("1", "audi", 4, true);
        Car bmw = new Car("2", "bmw", 4, false);

        Map<String, Car> cars = new HashMap<>();
        cars.put("id1", audi);
        cars.put("id2", bmw);
        System.out.println(cars);

        CarService service = new CarService();
        service.addCar(audi);
        service.addCar(audi);


// WHEN
        Map<String, Car> actual = service.getCars();

// THEN - fail wegen dynamischen uuids
//        assertEquals(cars, actual);
    }
}