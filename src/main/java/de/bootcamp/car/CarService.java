package de.bootcamp.car;

import java.util.*;

public class CarService {
    private CarRepository carRepository = new CarRepository();

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public Optional<Car> getCar(String id){
        return carRepository.getCar(id);
    }

    public Collection<Car> getCars() {
        return Collections.unmodifiableCollection(carRepository.getCars());
    }

    public Car addCar(Car car) {
        carRepository.addCar(car);
        return car;
    }


}
