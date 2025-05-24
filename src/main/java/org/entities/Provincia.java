package org.entities;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@ToString
public class Provincia extends Base{
    private String nombre;
    private Pais pais;
}
