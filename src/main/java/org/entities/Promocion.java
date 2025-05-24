package org.entities;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@SuperBuilder
@ToString
public class Promocion extends Base{
    private String denominacion;
    private LocalDate fechaDesde;
    private LocalDate fechaHasta;
    private LocalTime horaDesde;
    private LocalTime horaHasta;
    private String descripcionDescuento;
    private double precioPromocional;
    private TipoPromocion tipoPromocion;
    @Builder.Default
    private Set<Imagen> imagenes = new HashSet<>();
    @Builder.Default
    private Set<Articulo> articulos = new HashSet<>();

    public void agregarImagen(Imagen imagen){
        if (!imagenes.contains(imagen)){
            this.imagenes.add(imagen);
        }
    }
    public void agregarArticulo(Articulo articulo){
        if (!articulos.contains(articulo)){
            this.articulos.add(articulo);
        }
    }
}
