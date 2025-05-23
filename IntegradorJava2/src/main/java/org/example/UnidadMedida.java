package org.example;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@Builder
public class UnidadMedida {
    private String denominacion;

    public UnidadMedida(String denominacion) {
        this.denominacion = denominacion;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    @Override
    public String toString() {
        return "UnidadMedida{" +
                "denominacion='" + denominacion + '\'' +
                '}';
    }
}
