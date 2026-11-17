package ie.atu.sample.controller;

import ie.atu.sample.model.Room;
import ie.atu.sample.repository.RoomRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rooms")
public class RoomController {

    private final RoomRepository roomRepository;

    public RoomController(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    /*@GetMapping("/roomName")
    public List<Room> GetName(@RequestParam String name) {
        return roomRepository.findAll();
    }*/
}
