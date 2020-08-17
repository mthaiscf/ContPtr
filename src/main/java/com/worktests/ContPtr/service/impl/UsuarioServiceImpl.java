package com.worktests.ContPtr.service.impl;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.worktests.ContPtr.entity.Usuario;
import com.worktests.ContPtr.service.UsuarioService;
import com.worktests.ContPtr.repository.UsuarioRepository;


@Service
public class UsuarioServiceImpl implements UsuarioService {
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	@Override
	public List<Usuario> listarUsuarios() {
		return this.usuarioRepository.findAll();	
	}
	
	@Override
	public Usuario buscarUsuario(long id) {
		return this.usuarioRepository.findById(id);
	}

	@Override
	public void cadastrarUsuario(@Valid Usuario usuario) {
		usuarioRepository.save(usuario);
	}

	@Override
	public void atualizarUsuario(@Valid Usuario usuario, long id) {
		Usuario usuarioUpdate = usuarioRepository.findById(id);		
		if(usuarioUpdate != null) {
			usuarioUpdate.setNome(usuario.getNome());
			usuarioUpdate.setEmail(usuario.getEmail());
			usuarioUpdate.setSenha(usuario.getSenha());
			usuarioRepository.save(usuarioUpdate);
		}
	}
	
	@Override
	public void excluirUsuario(long id) {
		if(this.usuarioRepository.findById(id) != null) {
			this.usuarioRepository.deleteById(id);
		}
	}

}
