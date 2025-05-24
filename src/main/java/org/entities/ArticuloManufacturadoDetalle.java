package org.entities;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@ToString
public class ArticuloManufacturadoDetalle extends Base{
    private int cantidad;
    private ArticuloInsumo insumo;
}
