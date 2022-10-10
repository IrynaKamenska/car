package de.bootcamp.car;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/car")
public class CarController {

    private CarService carService = new CarService();


    // http://localhost:8080/car
    @PostMapping
    public Car addCar(@RequestBody Car car) {
        carService.addCar(car);
        return car;
    }


    @GetMapping
    public List<Car> getCars() {
        return new ArrayList<>(carService.getCars().values());
    }

    @GetMapping("/uuid")
    public Set<String> getUUIDs() {
        return carService.getUUIDs();
    }

    @GetMapping("{id}")
    public Car getCar(@PathVariable String id) {
        return carService.getCars().get(id);
    }

}
