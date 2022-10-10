package de.bootcamp.car;

import java.util.Map;
import java.util.Set;
import java.util.UUID;

public class CarService {
    private CarRepository carRepository = new CarRepository();


    public Car addCar(Car car) {
        String id = UUID.randomUUID().toString();
        if(car.getId() == null)car.setId(id);
        carRepository.addCar(id, car);
        return car;
    }

    public Map<String, Car> getCars() {
        return carRepository.getCars();
    }

    public Set<String> getUUIDs() {
        return carRepository.getCars().keySet();
    }

}
