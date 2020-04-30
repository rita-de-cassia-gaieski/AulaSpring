package lopes.kaleb.projjogos.model;

import lombok.*;

/**
 @author Kaleb Bueno Lopes
 @since 29/04/2020 10:20
 @version Exemplo 1.0
 */

@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Game {
    @Getter @Setter
    private String name;
    @Getter @Setter
    private double price;
    @Getter @Setter
    private String genre;
    @Getter @Setter
    private String producer;
    @Getter @Setter
    private String awards;
}
