package org.example;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@ToString
public class Domicilio extends Base {
    private String calle;
    private Integer numero;
    private Integer cp;
    //asoc
    private Localidad localidad;
}
