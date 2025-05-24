package org.example;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@ToString
public class Provincia extends Base{
    private String nombre;
    //asociaciones
    private Pais pais;

}
