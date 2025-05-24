package org.example;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@SuperBuilder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public abstract class Base implements Serializable {
    private Long id;
    @Builder.Default
    private boolean eliminado=false;
}
