package com.worktests.ContPtr.service;

import java.util.List;
import javax.validation.Valid;
import com.worktests.ContPtr.entity.Usuario;


public interface UsuarioService {
	
	List<Usuario> listarUsuarios();
	
	Usuario buscarUsuario(long id);

	void cadastrarUsuario(@Valid Usuario usuario);

	void atualizarUsuario(@Valid Usuario usuario, long id);
	
	void excluirUsuario(long id);

}
