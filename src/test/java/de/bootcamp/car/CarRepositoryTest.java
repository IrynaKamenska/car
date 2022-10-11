package de.bootcamp.car;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CarRepositoryTest {

    @Test
    void getCars() {

//GIVEN
        Car audi = new Car("1", "audi", 4, true);
        Car bmw = new Car("2", "bmw", 4, true);
        Car vw = new Car("3", "vw", 4, false);

        Map<String, Car> cars = new HashMap<>();
        cars.put("id1", audi);
        cars.put("id2", bmw);
        cars.put("id3", vw);
//        Map<String, Car> expected = cars.values();

// WHEN
        CarRepository carRepo = new CarRepository();
        carRepo.addCar("id1", audi);
        carRepo.addCar("id2", bmw);
        carRepo.addCar("id3", vw);


// THEN
       Map<String, Car> actual = carRepo.getCars();
       assertEquals(cars, actual);


    }

    @Test
    void addCar(){
        //GIVEN
        Car audi = new Car("1", "audi", 4, true);

        Map<String, Car> cars = new HashMap<>();
        cars.put("id1", audi);


// WHEN
        CarRepository carRepo = new CarRepository();
        Car actual = carRepo.addCar("id1", audi);

// THEN
        assertEquals(audi, actual);
    }


}