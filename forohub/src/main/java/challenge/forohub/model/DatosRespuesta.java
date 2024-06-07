package challenge.forohub.model;

import challenge.forohub.topico.Topico;

import java.util.List;

public record DatosRespuesta(String mensaje, Topico topico, String fechaCreacion, Usuario usuario, Solucion solucion) {
}
