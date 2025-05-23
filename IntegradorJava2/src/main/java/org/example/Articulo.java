package org.example;

import lombok.*;

import java.util.HashSet;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public abstract class Articulo {
    protected String denominacion;
    protected double precioVenta;

    protected UnidadMedida unidadMedida;
    protected HashSet<Imagen1> Imagen;

    public Articulo(String denominacion, double precioVenta) {
        this.denominacion = denominacion;
        this.precioVenta = precioVenta;
    }

    public Articulo(String denominacion, double precioVenta, UnidadMedida unidadMedida) {
        this.denominacion = denominacion;
        this.precioVenta = precioVenta;
        this.unidadMedida = unidadMedida;
    }
}
