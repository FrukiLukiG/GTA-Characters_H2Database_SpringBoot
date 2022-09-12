package hr.tvz.plese.packages.classes;


import javax.persistence.*;

@Entity
@Table(name = "gta_character")
public class Character {

    @Id
    @Column(name = "id")
    @GeneratedValue
    private Long id;

    @Column(name = "gta_char")
    private String name;

    @Column(name = "gta_game")
    private String game;

    @Column(name = "gta_desc")
    private String desc;

    @Column(name = "gta_char_link")
    private String charLink;

    @Column(name = "gta_game_link")
    private String gameLink;

    @Column(name = "gta_logo")
    private Integer logo;

    @Column(name = "gta_pic")
    private Integer pic;

    @Column(name = "gta_pic_back")
    private Integer background;

    @Column(name = "gta_sound")
    private Integer sound;

    public Character(){}

    public Character(String name, String game, String desc, String charLink, String gameLink, Integer logo, Integer pic, Integer background, Integer sound) {
        this.name = name;
        this.game = game;
        this.desc = desc;
        this.charLink = charLink;
        this.gameLink = gameLink;
        this.logo = logo;
        this.pic = pic;
        this.background = background;
        this.sound = sound;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGame() {
        return game;
    }

    public String getDesc() {
        return desc;
    }

    public String getCharLink() {
        return charLink;
    }

    public String getGameLink() {
        return gameLink;
    }

    public Integer getLogo() {
        return logo;
    }

    public Integer getPic() {
        return pic;
    }

    public Integer getBackground() {
        return background;
    }

    public Integer getSound() {
        return sound;
    }
}
