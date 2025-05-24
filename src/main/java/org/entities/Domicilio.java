package org.entities;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@ToString
public class Domicilio extends Base{
    private String calle;
    private int numero;
    private int cp;
    private Localidad localidad;
}
