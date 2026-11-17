package ie.atu.sample.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="bookings")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    @NotBlank
    @Size(min=3, max=20)
    private String organiserName;
    @Positive
    @Min(1) @Max(60)
    private Integer Attendee_count;

    private String status = "ACTIVE";
    @NotNull
    private Long roomID;
}
