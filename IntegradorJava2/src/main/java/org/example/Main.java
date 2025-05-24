package org.example;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {

        //Recordar poner la IDs eventualmente

        // 1) Países
        Pais p1 = Pais.builder()
                .nombre ("Argentina")
                .build();
        Pais p2 = Pais.builder()
                .nombre("Chile")
                .build();

        // 2) Provincias
        Provincia pr1 = Provincia.builder()
                .nombre("Mendoza")
                .build();
        pr1.setPais(p1);
        Provincia pr2 = Provincia.builder()
                .nombre("Valparaiso")
                .build();
        pr2.setPais(p2);

        // 3) Localidades
        Localidad l1 = Localidad.builder()
                .nombre("Villa Nueva")
                .build();
        l1.setProvincia(pr1);
        Localidad l2 = Localidad.builder()
                .nombre("Algun lugar de Chile")
                .build();
        l2.setProvincia(pr2);

        // 4) Domicilios
        Domicilio d1 = Domicilio.builder()
                .calle("Calle 1")
                .numero(123)
                .cp(1900)
                .build();
        d1.setLocalidad(l1);
        Domicilio d2 = Domicilio.builder()
                .calle("Rua 2")
                .numero(456)
                .cp(13000)
                .build();
        d2.setLocalidad(l2);


        //5) Promociones
        Promocion HappyHour = Promocion.builder()
                .denominacion("Happy Hour")
                .fechaDesde(LocalDate.now())
                .fechaHasta(LocalDate.now().plusDays(7))
                .horaDesde(LocalTime.of(17,0))
                .horaHasta(LocalTime.of(3,0))
                .descripcionDescuento("3 Gin tonic y un boleo en el-----. 50% off")
                .precioPromocional(2300.0)
                .tipoPromocion(TipoPromocion.happyHour)
                .build();
        Promocion Promo_1 = Promocion.builder()
                .denominacion("Promo 1")
                .fechaDesde(LocalDate.now())
                .fechaHasta(LocalDate.now().plusDays(7))
                .horaDesde(LocalTime.of(19,0))
                .horaHasta(LocalTime.of(23,0))
                .descripcionDescuento("2 pizza Mozzarella para llevar")
                .precioPromocional(3900.0)
                .tipoPromocion(TipoPromocion.promocion_1)
                .build();

        // 6) Sucursales
        Sucursal s1 = Sucursal.builder()
                .nombre("Scucursal Centro")
                .horarioApertura(LocalTime.of(18,0))
                .horarioCierre(LocalTime.of(3,0))
                .build();
        s1.setDomicilio(d1);
        Sucursal s2 = Sucursal.builder()
                .nombre("Scucursal Norte")
                .horarioApertura(LocalTime.of(10,0))
                .horarioCierre(LocalTime.of(23,0))
                .build();
        s2.setDomicilio(d2);

        // 7) Empresa
        Empresa e1 = Empresa.builder()
                .nombre("Foo S.A.")
                .razonSocial("Foo Sociedad Anonima")
                .cuil(201234567)
                .build();
        Empresa e2 = Empresa.builder()
                .nombre("Bar Ltda")
                .razonSocial("Bar Limitada")
                .cuil(301234568)
                .build();


        //8) Imágenes
        Imagen1 img1 = Imagen1.builder()
                .denominacion("Imagen 1")
                .build();
        Imagen2 img2 = Imagen2.builder()
                .denominacion("Imagen 2")
                .build();


        // 9) Categorías
        Categoria cat1 = Categoria.builder()
                .denominacion("Pizzeria")
                .build();
        Categoria cat2 = Categoria.builder()
                .denominacion("Panificados")
                .build();
        Categoria cat3 = Categoria.builder()
                .denominacion("Bebidas")
                .build();

        // 9.1) Subcategorias
        Categoria subCat1 = Categoria.builder()
                .denominacion("Pizza Mozzarella")
                .build();
        Categoria subCat2 = Categoria.builder()
                .denominacion("Pizza 4 Quesos")
                .build();
        Categoria subCat3 = Categoria.builder()
                .denominacion("Galletas")
                .build();
        Categoria subCat4 = Categoria.builder()
                .denominacion("Bizcochos")
                .build();
        Categoria subCat5 = Categoria.builder()
                .denominacion("Gin tonic")
                .build();
        Categoria subCat6 = Categoria.builder()
                .denominacion("Coca cola")
                .build();

        // 9.2) Relacion padre e hijo
        cat1.addSubcategoria(subCat1);
        cat1.addSubcategoria(subCat2);
        cat2.addSubcategoria(subCat3);
        cat2.addSubcategoria(subCat4);
        cat3.addSubcategoria(subCat5);
        cat3.addSubcategoria(subCat6);

        // 10) Unidades de medida
        UnidadMedida mililitros = UnidadMedida.builder()
                .denominacion("Mililitros")
                .build();
        UnidadMedida gramos = UnidadMedida.builder()
                .denominacion("Gramos")
                .build();
        UnidadMedida unidades = UnidadMedida.builder()
                .denominacion("Unidad/es")
                .build();

        //11) Insumos
        ArticuloInsumo harina = ArticuloInsumo.builder()
                .PrecioCompra(9374.0)
                .unidadMedida(gramos)
                .stockActual(10000)
                .stockMaximo(30000)
                .esParaElaborar(true)
                .build();
        ArticuloInsumo levadura = ArticuloInsumo.builder()
                .PrecioCompra(11000)
                .unidadMedida(gramos)
                .stockActual(1000)
                .stockMaximo(3000)
                .esParaElaborar(true)
                .build();
        ArticuloInsumo queso = ArticuloInsumo.builder()
                .PrecioCompra(27000)
                .unidadMedida(gramos)
                .stockActual(9000)
                .stockMaximo(20000)
                .esParaElaborar(true)
                .build();
        ArticuloInsumo salsa = ArticuloInsumo.builder()
                .PrecioCompra(6000)
                .unidadMedida(mililitros)
                .stockActual(5000)
                .stockMaximo(15000)
                .esParaElaborar(true)
                .build();
        ArticuloInsumo CocaCola = ArticuloInsumo.builder()
                .PrecioCompra(600)
                .unidadMedida(unidades)
                .precioVenta(1300)
                .stockActual(13)
                .stockMaximo(25)
                .esParaElaborar(false)
                .build();
        ArticuloInsumo GinBombay = ArticuloInsumo.builder()
                .PrecioCompra(60000)
                .unidadMedida(unidades)
                .stockActual(3)
                .stockMaximo(10)
                .esParaElaborar(true)
                .build();
        ArticuloInsumo TonicaSchweppes  = ArticuloInsumo.builder()
                .PrecioCompra(1300)
                .unidadMedida(unidades)
                .precioVenta(2500)
                .stockActual(13)
                .stockMaximo(30)
                .esParaElaborar(false)
                .build();

        //12)Detalle Manufacturado
        ArticuloManufacturadoDetalle amd1 = ArticuloManufacturadoDetalle.builder()
                .cantidad(330)
                .articuloInsumo(harina)
                .build();
        ArticuloManufacturadoDetalle amd2= ArticuloManufacturadoDetalle.builder()
                .cantidad(50)
                .articuloInsumo(levadura)
                .build();
        ArticuloManufacturadoDetalle amd3 = ArticuloManufacturadoDetalle.builder()
                .cantidad(250)
                .articuloInsumo(queso)
                .build();
        ArticuloManufacturadoDetalle amd4 = ArticuloManufacturadoDetalle.builder()
                .cantidad(150)
                .articuloInsumo(salsa)
                .build();
        ArticuloManufacturadoDetalle amd5 = ArticuloManufacturadoDetalle.builder()
                .cantidad(30)
                .articuloInsumo(GinBombay)
                .build();
        ArticuloManufacturadoDetalle amd6 = ArticuloManufacturadoDetalle.builder()
                .cantidad(1)
                .articuloInsumo(TonicaSchweppes)
                .build();


        //13) Manufacturados
        ArticuloManufacturado PizzaMozzarella = ArticuloManufacturado.builder()
                .descripcion("Pizza Mozzarella")
                .preparacion("Usemos las prepizzas que se hicieron en la tarde, metan la masa al horno y tirenle queso")
                .tiempoEstimadoMinutos(20)
                .build();
        PizzaMozzarella.addDetalle(amd1);
        PizzaMozzarella.addDetalle(amd2);
        PizzaMozzarella.addDetalle(amd3);
        PizzaMozzarella.addDetalle(amd4);
        ArticuloManufacturado GinTonic = ArticuloManufacturado.builder()
                .descripcion("Gin tonic")
                .preparacion("Gin y tonica, mandenle como les parezca mejor")
                .tiempoEstimadoMinutos(5)
                .build();
        GinTonic.addDetalle(amd5);
        GinTonic.addDetalle(amd6);

        //14) Usuarios
        Usuario cliente1 = Usuario.builder()
                .auth0Id("auth0|123")
                .username("Ana_G")
                .rol(Rol.cliente)
                .build();
        Usuario cliente2 = Usuario.builder()
                .auth0Id("auth0")
                .username("GerarditoParaLosAmigos")
                .rol(Rol.cliente)
                .build();
        Usuario empleado1 = Usuario.builder()
                .auth0Id("auth0|789")
                .username("BrunoCaja")
                .rol(Rol.empleado)
                .build();

        //15) Clientes
        Cliente cl1 = Cliente.builder()
                .nombre("Ana")
                .apellido("Garcia")
                .telefono("2616126432")
                .email("ana@mail.com")
                .usuario(cliente1)
                .build();
        Cliente cl2 = Cliente.builder()
                .nombre("Gerardo")
                .apellido("Buster")
                .telefono("2613614289")
                .email("buster@mail.com")
                .usuario(cliente2)
                .build();

        //16) Detalles de pedidos
        DetallePedido detallePedido1 = DetallePedido.builder()
                .cantidad(2)
                .subTotal(8500)
                .articulo(PizzaMozzarella)
                .build();
        DetallePedido detallePedido2 = DetallePedido.builder()
                .cantidad(4)
                .subTotal(4800)
                .articulo(GinTonic)
                .build();

        //17) Pedidos
        Pedido pedido1 = Pedido.builder()
                .horaEstimadaFinalizacion(LocalTime.of(02, 26))
                .total(8500.0)
                .totalCosto(5300.0)
                .estado(Estado.pendiente)
                .tipoEnvio(TipoEnvio.delivery)
                .formaPago(FormaPago.MercadoPago)
                .fechaPedido(LocalDate.of(2025,5,23))
                .sucursal(s1)
                .domicilio(d1)
                .build();
        Pedido pedido2 = Pedido.builder()
                .horaEstimadaFinalizacion(LocalTime.of(11,20))
                .total(4800.0)
                .totalCosto(2700.0)
                .estado(Estado.entregado)
                .tipoEnvio(TipoEnvio.TakeAway)
                .formaPago(FormaPago.efectivo)
                .fechaPedido(LocalDate.of(2025,5,23))
                .sucursal(s2)
                .domicilio(d2)
                .build();

        //18) Facturas
        Factura factura1 = Factura.builder()
                .fechaFacturacion(LocalDate.of(2025,5,23))
                .formaPago(FormaPago.MercadoPago)
                .totalVenta(8500.0)
                .build();
        Factura factura2 = Factura.builder()
                .fechaFacturacion(LocalDate.of(2025,5,23))
                .formaPago(FormaPago.efectivo)
                .totalVenta(4800.0)
                .build();

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
        System.out.println(HappyHour);
        System.out.println(Promo_1);
        System.out.println(img1);
        System.out.println(img2);
        System.out.println(mililitros);
        System.out.println(gramos);
        System.out.println(unidades);
        System.out.println(harina);
        System.out.println(levadura);
        System.out.println(PizzaMozzarella);
        System.out.println(GinTonic);
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