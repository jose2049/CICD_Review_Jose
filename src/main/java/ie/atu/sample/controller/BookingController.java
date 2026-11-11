package ie.atu.sample.controller;

import ie.atu.sample.dto.CreateBookingRequest;
import ie.atu.sample.model.Booking;
import ie.atu.sample.service.BookingService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("bookings")
public class BookingController {
    private BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @PostMapping("CreateBooking")
    public Booking CreateBookingRequest(@RequestBody CreateBookingRequest bookingRequest) {
        return bookingService.CreateBookingRequest(bookingRequest);
    }
    @GetMapping("{id}")
    public Long GetBookingId(@PathVariable Long id){
        return id;
    }

}
