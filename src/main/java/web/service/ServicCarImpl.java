package web.service;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class ServicCarImpl implements ServicCar {
    private final List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car(1, "Mazda", "0ADF3"));
        cars.add(new Car(2, "BMV", "9494GF"));
        cars.add(new Car(3, "Lada", "V446Bd"));
        cars.add(new Car(4, "Toyota", "88NFD2"));
        cars.add(new Car(5, "Porch", "23DSF2"));
    }

    public List<Car> show(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}