package org.example;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ArticuloInsumo extends Articulo {
    private double PrecioCompra;
    private Integer stockActual, stockMaximo;
    private Boolean esParaElaborar;

    public ArticuloInsumo(String denominacion, double precioVenta, UnidadMedida unidadMedida, double precioCompra) {
        super(denominacion, precioVenta, unidadMedida);
        PrecioCompra = precioCompra;
    }
}
