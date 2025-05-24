package org.entities;

import lombok.experimental.SuperBuilder;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@SuperBuilder
public abstract class Articulo  extends Base{
    protected String denominacion;
    protected double precioVenta;
    private UnidadMedida unidadMedida;
    @Builder.Default
    private Set<Imagen> imagenesArticulo = new HashSet<>();
}
