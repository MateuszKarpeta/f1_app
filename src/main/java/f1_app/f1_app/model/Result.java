package f1_app.f1_app.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity(name = "results")
@Table(name = "results")
@Builder
@AllArgsConstructor
@EqualsAndHashCode
@NoArgsConstructor

public class Result implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long resultId;
    private Integer grid;
    private Integer position;
    private Integer positionOrder;
    private Float points;
    private Integer laps;
    private Integer fastestLap;
    private Integer fastestLapTime;
    private Integer fastestLapSpeed;
    private Integer rank;
    private Integer statusId;

}