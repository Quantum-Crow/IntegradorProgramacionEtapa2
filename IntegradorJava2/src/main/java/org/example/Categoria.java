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
public class Categoria extends Base {
    private String denominacion;
    @ToString.Exclude
    private Categoria categoriaPadre;
    private HashSet<Categoria> subcategorias;
    private HashSet<Articulo> articulos ;

    public void addSubcategoria(Categoria subcategoria) {
        if (this.subcategorias == null) {
            this.subcategorias = new HashSet<>();
        }
        this.subcategorias.add(subcategoria);
        subcategoria.setCategoriaPadre(this);
    }

    public void removeSubcategoria(Categoria subcategoria) {
        if(this.subcategorias != null) {
            this.subcategorias.remove(subcategoria);
            subcategoria.setCategoriaPadre(null);
        }
    }
    public void addArticulo(Articulo articulo) {
        if (this.articulos == null) {
            this.articulos = new HashSet<>();
        }
        this.articulos.add(articulo);
    }

    public void removeArticulo(Articulo articulo) {
        if(this.articulos != null) {
            this.articulos.remove(articulo);
        }
    }
}
