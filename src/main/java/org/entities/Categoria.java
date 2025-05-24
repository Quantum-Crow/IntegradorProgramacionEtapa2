package org.entities;

import java.util.HashSet;
import java.util.Set;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@ToString
public class Categoria extends Base{
    private String denominacion;
    @Builder.Default
    private Set<Articulo> articulos = new HashSet<>();
    @Builder.Default
    private Set<Categoria> categorias = new HashSet<>();

    public void agregarArticulo(Articulo articulo) {
        if (!articulos.contains(articulo)) {
            if (articulo!= null){
                this.articulos.add(articulo);
            }
        }
    }
    public void agregarCategoria(Categoria categoria) {
        if (!categorias.contains(categoria)) {
            if (categoria!= null){
                this.categorias.add(categoria);
            }
        }
    }
}
