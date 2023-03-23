package web.service;

import web.models.Car;


import java.util.List;


public interface ServicCar {
    List<Car> show(int count);
}