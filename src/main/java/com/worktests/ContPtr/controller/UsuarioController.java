package com.worktests.ContPtr.controller;

import java.net.URI;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import com.worktests.ContPtr.entity.Usuario;
import com.worktests.ContPtr.service.UsuarioService;


@Controller
@RequestMapping(value="/usuarios")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;
	
	
	// LISTAGEM DE USUÁRIOS (GET)
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<Usuario>> findAll() {
		List<Usuario> list = usuarioService.listarUsuarios();
		return ResponseEntity.ok().body(list);
	}
	
	// MOSTRAR USUÁRIO (GET) pelo id
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<Usuario> findById(@PathVariable Integer id) {
		Usuario usuario = usuarioService.buscarUsuario(id);
		return ResponseEntity.ok().body(usuario);
	}
	
	// CADASTRO DE USUÁRIO (POST)
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Void> insert(@Valid @RequestBody Usuario usuario){
		usuarioService.cadastrarUsuario(usuario);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(usuario.getEmail()).toUri();			
		return ResponseEntity.created(uri).build();
	}
	
	// ATUALIZACAO DE USUÁRIO (PUT)
	@RequestMapping(value="/{id}",method=RequestMethod.PUT)
	public ResponseEntity<Void> update(@Valid  @RequestBody Usuario usuario, @PathVariable Integer id){
		usuarioService.atualizarUsuario(usuario, id);
		return ResponseEntity.noContent().build();
	}
	
	// EXCLUSÃO DE USUÁRIO (DELETE)
	@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	public ResponseEntity<Void> delete(@PathVariable Integer id){
		usuarioService.excluirUsuario(id);
		return ResponseEntity.noContent().build();
	}
	
}
