package lopes.kaleb.projfilmes.control;

import lopes.kaleb.projfilmes.model.Movies;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class MovieController {

    @GetMapping("/filme")
    public Movies filme() {
        Movies movie = new Movies();

        movie.setName("Vingadores ultimato");
        movie.setAuthor("Joe Russo, Anthony Russo");
        movie.setAwards("MTV Movie Award: Melhor Vilão, MAIS");
        movie.setBudget("356 milhões USD");
        movie.setReleaseDateOf("25 de abril de 2019 ");

        return movie;
    }


    @GetMapping("filmes")
    public ArrayList<Movies> filmes(){
        Movies movie1 = new Movies();

        movie1.setName("Vingadores ultimato");
        movie1.setAuthor("Joe Russo, Anthony Russo");
        movie1.setAwards("MTV Movie Award: Melhor Vilão, MAIS");
        movie1.setBudget("356 milhões USD");
        movie1.setReleaseDateOf("25 de abril de 2019 ");

        Movies movie2 = new Movies();

        movie2.setName("Efeito borboleta");
        movie2.setAuthor("Eric Bress, J. Mackye Gruber");
        movie2.setAwards("Não");
        movie2.setBudget("13 milhões USD");
        movie2.setReleaseDateOf("23 de julho de 2004 (Brasil)");

        Movies movie3 = new Movies();

        movie3.setName("O Rei Leão REMAKE");
        movie3.setAuthor("Jon Favreau");
        movie3.setAwards("Não");
        movie3.setBudget("260 milhões USD");
        movie3.setReleaseDateOf("18 de julho de 2019 (Brasil)");

        Movies movie4 = new Movies();

        movie4.setName("O Senhor dos Anéis: As Duas Torres");
        movie4.setAuthor("Peter Jackson");
        movie4.setAwards("MTV Movie Award: Melhor Filme, MAIS");
        movie4.setBudget("94 milhões USD");
        movie4.setReleaseDateOf("27 de dezembro de 2002 (Brasil)");

        ArrayList<Movies> register = new ArrayList();

        register.add(movie1);
        register.add(movie2);
        register.add(movie3);
        register.add(movie4);

        return register;
    }
}
