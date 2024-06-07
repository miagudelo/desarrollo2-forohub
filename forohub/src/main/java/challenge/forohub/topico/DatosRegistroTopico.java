package challenge.forohub.topico;

import challenge.forohub.model.DatosCurso;
import challenge.forohub.model.DatosRespuesta;
import challenge.forohub.model.DatosUsuario;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.List;

public record DatosRegistroTopico(
        @NotBlank
        String titulo,
        @NotBlank
        String mensaje,
        @NotBlank
        String fechaCreacion,
        @NotNull
        Estado estado,
        @NotNull
        @Valid
        DatosUsuario usuario,
        @NotNull
        @Valid
        DatosCurso curso,
        List<DatosRespuesta> respuestas) {
}
