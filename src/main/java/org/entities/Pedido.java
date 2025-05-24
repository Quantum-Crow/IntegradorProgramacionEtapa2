package org.entities;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@SuperBuilder
@ToString
public class Pedido extends Base{
    private LocalTime horaEstimadaFinalizacion;
    private double total;
    private double totalCosto;
    private Estado estado;
    private TipoEnvio tipoEnvio;
    private FormaPago formaPago;
    private LocalDate fechaPedido;
    private Sucursal sucursal;
    private Domicilio domicilio;
    @Builder.Default
    private Set<DetallePedido> detalles = new HashSet<>();
    private Factura factura;

    public void agregarDetalle(DetallePedido detalle) {
        if (!detalles.contains(detalle)) {
            if (detalle != null)
                this.detalles.add(detalle);
        }
    }
}
