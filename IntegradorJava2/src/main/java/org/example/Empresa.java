package org.example;

import lombok.*;

import java.util.HashSet;
import java.util.Set;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Empresa {
    private String nombre, razonSocial;
    private Integer cuil;

    private Set<Sucursal> sucursales;

    public Empresa(String nombre, String razonSocial, Integer cuil) {
        this.nombre = nombre;
        this.razonSocial = razonSocial;
        this.cuil = cuil;
    }

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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public Integer getCuil() {
        return cuil;
    }

    public void setCuil(Integer cuil) {
        this.cuil = cuil;
    }

    public HashSet<Sucursal> getSucursales() {
        return (HashSet<Sucursal>) sucursales;
    }

    public void setSucursales(HashSet<Sucursal> sucursales) {
        this.sucursales = sucursales;
    }
    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", razonSocial='" + razonSocial + '\'' +
                ", cuil=" + cuil +
                ", sucursales=" + sucursales +
                '}';
    }


}
