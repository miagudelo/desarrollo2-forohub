package challenge.forohub.model;

import jakarta.validation.constraints.NotBlank;

public record DatosPerfil(@NotBlank String nombre) {
}
