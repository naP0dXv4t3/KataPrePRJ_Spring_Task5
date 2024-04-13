package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.CarService.CarService;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping("/cars")
    public String cars (@RequestParam(value = "count", defaultValue = "5") int allCars, Model car) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Ford", "Mustang", "1950"));
        cars.add(new Car("Ferrari", "Enzo", "1976"));
        cars.add(new Car("BMW", "520i", "2016"));
        cars.add(new Car("Hyundai", "i40", "2012"));
        cars.add(new Car("Volkswagen", "Tiguan", "2019"));
        cars = CarService.carsCount(cars, allCars);
        car.addAttribute("cars",cars);
        return "cars";



    }

}
