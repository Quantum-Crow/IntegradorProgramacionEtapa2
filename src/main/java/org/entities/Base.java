package org.entities;

import java.io.Serializable;
import lombok.*;
import lombok.experimental.SuperBuilder;


@Getter
@Setter
@SuperBuilder
public abstract class Base implements Serializable {
    private long id;
    @Builder.Default
    private boolean eliminado = false;
}
