package br.com.integracao.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.integracao.modelo.Musica;

public interface MusicaDAO extends CrudRepository<Musica, Integer> {

}
