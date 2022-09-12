package hr.tvz.plese.packages.services;

import hr.tvz.plese.packages.classes.Character;
import hr.tvz.plese.packages.repositories.CharacterRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ImplCharacterService implements CharacterService {

    private final CharacterRepository characterRepository;

    public ImplCharacterService(CharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }

    @Override
    public List<Character> findAllCharacters() {
        return new ArrayList<>(characterRepository.findAll());
    }

}
