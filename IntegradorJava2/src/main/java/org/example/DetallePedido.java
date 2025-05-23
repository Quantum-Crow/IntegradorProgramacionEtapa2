package org.example;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DetallePedido {
    private Integer cantidad;
    private double subTotal;

    private Articulo articulo;

    public DetallePedido(int cantidad, double subTotal, ArticuloManufacturado am1) {
        this.cantidad = cantidad;
        this.subTotal = subTotal;
    }


    @Override
    public String toString() {
        return "DetallePedido{" +
                "cantidad=" + cantidad +
                ", subTotal=" + subTotal +
                ", articulo=" + articulo +
                '}';
    }
}
