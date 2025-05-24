package org.entities;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@ToString
public class Pais extends Base{
    private String nombre;
}
