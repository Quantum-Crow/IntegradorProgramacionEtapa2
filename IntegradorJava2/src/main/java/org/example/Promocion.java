package org.example;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Promocion {
    private String denominacion;
    private LocalDate fechaDesde;
    private LocalDate fechaHasta;
    private LocalTime horaDesde;
    private LocalTime horaHasta;
    private String descripcionDescuento;
    private Double precioPromocional;
    private TipoPromocion tipoPromocion;

    private HashSet<Imagen1> imagenes ;
    private HashSet<Articulo> articulos;

    public Promocion(String denominacion, LocalDate fechaDesde, LocalDate fechaHasta, LocalTime horaHasta, LocalTime horaDesde, String descripcionDescuento, Double precioPromocional, TipoPromocion tipoPromocion) {
        this.denominacion = denominacion;
        this.fechaDesde = fechaDesde;
        this.fechaHasta = fechaHasta;
        this.horaHasta = horaHasta;
        this.horaDesde = horaDesde;
        this.descripcionDescuento = descripcionDescuento;
        this.precioPromocional = precioPromocional;
        this.tipoPromocion = tipoPromocion;
    }


    public void setTipoPromocion(TipoPromocion tipoPromocion) {
        this.tipoPromocion = tipoPromocion;
    }
    public void addImagen(Imagen1 imagen) {
        if (imagenes == null) {
            imagenes = new HashSet<>();
        }
        imagenes.add(imagen);
    }
    public void removeImagen(Imagen1 imagen) {
        this.imagenes.remove(imagen);
    }
    public void addArticulo(Articulo articulo) {
        if (articulos == null) {
            articulos = new HashSet<>();
        }
        this.articulos.add(articulo);
    }


    @Override
    public String toString() {
        return "Promocion{" +
                "denominacion='" + denominacion + '\'' +
                ", fechaDesde=" + fechaDesde +
                ", fechaHasta=" + fechaHasta +
                ", horaDesde=" + horaDesde +
                ", horaHasta=" + horaHasta +
                ", descripcionDescuento='" + descripcionDescuento + '\'' +
                ", precioPromocional=" + precioPromocional +
                ", tipoPromocion=" + tipoPromocion +
                ", imagenes=" + imagenes +
                ", articulos=" + articulos +
                '}';
    }
}
