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

import br.com.integracao.dao.MusicaDAO;
import br.com.integracao.modelo.Musica;

@RestController
@CrossOrigin("*")
public class MusicaController {
	@Autowired
	private MusicaDAO dao;
	
	@GetMapping("/lancamento/{valor}")
	public ResponseEntity<List<Musica>> pesquisarLancamento(@PathVariable int valor){
		List<Musica> lista = (List<Musica>) dao.findByLancamento(valor);
		if (lista.size() == 0) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(lista);
	}

	//cadastrar Musica
	@PostMapping("/novamusica")
	public ResponseEntity<Musica> novaMusica(@RequestBody Musica nova){
		try {
			dao.save(nova);
			return ResponseEntity.ok(nova);
		}catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(403).build();
		}
	}
	
	//alterar lancamento
	@PostMapping("/alterarlancamento")
	public ResponseEntity<Musica> alterarLancamento(@RequestBody Musica atualizada){
		try {
			Musica completa = dao.findById(atualizada.getId()).orElse(null);
			completa.setLancamento(atualizada.getLancamento());
			dao.save(completa);
			return ResponseEntity.ok(completa);
		}catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(403).build();
		}
	}
}
