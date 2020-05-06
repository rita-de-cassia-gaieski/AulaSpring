package lopes.kaleb.finalproject.repository;

import lopes.kaleb.finalproject.model.GameEntity;
import org.springframework.data.repository.CrudRepository;

public interface GameRepository extends CrudRepository<GameEntity, Long> {
}
