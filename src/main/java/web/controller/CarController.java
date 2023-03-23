package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.ServicCar;


@Controller
public class CarController {
    private final ServicCar ServicCar;
    @Autowired
    public CarController(ServicCar servicCar) {
        this.ServicCar = servicCar;
    }

    @GetMapping("/cars")
    public String show(@RequestParam(value = "count", defaultValue = "5",required = false) int count, Model Car) {
        Car.addAttribute("cars", ServicCar.show(count));
        return "cars";
    }
}