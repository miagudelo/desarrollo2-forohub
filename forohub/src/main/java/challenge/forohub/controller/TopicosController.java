package challenge.forohub.controller;
import challenge.forohub.repository.CursoRepository;
import challenge.forohub.repository.TopicoRepository;
import challenge.forohub.topico.DatosRegistroTopico;
import challenge.forohub.topico.Topico;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/topicos")
public class TopicosController {

    @Autowired
    private TopicoRepository topicoRepository;

    @Autowired
    private CursoRepository cursoRepository;

   @PostMapping
    public void registrarTopico(@RequestBody @Valid DatosRegistroTopico datosRegistroTopico){
    topicoRepository.save(new Topico(datosRegistroTopico));
    }
}


