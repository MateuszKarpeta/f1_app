package f1_app.f1_app.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity(name="races")
@Table(name="races")
@Builder
@AllArgsConstructor
@EqualsAndHashCode
@NoArgsConstructor

public class Race implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long raceId;
    private Integer round;
    private Integer year;
    private String name;
}
