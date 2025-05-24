package org.entities;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@SuperBuilder
@ToString
public class Empresa extends Base{
    private String nombre;
    private int cuil;
    private String razonSocial;
    @Builder.Default
    private Set<Sucursal> sucursales = new HashSet<>();

    public void agregarSucursal(Sucursal sucursal) {
        if (!sucursales.contains(sucursal)) {
            sucursales.add(sucursal);
        }
    }
}
