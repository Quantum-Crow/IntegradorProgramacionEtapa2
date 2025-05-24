package org.entities;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@ToString
public class DetallePedido extends Base{
    private int cantidad;
    private double subtotal;
    private Articulo articulo;
}
