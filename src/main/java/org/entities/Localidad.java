package org.entities;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@ToString
public class Localidad extends Base{
    private String nombre;
    private Provincia provincia;
}
