package ie.atu.sample.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    @NotBlank
    @Min(2) @Max(60)
    private String name;
    @Positive
    @Min(1) @Max(60)
    private Integer Attendee_count;
    private String bookingStatus = "ACTIVE";
    private Integer room;
}
