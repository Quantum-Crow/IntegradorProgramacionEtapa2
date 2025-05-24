package org.example;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@ToString
public class Factura extends Base{
    private LocalDate fechaFacturacion;
    private Integer mpPaymentId, mpMerchantOrderId;
    private String mpPreferenceId, mpPaymentType;
    private FormaPago formaPago;
    private double totalVenta;
}
