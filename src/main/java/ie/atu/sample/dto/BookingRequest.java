package ie.atu.sample.dto;

public record BookingRequest(
        String organiserName,
        Integer Attendee_count,
        Long roomID

){ }
