package lopes.kaleb.projmusicas.control;

import lopes.kaleb.projmusicas.model.Musics;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class MusicController {

    @GetMapping("/musica")
    public Musics musica(){
        Musics music = new Musics();

        music.setName("Feel Good Inc");
        music.setSongwriter("Gorillaz");
        music.setReleaseDateOf("2005");
        music.setAlbum("Feel Good Inc");
        music.setGenre("Alternativa/Indie");
        music.setAwards("Grammy Award: Melhor Parceria de Pop, MAIS");

        return music;
    }

    @GetMapping("/musicas")
    public ArrayList<Musics> musicas(){
        Musics music1 = new Musics();

        music1.setName("Feel Good Inc");
        music1.setSongwriter("Gorillaz");
        music1.setReleaseDateOf("2005");
        music1.setAlbum("Feel Good Inc");
        music1.setGenre("Alternativa/Indie\n");
        music1.setAwards("Grammy Award: Melhor Parceria de Pop, MAIS");

        Musics music2 = new Musics();

        music2.setName("I'm Not Famous");
        music2.setSongwriter("AJR");
        music2.setReleaseDateOf("2016");
        music2.setAlbum("I'm Not Famous");
        music2.setGenre("Electropop");
        music2.setAwards("Não");

        Musics music3 = new Musics();

        music3.setName("Wolf in Sheep's Clothing");
        music3.setSongwriter("Set It Off");
        music3.setReleaseDateOf("2014");
        music3.setAlbum("Duality");
        music3.setGenre("Punk");
        music3.setAwards("Não");

        Musics music4 = new Musics();

        music4.setName("Baila mais");
        music4.setSongwriter("SóCIRO, Lourena");
        music4.setReleaseDateOf("2019");
        music4.setAlbum("Baila Mais");
        music4.setGenre("Hip-Hop/rap");
        music4.setAwards("Não");

        ArrayList<Musics> register = new ArrayList();

        register.add(music1);
        register.add(music2);
        register.add(music3);
        register.add(music4);

        return register;
    }
}
