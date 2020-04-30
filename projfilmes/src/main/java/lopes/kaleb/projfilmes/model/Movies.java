package lopes.kaleb.projfilmes.model;

import lombok.*;

/**
 @author Kaleb Bueno Lopes
 @since 29/04/2020 10:20
 @version Exemplo 1.0
 */

@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Movies {
    @Getter @Setter
    private String name;
    @Getter @Setter
    private String author;
    @Getter @Setter
    private String releaseDateOf;
    @Getter @Setter
    private String awards;
    @Getter @Setter
    private String budget;
}
