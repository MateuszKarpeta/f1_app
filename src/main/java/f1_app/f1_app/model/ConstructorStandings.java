package f1_app.f1_app.model;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity(name = "constructorstandings")
@Table(name = "constructorstandings")
@Builder
@AllArgsConstructor
@EqualsAndHashCode
@NoArgsConstructor

public class ConstructorStandings implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long constructorStandingsId;
    private Float points;
    private Integer position;
    private Integer wins;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "constructors",
            foreignKey = @ForeignKey(name = "constructorId_fk"))
    private Constructor constructorStandings;
}
