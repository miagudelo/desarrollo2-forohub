package challenge.forohub.model;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "curso")
@Entity(name = "Curso")
@Data
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre;
    private String categoria;

    public Curso(DatosCurso curso) {
        this.nombre= curso.nombre();
        this.categoria= curso.categoria();
    }
}
