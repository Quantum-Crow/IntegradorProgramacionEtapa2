package org.example;

import lombok.*;

import java.time.LocalDate;
import java.util.HashSet;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Cliente {
    private String nombre, apellido, telefono, email;
    private LocalDate fechaNacimiento;

    private Usuario usuario;
    private Imagen2 imagen;
    private HashSet<Pedido> pedidos;

    public Cliente(String nombre, String apellido, String telefono, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
    }

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

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", usuario=" + usuario +
                ", imagen=" + imagen +
                ", pedidos=" + pedidos +
                '}';
    }
}
