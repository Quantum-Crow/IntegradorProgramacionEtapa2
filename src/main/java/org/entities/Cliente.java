package org.entities;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@SuperBuilder
@ToString
public class Cliente extends Base{
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private LocalDate fechaNacimiento;
    @Builder.Default
    private Set<Pedido> pedidos = new HashSet<>();
    private Usuario usuario;
    private Imagen imagenUser;

    public void agregarPedido(Pedido pedido){
        if (!pedidos.contains(pedido)){
            if (pedido!=null){
                this.pedidos.add(pedido);
            }
        }
    }
}
