drop table if exists game;

create table game(
    id_game bigint null auto_increment,
    producer varchar(50) not null,
    game_name varchar(50) not null,
    price  float not null,
    hours_played varchar(20) not null,
    primary key(id_game));