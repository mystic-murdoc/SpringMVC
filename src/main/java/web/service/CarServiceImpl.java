package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final List<Car> cars = new ArrayList<>();

    public CarServiceImpl() {
        cars.add(new Car("Mercedes", "Black"));
        cars.add(new Car("BMW", "Blue"));
        cars.add(new Car("Audi", "White"));
        cars.add(new Car("Mazda", "Red"));
        cars.add(new Car("Toyota", "Yellow"));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count >= cars.size()) {
            return cars;
        } else {
            return cars.subList(0, count);
        }
    }
}
