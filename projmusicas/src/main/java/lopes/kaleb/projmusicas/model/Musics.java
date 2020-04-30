package lopes.kaleb.projmusicas.model;

import lombok.*;

/**
 @author Kaleb Bueno Lopes
 @since 29/04/2020 10:20
 @version Exemplo 1.0
 */

@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Musics {
    @Getter @Setter
    private String name;
    @Getter @Setter
    private String songwriter;
    @Getter @Setter
    private String releaseDateOf;
    @Getter @Setter
    private String album;
    @Getter @Setter
    private String genre;
    @Getter @Setter
    private String awards;
}
