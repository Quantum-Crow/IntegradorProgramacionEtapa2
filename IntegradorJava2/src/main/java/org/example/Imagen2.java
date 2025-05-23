package org.example;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@Builder
public class Imagen2 {
    private String denominacion;
    public Imagen2(String denominacion) {
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
        return "Imagen2{" +
                "denominacion='" + denominacion + '\'' +
                '}';
    }
}
