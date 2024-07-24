package CarRental.example.CarRental.repository;

import CarRental.example.CarRental.Model.Rental;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentalRepository extends JpaRepository<Rental, Long> {
}
