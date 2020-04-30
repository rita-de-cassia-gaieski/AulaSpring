package lopes.kaleb.projjogos.control;


import lopes.kaleb.projjogos.model.Game;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class GameController {

    @GetMapping("/jogo")
    public Game jogo(){
        Game game = new Game();

        game.setName("Shadow of the colossus");
        game.setPrice(42.90);
        game.setGenre("Ação e aventura, Quebra-cabeça, Kaiju");
        game.setProducer("Kō Ōtani");
        game.setAwards("BAFTA Video Games Award: Realização Artística, BAFTA Video Games Award: Melhor Jogo de Ação e Aventura");
        return game;
    }

    @GetMapping("/jogos")
    public ArrayList<Game> jogos(){
        Game game1 = new Game();
        game1.setName("Shadow of the colossus");
        game1.setPrice(42.90);
        game1.setGenre("Ação e aventura, Quebra-cabeça, Kaiju");
        game1.setProducer("Kō Ōtani");
        game1.setAwards("BAFTA Video Games Award: Realização Artística, BAFTA Video Games Award: Melhor Jogo de Ação e Aventura");

        Game game2 = new Game();
        game2.setName("Mega Man VII");
        game2.setPrice(60.00);
        game2.setGenre("Plataforma");
        game2.setProducer("Capcom");
        game2.setAwards("Não");

        Game game3 = new Game();
        game3.setName("Red Dead Redemption 2");
        game3.setPrice(150.00);
        game3.setGenre("ação e aventura");
        game3.setProducer("Rockstar Games");
        game3.setAwards("Não");

        Game game4 = new Game();
        game4.setName("Grand Theft Auto V");
        game4.setPrice(65.50);
        game4.setGenre("ação e aventura");
        game4.setProducer("Rockstar Games");
        game4.setAwards("BAFTA: melhor multiplayer, VGX: jogo do ano, VGX: melhor trila sonora, MAIS");

        ArrayList<Game> register = new ArrayList();

        register.add(game1);
        register.add(game2);
        register.add(game3);
        register.add(game4);

        return register;
    }
}
