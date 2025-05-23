package org.example;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@Builder
public class ArticuloManufacturadoDetalle {
    private Integer cantidad;

    private ArticuloInsumo articulo;

    public ArticuloManufacturadoDetalle(Integer cantidad, ArticuloInsumo articulo) {
        this.cantidad = cantidad;
        this.articulo = articulo;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public ArticuloInsumo getArticulo() {
        return articulo;
    }

    public void setArticulo(ArticuloInsumo articulo) {
        this.articulo = articulo;
    }

}
