package de.bootcamp.car;

import java.util.*;

public class CarRepository {
    private Map<String, Car> cars = new HashMap<>();

    public Car addCar(String id, Car car){
        id = car.getId();
        cars.put(id, car);
        return car;
    }

    public Map<String, Car> getCars(){
        return cars;
    }

    @Override
    public String toString() {
        return "CarRepository{" +
                "cars=" + cars +
                '}';
    }
}
