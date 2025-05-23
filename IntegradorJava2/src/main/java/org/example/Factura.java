package org.example;

import lombok.*;

import java.time.LocalDate;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Factura {
    private LocalDate fechaFacturacion;
    private Integer mpPaymentId, mpMerchantOrderId;
    private String mpPreferenceId, mpPaymentType;
    private FormaPago formaPago;
    private double totalVenta;

    public Factura(LocalDate fechaFacturacion, double totalVenta, FormaPago formaPago) {
        this.fechaFacturacion = fechaFacturacion;
        this.totalVenta = totalVenta;
        this.formaPago = formaPago;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "fechaFacturacion=" + fechaFacturacion +
                ", mpPaymentId=" + mpPaymentId +
                ", mpMerchantOrderId=" + mpMerchantOrderId +
                ", mpPreferenceId='" + mpPreferenceId + '\'' +
                ", mpPaymentType='" + mpPaymentType + '\'' +
                ", formaPago=" + formaPago +
                ", totalVenta=" + totalVenta +
                '}';
    }
}
