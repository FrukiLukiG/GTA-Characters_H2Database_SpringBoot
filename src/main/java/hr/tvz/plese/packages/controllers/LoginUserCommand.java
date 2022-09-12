package hr.tvz.plese.packages.controllers;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

public class LoginUserCommand {

    @NotBlank(message = "Email must not be blank")
    @Pattern(message = "Incorrectly typed email, see regular expression for email...",
            regexp = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$")
    private String email;

    @NotBlank(message = "Password must not be blank")
    private String password;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
