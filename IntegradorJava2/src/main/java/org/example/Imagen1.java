package org.example;

import lombok.*;

@Getter
@Setter
//@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Imagen1 {
    private String denominacion;
    public Imagen1(String denominacion) {
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
        return "Imagen1{" +
                "denominacion='" + denominacion + '\'' +
                '}';
    }
}
