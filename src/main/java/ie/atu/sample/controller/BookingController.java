package ie.atu.sample.controller;

import ie.atu.sample.dto.CreateBookingRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("bookings")
public class BookingController {

    @PostMapping("CreateBooking")
    public CreateBookingRequest CreateBookingRequest(@RequestBody CreateBookingRequest bookingRequest) {
        return bookingRequest;
    }
    @GetMapping("{id}")
    public Long GetBookingId(@PathVariable Long id){
        return id;
    }

}
