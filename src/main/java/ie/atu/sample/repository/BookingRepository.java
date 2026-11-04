package ie.atu.sample.repository;

import ie.atu.sample.model.Booking;
import ie.atu.sample.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository
        extends JpaRepository<Booking, Long> {
}
