package br.com.integracao.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.integracao.dao.ArtistaDAO;
import br.com.integracao.dao.MusicaDAO;
import br.com.integracao.modelo.Artista;
import br.com.integracao.modelo.Musica;

@RestController
@CrossOrigin("*")
public class MusicaController {
	@Autowired
	private MusicaDAO dao;
	private ArtistaDAO artdao;

	//cadastrar Musica
	@PostMapping("/novamusica")
	public ResponseEntity<Musica> novaMusica(@RequestBody Musica nova){
		Optional<Artista> artista = artdao.findById(Integer.parseInt(nova.getIdArtista()));
		if (artista != null) {
			try {
				dao.save(nova);
				return ResponseEntity.ok(nova);
			} catch (Exception e) {
				e.printStackTrace();
				return ResponseEntity.status(403).build();
			} 		
		} else {
			return ResponseEntity.status(403).build();
		}
		//List<Artista> todosArtistas = (List<Artista>) artdao.findAll();
		
	}
}
