package web.CarService;

import web.model.Car;

import java.util.List;

public class CarService {
    public static List<Car> carsCount(List<Car> cars, int count){
        return cars.stream().limit(count).toList();
    }
}
