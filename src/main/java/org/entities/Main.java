package org.entities;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {

        Pais pais_0 = Pais.builder()
                .nombre("Argentina")
                .build();

        Provincia provincia_0 = Provincia.builder()
                .nombre("Mendoza")
                .pais(pais_0)
                .build();

        Localidad localidad_0 = Localidad.builder()
                .nombre("Ciudad de Mendoza")
                .provincia(provincia_0)
                .build();

        Domicilio domicilio_0 = Domicilio.builder()
                .calle("Av. ficticia")
                .numero(1234)
                .cp(5678)
                .localidad(localidad_0)
                .build();

        Categoria categoria_0 = Categoria.builder()
                .denominacion("Panificado")
                .build();
        Categoria categoria_1 = Categoria.builder()
                .denominacion("Insumos propios?")
                .build();
        // .!agregar lista de articulos

        Sucursal sucursal_0 = Sucursal.builder()
                .nombre("Sucursal ficticia 0")
                .horarioApertura(LocalTime.of(8, 0))
                .horarioCierre(LocalTime.of(19, 0))
                .domicilio(domicilio_0)
                .build();
        sucursal_0.agregarCategoria(categoria_0);

        Empresa empresa_0 = Empresa.builder()
                .nombre("Empresa ficticia 0")
                .razonSocial("xx")
                .cuil(123456789)
                .build();
        //hacer uso de agregar sucursales

        Promocion promocion_0 = Promocion.builder()
                .denominacion("Promocion ficticia 0")
                .fechaDesde(LocalDate.of(2025,6,1))
                .fechaHasta(LocalDate.of(2025,6,30))
                .horaDesde(LocalTime.of(8,0))
                .horaHasta(LocalTime.of(19,0))
                .descripcionDescuento("Descripcion de descuento ficticia 0")
                .precioPromocional(0.20) //hablando en porcentage?
                .tipoPromocion(TipoPromocion.PROMOCION_1)
                .build();
        promocion_0.agregarImagen(Imagen.builder().denominacion("https://via.placeholder.com/600x400?text=Promocion+Aqui").build());
        //promocion_0.agregarArticulo(); !AGREGAR ARTICULO

        //articulos :(

        //insumo
        UnidadMedida unidadMedida_0 = UnidadMedida.builder()
                .denominacion("kilo")
                .build();
        ArticuloInsumo articuloInsumo_0 = ArticuloInsumo.builder()
                .denominacion("Harina")
                .unidadMedida(unidadMedida_0)
                //asumo que al ser un insumo de inventario no deberia tener un precioVenta
                .precioCompra(10000.0)
                .esParaElaborar(true)
                .stockActual(1)
                .stockMaximo(10)
                .build();

        //manufacturado

        ArticuloManufacturado articuloManufacturado_0 = ArticuloManufacturado.builder()
                .denominacion("Docena de medialunas")
                .precioVenta(4000)
                .descripcion("Una docena de medialunas")
                .tiempoEstimadoMinutos(20)
                .preparacion("texto de preparacion")
                .build();
        //crear y agregar detalle al articulo
        ArticuloManufacturadoDetalle detalle_0 = ArticuloManufacturadoDetalle.builder()
                .cantidad(12)
                .insumo(articuloInsumo_0)
                .build();
        articuloManufacturado_0.agregarDetalle(detalle_0);

        //agregando los articulos a sus categorias
        categoria_0.agregarArticulo(articuloManufacturado_0);
        categoria_1.agregarArticulo(articuloInsumo_0);
        //agregando cosas que faltan a la sucursal
        sucursal_0.agregarCategoria(categoria_0);
        sucursal_0.agregarCategoria(categoria_1);
        sucursal_0.agregarPromocion(promocion_0);
        promocion_0.agregarArticulo(articuloManufacturado_0);

        //.!falta parte de pedido con detalle y factura y cliente con usuario e imagen.

        System.out.println(sucursal_0);
    }
}
