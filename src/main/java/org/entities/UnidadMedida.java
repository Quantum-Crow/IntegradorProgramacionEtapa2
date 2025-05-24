package org.entities;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@ToString
public class UnidadMedida extends Base{
    private String denominacion;
}
