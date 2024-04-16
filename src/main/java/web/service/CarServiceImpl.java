package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Service
public class CarServiceImpl implements CarService{


    private List<Car> cars;
    {
        cars = new ArrayList<>();
        cars.add(new Car("Ford", "Mustang", "1950"));
        cars.add(new Car("Ferrari", "Enzo", "1976"));
        cars.add(new Car("BMW", "520i", "2016"));
        cars.add(new Car("Hyundai", "i40", "2012"));
        cars.add(new Car("Volkswagen", "Tiguan", "2019"));

    }
    @Override
    public List<Car> carsCount(int count){
        return cars.stream().limit(count).toList();
    }
}

