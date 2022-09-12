package hr.tvz.plese.packages.services;

import hr.tvz.plese.packages.classes.LoginUser;
import hr.tvz.plese.packages.controllers.LoginUserCommand;
import hr.tvz.plese.packages.repositories.LoginUserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ImplLoginUserService implements LoginUserService {

    private final LoginUserRepository loginUserRepository;

    public ImplLoginUserService(LoginUserRepository loginUserRepository) {
        this.loginUserRepository = loginUserRepository;
    }

    @Override
    public List<LoginUser> findAllUsers() {
        return new ArrayList<>(loginUserRepository.findAll());
    }

    @Override
    public Optional<LoginUser> saveUser(LoginUserCommand loginUserCommand){
        LoginUser loginUser = mapCommandUser(loginUserCommand);

        for (LoginUser usr : loginUserRepository.findAll()){
            if (usr.getEmail().equals(loginUser.getEmail())){
                return Optional.empty();
            }
        }

        loginUserRepository.save(loginUser);
        return Optional.of(loginUser);
    }

    private LoginUser mapCommandUser(final LoginUserCommand loginUserCommand){
        return new LoginUser(loginUserCommand.getEmail(), loginUserCommand.getPassword());
    }

}
