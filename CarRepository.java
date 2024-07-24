package CarRental.example.CarRental.repository;

import CarRental.example.CarRental.Model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}
