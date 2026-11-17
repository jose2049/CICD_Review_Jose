package ie.atu.sample.repository;

import ie.atu.sample.model.Booking;
import ie.atu.sample.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {
    boolean existsByName(String name);

    //public List<Booking> GetName(@Param("name") String name);
}
