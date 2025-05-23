package org.example;

import lombok.*;

import java.util.HashSet;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Categoria {
    private String denominacion;
    private Categoria categoriaPadre;
    private HashSet<Categoria> subcategorias;
    private HashSet<Articulo> articulos ;

    public Categoria(String denominacion) {
        this.denominacion = denominacion;
        this.categoriaPadre = null;
    }

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

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public Categoria getCategoriaPadre() {
        return categoriaPadre;
    }

    public void setCategoriaPadre(Categoria categoriaPadre) {
        this.categoriaPadre = categoriaPadre;
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "denominacion='" + denominacion + '\'' +
                ", categoriaPadre=" + categoriaPadre +
                ", subcategorias=" + subcategorias +
                ", articulos=" + articulos +
                '}';
    }
}
