package f1_app.f1_app.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity(name = "drivers")
@Table(name = "drivers")
@Builder
@AllArgsConstructor
@EqualsAndHashCode
@NoArgsConstructor

public class Driver implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long driverID;
    private String forename;
    private String surname;

}
