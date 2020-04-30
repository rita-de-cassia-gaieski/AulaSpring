package lopes.kaleb.projfilmes.control;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControl {
    @GetMapping("/")
    public String index(){
        return "Ola, iniciando o projeto de filmes";
    }
}
