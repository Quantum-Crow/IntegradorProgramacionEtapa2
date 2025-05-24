package org.example;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@ToString
public class ArticuloManufacturadoDetalle extends Base{
    private Integer cantidad;

    private ArticuloInsumo articuloInsumo;
}
