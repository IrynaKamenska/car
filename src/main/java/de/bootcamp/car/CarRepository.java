package de.bootcamp.car;

import java.util.*;

public class CarRepository {
    private Map<String, Car> cars = new HashMap<>();

    public Car addCar(String id, Car car){
//        id = car.getId();
        cars.put(id, car);
        return car;
    }

    public Map<String, Car> getCars(){
        return cars;
    }

    public List<Car> listCars(){
        return List.copyOf(cars.values());
    }

    @Override
    public String toString() {
        return "CarRepository{" +
                "cars=" + cars +
                '}';
    }
}
