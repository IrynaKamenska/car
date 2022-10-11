package de.bootcamp.car;

import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;


@RestController
@RequestMapping("/cars")
public class CarController {

    private CarRepository carRepository = new CarRepository();
    private CarService carService = new CarService(carRepository);

//    public CarController(CarService carService) {
//        this.carService = carService;
//    }


    // http://localhost:8080/car
    @PostMapping
    public Car addCar(@RequestBody Car car) {
        carService.addCar(car);
        return car;
    }


    @GetMapping
    public Collection<Car> getCars() {
          return carService.getCars();
    }

    @GetMapping("{id}")
    public Optional<Car> getCar(@PathVariable String id) {
        return carService.getCar(id);
    }

}
