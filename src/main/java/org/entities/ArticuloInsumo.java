package org.entities;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@ToString
public class ArticuloInsumo extends Articulo{
    private double precioCompra;
    private int stockActual;
    private int stockMaximo;
    private Boolean esParaElaborar;
}
