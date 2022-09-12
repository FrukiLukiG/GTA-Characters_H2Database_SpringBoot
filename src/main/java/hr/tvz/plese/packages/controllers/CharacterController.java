package hr.tvz.plese.packages.controllers;

import hr.tvz.plese.packages.classes.Character;
import hr.tvz.plese.packages.services.CharacterService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("gta")
public class CharacterController {

    private final CharacterService characterService;

    public CharacterController(CharacterService characterService) {
        this.characterService = characterService;
    }

    @GetMapping
    public List<Character> getAllSidemen(){
        return characterService.findAllCharacters();
    }

}
