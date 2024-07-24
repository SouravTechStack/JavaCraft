package CarRental.example.CarRental.controller;

import CarRental.example.CarRental.Model.Car;
import CarRental.example.CarRental.Service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@Controller
@RequestMapping("/api/cars")
/*public class CarController {
    @Autowired
    private CarService carService;

    @GetMapping
    public String listCars(Model model) {
        List<Car> cars = carService.getAllCars();
        model.addAttribute("cars", cars);
        return "car-list";
    }

    @GetMapping("/new")
    public String newCarForm(Model model) {
        model.addAttribute("car", new Car());
        return "car-form";
    }

    @PostMapping("/new")
    public String saveCar(@ModelAttribute Car car) {
        carService.saveCar(car);
        return "redirect:/cars";
    }

    @GetMapping("/{id}/edit")
    public String editCarForm(@PathVariable Long id, Model model) {
        Car car = carService.getCarById(id);
        model.addAttribute("car", car);
        return "car-form";
    }

    @PostMapping("/{id}")
    public String updateCar(@PathVariable Long id, @ModelAttribute Car car) {
        car.setId(id);
        carService.saveCar(car);
        return "redirect:/cars";
    }

    @GetMapping("/{id}/delete")
    public String deleteCar(@PathVariable Long id) {
        carService.deleteCar(id);
        return "redirect:/cars";





    }
}*/

public class CarController {
    @Autowired
    private CarService carService;

    @GetMapping
    public List<Car> listCars() {
        return carService.getAllCars();
    }

    @PostMapping("/new")
    public Car saveCar(@RequestBody Car car) {
        return carService.saveCar(car);
    }

    @GetMapping("/id")
    public Car getCarById(@PathVariable Long id) {
        return carService.getCarById(id);
    }

    @PutMapping("/id")
    public Car updateCar(@PathVariable Long id, @RequestBody Car car) {
        car.setId(id);
        return carService.saveCar(car);
    }

    @DeleteMapping("/id")
    public void deleteCar(@PathVariable Long id) {
        carService.deleteCar(id);
    }
}
