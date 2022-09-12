package hr.tvz.plese.packages.repositories;

import hr.tvz.plese.packages.classes.Character;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacterRepository extends JpaRepository<Character, Long> {}
