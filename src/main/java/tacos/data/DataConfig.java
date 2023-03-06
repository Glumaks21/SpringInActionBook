package tacos.data;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class DataConfig {
//
//    @Bean
//    @Profile("!prod")
//    CommandLineRunner dataLoader(
//            UserRepository userRepo,
//            IngredientRepository ingredientRepo,
//            PasswordEncoder passwordEncoder
//    ) {
//        return args -> {
//
//        };
//    }
//
//    @Bean
//    ApplicationListener<ApplicationStartedEvent> applicationListener(JdbcOperations jdbcOperations) {
//        return event -> jdbcOperations.execute("delete from taco;\n" +
//                "delete from taco_Order;\n" +
//                "delete from ingredient;\n" +
//                "insert into ingredient (id, name, type)\n" +
//                "values ('FLTO', 'Flour Tortilla', 'WRAP');\n" +
//                "insert into ingredient (id, name, type)\n" +
//                "values ('COTO', 'Corn Tortilla', 'WRAP');\n" +
//                "insert into ingredient (id, name, type)\n" +
//                "values ('GRBF', 'Ground Beef', 'PROTEIN');\n" +
//                "insert into ingredient (id, name, type)\n" +
//                "values ('CARN', 'Carnitas', 'PROTEIN');\n" +
//                "insert into ingredient (id, name, type)\n" +
//                "values ('TMTO', 'Diced Tomatoes', 'VEGGIES');\n" +
//                "insert into ingredient (id, name, type)\n" +
//                "values ('LETC', 'Lettuce', 'VEGGIES');\n" +
//                "insert into ingredient (id, name, type)\n" +
//                "values ('CHED', 'Cheddar', 'CHEESE');\n" +
//                "insert into ingredient (id, name, type)\n" +
//                "values ('JACK', 'Monterrey Jack', 'CHEESE');\n" +
//                "insert into ingredient (id, name, type)\n" +
//                "values ('SLSA', 'Salsa', 'SAUCE');\n" +
//                "insert into ingredient (id, name, type)\n" +
//                "values ('SRCR', 'Sour Cream', 'SAUCE');"
//        );
//    }
}
