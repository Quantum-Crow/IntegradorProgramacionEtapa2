package org.example;

import lombok.*;

import java.util.HashSet;
import java.util.Set;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ArticuloManufacturado {
    private String descripcion, preparacion;
    private Integer tiempoEstimadoMinutos;
    private Set<ArticuloManufacturadoDetalle> ArtManDet;

    public ArticuloManufacturado(String denominacion, double precioVenta, UnidadMedida unidadMedida, String descripcion) {
        super();
        this.descripcion = descripcion;
    }
    public void addDetalle(ArticuloManufacturadoDetalle det) {
        if (this.ArtManDet == null) {
            this.ArtManDet = new HashSet<ArticuloManufacturadoDetalle>();
        }
        this.ArtManDet.add(det);
    }
}
