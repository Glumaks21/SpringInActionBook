package tacos.security;

import lombok.Data;
import org.springframework.security.crypto.password.PasswordEncoder;
import tacos.User;

@Data
public class RegistrationForm {

    private String username;
    private String password;
    private String fullname;
    private String street;
    private String city;
    private String state;
    private String zip;
    private String phone;

    public User toUser(PasswordEncoder passwordEncoder) {
        User user = new User();
        user.setUsername(getUsername());
        user.setPassword(passwordEncoder.encode(getPassword()));
        user.setFullname(getFullname());
        user.setStreet(getStreet());
        user.setCity(getCity());
        user.setState(getState());
        user.setZip(getZip());
        user.setPhoneNumber(getPhone());
        return user;
    }

}
