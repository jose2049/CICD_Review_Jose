package ie.atu.sample.controller;

import ie.atu.sample.dto.BookingRequest;
import ie.atu.sample.dto.BookingResponse;
import ie.atu.sample.model.Booking;
import ie.atu.sample.model.Room;
import ie.atu.sample.service.BookingService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//This annotation tells Spring that this class handles http requests
@RestController
//This annotation the base URL for all endpoints inside this controller
@RequestMapping("bookings")
public class BookingController {
    //I need a BookingSerivice object to work
    /*At this point I'm not creating an object.
    I'm creating a variable that will hold a reference ot one */
    private final BookingService bookingService;
    //Creating a constructor
    //This is used to initialise an object when it's created
    public BookingController(BookingService bookingService) {
       //Take the BookingService object Spring gives me and store it in my bookingService variable
        this.bookingService = bookingService;
    }
    //This method handles HTTP POST requests
    @PostMapping("CreateBooking")
    //@RequestBody tells spring to take the JSON sent by the client and convert it into a Java object
    //CreateBookingRequest is the new type of the object and is called bookingRequest
    public BookingResponse CreateBookingRequest(@RequestBody BookingRequest bookingRequest) {
        //Passing the info to the service layer
        return bookingService.CreateBookingRequest(bookingRequest);
    }
    //This method handles GET requests
    //So far this method only returns the ID by it doesn't retrieve the booking ID from the database
    @GetMapping("{id}")
    public Booking GetBookingId(@PathVariable Long id){
        return bookingService.GetBookingId(id);
    }
    //Here I'm receiving a name to be searched by the repo and return all the bookings associated to a specific room
    @GetMapping("/roomName")
    public List<Booking> GetRoomName(@RequestParam String name){
        return bookingService.GetRoomName(name);
    }
}
