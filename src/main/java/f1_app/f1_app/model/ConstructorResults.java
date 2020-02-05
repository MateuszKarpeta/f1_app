package f1_app.f1_app.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity (name="constructorresults")
@Builder
@AllArgsConstructor
@EqualsAndHashCode
@NoArgsConstructor

public class ConstructorResults implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long driverID;
    private String forename;
    private String surname;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "constructors",
            foreignKey = @ForeignKey(name = "constructorId_fk"))
    private Constructor constructorResults;

}
