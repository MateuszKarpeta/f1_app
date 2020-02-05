package f1_app.f1_app.model;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity(name="driverstandings")
@Table(name="driverstandings")
@Builder
@AllArgsConstructor
@EqualsAndHashCode
@NoArgsConstructor

public class DriverStandings implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long driverStandingsId;
    private Float points;
    private Integer position;
    private Integer wins;
}
