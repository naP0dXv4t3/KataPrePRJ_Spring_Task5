package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController  {
    @Autowired
    private CarServiceImpl carService;
    @GetMapping("/cars")
    public String cars (@RequestParam(value = "count", defaultValue = "5") int count, Model model) {
        List <Car> showCars = carService.getCars();
        showCars = carService.carsCount(showCars, count);
        model.addAttribute("cars", showCars);
        return "cars";
        }






    }

