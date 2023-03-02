package tacos;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
import org.springframework.data.domain.Persistable;

@Getter
@Setter
@Entity
public class Ingredient {

    @Id
    private String id;

    private String name;

    private Type type;

    public enum Type {
        WRAP, PROTEIN, SAUCE, CHEESE, VEGGIES
    }

}
