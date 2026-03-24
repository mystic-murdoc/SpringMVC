package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final List<Car> cars = List.of(
            new Car("Mercedes", "Black"),
    new Car("BMW", "Blue"),
            new Car("Audi", "White"),
    new Car("Mazda", "Red"),
            new Car("Toyota", "Yellow")
    );

    @Override
    public List<Car> getCars(int count) {
        if (count >= cars.size()) {
            return cars;
        } else {
            return cars.subList(0, count);
        }
    }
}
