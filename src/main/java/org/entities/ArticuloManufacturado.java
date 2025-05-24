package org.entities;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@SuperBuilder
@ToString
public class ArticuloManufacturado extends Articulo{
    private String descripcion;
    private int tiempoEstimadoMinutos;
    private String preparacion;
    @Builder.Default
    private Set<ArticuloManufacturadoDetalle> detalles = new HashSet<>();

    public void agregarDetalle(ArticuloManufacturadoDetalle detalle){
        if (!detalles.contains(detalle)){
            this.detalles.add(detalle);
        }
    }
}
