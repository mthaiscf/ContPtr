package com.worktests.ContPtr.repository;


import java.util.List;
import org.springframework.stereotype.Repository;
import com.worktests.ContPtr.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

	List<Usuario> findAll();

	Usuario findById(long id);
	
}
