package f1_app.f1_app.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity (name="constructors")
@Builder
@AllArgsConstructor
@EqualsAndHashCode
@NoArgsConstructor

public class Constructor implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long constructorId;
    private String name;

    @OneToMany(mappedBy = "constructorResults")
    public List<ConstructorResults> constructorResultsList;

    @OneToMany(mappedBy ="constructorStandings")
    public List<ConstructorStandings> constructorStandingsList;
}
