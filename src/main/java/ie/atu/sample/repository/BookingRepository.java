package ie.atu.sample.repository;

import ie.atu.sample.model.Booking;
import ie.atu.sample.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BookingRepository
        extends JpaRepository<Booking, Long> {
    @Query("""
            SELECT b
            FROM Booking b
            JOIN Room r
            ON b.roomID = r.id
            WHERE LOWER(r.name) = LOWER(:name)
            ORDER BY r.id ASC
            """)
    public List<Booking> GetName(@Param("name") String name);
}
