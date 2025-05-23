package org.example;

import lombok.*;

import java.time.LocalTime;
import java.util.HashSet;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Sucursal {
    private String nombre;
    private LocalTime horarioApertura;
    private LocalTime horarioCierre;

    //asociaciones
    private Domicilio domicilio;
    private HashSet<Categoria> categoria;
    private HashSet<Promocion> promocion;

    public Sucursal(String nombre, LocalTime horarioApertura, LocalTime horarioCierre, Domicilio domicilio) {
        this.nombre = nombre;
        this.horarioApertura = horarioApertura;
        this.horarioCierre = horarioCierre;
        this.domicilio = domicilio;
    }

    public void addPromocion(Promocion promocion) {
        if (this.promocion == null) {
            this.promocion = new HashSet<>();
        }
        this.promocion.add(promocion);
    }

    public void removePromocion(Promocion promocion) {
        if(this.promocion != null) {
            this.promocion.remove(promocion);
        }
    }

    public void addCategoria(Categoria categoria) {
        if (this.categoria == null) {
            this.categoria = new HashSet<>();
        }
        this.categoria.add(categoria);
    }

    public void removeCategoria(Categoria categoria) {
        if (this.categoria != null) {
            this.categoria.remove(categoria);
        }
    }

    @Override
    public String toString() {
        return "Sucursal{" +
                "nombre='" + nombre + '\'' +
                ", horarioApertura=" + horarioApertura +
                ", horarioCierre=" + horarioCierre +
                ", domicilio=" + domicilio +
                ", categoria=" + categoria +
                ", promocion=" + promocion +
                '}';
    }
}
