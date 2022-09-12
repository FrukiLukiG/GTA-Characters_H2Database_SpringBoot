CREATE TABLE IF NOT EXISTS login_info(
    id identity,
    email varchar(255) not null unique,
    password varchar(255) not null
);

CREATE TABLE IF NOT EXISTS gta_character(
    id identity,
    gta_char varchar(50) not null,
    gta_game varchar(50) not null,
    gta_desc varchar(1000) not null,
    gta_char_link varchar(255) not null,
    gta_game_link varchar(255) not null,
    gta_logo integer not null,
    gta_pic integer not null,
    gta_pic_back integer not null,
    gta_sound integer not null
);


