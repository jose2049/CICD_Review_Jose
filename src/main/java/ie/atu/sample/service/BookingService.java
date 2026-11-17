package ie.atu.sample.service;

import ie.atu.sample.dto.BookingRequest;
import ie.atu.sample.dto.BookingResponse;
import ie.atu.sample.model.Booking;
import ie.atu.sample.model.Room;
import ie.atu.sample.repository.BookingRepository;
import ie.atu.sample.repository.RoomRepository;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class BookingService {
    private final BookingRepository bookingRepository;
    private final RoomRepository roomRepository;

    public BookingService(RoomRepository roomRepository, BookingRepository bookingRepository) {
        this.roomRepository = roomRepository;
        this.bookingRepository = bookingRepository;
    }
    //Retrieving data to the client
    //Here I receive the DTO info and return a Booking object and save it to the database
    public BookingResponse CreateBookingRequest(BookingRequest bookingRequest) {
        //Creating Booking
        Booking booking = new Booking();
        //Here I'm taking the name from the DTO and assigning it to the Booking object
        booking.setOrganiserName(bookingRequest.organiserName());
        booking.setAttendee_count(bookingRequest.Attendee_count());
        booking.setRoomID(bookingRequest.roomID());
        booking.setStatus("ACTIVE");
        //Here I'm saving the Booking object to the database
        Booking savedBooking = bookingRepository.save(booking);

        Room room = new Room();
        room = roomRepository.findById(bookingRequest.roomID())
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Room Not Found"));
        //Create response DTO
        return new BookingResponse(
                //Here I am assigning the values to the different fields from the database
                savedBooking.getId(),
                savedBooking.getRoomID(),
                room.getName(),
                savedBooking.getOrganiserName(),
                savedBooking.getAttendee_count(),
                savedBooking.getStatus()
        );
    }
    //Accessing the database to return the id
    public Booking GetBookingId(Long id){
        return bookingRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ID Not Found"));
    }
    //Here I want to enter the room name and return the exact room name supplied. How?
    public List<Booking> GetRoomName(String name){
        //I need to access the roomRepo to know what bookings are related with the room names
        if (!roomRepository.existsByName(name))
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Room name Not Found") ;
        return bookingRepository.GetName(name);
    }
}
