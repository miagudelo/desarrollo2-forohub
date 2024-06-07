package challenge.forohub.topico;

import challenge.forohub.model.Curso;
import challenge.forohub.model.DatosRespuesta;
import challenge.forohub.model.Respuesta;
import challenge.forohub.model.Usuario;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Table(name = "topicos")
@Entity (name = "Topico")
@Getter
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String titulo;
    private String mensaje;
    private String fechaCreacion;
    @Enumerated(EnumType.STRING)
    private Estado estado;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "curso_id")
    private Curso curso;
    @OneToMany(mappedBy = "topico", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Respuesta> respuestas;

    public Topico(DatosRegistroTopico datosRegistroTopico) {
        this.titulo = datosRegistroTopico.titulo();
        this.mensaje = datosRegistroTopico.mensaje();
        this.fechaCreacion = datosRegistroTopico.fechaCreacion();
        this.estado = datosRegistroTopico.estado();
        this.usuario = usuario;
        this.curso = curso;
        this.respuestas = new ArrayList<>();
        if (datosRegistroTopico.respuestas() != null) {
            for (DatosRespuesta respuesta : datosRegistroTopico.respuestas()) {
                this.respuestas.add(new Respuesta(respuesta));
            }
        }
    }
    }

