package CarRental.example.CarRental.controller;

import CarRental.example.CarRental.Model.Rental;
import CarRental.example.CarRental.Service.CarService;
import CarRental.example.CarRental.Service.RentalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@Controller
@RequestMapping("/rentals")
/*
public class RentalController {
    @Autowired
    private RentalService rentalService;
    @Autowired
    private CarService carService;

    @GetMapping
    public String listRentals(Model model) {
        List<Rental> rentals = rentalService.getAllRentals();
        model.addAttribute("rentals", rentals);
        return "rental-list";
    }

    @GetMapping("/new")
    public String newRentalForm(Model model) {
        model.addAttribute("rental", new Rental());
        model.addAttribute("cars", carService.getAllCars());
        return "rental-form";
    }

    @PostMapping("/new")
    public String saveRental(@ModelAttribute Rental rental) {
        rentalService.saveRental(rental);
        return "redirect:/rentals";
    }

    @GetMapping("/{id}/edit")
    public String editRentalForm(@PathVariable Long id, Model model) {
        Rental rental = rentalService.getRentalById(id);
        model.addAttribute("rental", rental);
        model.addAttribute("cars", carService.getAllCars());
        return "rental-form";
    }

    @PostMapping("/{id}")
    public String updateRental(@PathVariable Long id, @ModelAttribute Rental rental) {
        rental.setId(id);
        rentalService.saveRental(rental);
        return "redirect:/rentals";
    }

    @GetMapping("/{id}/delete")
    public String deleteRental(@PathVariable Long id) {
        rentalService.deleteRental(id);
        return "redirect:/rentals";
    }
}*/

public class RentalController {
    @Autowired
    private RentalService rentalService;
    @Autowired
    private CarService carService;

    @GetMapping
    public List<Rental> listRentals() {
        return rentalService.getAllRentals();
    }

    @PostMapping("/new")
    public Rental saveRental(@RequestBody Rental rental) {
        return rentalService.saveRental(rental);
    }

    @GetMapping("/id")
    public Rental getRentalById(@PathVariable Long id) {
        return rentalService.getRentalById(id);
    }

    @PutMapping("/id")
    public Rental updateRental(@PathVariable Long id, @RequestBody Rental rental) {
        rental.setId(id);
        return rentalService.saveRental(rental);
    }

    @DeleteMapping("/id")
    public void deleteRental(@PathVariable Long id) {
        rentalService.deleteRental(id);
    }
}
