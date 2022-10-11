package de.bootcamp.car;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.jupiter.api.Assertions.*;

class CarServiceTest {

    @Test
    void shouldReturnCardId(){

        Car car1 = new Car("audi", 5, true);
        Car car2 = new Car("bmw", 4, false);

        CarRepository carRepository = new CarRepository();
        carRepository.addCar(car1);
        carRepository.addCar(car2);

        CarService carService = new CarService(carRepository);
        Optional<Car> actual = carService.getCar("1234");
        assertThat(actual).contains(car1);

    }

    @Test
    void shouldReturnCars(){
        Car car1 = new Car("audi", 5, true);
        Car car2 = new Car("bmw", 4, false);
        CarRepository carRepository = new CarRepository();
        carRepository.addCar(car1);
        carRepository.addCar(car2);

        CarService carService = new CarService(carRepository);

        Collection<Car> actual = carService.getCars();

        MatcherAssert.assertThat(actual, containsInAnyOrder(
               List.of(new Car("audi", 5, true),
                new Car("bmw", 4, false))));
        assertEquals(2, actual.size());
    }
}