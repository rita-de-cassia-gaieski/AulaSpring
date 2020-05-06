package lopes.kaleb.finalproject.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Entity
@Table(name = "game")
public class GameEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_game")
    private long id;

    @Column(name = "producer")
    private String producer;

    @Column(name = "game_name")
    private String name;

    @Column(name = "price")
    private float price;

    @Column(name = "hours_played")
    private String hoursPlayed;
}
