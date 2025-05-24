package org.entities;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@SuperBuilder
@ToString
public class Sucursal extends Base{
    private String nombre;
    private LocalTime horarioApertura;
    private LocalTime horarioCierre;
    private Domicilio domicilio;

    @Builder.Default
    private Set<Categoria> categorias = new HashSet<>();
    @Builder.Default
    private Set<Promocion> promociones = new HashSet<>();

    public void agregarCategoria(Categoria categoria) {
        if (categoria != null) {
            categorias.add(categoria);
        }
    }
    public void agregarPromocion(Promocion promocion) {
        if (promocion != null) {
            promociones.add(promocion);
        }
    }
}
