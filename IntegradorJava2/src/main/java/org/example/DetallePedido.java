package org.example;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@ToString
public class DetallePedido extends Base {
    private Integer cantidad;
    private double subTotal;

    private ArticuloManufacturado articulo;

}
