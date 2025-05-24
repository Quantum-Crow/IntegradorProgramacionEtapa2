package org.example;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.HashSet;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@ToString
public abstract class Articulo extends Base {
    protected String denominacion;
    protected double precioVenta;

    protected UnidadMedida unidadMedida;
    protected HashSet<Imagen1> Imagen;

    public void addImagenArticulo(Imagen1 imagenComida) {
        if (Imagen == null) {
            Imagen = new HashSet<>();
        }
        this.Imagen.add(imagenComida);
    }

    public void removeImagenArticulo(Imagen1 imagenComida) {
        if (Imagen != null) {
            this.Imagen.remove(imagenComida);
        }
    }

}
