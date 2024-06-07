package challenge.forohub.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosCurso(
        @NotBlank
        String nombre,
        @NotBlank
        String categoria) {
}
