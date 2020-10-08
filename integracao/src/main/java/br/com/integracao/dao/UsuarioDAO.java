package br.com.integracao.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.integracao.modelo.Usuario;

/*
 * DAO (Data Access Object): aqui manipulamos TODAS as operações do BD
 * Dentro do DAO é que colocamos o CRUD (Create - Read - Update - Delete)
 * 
 */
public interface UsuarioDAO extends CrudRepository<Usuario, Integer> {
	Usuario findByEmailAndSenha(String email, String senha);
}
