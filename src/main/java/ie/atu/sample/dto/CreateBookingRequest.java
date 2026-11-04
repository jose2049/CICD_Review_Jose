package ie.atu.sample.dto;

public record CreateBookingRequest (
        String name,
        Integer Attendee_count,
        Integer room

){ }
