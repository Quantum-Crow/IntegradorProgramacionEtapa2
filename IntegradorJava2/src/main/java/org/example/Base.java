package org.example;

import lombok.experimental.SuperBuilder;

@SuperBuilder
public abstract class Base {
    private Long id;
    private boolean eliminado=false;
}
