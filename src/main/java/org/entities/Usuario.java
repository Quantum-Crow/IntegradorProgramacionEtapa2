package org.entities;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@ToString
public class Usuario extends Base{
    private String auth0id;
    private String username;
}
