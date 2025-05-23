package org.example;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        // 1) Países
        org.example.Pais p1 = new org.example.Pais("Argentina");
        org.example.Pais p2 = new org.example.Pais("Chile");

        // 2) Provincias
        org.example.Provincia pr1 = new org.example.Provincia("Mendoza");
        pr1.setPais(p1);
        org.example.Provincia pr2 = new org.example.Provincia("Valparaiso?");
        pr2.setPais(p2);

        // 3) Localidades
        org.example.Localidad l1 = new org.example.Localidad("Villa Nueva");
        l1.setProvincia(pr1);
        org.example.Localidad l2 = new org.example.Localidad("Que se yo, algun lugar de Chile");
        l2.setProvincia(pr2);

        // 4) Domicilios
        org.example.Domicilio d1 = new org.example.Domicilio("Calle 1", 123, 1900);
        d1.setLocalidad(l1);
        org.example.Domicilio d2 = new org.example.Domicilio("Rua 2", 456, 13000);
        d2.setLocalidad(l2);

        // 5) Sucursales
        org.example.Sucursal s1 = new org.example.Sucursal("Sucursal Centro",
                LocalTime.of(9,0), LocalTime.of(18,0), d1);
        org.example.Sucursal s2 = new org.example.Sucursal("Sucursal Norte",
                LocalTime.of(10,0), LocalTime.of(20,0), d2);

        // 6) Empresa
        org.example.Empresa e1 = new org.example.Empresa("Foo S.A.", "Foo Sociedad Anónima", 201234567);
        org.example.Empresa e2 = new org.example.Empresa("Bar Ltda.", "Bar Limitada", 301234568);

        //7) Promociones
        org.example.Promocion promo1 = new org.example.Promocion(
                "Happy Hour", LocalDate.now(),
                LocalDate.now().plusDays(7),
                LocalTime.of(17,0), LocalTime.of(19,0),
                "50% off", 100.0, org.example.TipoPromocion.happyHour
        );
        org.example.Promocion promo2 = new org.example.Promocion(
                "Promo 1", LocalDate.now(),
                LocalDate.now().plusDays(3),
                LocalTime.of(12,0), LocalTime.of(14,0),
                "30% off", 150.0, org.example.TipoPromocion.promocion_1
        );

        //8) Imágenes
        org.example.Imagen1 img1 = new org.example.Imagen1("Imagen 1");
        org.example.Imagen2 img2 = new org.example.Imagen2("Imagen 2");

        // 9) Categorías
        org.example.Categoria cat1 = new org.example.Categoria("Pizzeria");
        org.example.Categoria cat2 = new org.example.Categoria("Panificados");

        // 9.1) Subcategorias
        org.example.Categoria subCat1 = new org.example.Categoria("Pizza Mozzarella");
        org.example.Categoria subCat2 = new org.example.Categoria("Pizza 4 Quesos");
        org.example.Categoria subCat3 = new org.example.Categoria("Galletas");
        org.example.Categoria subCat4 = new org.example.Categoria("Bizcochos");

        // 9.2) Relacion padre e hijo
        cat1.addSubcategoria(subCat1);
        cat1.addSubcategoria(subCat2);
        cat2.addSubcategoria(subCat3);
        cat2.addSubcategoria(subCat4);

        // 10) Unidades de medida
        org.example.UnidadMedida mililitros = new org.example.UnidadMedida("Mililitros");
        org.example.UnidadMedida gramos = new org.example.UnidadMedida("Gramos");
        org.example.UnidadMedida unidad = new org.example.UnidadMedida("Unidad");

        //11) Insumos
        org.example.ArticuloInsumo harina = new org.example.ArticuloInsumo("Harina 000", 49.99, gramos, 20.0);
        org.example.ArticuloInsumo levadura = new org.example.ArticuloInsumo("Levadura", 9.99, gramos, 5.0);

        //12) Manufacturados
        org.example.ArticuloManufacturado am1 = new org.example.ArticuloManufacturado("Pizza Mozzarela", 15, unidad, "Pizza Mozzarella comun y corriente" );
        org.example.ArticuloManufacturado am2 = new org.example.ArticuloManufacturado("Bizcocho", 20, unidad ,"Hornear");

        //13) Detalle Manufacturado
        org.example.ArticuloManufacturadoDetalle amd1 = new org.example.ArticuloManufacturadoDetalle( 10, harina);
        org.example.ArticuloManufacturadoDetalle amd2 = new org.example.ArticuloManufacturadoDetalle(5, harina);

        //14) Clientes
        org.example.Cliente cl1 = new org.example.Cliente("Ana", "García", "111-222", "ana@mail.com");
        org.example.Cliente cl2 = new org.example.Cliente("Gerardo", "Buster", "333-444", "bruno@mail.br");

        //15) Usuarios
        org.example.Usuario cliente1 = new org.example.Usuario("auth0|123", "ana_g", org.example.Rol.cliente);
        org.example.Usuario cliente2 = new org.example.Usuario("auth0|456", "gerardo_b", org.example.Rol.cliente);
        org.example.Usuario empleado1 = new org.example.Usuario("auth0|789", "bruno_s", org.example.Rol.empleado);

        //16) Detalles de pedidos
        org.example.DetallePedido detallePedido1 = new org.example.DetallePedido(2, 8500.0, am1);
        org.example.DetallePedido detallePedido2 = new org.example.DetallePedido(12, 4000, am2);

        //17) Pedidos
        LocalTime horafin1 = LocalTime.of(04, 26);
        LocalDate fechapedido1 = LocalDate.of(2025, 5, 23);
        org.example.Pedido pedido1 = new org.example.Pedido(org.example.Estado.pendiente, org.example.TipoEnvio.TakeAway, org.example.FormaPago.MercadoPago, fechapedido1, s1, d1);
        pedido1.addDetallePedido(detallePedido1);
        pedido1.setHoraEstimadaFinalizacion(horafin1);

        LocalTime horafin2 = LocalTime.of(04, 26);
        LocalDate fechapedido2 = LocalDate.of(2025, 5, 23);
        org.example.Pedido pedido2 = new org.example.Pedido(org.example.Estado.pendiente, org.example.TipoEnvio.delivery, org.example.FormaPago.efectivo, fechapedido2, s2, d2);
        pedido2.addDetallePedido(detallePedido2);
        pedido2.setHoraEstimadaFinalizacion(horafin2);

        //18) Facturas
        org.example.Factura factura1 = new org.example.Factura(pedido1.getFechaPedido(),8500, org.example.FormaPago.MercadoPago);
        org.example.Factura factura2 = new org.example.Factura(pedido2.getFechaPedido(), 4000,  org.example.FormaPago.efectivo);

        //Souts para que se ordene mejor
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(pr1);
        System.out.println(pr2);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(promo1);
        System.out.println(promo2);
        System.out.println(img1);
        System.out.println(img2);
        System.out.println(mililitros);
        System.out.println(gramos);
        System.out.println(unidad);
        System.out.println(harina);
        System.out.println(levadura);
        System.out.println(am1);
        System.out.println(am2);
        System.out.println(amd1);
        System.out.println(amd2);
        System.out.println(cl1);
        System.out.println(cl2);
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(empleado1);
        System.out.println(detallePedido1);
        System.out.println(detallePedido2);
        System.out.println(pedido1);
        System.out.println(pedido2);
        System.out.println(factura1);
        System.out.println(factura2);
    }

}