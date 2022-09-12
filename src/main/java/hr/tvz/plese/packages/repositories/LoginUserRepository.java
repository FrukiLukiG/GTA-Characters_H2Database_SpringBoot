package hr.tvz.plese.packages.repositories;

import hr.tvz.plese.packages.classes.LoginUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginUserRepository extends JpaRepository<LoginUser, Long> {}