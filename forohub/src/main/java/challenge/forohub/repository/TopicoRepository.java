    package challenge.forohub.repository;

    import challenge.forohub.topico.Topico;
    import org.springframework.data.jpa.repository.JpaRepository;

    public interface TopicoRepository extends JpaRepository<Topico, Long> {
    }
