package org.example;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@ToString
public class Pedido extends Base{
    private LocalTime horaEstimadaFinalizacion;
    private Double total;
    private Double totalCosto;
    private Estado estado;
    private TipoEnvio tipoEnvio;
    private FormaPago formaPago;
    private LocalDate fechaPedido;
    private Factura factura;
    private Sucursal sucursal;
    private Domicilio domicilio;
    private HashSet<DetallePedido> detallesPedido;

    public void addDetallePedido(DetallePedido detallePedido) {
        if (detallesPedido == null) {
            detallesPedido = new HashSet<>();
        }
        this.detallesPedido.add(detallePedido);
    }

    public void removeDetallePedido(DetallePedido detallePedido) {
        if (detallesPedido != null) {
            this.detallesPedido.remove(detallePedido);
        }
    }

}
