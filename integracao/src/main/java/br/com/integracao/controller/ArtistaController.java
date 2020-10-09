package br.com.integracao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.integracao.dao.ArtistaDAO;
import br.com.integracao.modelo.Artista;


@RestController
@CrossOrigin("*")
public class ArtistaController {
	@Autowired
	private ArtistaDAO dao;
	
	//retorna artista por ID
	@GetMapping("/artista/{codigo}")
	public ResponseEntity<Artista> getArtista(@PathVariable int codigo){
		Artista artista = dao.findById(codigo).orElse(null);
		if (artista == null) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(artista);
	}
	
	//retorta todos os artistas
	@GetMapping("/artista/all")
	public ResponseEntity<List<Artista>> getTodosArtistas(){
		List<Artista> todosArtistas = (List<Artista>) dao.findAll();
		if (todosArtistas.size() == 0) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(todosArtistas);
	}
	//retorna artistas por nacionalidade
	@PostMapping("/artista/nacionalidade")
	public ResponseEntity<List<Artista>> acharByNacionalidade(@RequestBody Artista objeto){
		List<Artista> artistasPorNac = (List<Artista>) dao.findByNacionalidade(objeto.getNacionalidade());
		if (artistasPorNac.size() == 0) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(artistasPorNac);
	}
	
	@PostMapping("/novoartista")
	public ResponseEntity<Artista> novoArtista(@RequestBody Artista novo){
		try {
			dao.save(novo);
			return ResponseEntity.ok(novo);
		}catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(403).build();
		}
	}
}
