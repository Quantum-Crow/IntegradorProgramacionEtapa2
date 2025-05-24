package org.example;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@ToString
public class Usuario extends Base{
    private String auth0Id;
    private String username;
    private Rol rol;

}
