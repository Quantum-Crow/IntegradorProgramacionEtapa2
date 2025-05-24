package org.example;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.util.HashSet;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@ToString
public class Cliente extends Base{
    private String nombre, apellido, telefono, email;
    private LocalDate fechaNacimiento;

    private Usuario usuario;
    private Imagen2 imagen;
    private HashSet<Pedido> pedidos;

    public void addPedido (Pedido pedido){
        if(pedidos == null){
            pedidos = new HashSet<>();
        }
        this.pedidos.add(pedido);
    }
    public void removePedido (Pedido pedido){
        if(pedidos != null){
            this.pedidos.remove(pedido);
        }
    }
}
