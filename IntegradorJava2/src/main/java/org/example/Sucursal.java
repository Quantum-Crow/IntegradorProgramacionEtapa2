package org.example;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalTime;
import java.util.HashSet;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@ToString
public class Sucursal extends Base{
    private String nombre;
    private LocalTime horarioApertura;
    private LocalTime horarioCierre;

    //asociaciones
    private Domicilio domicilio;
    private HashSet<Categoria> categoria;
    private HashSet<Promocion> promocion;


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

}
