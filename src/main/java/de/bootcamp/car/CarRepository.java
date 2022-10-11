package de.bootcamp.car;

import java.util.*;

public class CarRepository {
    private final Map<String, Car> cars = new HashMap<>();

    public Optional<Car> getCar(String id){
        return Optional.ofNullable(cars.get(id));
    }

    public Collection<Car> getCars(){
        return Collections.unmodifiableCollection(cars.values());
    }

    public Car addCar(Car car){
        cars.put(car.getId(), car);
        return car;
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
