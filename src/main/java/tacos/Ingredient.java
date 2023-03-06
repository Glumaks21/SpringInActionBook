package tacos;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode(of = {"id"})
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Ingredient {

    @Id
    @Column(length = 4, nullable = false)
    private String id;

    @Column(length = 25, nullable = false)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(length = 10, nullable = false)
    private Type type;

    public enum Type {
        WRAP, PROTEIN, SAUCE, CHEESE, VEGGIES
    }

}
