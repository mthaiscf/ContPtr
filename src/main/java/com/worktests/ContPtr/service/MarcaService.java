package com.worktests.ContPtr.service;

import java.util.List;
import javax.validation.Valid;
import com.worktests.ContPtr.entity.Marca;


public interface MarcaService {
	
	//gets
	List<Marca> listarMarcas();
	Marca buscarMarca(long id);

	//post
	void cadastrarMarca(@Valid Marca marca);

	//update
	void atualizarMarca(@Valid Marca marca, long id);
	
	//delete 
	void excluirMarca(long id);
	
}
