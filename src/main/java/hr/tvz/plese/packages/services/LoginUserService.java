package hr.tvz.plese.packages.services;

import hr.tvz.plese.packages.classes.LoginUser;
import hr.tvz.plese.packages.controllers.LoginUserCommand;

import java.util.List;
import java.util.Optional;

public interface LoginUserService {

    List<LoginUser> findAllUsers();

    Optional<LoginUser> saveUser(LoginUserCommand loginUserCommand);
}
