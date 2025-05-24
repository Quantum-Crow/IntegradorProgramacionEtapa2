package org.example;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@ToString
public class ArticuloInsumo extends Articulo {
    private double PrecioCompra;
    private Integer stockActual, stockMaximo;
    private Boolean esParaElaborar;

}
