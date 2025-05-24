package org.example;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.HashSet;
import java.util.Set;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@ToString
public class ArticuloManufacturado extends Base {
    private String descripcion, preparacion;
    private Integer tiempoEstimadoMinutos;
    private Set<ArticuloManufacturadoDetalle> ArtManDet;

    public void addDetalle(ArticuloManufacturadoDetalle det) {
        if (this.ArtManDet == null) {
            this.ArtManDet = new HashSet<ArticuloManufacturadoDetalle>();
        }
        this.ArtManDet.add(det);
    }
}
