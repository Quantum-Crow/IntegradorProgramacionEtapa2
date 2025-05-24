package org.example;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.HashSet;
import java.util.Set;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@ToString
public class Empresa extends Base {
    private String nombre, razonSocial;
    private Integer cuil;

    private Set<Sucursal> sucursales;

    public void addSucursal(Sucursal sucursal){
        if(this.sucursales == null) {
            this.sucursales = new HashSet<>();
        }
        sucursales.add(sucursal);
    }

    public void removeSucursar(Sucursal sucursal){
        if(this.sucursales != null) {
            this.sucursales.remove(sucursal);
        }
    }
}
