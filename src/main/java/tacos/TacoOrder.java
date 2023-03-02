package tacos;

import jakarta.persistence.*;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.CreditCardNumber;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class TacoOrder implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private Date placedAt;

    @NotEmpty(message = "Delivery name is required")
    @Column(length = 50, nullable = false)
    private String deliveryName;

    @NotEmpty(message = "Street is required")
    @Column(length = 50, nullable = false)
    private String deliveryStreet;

    @NotEmpty(message = "City is required")
    @Column(length = 50, nullable = false)
    private String deliveryCity;

    @NotEmpty(message = "State is required")
    @Column(length = 2, nullable = false)
    private String deliveryState;

    @NotEmpty(message = "Zip code is required")
    @Column(length = 10, nullable = false)
    private String deliveryZip;

    @CreditCardNumber(message = "Not a valid credit card number")
    @Column(length = 16, nullable = false)
    private String ccNumber;

    @Pattern(regexp="^(0[1-9]|1[0-2])([\\/])([2-9][0-9])$",
            message="Must be formatted MM/YY")
    @Column(length = 5, nullable = false)
    private String ccExpiration;

    @Digits(integer=3, fraction=0, message="Invalid CVV")
    @Column(length = 3, nullable = false)
    private String ccCVV;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Taco> tacos;

    @ManyToOne
    private User user;

    public void addTaco(Taco taco) {
        tacos.add(taco);
    }
}
