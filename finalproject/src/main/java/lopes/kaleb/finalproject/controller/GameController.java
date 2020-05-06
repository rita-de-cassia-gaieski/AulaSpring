package lopes.kaleb.finalproject.controller;

import lopes.kaleb.finalproject.model.GameEntity;
import lopes.kaleb.finalproject.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jogos")
public class GameController {
    @Autowired
    private GameRepository  gameRepository;

    @GetMapping
    public ResponseEntity<List<GameEntity>> findAll (){  // get
        return new ResponseEntity<List<GameEntity>>(
                (List<GameEntity>) this.gameRepository.findAll(),
                new HttpHeaders(), HttpStatus.OK);//error 404
    }

    @GetMapping(path = "/{id}")
    // só um objeto
    public ResponseEntity<GameEntity> findById(@PathVariable("id") long id) {
        if(this.gameRepository.findById(id).isPresent()){
            return new ResponseEntity<GameEntity>(
                    this.gameRepository.findById(id).get(),
                    new HttpHeaders(),
                    HttpStatus.OK);

        }
        return new ResponseEntity<GameEntity>(HttpStatus.NOT_FOUND);
    }

    @PostMapping

    public ResponseEntity<GameEntity> register (@RequestBody GameEntity funcionarioEntity) {
        return new ResponseEntity<GameEntity> (
                this.gameRepository.save(funcionarioEntity),
                new HttpHeaders(),
                HttpStatus.CREATED
        );

    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<GameEntity> update (@PathVariable("id") long id,
                                                        @RequestBody GameEntity gameEntity) throws Exception {

        if(id == 0 || !this.gameRepository.existsById(id)){
            throw  new Exception("Código não encontrado ou inexistente!");

        }
        return new ResponseEntity<GameEntity>(
                this.gameRepository.save(gameEntity),
                new HttpHeaders(),
                HttpStatus.OK);

    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<GameEntity> delet (@PathVariable("id") long id ){
        this.gameRepository.deleteById(id);
        return new ResponseEntity<GameEntity>(new HttpHeaders(), HttpStatus.OK);
    }
}
