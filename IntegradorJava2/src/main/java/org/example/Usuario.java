package org.example;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@Builder
public class Usuario {
    private String auth0Id;
    private String username;
    private Rol rol;

    public Usuario(String username, String auth0Id, Rol rol) {
        this.username = username;
        this.auth0Id = auth0Id;
        this.rol = rol.cliente;
    }

    public String getAuth0Id() {
        return auth0Id;
    }

    public void setAuth0Id(String auth0Id) {
        this.auth0Id = auth0Id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
    @Override
    public String toString() {
        return "Usuario{" +
                "auth0Id='" + auth0Id + '\'' +
                ", username='" + username + '\'' +
                ", rol=" + rol +
                '}';
    }
}
