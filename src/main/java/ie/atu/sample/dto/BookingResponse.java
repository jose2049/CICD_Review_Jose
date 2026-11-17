package ie.atu.sample.dto;

public record BookingResponse(
        Long id,
        Long roomID,
        String roomName,
        String organiserName,
        Integer Attendee_count,
        String status
) {
}
