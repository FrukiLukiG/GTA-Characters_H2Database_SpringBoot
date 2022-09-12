package hr.tvz.plese.packages.controllers;

import hr.tvz.plese.packages.classes.LoginUser;
import hr.tvz.plese.packages.services.LoginUserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("login")
public class LoginUserController {

    private final LoginUserService loginUserService;

    public LoginUserController(LoginUserService loginUserService) {
        this.loginUserService = loginUserService;
    }

    @GetMapping
    public List<LoginUser> getAllUsers(){
        return loginUserService.findAllUsers();
    }

    @PostMapping
    public ResponseEntity<LoginUser> saveUser(@Valid @RequestBody final LoginUserCommand loginUserCommand) {
        return loginUserService.saveUser(loginUserCommand)
                .map(l -> ResponseEntity
                        .status(HttpStatus.CREATED)
                        .body(l)
                )
                .orElseGet( () -> ResponseEntity
                        .status(HttpStatus.CONFLICT)
                        .build()
                );
    }
}
