package ie.atu.sample.service;

import ie.atu.sample.dto.CreateBookingRequest;
import ie.atu.sample.model.Booking;
import ie.atu.sample.model.Room;
import ie.atu.sample.repository.BookingRepository;
import ie.atu.sample.repository.RoomRepository;

import org.springframework.stereotype.Service;

import java.net.HttpRetryException;
import java.util.List;

@Service
public class BookingService {
    private final BookingRepository bookingRepository;
    private final RoomRepository roomRepository;

    public BookingService(RoomRepository roomRepository, BookingRepository bookingRepository) {
        this.roomRepository = roomRepository;
        this.bookingRepository = bookingRepository;
    }

    public Booking CreateBookingRequest(CreateBookingRequest bookingRequest) {
        //Creating Booking
        Booking booking = new Booking();
        booking.setName(bookingRequest.name());
        booking.setAttendee_count(bookingRequest.Attendee_count());
        booking.setRoom(bookingRequest.room());

        return bookingRepository.save(booking);

    }
    public List<Booking> GetBookingId(Booking bookings){
        return bookingRepository.findAll();
    }
}
